package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * @author MrPineapple070
 * @version 13 October 2020
 * @since 13 October 2020
 */
public class Critical extends ModEnchantment {
	protected Critical() {
		super(Rarity.UNCOMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 6;
	}

	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}

	@Override
	public void onEntityDamaged(LivingEntity user, Entity target, int level) {
		level *= 1.1;
		super.onEntityDamaged(user, target, level);
	}
}