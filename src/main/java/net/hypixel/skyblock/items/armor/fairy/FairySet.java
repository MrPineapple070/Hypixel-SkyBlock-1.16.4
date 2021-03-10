package net.hypixel.skyblock.items.armor.fairy;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fairy_Armor">Fairy Set</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class FairySet implements FullSetInformation {
	public static final FairySet instance = new FairySet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.fairy.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.fairy.fsb.discription.0", StatString.speed),
			new TranslationTextComponent("armor.fairy.fsb.discription.1", StatString.health));

	public static double boots_hp = .2;
	public static final int boots_int = -1;
	public static final int boots_spd = 10;

	public static double chestplate_hp = .2;
	public static final int chestplate_int = -1;
	public static final int chestplate_spd = 10;

	public static double helmet_hp = .2;
	public static final int helmet_int = -1;
	public static final int helmet_spd = 10;

	public static double leggings_hp = .2;
	public static final int leggings_int = -1;
	public static final int leggings_spd = 10;

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, boots_hp, boots_spd, boots_int, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, chestplate_hp, chestplate_spd, chestplate_int, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet_hp, helmet_spd, helmet_int, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, leggings_hp, leggings_spd, leggings_int, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Fairy;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}