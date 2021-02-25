package net.hypixel.skyblock.items.armor.strong_dragon;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;

/**
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class StrongDragonSet implements FullSetInformation {
	public static final StrongDragonSet instance = new StrongDragonSet();

	private final double boots_hp = 12;
	private final int boots_str = 25;
	private final double chestplate_hp = 24;

	private final double helmet_hp = 5;
	private final int helmet_str = 25;
	private final double leggings_hp = 20;
	private final int leggings_str = 25;

	public StrongDragonSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { this.boots_str, 0, 0, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Strong Blood\n" + FormatingCodes.gray
				+ "Gives +75 damage, +2 teleport distance, +3 seconds of duration, +5 strength of cast to the Aspect of the End.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { this.helmet_str, 0, 0, this.helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { this.leggings_str, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Strong_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}