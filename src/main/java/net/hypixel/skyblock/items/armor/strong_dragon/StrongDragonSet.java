package net.hypixel.skyblock.items.armor.strong_dragon;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class StrongDragonSet implements FullSetInformation {
	public static final StrongDragonSet instance = new StrongDragonSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.strong.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.strong.fsb.discription"));

	private final double boots_hp = 12;
	private final int boots_str = 25;
	private final double chestplate_hp = 24;

	private final double helmet_hp = 5;
	private final int helmet_str = 25;
	private final double leggings_hp = 20;
	private final int leggings_str = 25;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { this.boots_str, 0, 0, this.boots_hp, 0, 0, 0 };
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
		return new double[] { this.helmet_str, 0, 0, this.helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { this.leggings_str, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Strong_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}