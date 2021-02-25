package net.hypixel.skyblock.inventory.container;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.items.AbstractBackpack.BackpackType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

/**
 * Serve as a base for Backpack Containers
 *
 * @author MrPineapple070
 * @version 08 September 2020
 * @since 11 June 2019
 */
public class AbstractBackpackContainer extends Container implements INamedContainerProvider {
	public static class SmallBC extends AbstractBackpackContainer {
		public SmallBC(int id, PlayerInventory pInvIn) {
			super(ModContainerTypes.small_backpack.get(), id, pInvIn, BackpackType.Small);
		}

		public SmallBC(int id, PlayerInventory pInvIn, PacketBuffer data) {
			this(id, pInvIn);
		}
	}
	
	public static class MediumBC extends AbstractBackpackContainer {
		public MediumBC(int id, PlayerInventory pInvIn) {
			super(ModContainerTypes.medium_backpack.get(), id, pInvIn, BackpackType.Medium);
		}

		public MediumBC(int id, PlayerInventory pInvIn, PacketBuffer data) {
			this(id, pInvIn);
		}
	}
	
	public static class LargeBC extends AbstractBackpackContainer {
		public LargeBC(int id, PlayerInventory pInvIn) {
			super(ModContainerTypes.large_backpack.get(), id, pInvIn, BackpackType.Large);
		}

		public LargeBC(int id, PlayerInventory pInvIn, PacketBuffer data) {
			this(id, pInvIn);
		}
	}
	
	public static class GreaterBC extends AbstractBackpackContainer {
		public GreaterBC(int id, PlayerInventory pInvIn) {
			super(ModContainerTypes.greater_backpack.get(), id, pInvIn, BackpackType.Greater);
		}

		public GreaterBC(int id, PlayerInventory pInvIn, PacketBuffer data) {
			this(id, pInvIn);
		}
	}
	
	public static class JumboBC extends AbstractBackpackContainer {
		public JumboBC(int id, PlayerInventory pInvIn) {
			super(ModContainerTypes.jumbo_backpack.get(), id, pInvIn, BackpackType.Jumbo);
		}
		
		public JumboBC(int id, PlayerInventory pInvIn, PacketBuffer data) {
			this(id, pInvIn);
		}
	}

	/**
	 * {@link IInventory} of this
	 */
	@Nonnull
	protected final IInventory bpInv;

	/**
	 * {@link BackpackType}
	 */
	@Nonnull
	protected final BackpackType type;

	/**
	 * Construct this
	 *
	 * @param containerType the {@link ContainerType}
	 * @param id            the window id
	 * @param pInvIn        the player's {@link PlayerInventory}
	 * @param type          the {@link BackpackType}
	 */
	private AbstractBackpackContainer(ContainerType<? extends AbstractBackpackContainer> containerType, int id,
			PlayerInventory pInvIn, @Nonnull BackpackType type) {
		super(containerType, id);
		this.type = type;
		this.bpInv = new Inventory(this.type.size);
		Container.assertInventorySize(this.bpInv, this.type.size);
		this.bpInv.openInventory(pInvIn.player);

		// Main Inventory
		for (int row = 0; row < this.type.size / 9; row++)
			for (int col = 0; col < 9; col++)
				this.addSlot(new BackpackSlot(this.bpInv, row, col));

		// Player Inventory
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 9; col++)
				this.addSlot(new Slot(pInvIn, col + row * 9 + 9, 48 + col * 18, 139 + row * 18));

		// Hotbar
		for (int i = 0; i < 9; i++)
			this.addSlot(new Slot(pInvIn, i, 48 + i * 18, 197));
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return this.bpInv.isUsableByPlayer(playerIn);
	}

	/**
	 * @return {@link #type}
	 */
	public BackpackType getBackpackType() {
		return this.type;
	}

	@Override
	public void onContainerClosed(PlayerEntity playerIn) {
		super.onContainerClosed(playerIn);
		this.bpInv.closeInventory(playerIn);
	}

	@Override
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
		ItemStack copy = ItemStack.EMPTY;
		final Slot slot = this.inventorySlots.get(index);
		if (slot != null && slot.getHasStack()) {
			final ItemStack slotStack = slot.getStack();
			copy = slotStack.copy();
			if (index < this.type.size)
				if (!this.mergeItemStack(slotStack, this.type.size, this.inventorySlots.size(), true))
					return ItemStack.EMPTY;
				else if (!this.mergeItemStack(slotStack, 0, this.type.size, false))
					return ItemStack.EMPTY;
			if (slotStack.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();
		}
		return copy;
	}

	@Override
	public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
		return this;
	}

	@Override
	public ITextComponent getDisplayName() {
		return new StringTextComponent(this.type.name() + " Backpack");
	}
}