package net.hypixel.skyblock.items.armor.frozen_blaze;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Frozen_Blaze_Armor">Frozen
 * Blaze Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 18 December 2019
 */
public class FrozenBlazeSet implements FullSetInformation {
	public static final FrozenBlazeSet instance = new FrozenBlazeSet();
	private static final List<ITextComponent> fsb = Arrays.asList(
			full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.frozen_blaze.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.frozen_blaze.fsb.discription.0", StatString.health,
					((IFormattableTextComponent) Effects.SLOWNESS.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.SLOWNESS.getLiquidColor())))),
			new TranslationTextComponent("armor.frozen_blaze.fsb.discription.1"),
			new TranslationTextComponent("armor.frozen_blaze.fsb.discription.2"));

	private final int boots_spd = 2;
	private final int boots_str = 40;
	private final int chestplate_spd = 2;
	private final int chestplate_str = 40;

	private final int helmet_spd = 2;
	private final int helmet_str = 40;
	private final int leggings_spd = 2;
	private final int leggings_str = 40;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { this.boots_str, 0, 0, 0, this.boots_spd, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { this.chestplate_str, 0, 0, 0, this.chestplate_spd, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { this.helmet_str, 0, 0, 0, this.helmet_spd, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { this.leggings_str, 0, 0, 0, this.leggings_spd, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Frozen_Blaze;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}