package net.hypixel.skyblock.items.armor.mastiff;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mastiff_Armor">Mastiff
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class MastiffSet implements FullSetInformation {
	public static final MastiffSet instance = new MastiffSet();

	protected static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.mastiff.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.mastiff.fsb.discription.0", StatString.health, StatString.crit_damage),
			new TranslationTextComponent("armor.mastiff.fsb.discription.1"),
			new TranslationTextComponent("armor.mastiff.fsb.discription.2"),
			new TranslationTextComponent("armor.mastiff.fsb.discription.3", StatString.crit_damage));

	private final double boots_hp = 500;
	private final int boots_int = 25;

	private final double chestplate_hp = 500;

	private final double helmet_hp = 500;
	private final int helmet_int = 125;

	private final double leggings_hp = 500;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, this.boots_int, 0 };
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
		return new double[] { 0, 0, 0, this.helmet_hp, 0, this.helmet_int, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Mastiff;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}