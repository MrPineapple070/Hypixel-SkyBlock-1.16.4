package net.hypixel.skyblock.items.armor.sponge;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;

/**
 *
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpongeSet implements FullSetInformation {
	public static final SpongeSet instance = new SpongeSet();

	public SpongeSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Absorb\n" + FormatingCodes.gray
				+ "Doubles defense while in water.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Sponge;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}