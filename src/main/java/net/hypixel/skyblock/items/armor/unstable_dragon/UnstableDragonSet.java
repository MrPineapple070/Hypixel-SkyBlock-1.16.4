package net.hypixel.skyblock.items.armor.unstable_dragon;

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
 * @version 10 August 2020
 * @since 10 August 2020
 */
public class UnstableDragonSet implements FullSetInformation {
	public static final UnstableDragonSet instance = new UnstableDragonSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.unstable.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.unstable.fsb.discription"));

	private final double boots_hp = 12;
	private final double chestplate_hp = 24;
	private final double helmet_hp = 14;
	private final double leggings_hp = 20;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.helmet_hp, 0, 25, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Unstable_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}