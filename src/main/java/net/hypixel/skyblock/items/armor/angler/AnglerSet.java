package net.hypixel.skyblock.items.armor.angler;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Angler_Armor">Angler Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 2 July 2019
 */
public class AnglerSet implements FullSetInformation {
	public static final AnglerSet instance = new AnglerSet();

	public double boots_hp = 0;
	public double chestplate_hp = 0;
	public double helmet_hp = 0;
	public double leggings_hp = 0;

	public AnglerSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Sea Creature Master"),
				new StringTextComponent(FormatingCodes.gray + "Take 30% less damage from Sea Creatures."),
				new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Deepness Within"),
				new StringTextComponent(FormatingCodes.gray + "Get +2 " + StatString.health + " per fishing level."));
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.helmet_hp, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Angler;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}