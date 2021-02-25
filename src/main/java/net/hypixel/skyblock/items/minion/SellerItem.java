package net.hypixel.skyblock.items.minion;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Seller Items for Minions
 *
 * @author mrPineapple
 * @version 22 June 2020
 */
public class SellerItem extends Item {
	/**
	 * Construct {@code this}
	 *
	 * @param properties {@link Properties}
	 */
	public SellerItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
