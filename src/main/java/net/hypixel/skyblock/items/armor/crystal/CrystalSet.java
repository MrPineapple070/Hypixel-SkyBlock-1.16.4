package net.hypixel.skyblock.items.armor.crystal;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Crystal_Armor">Crystal
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 2 August 2019
 * @since 18 December 2019
 */
public class CrystalSet implements FullSetInformation {
	public static final CrystalSet instance = new CrystalSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.crystal.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.crystal.fsb.discription"));

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, 0, 0, 60, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, 0, 0, 120, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 0, 0, 65, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, 0, 0, 100, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Crystal;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}