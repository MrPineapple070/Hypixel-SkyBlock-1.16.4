package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * The Smelting Touch {@link Enchantment}. <br>
 * This {@code Enchantment} will will auto smelt any block broken. <br>
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class SmeltingTouch extends ModEnchantment {
	public SmeltingTouch() {
		super(Rarity.UNCOMMON, EnchantmentType.DIGGER, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
		this.name = "Smelting Touch";
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return ench != Enchantments.SILK_TOUCH;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}

	@Override
	public int getMaxLevel() {
		return 1;
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