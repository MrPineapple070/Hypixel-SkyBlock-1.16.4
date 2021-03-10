package net.hypixel.skyblock.items.armor.cheap_tuxedo;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class CheapTuxedoSet implements FullSetInformation {
	public static CheapTuxedoSet instance = new CheapTuxedoSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.tux.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.tux.fsb.discription", "75", "50"));

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 25, 0, 0, 0, 25, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 50, 0, 0, 0, 50, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("The Helmet does not exist in this set.");
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 25, 0, 0, 0, 25, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Cheap_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}