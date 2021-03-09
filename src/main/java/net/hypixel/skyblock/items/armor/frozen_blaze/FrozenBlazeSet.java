package net.hypixel.skyblock.items.armor.frozen_blaze;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Frozen_Blaze_Armor">Frozen
 * Blaze Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 18 December 2019
 */
public class FrozenBlazeSet implements FullSetInformation {
	public static final FrozenBlazeSet instance = new FrozenBlazeSet();

	private final int boots_spd = 2;
	private final int boots_str = 40;
	private final int chestplate_spd = 2;
	private final int chestplate_str = 40;

	private final int helmet_spd = 2;
	private final int helmet_str = 40;
	private final int leggings_spd = 2;
	private final int leggings_str = 40;

	public FrozenBlazeSet() {
	}

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
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Blazing Aura"),
				new StringTextComponent("Damages mobs in a 5 block range for 300 base damage + 3% of their max "
						+ StatString.health + "per second and applies Slowness 1 for 4 seconds."),
				new StringTextComponent("Max damage per second increased by +100 per 5000 rods (5000 max damage cap)."),
				new StringTextComponent("Also grants permanent Fire and Lava immunity."));
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