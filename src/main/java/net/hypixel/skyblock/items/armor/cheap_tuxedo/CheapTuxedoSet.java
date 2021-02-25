package net.hypixel.skyblock.items.armor.cheap_tuxedo;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;

public class CheapTuxedoSet implements FullSetInformation {
	public static CheapTuxedoSet instance = new CheapTuxedoSet();

	public CheapTuxedoSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 25, 0, 0, 0, 25, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 50, 0, 0, 0, 50, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Dashing!\n" + FormatingCodes.gray
				+ "Max health is set to 75. Deal +50% more damaage.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("The Helmet does not exist in this set.");
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 25, 0, 0, 0, 25, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Cheap_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}