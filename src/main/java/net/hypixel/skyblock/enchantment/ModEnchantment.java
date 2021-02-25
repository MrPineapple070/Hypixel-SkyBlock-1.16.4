package net.hypixel.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * A Mod version of {@link Enchantment}
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public abstract class ModEnchantment extends Enchantment {
	/**
	 * @param rarityIn {@link Rarity} of this
	 * @param typeIn   {@link EnchantmentType} of this
	 * @param slots    {@link EquipmentSlotType}[] of this
	 */
	protected ModEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
	}

	@Override
	protected abstract boolean canApplyTogether(Enchantment ench);

	@Override
	public abstract int getMaxLevel();

	@Override
	public abstract boolean isAllowedOnBooks();
}