package net.hypixel.skyblock.items.armor.unstable_dragon;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

/**
 * @author MrPineapple070
 * @version 10 August 2020
 * @since 10 August 2020
 */
public class UnstableDragonSet implements FullSetInformation {

	public static final UnstableDragonSet instance = new UnstableDragonSet();

	private final double boots_hp = 12;
	private final double chestplate_hp = 24;
	private final double helmet_hp = 14;
	private final double leggings_hp = 20;

	public UnstableDragonSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.boots_hp, 0, 0, 0 };
	}

	@Override
	public double[] getChestplateBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.chestplate_hp, 0, 0, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent("Full Set Bonus: Unstable Blood").mergeStyle(TextFormatting.GOLD),
				new StringTextComponent("Every 10 seconds, skrike mobs with in 7 blocks with 3000 damage."));
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.helmet_hp, 0, 25, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 5, 15, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Unstable_Dragon;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}