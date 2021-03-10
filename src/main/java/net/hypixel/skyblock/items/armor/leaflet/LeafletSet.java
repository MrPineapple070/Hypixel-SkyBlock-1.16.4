package net.hypixel.skyblock.items.armor.leaflet;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Leaflet_Armor">Leadlet
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class LeafletSet implements FullSetInformation {
	public static final LeafletSet instance = new LeafletSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.leaflet.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.leaflet.fsb.discription"));

	public double boots_hp = 3;
	public double chestplate_hp = 7;
	public double helmet_hp = 4;
	public double leggings_hp = 6;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Leaflet;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}