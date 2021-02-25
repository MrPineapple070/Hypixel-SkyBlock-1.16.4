package net.hypixel.skyblock.inventory;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.accessories.Accessory;
import net.hypixel.skyblock.items.accessories.Accessory.AccessoryReforge;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.items.sacks.Sack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.NonNullList;

/**
 * An extended version of {@link PlayerInventory}
 *
 * @author MrPineapple070
 * @version 24 July 2020
 */
public class ExtendedPlayerInventory extends PlayerInventory {
	/**
	 * An {@link ImmutableList} of all possible sizes for {@link #accessories}.
	 */
	private static final ImmutableList<Integer> accessories_size = ImmutableList
			.copyOf(new Integer[] { 3, 9, 15, 21, 27, 33, 39, 45 });

	/**
	 * An {@link ImmutableList} of all possible sizes for {@link #fishing_bag}.
	 */
	private static final ImmutableList<Integer> fishing_bag_size = ImmutableList
			.copyOf(new Integer[] { 9, 18, 27, 36, 45 });

	/**
	 * An {@link ImmutableList} of all possible sizes for {@link #potions}.
	 */
	private static final ImmutableList<Integer> potions_size = ImmutableList
			.copyOf(new Integer[] { 9, 18, 27, 36, 45 });

	/**
	 * An {@link ImmutableList} of all possible sizes for {@link #quiver}.
	 */
	private static final ImmutableList<Integer> quiver_size = ImmutableList.copyOf(new Integer[] { 27, 36, 45 });

	/**
	 * An {@link ImmutableList} of all possible sizes for {@link #sacks}.
	 */
	private static final ImmutableList<Integer> sack_size = ImmutableList.copyOf(new Integer[] { 3, 6, 9, 12 });

	/**
	 * {@link NonNullList} holding all active {@link Accessory}.
	 */
	public NonNullList<ItemStack> accessories = NonNullList.withSize(accessories_size.get(0), ItemStack.EMPTY);

	/**
	 * Index of the first {@link ItemStack} in {@link #accessories}.
	 */
	public int accessory_start;

	/**
	 * A {@link List} of all Inventories
	 */
	public final List<NonNullList<ItemStack>> allInventories = ImmutableList.of(this.mainInventory, this.armorInventory,
			this.offHandInventory, this.fishing_bag, this.quiver, this.sacks, this.potions, this.accessories);

	/**
	 * {@link NonNullList} holding all {@link Bait}.
	 */
	public NonNullList<ItemStack> fishing_bag = NonNullList.withSize(fishing_bag_size.get(0), ItemStack.EMPTY);

	/**
	 * Index of the first {@link ItemStack} in {@link #fishing_bag}.
	 */
	public int fishing_bag_start;

	/**
	 * Index of the first {@link ItemStack} in {@link #potions}.
	 */
	public int potion_start;

	/**
	 * {@link NonNullList} holding all {@link PotionItem}.
	 */
	public NonNullList<ItemStack> potions = NonNullList.withSize(potions_size.get(0), ItemStack.EMPTY);

	/**
	 * {@link NonNullList} holding all {@link ArrowItem}.
	 */
	public NonNullList<ItemStack> quiver = NonNullList.withSize(quiver_size.get(0), ItemStack.EMPTY);

	/**
	 * Index of the first {@link ItemStack} in {@link #quiver}.
	 */
	public int quiver_start;

	/**
	 * {@link NonNullList} holding all {@link Sack}.
	 */
	public NonNullList<ItemStack> sacks = NonNullList.withSize(sack_size.get(0), ItemStack.EMPTY);

	/**
	 * Index of the first {@link ItemStack} in {@link #sacks}.
	 */
	public int sacks_start;

	/**
	 * A {@link List} of Special Inventories
	 */
	public final List<NonNullList<ItemStack>> specialInv = ImmutableList.of(this.fishing_bag, this.quiver, this.sacks,
			this.potions, this.accessories);

	/**
	 * Construct this
	 *
	 * @param playerIn the {@link PlayerEntity}
	 */
	public ExtendedPlayerInventory(PlayerEntity playerIn) {
		super(playerIn);
		this.updateStartIndexes();
	}

	@Override
	public void clear() {
		for (final NonNullList<ItemStack> inv : this.allInventories)
			inv.clear();
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		NonNullList<ItemStack> targetInventory = null;
		for (final NonNullList<ItemStack> inventory : this.allInventories) {
			if (index < inventory.size()) {
				targetInventory = inventory;
				break;
			}
			index -= inventory.size();
		}
		return targetInventory != null && !targetInventory.get(index).isEmpty()
				? ItemStackHelper.getAndSplit(targetInventory, index, count)
				: ItemStack.EMPTY;
	}

	@Override
	public void deleteStack(ItemStack stack) {
		for (final NonNullList<ItemStack> inventory : this.allInventories)
			for (int i = 0; i < inventory.size(); ++i)
				if (inventory.get(i) == stack) {
					inventory.set(i, ItemStack.EMPTY);
					return;
				}
	}

	@Override
	public void dropAllItems() {
		for (final List<ItemStack> list : this.allInventories)
			for (int i = 0; i < list.size(); ++i) {
				final ItemStack itemstack = list.get(i);
				if (!itemstack.isEmpty()) {
					this.player.dropItem(itemstack, true, false);
					list.set(i, ItemStack.EMPTY);
				}
			}
	}

	@Override
	public int getSizeInventory() {
		return super.getSizeInventory() + this.fishing_bag.size() + this.quiver.size() + this.sacks.size()
				+ this.potions.size() + this.accessories.size();
	}

	/**
	 * @return {@link #specialInv}
	 */
	public List<NonNullList<ItemStack>> getSpecialInv() {
		return this.specialInv;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		List<ItemStack> list = null;
		for (final NonNullList<ItemStack> inventory : this.allInventories) {
			if (index < inventory.size()) {
				list = inventory;
				break;
			}
			index -= inventory.size();
		}
		return list == null ? ItemStack.EMPTY : list.get(index);
	}

	@Override
	public boolean hasItemStack(ItemStack targetStack) {
		for (final NonNullList<ItemStack> inventory : this.allInventories) {
			final Iterator<ItemStack> iterator = inventory.iterator();
			while (true) {
				if (!iterator.hasNext())
					return false;
				final ItemStack stack = iterator.next();
				if (!stack.isEmpty() && stack.isItemEqual(targetStack))
					break;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		for (final NonNullList<ItemStack> inv : this.specialInv)
			if (!inv.isEmpty())
				return false;
		return super.isEmpty();
	}

	@Override
	public void read(ListNBT list) {
		super.read(list);
		for (int i = 0; i < list.size(); ++i) {
			final CompoundNBT compound = list.getCompound(i);
			final int slot = compound.getByte("Slot") & 255;
			final ItemStack stack = ItemStack.read(compound);
			if (!stack.isEmpty())
				for (final NonNullList<ItemStack> inv : this.specialInv)
					if (slot >= 200 && slot < inv.size() + 200)
						inv.set(slot - 200, stack);
		}
	}

	public void reforgeAllAccessories() {
		final AccessoryReforge reforge = AccessoryReforge.getRandomReforge();
		for (final ItemStack stack : this.accessories)
			((Accessory) stack.getItem()).setReforge(reforge);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		NonNullList<ItemStack> targetInventory = null;
		for (final NonNullList<ItemStack> inventory : this.allInventories) {
			if (index < inventory.size()) {
				targetInventory = inventory;
				break;
			}
			index -= inventory.size();
		}
		if (targetInventory != null && !targetInventory.get(index).isEmpty()) {
			final ItemStack stack = targetInventory.get(index);
			targetInventory.set(index, ItemStack.EMPTY);
			return stack;
		}
		return ItemStack.EMPTY;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		NonNullList<ItemStack> targetInventory = null;
		for (final NonNullList<ItemStack> inventory : this.allInventories) {
			if (index < inventory.size()) {
				targetInventory = inventory;
				break;
			}
			index -= inventory.size();
		}
		if (targetInventory != null)
			targetInventory.set(index, stack);
	}

	@Override
	public void tick() {
		for (final NonNullList<ItemStack> inventory : this.allInventories)
			for (int i = 0; i < inventory.size(); ++i)
				if (!inventory.get(i).isEmpty())
					inventory.get(i).inventoryTick(this.player.world, this.player, i, this.currentItem == i);
		this.armorInventory.forEach(e -> e.onArmorTick(this.player.world, this.player));
	}

	/**
	 * Update all start indexes
	 */
	public void updateStartIndexes() {
		this.fishing_bag_start = super.getSizeInventory();
		this.quiver_start = this.fishing_bag_start + this.quiver.size();
		this.sacks_start = this.quiver_start + this.quiver.size();
		this.potion_start = this.sacks_start + this.sacks.size();
		this.accessory_start = this.fishing_bag_start + this.fishing_bag.size();
	}

	@Override
	public ListNBT write(ListNBT list) {
		list = super.write(list);
		for (final NonNullList<ItemStack> inv : this.specialInv)
			for (int i = 0; i < inv.size(); i++)
				if (!inv.get(i).isEmpty()) {
					final CompoundNBT compound = new CompoundNBT();
					compound.putByte("Slot", (byte) (i + 200));
					inv.get(i).write(compound);
					list.add(compound);
				}
		return list;
	}
}