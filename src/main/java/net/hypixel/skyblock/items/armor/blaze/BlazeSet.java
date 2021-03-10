package net.hypixel.skyblock.items.armor.blaze;

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
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Blaze_Armor">Blaze
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class BlazeSet implements FullSetInformation {
	public static final BlazeSet instance = new BlazeSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.blaze.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.blaze.fsb.discription.0"),
			new TranslationTextComponent("armor.blaze.fsb.discription.1"));

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Blaze;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}