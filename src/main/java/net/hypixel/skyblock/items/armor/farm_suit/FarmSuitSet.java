package net.hypixel.skyblock.items.armor.farm_suit;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farm_Suit">Farm Suit
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class FarmSuitSet implements FullSetInformation {
	public static final FarmSuitSet instance = new FarmSuitSet();

	private final int boots_spd = 0;
	private final int chestplate_spd = 0;
	private final int helmet_spd = 0;
	private final int leggings_spd = 0;

	public FarmSuitSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.boots_spd, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.chestplate_spd, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Bonus Speed\n" + FormatingCodes.gray + "Increases"
				+ FormatingCodes.white + " Speed" + FormatingCodes.gray
				+ " by 20% while worn near Farming Minions or in the Farm, Barn, and Mushroom Desert.\n"
				+ FormatingCodes.gold + "Full Set Bonus: Farmer Aura\n" + FormatingCodes.gray
				+ "Increases te regrowth rate of nearby crops on public islands.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.helmet_spd, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.leggings_spd, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Farm_Suit;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}