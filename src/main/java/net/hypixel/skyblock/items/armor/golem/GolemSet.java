package net.hypixel.skyblock.items.armor.golem;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Golem_Armor">Golem Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GolemSet implements FullSetInformation {
	public static final GolemSet instance = new GolemSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.golem.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.golem.fsb.discription.0",
					((IFormattableTextComponent) Effects.ABSORPTION.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.ABSORPTION.getLiquidColor())))),
			new TranslationTextComponent("armor.golem.fsb.discription.1"));

	public static double boots_hp = 8;
	public static double chestplate_hp = 13;
	public static double helmet_hp = 9;
	public static double leggings_hp = 11;

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Golem;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}
