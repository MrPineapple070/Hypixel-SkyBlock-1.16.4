package net.hypixel.skyblock.inventory.container.minion;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

/**
 * @author MrPineapple070
 * @version 08 November 2020
 * @since 08 November 2020
 */
public class MinionSlot extends Slot {
	public MinionSlot(IInventory inventoryIn, int row, int col) {
		super(inventoryIn, 4 + row * 5 + col, 80 + 18 * col, 18 + 18 * row);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return false;
	}
}