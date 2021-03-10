package net.hypixel.skyblock.items.armor.sponge;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sponge_Armor">Sponge
 * Armor</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpongeSet implements FullSetInformation {
	public static final SpongeSet instance = new SpongeSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.sponge.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.sponge.fsb.discription", StatString.defense));

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
		return fsb;
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