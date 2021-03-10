package net.hypixel.skyblock.items.armor.old_dragon;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class OldDragonSet implements FullSetInformation {
	public static final OldDragonSet instance = new OldDragonSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.old.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.old.fsb.discription", "Growth",
					Enchantments.PROTECTION.getDisplayName(1), Enchantments.FEATHER_FALLING.getDisplayName(1)));

	public double boots_hp = 15;
	public double chestplate_hp = 32;
	public double helmet_hp = 22;
	public double leggings_hp = 26;

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
		return ModArmorMaterial.Old_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}