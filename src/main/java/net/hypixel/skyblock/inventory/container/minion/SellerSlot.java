package net.hypixel.skyblock.inventory.container.minion;

import net.hypixel.skyblock.tags.ModItemTags;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

/**
 * @author LaiHuy411846
 * @version 08 November 2020
 */
public class SellerSlot extends Slot {
	public SellerSlot(IInventory inventoryIn) {
		super(inventoryIn, 1, 44, 36);
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return 1;
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return stack.getItem().isIn(ModItemTags.seller);
	}
}