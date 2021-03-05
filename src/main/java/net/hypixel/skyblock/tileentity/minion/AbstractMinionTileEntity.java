package net.hypixel.skyblock.tileentity.minion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.items.init.ItemInit;
import net.hypixel.skyblock.items.minion.MinionFuelItem;
import net.hypixel.skyblock.tags.ModItemTags;
import net.hypixel.skyblock.util.ItemMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IClearable;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.InvWrapper;

/**
 * A {@link TileEntity} for all Minions.<br>
 * <a href=https://hypixel-skyblock.fandom.com/wiki/Minions>Click here</a> for a
 * description of Minions.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public abstract class AbstractMinionTileEntity extends LockableLootTileEntity
		implements ITickableTileEntity, IClearable, INamedContainerProvider {
	/**
	 * The tier of each Minion
	 */
	public static enum MinionTier {
		I(1, 0), II(3, 1), III(3, 2), IV(6, 3), V(6, 4), VI(9, 5), VII(9, 6), VIII(12, 7), IX(12, 8), X(15, 9),
		XI(15, 10), XII(15, 11);

		/**
		 * A conversion between this and an integer.
		 */
		@Nonnegative
		public final int asInt;

		/**
		 * The amount of slots for each tier.
		 */
		@Nonnegative
		public final int size;

		private MinionTier(@Nonnegative int size, @Nonnegative int asInt) {
			this.size = size;
			this.asInt = asInt;
		}
	}
	
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * Fuel Slot index.
	 */
	protected static final int FUEL_INDEX = 0x0;

	/**
	 * Inventory start.
	 */
	protected static final int INVENTORY_START = 0x4;

	/**
	 * A Random Number Generator.
	 */
	@Nonnull
	protected static final Random rand = new Random();

	/**
	 * Seller Slot index.
	 */
	protected static final int SELLER_INDEX = 0x1;

	/**
	 * Upgrade 1 Slot index.
	 */
	protected static final int UPGRADE_1_INDEX = 0x2;

	/**
	 * Upgrade 2 Slot index.
	 */
	protected static final int UPGRADE_2_INDEX = 0x3;

	/**
	 * The list of everything this will hold.
	 */
	@Nonnull
	public NonNullList<ItemStack> minionContents;

	/**
	 * X coordinate of this.
	 */
	public int x;

	/**
	 * Y coordinate of this.
	 */
	public int y;

	/**
	 * Z coordinate of this.
	 */
	public int z;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding {@link Blocks#AIR}
	 */
	@Nonnull
	protected final List<BlockPos> airSurround = new ArrayList<>();

	/**
	 * Index of the current item to merge {@link ItemStack}.
	 */
	protected int currentItem;

	/**
	 * {@link StringTextComponent} used in {@link #getDisplayName()}.
	 */
	protected final StringTextComponent display_name;

	/**
	 * Determine if {@code this} is ticking.
	 */
	protected boolean isTicking = false;

	/**
	 * The {@link AbstractMinionChestTileEntity} next to {@code this}
	 */
	@Nullable
	protected AbstractMinionChestTileEntity mcte;

	/**
	 * {@link LazyOptional} of {@link IItemHandlerModifiable}
	 */
	@Nonnull
	protected LazyOptional<IItemHandlerModifiable> minionHandler = LazyOptional.of(() -> new InvWrapper(this));

	/**
	 * The Number of Players Using {@code this}
	 */
	@Nonnegative
	protected int numPlayersUsing;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding {@code BlockPos}
	 */
	@Nonnull
	protected final BlockPos[][][] surround;

	/**
	 * The current game tick of {@code this}
	 */
	@Nonnegative
	protected int tick, fuelTick;

	/**
	 * The tier of {@code this}
	 */
	@Nonnull
	protected final MinionTier tier;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding valid {@code BlockPos}
	 */
	@Nonnull
	protected final List<BlockPos> validSurround = new ArrayList<>();

	/**
	 * Create an Abstract {@link TileEntity} for {@code this}.
	 *
	 * @param typeIn {@code TileEntity} of this.
	 * @param tier   {@link MinionTier} of this.
	 */
	protected AbstractMinionTileEntity(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn);
		this.tier = Objects.requireNonNull(tier, "Illegal Minion Tier");
		this.minionContents = NonNullList.withSize(4 + this.tier.size, ItemStack.EMPTY);
		this.surround = this.initSurround();
		this.display_name = this.initDisplayName();
	}

	@Override
	public final void clear() {
		super.clear();
		this.minionContents.clear();
	}

	@Override
	public final ItemStack decrStackSize(int index, int count) {
		return ItemStackHelper.getAndSplit(this.minionContents, index, count);
	}

	@Override
	public final <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return this.minionHandler.cast();
		return super.getCapability(cap, side);
	}

	@Override
	public final ITextComponent getDisplayName() {
		return this.display_name;
	}

	@Override
	public final NonNullList<ItemStack> getItems() {
		return this.minionContents;
	}

	/**
	 * @return {@link #mcte}
	 */
	public final AbstractMinionChestTileEntity getMcte() {
		return this.mcte;
	}

	@Override
	public final int getSizeInventory() {
		return this.minionContents.size();
	}

	@Override
	public final ItemStack getStackInSlot(int index) {
		return this.minionContents.get(index);
	}

	/**
	 * @return {@link #tier}
	 */
	public final MinionTier getTier() {
		return this.tier;
	}

	@Override
	public final SUpdateTileEntityPacket getUpdatePacket() {
		final CompoundNBT nbt = new CompoundNBT();
		this.write(nbt);
		return new SUpdateTileEntityPacket(this.getPos(), 1, nbt);
	}

	@Override
	public final CompoundNBT getUpdateTag() {
		return this.write(new CompoundNBT());
	}

	/**
	 * Initialize all variables.
	 */
	public final void init() {
		this.isTicking = true;
		this.x = this.pos.getX();
		this.y = this.pos.getY();
		this.z = this.pos.getZ();
		this.tick = 0;
		this.fuelTick = 0;
		LOGGER.info(this.toString());
		this.setSurround();
	}

	/**
	 * Determine if {@code this} and any additional storage are full.
	 *
	 * @return {@code true} if full. {@code false} otherwise
	 */
	public final boolean isCompletlyFull() {
		if (this.isInventoryFull())
			if (this.mcte != null)
				return this.mcte.isFull();
		return this.hasSeller();
	}

	@Override
	public final boolean isEmpty() {
		if (this.hasSeller())
			return false;
		for (int i = 4; i < this.getSizeInventory(); ++i)
			if (this.getStackInSlot(i).isEmpty())
				return true;
		if (this.mcte != null)
			return this.mcte.isFull();
		return false;
	}

	@Override
	public final boolean isItemValidForSlot(int index, @Nonnull ItemStack stack) {
		final Item item = stack.getItem();
		LOGGER.info(item.getTags().toString());
		switch (index) {
		case FUEL_INDEX:
			return item.isIn(ModItemTags.fuel);
		case SELLER_INDEX:
			return item.isIn(ModItemTags.seller);
		case UPGRADE_1_INDEX:
		case UPGRADE_2_INDEX:
			return item.isIn(ModItemTags.upgrade);
		default:
			return false;
		}
	}

	@Override
	public final boolean isUsableByPlayer(@Nonnull PlayerEntity player) {
		if (this.world.getTileEntity(this.pos) != this)
			return false;
		return player.getDistanceSq(this.pos.getX() + .5, this.pos.getY() + .5, this.pos.getZ() + .5) <= 64d;
	}

	@Override
	public final void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
		LOGGER.info("NetworkManager:\t" + net.toString());
		LOGGER.info("SUpdateTileEntityPacket:\t" + pkt.toString());
		this.read(this.getBlockState(), pkt.getNbtCompound());
	}

	@Override
	public final void read(BlockState blockState, CompoundNBT compound) {
		LOGGER.info("Minion NBT Reading");
		LOGGER.info("CompoundNBT:\t" + compound.toString());
		super.read(blockState, compound);
		this.minionContents = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.minionContents);
	}

	@Override
	public final boolean receiveClientEvent(int id, int type) {
		LOGGER.info("Receiving Client Event. id:\t" + id + " type:\t" + type);
		if (id == 1) {
			this.numPlayersUsing = type;
			return true;
		}
		return super.receiveClientEvent(id, type);
	}

	@Override
	public final void remove() {
		LOGGER.info("Removing " + this.getClass().getSimpleName());
		super.remove();
		if (this.minionHandler != null)
			this.minionHandler.invalidate();
	}

	@Override
	public final ItemStack removeStackFromSlot(int index) {
		LOGGER.info("Removing stack from slot " + index);
		return ItemStackHelper.getAndRemove(this.minionContents, index);
	}

	@Override
	public final void setInventorySlotContents(int index, @Nonnull ItemStack stack) {
		LOGGER.info("Setting slot" + index + " to " + stack.toString());
		final ItemStack indexStack = this.minionContents.get(index);
		final boolean flag = !stack.isEmpty() && stack.isItemEqual(indexStack)
				&& ItemStack.areItemStackTagsEqual(stack, indexStack);
		this.minionContents.set(index, stack);
		if (stack.getCount() > this.getInventoryStackLimit())
			stack.setCount(this.getInventoryStackLimit());
		if (!flag)
			this.markDirty();
	}

	/**
	 * Changes {@link #mcte}
	 *
	 * @param mcte the new {@link AbstractMinionChestTileEntity}
	 */
	public final void setMcte(@Nullable AbstractMinionChestTileEntity mcte) {
		LOGGER.info("Setting AbstractMinionChestTileEntity");
		this.mcte = mcte;
	}

	@Override
	public abstract void tick();

	@Override
	public final String toString() {
		return this.getClass().getSimpleName() + " [x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", tier="
				+ this.tier + "]";
	}

	@Override
	public final void updateContainingBlockInfo() {
		LOGGER.info("Updating Containing Block Info");
		super.updateContainingBlockInfo();
		if (this.minionHandler != null) {
			this.minionHandler.invalidate();
			this.minionHandler = null;
		}
	}

	@Override
	public final CompoundNBT write(CompoundNBT compound) {
		LOGGER.info("Minion NBT Writting:\t" + compound.toString());
		super.write(compound);
		ItemStackHelper.saveAllItems(compound, this.minionContents);
		return compound;
	}

	/**
	 * Adds the stack to the specified slot in the list.
	 *
	 * @param slotIn the specified slot
	 * @param stack  the {@link ItemStack} to add.
	 * @return {@code true} if {@code stack} has been successfully added.
	 *         {@code false} if it's not possible to place the entire stack in the
	 *         inventory.
	 */
	protected final boolean add(int slotIn, ItemStack stack) {
		LOGGER.info("Adding " + stack.toString() + " to slot " + slotIn);
		if (stack.isEmpty())
			return false;
		try {
			int i;
			while (true) {
				i = stack.getCount();
				if (slotIn == -1)
					stack.setCount(this.storePartialItemStack(stack));
				else
					stack.setCount(this.addResource(slotIn, stack));
				if (stack.isEmpty() || stack.getCount() >= i)
					break;
			}
			if (stack.getCount() == i) {
				stack.setCount(0);
				return true;
			} else
				return stack.getCount() < i;
		} catch (final Throwable throwable) {
			final CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Adding item to inventory");
			final CrashReportCategory crashreportcategory = crashreport.makeCategory("Item being added");
			crashreportcategory.addDetail("Registry Name", () -> String.valueOf(stack.getItem().getRegistryName()));
			crashreportcategory.addDetail("Item Class", () -> stack.getItem().getClass().getName());
			crashreportcategory.addDetail("Item ID", Item.getIdFromItem(stack.getItem()));
			crashreportcategory.addDetail("Item data", stack.getDamage());
			crashreportcategory.addDetail("Item name", () -> stack.getDisplayName().getString());
			throw new ReportedException(crashreport);
		}
	}

	/**
	 * Adds drops to {@link #minionContents}
	 *
	 * @param drops the items to add.
	 */
	protected final void addItemStacks(ItemStack... drops) {
		LOGGER.info("Adding " + Arrays.deepToString(drops) + " to inventory.");
		this.compactor();
		this.autoSmelt();
		this.superCompactor();
		for (ItemStack stack : drops)
			this.add(-1, stack);
		this.diamondSpreading();
		LOGGER.info(this.minionContents.toString());
	}

	/**
	 * Adds drops to {@link #minionContents}
	 *
	 * @param drops the items to add.
	 */
	protected final void addItemStacks(List<ItemStack> drops) {
		this.addItemStacks(drops.toArray(new ItemStack[drops.size()]));
	}

	/**
	 * Add {@link ItemStack} to {@link #minionContents}. Also handle if the
	 * {@code ItemStack} has a count more than max stack.
	 *
	 * @param index the index to add to
	 * @param stack the {@code ItemStack} to add.
	 * @return the number of items remainding after capping an {@code ItemStack}.
	 */
	protected final int addResource(int index, ItemStack stack) {
		LOGGER.info("Adding " + stack.toString() + " to slot " + index);
		int i = stack.getCount();
		ItemStack itemstack = this.getStackInSlot(index);
		if (itemstack.isEmpty()) {
			itemstack = stack.copy();
			itemstack.setCount(0);
			if (stack.hasTag())
				itemstack.setTag(stack.getTag().copy());
			this.setInventorySlotContents(index, itemstack);
		}

		int j = i;
		if (i > itemstack.getMaxStackSize() - itemstack.getCount())
			j = itemstack.getMaxStackSize() - itemstack.getCount();
		if (j > this.getInventoryStackLimit() - itemstack.getCount())
			j = this.getInventoryStackLimit() - itemstack.getCount();
		if (j == 0)
			return i;
		else {
			i -= j;
			itemstack.grow(j);
			itemstack.setAnimationsToGo(5);
			return i;
		}
	}

	/**
	 * Handle {@link ItemInit#auto_smelter}.<br>
	 * Certain smeltable items will not smelt through this method as
	 * {@link #superCompactor()} takes priority.
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Auto_Smelter">Auto
	 * Smelter.</a>
	 */
	protected final void autoSmelt() {
		if (!this.hasUpgrade(ItemInit.auto_smelter.get()))
			return;
		LOGGER.info("Auto smelting contents");
		final NonNullList<ItemStack> inv = this.getInventory();
		for (final ItemStack stack : inv) {
			final Item smelt = ItemMap.smeltMap.get(stack.getItem());
			if (smelt == null)
				continue;
			this.decrStackSize(inv.lastIndexOf(stack), 1);
			this.add(-1, new ItemStack(smelt, 1));
		}
	}

	/**
	 * Determine if two {@link ItemStack} can merge into one.
	 *
	 * @param stack1 one {@code ItemStack}
	 * @param stack2 another {@code ItemStack}
	 * @return {@code true} if can merge.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean canMergeStacks(ItemStack stack1, ItemStack stack2) {
		return !stack1.isEmpty() && this.stackEqualExact(stack1, stack2) && stack1.isStackable()
				&& stack1.getCount() < stack1.getMaxStackSize() && stack1.getCount() < this.getInventoryStackLimit();
	}

	/**
	 * Handle {@link ItemInit#compactor}.<br>
	 * Sometimes this will do nothing unless paired with
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Diamond_Spreading">diamond
	 * spreading</a>.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Compactor">Compactor</a>
	 */
	@SuppressWarnings("unlikely-arg-type")
	protected final void compactor() {
		if (!this.hasUpgrade(ItemInit.compactor.get()))
			return;
		LOGGER.info("Compacting contents");
		for (final Item item : this.getCompactor()) {
			Integer count = ItemMap.compCountMap.get(item);
			count = count == null ? 9 : count;
			if (this.count(item) == count) {
				this.decrStackSize(this.minionContents.lastIndexOf(item), count);
				this.add(-1, new ItemStack(ItemMap.compMap.get(item), 1));
			}
		}
	}

	/**
	 * Handle consuming fuel that this has.
	 *
	 * @param fuel the {@link MinionFuelItem} to consume.
	 */
	protected final void consumeFuel(MinionFuelItem fuel) {
		final int time = fuel.getBurnTime();
		if (time == -1)
			return;
		this.fuelTick = (++this.fuelTick) % time;
		if (this.fuelTick == 0) {
			LOGGER.info("Consuming fuel: " + fuel.toString());
			this.decrStackSize(FUEL_INDEX, 1);
		}
	}

	@Override
	protected abstract Container createMenu(int id, PlayerInventory player);

	/**
	 * Handle {@link ItemInit#diamond_spreading}<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Diamond_Spreading">Diamond
	 * Spreading</a>
	 */
	protected final void diamondSpreading() {
		if (!this.hasUpgrade(ItemInit.diamond_spreading.get()))
			return;
		LOGGER.info("Diamond Spreading Loggic");
		if (rand.nextInt(10) == 0)
			this.add(-1, new ItemStack(Items.DIAMOND));
	}

	/**
	 * Determine all possible {@link Item} that could be compacted using the
	 * {@link ItemInit#compactor}.
	 *
	 * @return a list of these {@code Item}.
	 */
	protected abstract Item[] getCompactor();

	@Override
	protected final ITextComponent getDefaultName() {
		return new TranslationTextComponent("container." + this.getType().getRegistryName().toString().toLowerCase());
	}

	/**
	 * Gets First Empty {@link ItemStack}
	 *
	 * @return the index of empty stack.
	 */
	protected final int getFirstEmptyStack() {
		LOGGER.info("Getting the index of the first empty stack.");
		for (int i = 4; i < this.minionContents.size(); ++i)
			if (this.minionContents.get(i).isEmpty())
				return i;
		return -1;
	}

	/**
	 * @return the {@link ItemStack} in the Fuel Slot.
	 */
	protected final ItemStack getFuel() {
		return this.getStackInSlot(FUEL_INDEX);
	}

	/**
	 * Determines the fuel speed of the Item in the fuel slot.
	 *
	 * @return the fuel speed. 1 if no fuel.
	 */
	protected final double getFuelSpeed() {
		final ItemStack fuel = this.getFuel();
		if (fuel.isEmpty())
			return 1d;
		final Item fuelItem = fuel.getItem();
		if (fuelItem instanceof MinionFuelItem) {
			this.consumeFuel((MinionFuelItem) fuelItem);
			return ((MinionFuelItem) fuelItem).getSpeed();
		}
		throw new IllegalStateException("Found impossible item in fuel slot: " + fuelItem.getRegistryName().toString());
	}

	/**
	 * @return a list of the main inventory.
	 */
	protected final NonNullList<ItemStack> getInventory() {
		final NonNullList<ItemStack> inv = NonNullList.withSize(this.getSizeInventory() - 4, ItemStack.EMPTY);
		for (int i = INVENTORY_START; i < this.getSizeInventory(); i++)
			inv.set(i - 4, this.minionContents.get(i));
		return inv;
	}

	/**
	 * @return the {@link ItemStack} in the Seller Slot.
	 */
	protected final ItemStack getSeller() {
		return this.getStackInSlot(SELLER_INDEX);
	}

	/**
	 * Determines the time between {@link #interact(BlockPos)} calls in ticks.
	 * 
	 * @param tier {@link MinionTier}
	 * @return time between actions in ticks.
	 */
	protected abstract int getSpeed(MinionTier tier);

	/**
	 * Determine all possible {@link Item} that could be super compacted.<br>
	 * This method assumes that all {@code Item} are keys in
	 * {@link ItemMap#enchMap}.
	 *
	 * @return a list of these {@code Item}.
	 */
	protected abstract Item[] getSuperCompactor();

	/**
	 * Determine the indexes of 160 {@link Item} to remove.
	 *
	 * @param item {@link Item} to find
	 * @return the indexes
	 */
	protected final int[] getSuperCompIndex(Item item) {
		LOGGER.info("Finding super compactor indexes for: " + item.getRegistryName().toString());
		final int[] indexs = new int[3];
		int index = 0;
		boolean half = false;
		for (int i = this.minionContents.size() - 1; i > -1; i--) {
			final ItemStack stack = this.minionContents.get(i);
			if (stack.getItem() == item)
				switch (stack.getCount()) {
				case 32:
					if (!half) {
						indexs[index] = i;
						index++;
						half = true;
					}
					break;
				case 64:
					indexs[index] = i;
					index++;
					break;
				default:
					continue;
				}
			else
				continue;
		}
		return indexs;
	}

	/**
	 * @return the {@link ItemStack} in both Upgrade Slots.
	 */
	protected final ItemStack[] getUpgrades() {
		return new ItemStack[] { this.getStackInSlot(UPGRADE_1_INDEX), this.getStackInSlot(UPGRADE_2_INDEX) };
	}

	/**
	 * Determines if {@code this} has fuel.
	 *
	 * @return {@code true} if {@code this} has fuel.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean hasFuel() {
		return !this.getFuel().isEmpty();
	}

	/**
	 * Determines if {@code this} has a seller.
	 *
	 * @return {@code true} if {@code this} has fuel.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean hasSeller() {
		return !this.getSeller().isEmpty();
	}

	/**
	 * Determines if {@code this} has the upgrade {@code upgrade}
	 *
	 * @param upgrade is the upgrade
	 * @return {@code true} if this has {@code upgrade}<br>
	 *         {@code flase} otherwise.
	 */
	protected final boolean hasUpgrade(Item upgrade) {
		return this.getUpgrades()[0].getItem() == upgrade || this.getUpgrades()[1].getItem() == upgrade;
	}

	/**
	 * Initializes {@link #display_name}
	 * 
	 * @return {@link StringTextComponent}.
	 */
	protected abstract StringTextComponent initDisplayName();

	/**
	 * Create a 3d Array of all {@link BlockPos} that surround this.<br>
	 * This Array is 3d as certain minions interact with blocks that require these 3
	 * dimensions.
	 *
	 * @return the 3d Array with the correct bounds.
	 */
	protected abstract BlockPos[][][] initSurround();

	/**
	 * Interact with {@code pos}
	 *
	 * @param pos is the result of {@link #pickBlockPos()}
	 * @return {@code true} if a {@link Block} has been changed.<br>
	 *         {@code false} if a {@link Block} has not been changed.
	 */
	protected boolean interact(BlockPos pos) {
		return false;
	}

	/**
	 * Determine if {@code this} is fill.
	 *
	 * @return {@code true} if full. {@code false} otherwise.
	 */
	protected final boolean isInventoryFull() {
		for (final ItemStack stack : this.getInventory())
			if (stack.isEmpty())
				return false;
			else if (stack.getCount() < stack.getMaxStackSize())
				return false;
		return true;
	}

	/**
	 * Pick a random valid {@link BlockPos} to interact with.<br>
	 * This method depends heavily on the type of minion.<br>
	 * This method will return {@code null} if no valid {@link BlockPos} is chosen.
	 *
	 * @return {@link BlockPos} picked.
	 */
	protected abstract BlockPos pickBlockPos();

	/**
	 * Removes a stack from the indexes.
	 *
	 * @param indexes a list of indexes
	 * @return primitive type array of {@link ItemStack} removed.
	 */
	protected final ItemStack[] removeStacksFromSlot(int... indexes) {
		LOGGER.info("Removing stacks from slots " + Arrays.toString(indexes));
		final ItemStack[] temp = new ItemStack[indexes.length];
		for (int i = 0; i < indexes.length; i++)
			temp[i] = this.getStackInSlot(i).getCount() == 32 ? this.decrStackSize(i, 32) : this.removeStackFromSlot(i);
		return temp;
	}

	/**
	 * Determine all surround {@link BlockPos} that equal {@link Material#AIR}.
	 */
	protected void setAirSurround() {
		LOGGER.info("Finding Air in valid BlockPos");
		this.airSurround.clear();
		for (final BlockPos pos : this.validSurround) {
			BlockState state = this.world.getBlockState(pos);
			if (state.getMaterial() == Material.AIR)
				this.airSurround.add(pos);
		}
		LOGGER.info(this.airSurround.toString());
	}

	@Override
	protected void setItems(NonNullList<ItemStack> itemsIn) {
		this.minionContents = Objects.requireNonNull(itemsIn, "New Minion Contents must be non-null");
	}

	/**
	 * Determine all surrounding {@link BlockPos}.<br>
	 * Due to the effects of {@link ItemInit#minion_expander}, this method will
	 * automatically gather the blocks from the enlarged area
	 */
	protected abstract void setSurround();

	/**
	 * Determine all valid surrounding {@link BlockPos}
	 */
	protected abstract void setValidSurround();

	/**
	 * Checks item, NBT, and meta if the item is not damageable.
	 *
	 * @param stack1 one {@link ItemStack}
	 * @param stack2 another {@link ItemStack}
	 * @return {@code true} if equal.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean stackEqualExact(ItemStack stack1, ItemStack stack2) {
		LOGGER
				.info("Determining if " + stack1.toString() + " is exactly equal to " + stack2.toString());
		return stack1.getItem() == stack2.getItem() && ItemStack.areItemStackTagsEqual(stack1, stack2);
	}

	/**
	 * Stores a stack in the player's inventory. It first tries to place it in the
	 * selected slot in the player's hotbar, then the offhand slot, then any
	 * available/empty slot in the player's inventory.
	 *
	 * @param stack {@link ItemStack} to add.
	 * @return index of stack
	 */
	protected final int storeItemStack(ItemStack stack) {
		LOGGER.info("Storing " + stack.toString());
		if (this.canMergeStacks(this.getStackInSlot(this.currentItem), stack))
			return this.currentItem;
		for (int i = 4; i < this.minionContents.size(); ++i)
			if (this.canMergeStacks(this.minionContents.get(i), stack))
				return i;
		return -1;
	}

	/**
	 * This function stores as many items of an {@link ItemStack} as possible in a
	 * matching slot and returns the quantity of left over items.
	 *
	 * @param stack {@code ItemStack} to store.
	 * @return the quantity of left over {@code Item}
	 */
	protected final int storePartialItemStack(ItemStack stack) {
		LOGGER.info("Storing partially " + stack.toString());
		int i = this.storeItemStack(stack);
		if (i == -1)
			i = this.getFirstEmptyStack();
		return i == -1 ? stack.getCount() : this.addResource(i, stack);
	}

	/**
	 * Handle {@link ItemInit#super_compactor_3000}.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Super_Compactor_3000">Super
	 * Compactor 3000</a>
	 */
	protected final void superCompactor() {
		if (!this.hasUpgrade(ItemInit.super_compactor_3000.get()))
			return;
		LOGGER.info("Super Compacting contents");
		for (final Item item : this.getSuperCompactor()) {
			Integer count = ItemMap.enchCountMap.get(item);
			count = count == null ? 160 : count;
			if (this.count(item) == count) {
				this.removeStacksFromSlot(this.getSuperCompIndex(item));
				this.add(-1, new ItemStack(ItemMap.enchMap.get(item), ItemMap.enchCountMap.get(item)));
			}
		}
	}
}