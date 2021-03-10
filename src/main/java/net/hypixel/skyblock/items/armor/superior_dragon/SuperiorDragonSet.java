package net.hypixel.skyblock.items.armor.superior_dragon;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

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
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.superior.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.superior.fsb.discription.0"),
			new TranslationTextComponent("armor.superior.fsb.discription.1"));

	private final double boots_hp = 16;
	private final double chestplate_hp = 30;
	private final double helmet_hp = 18;
	private final double leggings_hp = 26;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.boots_hp, 3, 25, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 10, 2, 8, this.chestplate_hp, 3, 25, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
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