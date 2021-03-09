package net.hypixel.skyblock.items.armor.monster_hunter;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Monster_Hunter_Armor">Monster
 * Hunter Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MonsterHunterSet implements FullSetInformation {
	public static final MonsterHunterSet instance = new MonsterHunterSet();

	public int boots_int = 50;
	public int boots_spd = 5;

	public int chestplate_hp = 4;
	public int leggings_hp = 40;

	public MonsterHunterSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.boots_spd, this.boots_int, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList();
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Monster_Hunter;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}