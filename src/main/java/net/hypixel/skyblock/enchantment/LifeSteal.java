package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * The Life Steal {@link Enchantment}.<br>
 * This {@code Enchantment} will heal the player .1% of the damage the player
 * deals to any entity.
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class LifeSteal extends ModEnchantment {
	public LifeSteal() {
		super(Rarity.VERY_RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
		this.name = "Life Steal";
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 11 * enchantmentLevel;
	}

	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
}