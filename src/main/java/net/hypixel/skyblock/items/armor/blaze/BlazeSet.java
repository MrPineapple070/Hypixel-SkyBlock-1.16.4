package net.hypixel.skyblock.items.armor.blaze;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Blaze_Armor">Blaze
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class BlazeSet implements FullSetInformation {
	public static final BlazeSet instance = new BlazeSet();

	public BlazeSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Blazing Aura"),
				new StringTextComponent(FormatingCodes.gray + "Damages mobs in a 5 block range for 3% of their max Health per second."),
				new StringTextComponent(FormatingCodes.gray + "Also grants permanent Fire and Lava immunity"));
	}

	@Override
	public double[] getHelmetBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 10, 0, 0, 0, 2, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Blaze;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}
