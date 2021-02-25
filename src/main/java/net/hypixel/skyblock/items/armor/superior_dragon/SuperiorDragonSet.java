package net.hypixel.skyblock.items.armor.superior_dragon;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Superior_Dragon_Armor">Superior
 * Dragon Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class SuperiorDragonSet implements FullSetInformation {
	public static final SuperiorDragonSet instance = new SuperiorDragonSet();

	private final double boots_hp = 16;
	private final double chestplate_hp = 30;
	private final double helmet_hp = 18;
	private final double leggings_hp = 26;

	public SuperiorDragonSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.boots_hp, 3, 25, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.chestplate_hp, 3, 25, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Superior Blood\n" + FormatingCodes.gray
				+ "All stats are increased by 5%.\nThe Aspect of the Dragons ability deals 50% more damage.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.helmet_hp, 3, 25, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.leggings_hp, 3, 25, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Superior_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}