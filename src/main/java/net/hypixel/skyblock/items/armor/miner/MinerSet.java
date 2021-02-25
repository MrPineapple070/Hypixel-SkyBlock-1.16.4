package net.hypixel.skyblock.items.armor.miner;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner_Armor">Miner Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MinerSet implements FullSetInformation {

	public static int boots_def = 9;

	public static int chestplate_def = 19;
	public static int helmet_def = 9;
	public static final MinerSet instance = new MinerSet();
	public static int leggings_def = 14;

	public MinerSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Regeneration\n" + FormatingCodes.gray
				+ "Regenerates 5% of your max Heal every second when exiting combat for 8 seconds.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Miner;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}