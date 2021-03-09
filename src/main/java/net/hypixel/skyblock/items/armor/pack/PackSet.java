package net.hypixel.skyblock.items.armor.pack;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_the_Pack">PackSet
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class PackSet implements FullSetInformation {
	static final PackSet instance = new PackSet();

	private static final int helmet = 29;
	private static final int chestplate = 35;
	private static final int leggings = 30;
	private static final int boots = 25;

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, helmet, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, chestplate, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Armor of the Pack"),
				new StringTextComponent("Gain +35 ").append(StatString.strength).appendString(" and +80 ")
						.append(StatString.defense)
						.appendString(" for each Armor of the Pack wearers within 30 blocks."),
				new StringTextComponent("Max of 3 players."));
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, leggings, 0, 0, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, boots, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Pack;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}