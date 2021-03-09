package net.hypixel.skyblock.items.armor.mastiff;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mastiff_Armor">Mastiff
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class MastiffSet implements FullSetInformation {
	public static final MastiffSet instance = new MastiffSet();
	
	protected static final List<ITextComponent> fsb = Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Absolute Unit"),
			new StringTextComponent("+10 ").append(StatString.health).appendString(" per ").append(StatString.crit_damage).appendString("."),
			new StringTextComponent("Regain 2% of max hp when hit."),
			new StringTextComponent("Receive -20% damage from wolves."),
			StatString.crit_damage.appendString(" is 50% less effective"));

	private final double boots_hp = 500;

	private final int boots_int = 25;
	private final double chestplate_hp = 500;
	private final double helmet_hp = 500;
	private final int helmet_int = 125;

	private final double leggings_hp = 500;

	public MastiffSet() {
	}

	@Override
	public double[] getBootsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.boots_hp, 0, this.boots_int, 0 };
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
		return new double[] { 0, 0, 0, this.helmet_hp, 0, this.helmet_int, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, this.leggings_hp, 0, 0, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Mastiff;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}