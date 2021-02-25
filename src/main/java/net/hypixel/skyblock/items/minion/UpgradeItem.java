package net.hypixel.skyblock.items.minion;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UpgradeItem extends Item {
	public UpgradeItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
