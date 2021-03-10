package net.hypixel.skyblock.items.armor.adaptive;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Adaptive_Armor">Adaptive
 * Set</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 7 July 2020
 */
public class AdaptiveSet implements FullSetInformation {
	public static final AdaptiveSet instance = new AdaptiveSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.adaptive.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.adaptive.fsb.discription"));

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 45, 0, 0, 18, 0, 15, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 15, 0, 0, 34, 0, 15, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() {
		return new double[] { 45, 0, 0, 22, 0, 15, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 15, 0, 0, 29, 0, 15, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Adaptive;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}