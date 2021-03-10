package net.hypixel.skyblock.items.armor.growth;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;

/**
 * Hold {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_Growth">GrowthSet
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GrowthSet implements FullSetInformation {
	public static final GrowthSet instance = new GrowthSet();
	
	public static final int boots = 10;
	public static final int chestplate = 20;
	public static final int helmet = 10;
	public static final int leggings = 16;
	
	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] {0, 0, 0, boots, 0, 0, 0};
	}
	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] {0, 0, 0, chestplate, 0, 0, 0};
	}
	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList();
	}
	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] {0, 0, 0, helmet, 0, 0, 0};
	}
	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] {0, 0, 0, leggings, 0, 0, 0};
	}
	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Growth;
	}
	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Uncommon;
	}
}