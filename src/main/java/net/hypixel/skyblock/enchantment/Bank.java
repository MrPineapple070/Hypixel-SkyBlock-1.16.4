package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class Bank extends ModEnchantment {

	public Bank() {
		super(Rarity.VERY_RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] { EquipmentSlotType.HEAD,
				EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET });
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
}