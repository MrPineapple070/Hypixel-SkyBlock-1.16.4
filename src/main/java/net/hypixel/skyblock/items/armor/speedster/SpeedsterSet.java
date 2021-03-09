package net.hypixel.skyblock.items.armor.speedster;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

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
	private static final int boots_spd = 15;

	private static final int chestplate_spd = 15;
	private static final int helmet_spd = 15;
	public static final SpeedsterSet instance = new SpeedsterSet();
	private static final int leggings_spd = 15;

	public SpeedsterSet() {
	}

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
		return Arrays.asList(new StringTextComponent("Full Set Bonus: Bonus Speed").mergeStyle(TextFormatting.GOLD),
				new StringTextComponent("Increases speed by 20%."));
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