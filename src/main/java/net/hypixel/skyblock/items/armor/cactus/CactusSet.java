package net.hypixel.skyblock.items.armor.cactus;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Cactus_Armor">Cactus
 * Armor</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class CactusSet implements FullSetInformation {
	public static final CactusSet instance = new CactusSet();

	public CactusSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, 1, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, 3, 0, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Deflect\n" + FormatingCodes.gray
				+ "Rebound 33% of the damage you take back at your enemy.";
	}

	@Override
	public double[] getHelmetBuffs() {
		return new double[] { 0, 0, 0, 1, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, 2, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Cactus;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}
