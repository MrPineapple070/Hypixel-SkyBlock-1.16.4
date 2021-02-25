package net.hypixel.skyblock.items.armor.fancy_tuxedo;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fancy_Tuxedo">Fancy Tuxedo
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FancyTuxedoSet implements FullSetInformation {
	public static final int boots_cr_dmg = 35;

	public static final int boots_int = 74;
	public static final int chestplate_cr_dmg = 80;
	public static final int chestplate_int = 150;

	public static final FancyTuxedoSet instance = new FancyTuxedoSet();
	public static final int leggings_cr_dmg = 35;
	public static final int leggings_int = 75;

	public FancyTuxedoSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, boots_cr_dmg, 0, 0, boots_int, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, chestplate_cr_dmg, 0, 0, chestplate_int, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Dashing!\n" + FormatingCodes.gray
				+ "Set max health to 150.\nDeal 100% more damage.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("Helmet does not exist for the Fancy Tuxedo Set.");
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, leggings_cr_dmg, 0, 0, leggings_int, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Fancy_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}