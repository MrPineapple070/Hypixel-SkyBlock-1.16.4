package net.hypixel.skyblock.inventory.container;

import net.hypixel.skyblock.items.AbstractBackpack;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.PlayerContainer;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

/**
 * Extend the {@link PlayerContainer}
 *
 * @author MrPineapple070
 * @version 24 July 2020
 */
public class ExtendedPlayerContainer extends PlayerContainer {
	/**
	 * Construct this.
	 *
	 * @param playerInventory the {@link PlayerInventory} of this.
	 * @param localWorld      determine if this is server or client side
	 * @param playerIn        the {@link PlayerEntity} of this.
	 */
	public ExtendedPlayerContainer(PlayerInventory playerInventory, boolean localWorld, PlayerEntity playerIn) {
		super(playerInventory, localWorld, playerIn);
		/**
		 * this.addSlot(new Slot(playerInventory, 41, 77, 44) {
		 *
		 * @Nullable
		 * @Override
		 * @OnlyIn(Dist.CLIENT) public Pair<ResourceLocation, ResourceLocation>
		 *                      func_225517_c_() { return
		 *                      Pair.of(AtlasTexture.LOCATION_BLOCKS_TEXTURE, null); }
		 *
		 * @Override public boolean isItemValid(ItemStack stack) { return
		 *           stack.getItem() instanceof AbstractBackpack; } });
		 */
	}

	@Override
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
		ItemStack copy = ItemStack.EMPTY;
		final Slot slot = this.inventorySlots.get(index);
		if (slot != null && slot.getHasStack()) {
			final ItemStack slotStack = slot.getStack();
			copy = slotStack.copy();
			final EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(copy);
			if (index != 46 && copy.getItem() instanceof AbstractBackpack)
				if (!this.inventorySlots.get(46).getHasStack())
					if (!this.mergeItemStack(slotStack, 46, 47, false))
						return ItemStack.EMPTY;
					else if (index == 0) {
						if (!this.mergeItemStack(slotStack, 9, 45, true))
							return ItemStack.EMPTY;
						slot.onSlotChange(slotStack, copy);
					} else if (index < 5)
						if (!this.mergeItemStack(slotStack, 9, 45, false))
							return ItemStack.EMPTY;
						else if (index < 9)
							if (!this.mergeItemStack(slotStack, 9, 45, false))
								return ItemStack.EMPTY;
							else if (equipmentslottype.getSlotType() == EquipmentSlotType.Group.ARMOR
									&& !this.inventorySlots.get(8 - equipmentslottype.getIndex()).getHasStack()) {
								final int i = 8 - equipmentslottype.getIndex();
								if (!this.mergeItemStack(slotStack, i, i + 1, false))
									return ItemStack.EMPTY;
							} else if (equipmentslottype == EquipmentSlotType.OFFHAND
									&& !this.inventorySlots.get(45).getHasStack())
								if (!this.mergeItemStack(slotStack, 45, 46, false))
									return ItemStack.EMPTY;
								else if (index == 46)
									if (!this.mergeItemStack(slotStack, 9, 45, false))
										return ItemStack.EMPTY;
									else if (index < 36)
										if (!this.mergeItemStack(slotStack, 36, 45, false))
											return ItemStack.EMPTY;
										else if (index < 45)
											if (!this.mergeItemStack(slotStack, 9, 36, false))
												return ItemStack.EMPTY;
											else if (!this.mergeItemStack(slotStack, 9, 45, false))
												return ItemStack.EMPTY;

			if (slotStack.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();

			if (slotStack.getCount() == copy.getCount())
				return ItemStack.EMPTY;

			final ItemStack itemstack2 = slot.onTake(playerIn, slotStack);
			if (index == 0)
				playerIn.dropItem(itemstack2, false);
		}
		return copy;
	}
}
