package net.hypixel.skyblock.items.armor.mushroom;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mushroom_Armor">Mushroom
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MushroomSet implements FullSetInformation {
	public static final MushroomSet instance = new MushroomSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.mushroom.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.mushroom.fsb.discription.0",
					((IFormattableTextComponent) Effects.NIGHT_VISION.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.NIGHT_VISION.getLiquidColor())))),
			new TranslationTextComponent("armor.mushroom.fsb.discription.1"));

	public int boots_hp = 3;
	public int chestplate_hp = 2;
	public int helmet_hp = 4;
	public int leggings_hp = 1;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
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
		return ModArmorMaterial.Mushroom;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}