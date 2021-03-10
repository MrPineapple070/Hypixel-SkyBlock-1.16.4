package net.hypixel.skyblock.items.armor.emerald;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class EmeraldSet implements FullSetInformation {
	public static final EmeraldSet instance = new EmeraldSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.emerald.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.emerald.fsb.discription.0", StatString.health, StatString.defense,
					Items.EMERALD.getDisplayName(new ItemStack(Items.EMERALD))),
			new TranslationTextComponent("armor.emerald.fsb.discription.1"));

	private static int boots = 0;
	private static int chestplate = 0;
	private static int helmet = 0;
	private static int leggings = 0;

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, boots, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, chestplate, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, leggings, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Emerald;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}