package net.hypixel.skyblock.items.armor.leaflet;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Leaflet_Armor">Leadlet
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class LeafletSet implements FullSetInformation {

	public static final LeafletSet instance = new LeafletSet();

	public double boots_hp = 3;
	public double chestplate_hp = 7;
	public double helmet_hp = 4;
	public double leggings_hp = 6;

	public LeafletSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public String getFullSetBonus() {
		return FormatingCodes.gold + "Full Set Bonus: Energy of the Forest\n" + FormatingCodes.gray
				+ "Grants +10% damage reduction and +10% extra damage.";
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Leaflet;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}