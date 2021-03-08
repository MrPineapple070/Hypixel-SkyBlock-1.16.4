package net.hypixel.skyblock.items.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

/**
 * @author MrPineapple070
 * @version 08 March 2021
 * @since 11 July 2019
 */
public enum ModToolTier implements IItemTier {
	BP0(0, 2f), BP1(1, 4f), BP2(2, 6f), BP3(3, 8f), BP4(4, 9f), BP5(5, 12f), BP6(6, 14f);

	private final int harvest_lvl;
	private final float efficiency;

	private ModToolTier(int lvl, float eff) {
		this.harvest_lvl = lvl;
		this.efficiency = eff;
	}

	@Override
	public int getMaxUses() {
		return Integer.MAX_VALUE;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return 0f;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvest_lvl;
	}

	@Override
	public int getEnchantability() {
		return 32;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.EMPTY;
	}
}