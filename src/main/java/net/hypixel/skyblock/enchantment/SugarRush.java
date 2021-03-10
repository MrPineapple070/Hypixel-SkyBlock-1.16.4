package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class SugarRush extends ModEnchantment {

	public SugarRush() {
		super(Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET});
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
}