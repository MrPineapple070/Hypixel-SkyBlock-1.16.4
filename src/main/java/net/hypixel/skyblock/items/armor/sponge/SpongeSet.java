package net.hypixel.skyblock.items.armor.sponge;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

/**
 *<a href="https://hypixel-skyblock.fandom.com/wiki/Sponge_Armor">Sponge Armor</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpongeSet implements FullSetInformation {
	public static final SpongeSet instance = new SpongeSet();

	public SpongeSet() {
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
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Absorb"),
				new StringTextComponent("Doubles defense while in water."));
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
		return ModArmorMaterial.Sponge;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}