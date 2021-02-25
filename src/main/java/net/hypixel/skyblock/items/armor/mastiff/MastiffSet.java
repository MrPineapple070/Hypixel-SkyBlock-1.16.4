package net.hypixel.skyblock.items.armor.mastiff;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mastiff_Armor">Mastiff
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class MastiffSet implements FullSetInformation {

	public static final MastiffSet instance = new MastiffSet();

	private final double boots_hp = 500;

	private final int boots_int = 25;
	private final double chestplate_hp = 500;
	private final double helmet_hp = 500;
	private final int helmet_int = 125;

	private final double leggings_hp = 500;

	public MastiffSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, this.boots_int, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Absolute Unit\n" + FormatingCodes.gray + "+10 "
				+ FormatingCodes.red + "Health" + FormatingCodes.gray + " per " + FormatingCodes.dark_blue
				+ "Crit Damage" + FormatingCodes.gray
				+ ".\nRegain 2% of max hp when hit.\nReceive -20% damage from wolves.\n" + FormatingCodes.dark_blue
				+ "Crit Damage" + FormatingCodes.gray + " is 50% less effective.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.helmet_hp, 0, this.helmet_int, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Mastiff;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}