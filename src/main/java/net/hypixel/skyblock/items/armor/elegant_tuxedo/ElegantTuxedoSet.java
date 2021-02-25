package net.hypixel.skyblock.items.armor.elegant_tuxedo;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific infomration for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Elegant_Tuxedo">Elegant
 * Tuxedo Set</a>
 *
 * @author MrPineapple070
 * @version 04 August 2020
 * @since 04 August 2020
 */
public class ElegantTuxedoSet implements FullSetInformation {
	public static final ElegantTuxedoSet instance = new ElegantTuxedoSet();

	public ElegantTuxedoSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 50, 0, 10, 100, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 100, 0, 0, 300, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Dashing!\n" + FormatingCodes.gray
				+ "Max health is set to 50.\nDeal +150% more damage";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("The helmet does not exist for the Elegant Tuxedo set.");
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 50, 0, 0, 100, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Elegant_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}
