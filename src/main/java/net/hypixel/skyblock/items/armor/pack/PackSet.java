package net.hypixel.skyblock.items.armor.pack;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_the_Pack">PackSet
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class PackSet implements FullSetInformation {
	static final PackSet instance = new PackSet();

	private static final int helmet = 29;
	private static final int chestplate = 35;
	private static final int leggings = 30;
	private static final int boots = 25;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, chestplate, 0, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Armor of the PackSet\n" + FormatingCodes.gray + "Gain +35 "
				+ StatString.strength + FormatingCodes.gray + " and +80 " + StatString.defense + FormatingCodes.gray
				+ " for each Armor of the PackSet wearers within 30 blocks. Max of 3 players.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, leggings, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, boots, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Pack;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}