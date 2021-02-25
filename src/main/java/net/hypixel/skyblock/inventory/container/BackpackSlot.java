package net.hypixel.skyblock.inventory.container;

import net.hypixel.skyblock.items.AbstractBackpack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

/**
 * @author LaiHuy411846
 * @version 09 November 2020
 * @since 09 November 2020
 */
public class BackpackSlot extends Slot {
	public BackpackSlot(IInventory inventoryIn, int row, int col) {
		super(inventoryIn, col + row * 9 + 9, 207 - col * 18, 122 - row * 18);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return !(stack.getItem() instanceof AbstractBackpack);
	}
}