package net.hypixel.skyblock.items.armor.miner;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner_Armor">Miner Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MinerSet implements FullSetInformation {
	public static final MinerSet instance = new MinerSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.miner.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.miner.fsb.discription"));

	public static int boots_def = 9;
	public static int chestplate_def = 19;
	public static int helmet_def = 9;
	public static int leggings_def = 14;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[7];
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Miner;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}