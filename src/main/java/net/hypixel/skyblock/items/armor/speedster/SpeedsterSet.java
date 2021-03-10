package net.hypixel.skyblock.items.armor.speedster;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Speedster_Armor">Speedster
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 18 Decmeber 2019
 * @since 11 June 2019
 */
public class SpeedsterSet implements FullSetInformation {
	public static final SpeedsterSet instance = new SpeedsterSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.speedster.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.speedster.fsb.discription", StatString.speed));

	private static final int boots_spd = 15;
	private static final int chestplate_spd = 15;
	private static final int helmet_spd = 15;
	private static final int leggings_spd = 15;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, boots_spd, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, chestplate_spd, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, helmet_spd, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, leggings_spd, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Speedster;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}