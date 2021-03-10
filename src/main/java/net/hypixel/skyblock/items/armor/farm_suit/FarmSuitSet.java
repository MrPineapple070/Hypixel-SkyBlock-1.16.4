package net.hypixel.skyblock.items.armor.farm_suit;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farm_Suit">Farm Suit
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class FarmSuitSet implements FullSetInformation {
	public static final FarmSuitSet instance = new FarmSuitSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.farm.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.farm.fsb.discription", StatString.speed),
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.farm_suit.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.farm_suit.fsb.discription"));

	private final int boots_spd = 0;
	private final int chestplate_spd = 0;
	private final int helmet_spd = 0;
	private final int leggings_spd = 0;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.boots_spd, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.chestplate_spd, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.helmet_spd, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, this.leggings_spd, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Farm_Suit;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}