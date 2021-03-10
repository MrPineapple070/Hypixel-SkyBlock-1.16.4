package net.hypixel.skyblock.items.armor.revenant;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Revenant_Armor">Revenant
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 15 October 2019
 * @since 11 October 2019
 */
public class RevenantSet implements FullSetInformation {
	public static final RevenantSet instance = new RevenantSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.revenant.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.revenant.fsb.discription.0"),
			new TranslationTextComponent("armor.revenant.fsb.discription.1", StatString.defense));

	public double boots_hp = 20;
	public double chestplate_hp = 36;
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
		throw new IllegalAccessException("Helmet does not exist for the Revenant Set.");
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Revenant;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}