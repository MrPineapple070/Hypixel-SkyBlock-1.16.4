package net.hypixel.skyblock.enchantment;

import net.hypixel.skyblock.entity.ModCreatureAttribute;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

/**
 * @author MrPineapple070
 * @version 13 October 2020
 * @since 13 October 2020
 */
public class ModDamageEnchantment extends DamageEnchantment {
	private static final int[] LEVEL_COST = { 11, 8, 8, 8 };
	private static final int[] LEVEL_COST_SPAN = { 20, 20, 20, 20 };
	private static final int[] MIN_COST = { 1, 5, 5, 5 };

	public ModDamageEnchantment(Rarity rarityIn, int damageTypeIn, EquipmentSlotType... slots) {
		super(rarityIn, damageTypeIn, slots);
	}

	/**
	 * Calculates the additional damage that will be dealt by an item with this
	 * enchantment. This alternative to calcModifierDamage is sensitive to the
	 * targets EnumCreatureAttribute.
	 */
	@Override
	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		switch (this.damageType) {
		case 3:
			if (creatureType == ModCreatureAttribute.cube)
				return 1.1f * level;
			break;
		case 4:
			if (creatureType == ModCreatureAttribute.dragon)
				return 1.08f * level;
			break;
		case 5:
			if (creatureType == ModCreatureAttribute.ender)
				return 1.12f * level;
			break;
		case 6:
			if (creatureType == ModCreatureAttribute.impaling)
				return 1.125f * level;
			break;
		default:
			return super.calcDamageByCreature(level, creatureType);
		}
		return 0f;
	}

	/**
	 * Determines if the enchantment passed can be applyied together with this
	 * enchantment.
	 */
	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return false;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + LEVEL_COST_SPAN[this.damageType];
	}

	/**
	 * Returns the maximum level that the enchantment can have.
	 */
	@Override
	public int getMaxLevel() {
		return 5;
	}

	/**
	 * Returns the minimal value of enchantability needed on the enchantment level
	 * passed.
	 */
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return MIN_COST[this.damageType] + (enchantmentLevel - 1) * LEVEL_COST[this.damageType];
	}

	/**
	 * Called whenever a mob is damaged with an item that has this enchantment on
	 * it.
	 */
	@Override
	public void onEntityDamaged(LivingEntity user, Entity target, int level) {
		if (target instanceof LivingEntity) {
			final LivingEntity livingentity = (LivingEntity) target;
			if (this.damageType == 2 && livingentity.getCreatureAttribute() == CreatureAttribute.ARTHROPOD) {
				final int i = 20 + user.getRNG().nextInt(10 * level);
				livingentity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, i, 3));
			}
		}

	}

}