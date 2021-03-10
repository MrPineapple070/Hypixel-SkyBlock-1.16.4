package net.hypixel.skyblock.items.armor.farm;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farm_Armor">Farm Armor
 * Set</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FarmSet implements FullSetInformation {
	public static final FarmSet instance = new FarmSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.farm.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.farm.fsb.discription", StatString.speed));

	private static double boots_hp = 4;
	private static double chestplate_hp = 4;
	private static double helmet_hp = 4;
	private static double leggings_hp = 4;

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Farm;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}