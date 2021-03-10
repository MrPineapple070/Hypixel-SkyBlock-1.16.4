package net.hypixel.skyblock.items.armor.magma;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_Magma">MagmaSet
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 31 July 2020
 * @since 31 July 2020
 */
public class MagmaSet implements FullSetInformation {
	public static final MagmaSet instance = new MagmaSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.magma.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.magma.fsb.discription.0", "Magma Cube", StatString.health, StatString.intelligence),
			new TranslationTextComponent("armor.magma.fsb.discription.1"));

	public static final int boots = 9;
	public static final int chestplate = 20;
	public static final int helmet = 3;
	public static final int leggings = 15;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, boots, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
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
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, leggings, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Magma;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}