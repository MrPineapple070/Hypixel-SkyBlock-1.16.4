package net.hypixel.skyblock.inventory.container.minion;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.blocks.minion.MinionChestBlock.MinionChestType;
import net.hypixel.skyblock.inventory.container.init.ModContainerTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

/**
 * Serve as a basis for all {@code MinionChestContainer}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Minion_Chests">Click
 * here</a> for a description of Minion Chests.
 *
 * @author MrPineapple070
 * @version 12 June 2020
 * @since 11 June 2019
 */
public abstract class MinionChestContainer extends Container {
	/**
	 * {@link IInventory} of the contents of this.
	 */
	@Nonnull
	protected final IInventory chestInventory;

	/**
	 * {@link MinionChestType} of this.
	 */
	@Nonnull
	protected final MinionChestType type;

	protected MinionChestContainer(ContainerType<? extends MinionChestContainer> typeIn, int windowId,
			PlayerInventory pInvIn, MinionChestType type) {
		super(typeIn, windowId);
		this.type = type;
		this.chestInventory = new Inventory(this.type.additional);
		this.chestInventory.openInventory(pInvIn.player);

		// Main Inventory
		int rowMin, rowMax, colMin, colMax;
		switch (type) {
		case Small:
			rowMin = 1;
			rowMax = 2;
			colMin = 1;
			colMax = 4;
			break;
		case Medium:
			rowMin = 0;
			rowMax = 3;
			colMin = 1;
			colMax = 4;
			break;
		case Large:
			rowMin = 0;
			rowMax = 3;
			colMin = 0;
			colMax = 5;
			break;
		default:
			throw new IllegalStateException("Illegal MinionChestType " + this.type.name());
		}

		// Main Inventory
		for (int row = rowMin; row < rowMax; ++row)
			for (int col = colMin; col < colMax; ++col)
				this.addSlot(new MinionChestSlot(this.chestInventory, row, col, rowMax));

		// Player Inventory
		for (int row = 0; row < 3; ++row)
			for (int col = 0; col < 9; ++col)
				this.addSlot(new Slot(pInvIn, 9 + 9 * row + col, 48 + 18 * col, 129 + 18 * row));

		// Player HotBar
		for (int col = 0; col < 9; ++col)
			this.addSlot(new Slot(pInvIn, col, 48 + 18 * col, 187));
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return this.chestInventory.isUsableByPlayer(playerIn);
	}

	public IInventory getChestInventory() {
		return this.chestInventory;
	}

	@Override
	public void onContainerClosed(PlayerEntity playerIn) {
		super.onContainerClosed(playerIn);
		this.chestInventory.closeInventory(playerIn);
	}

	@Override
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (index < this.type.additional)
				if (!this.mergeItemStack(itemstack1, this.type.additional, this.inventorySlots.size(), true))
					return ItemStack.EMPTY;
				else if (!this.mergeItemStack(itemstack1, 0, this.type.additional, false))
					return ItemStack.EMPTY;

			if (itemstack1.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();
		}
		return itemstack;
	}

	public static class SmallMCC extends MinionChestContainer {
		public SmallMCC(int windowId, PlayerInventory pInvIn) {
			super(ModContainerTypes.small_mcc.get(), windowId, pInvIn, MinionChestType.Small);
		}

		public SmallMCC(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn);
		}
	}

	public static class MediumMCC extends MinionChestContainer {
		public MediumMCC(int windowId, PlayerInventory pInvIn) {
			super(ModContainerTypes.medium_mcc.get(), windowId, pInvIn, MinionChestType.Medium);
		}

		public MediumMCC(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn);
		}
	}

	public static class LargeMCC extends MinionChestContainer {
		public LargeMCC(int windowId, PlayerInventory pInvIn) {
			super(ModContainerTypes.large_mcc.get(), windowId, pInvIn, MinionChestType.Large);
		}

		public LargeMCC(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn);
		}
	}
}