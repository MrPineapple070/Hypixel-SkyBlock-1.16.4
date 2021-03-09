package net.hypixel.skyblock.items.armor.spooky;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Spooky_Armor">Spooky Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpookySet implements FullSetInformation {
	public static final SpookySet instance = new SpookySet();

	public SpookySet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent("Full Set Bonus: Candy Man").mergeStyle(TextFormatting.GOLD),
				new StringTextComponent("Grants a +5% chance to find rare candy."));
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] {};
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Spooky;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}