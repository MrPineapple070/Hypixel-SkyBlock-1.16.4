package net.hypixel.skyblock.items.armor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Serve as a base for {@link EquipmentSlotType} specific information for all
 * {@link ModArmorItem}
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
public interface FullSetInformation {
	public static final ImmutableList<TranslationTextComponent> buff = ImmutableList.copyOf(Arrays.asList(StatString.strength, StatString.crit_chance,
			StatString.crit_damage, StatString.health, StatString.speed, StatString.intelligence, StatString.true_def));

	static double[] createBuffArray(double str, double cr_chn, double cr_dmg, double hp, double spd, double intel,
			double tru_def) {
		return new double[] { str, cr_chn, cr_dmg, hp, spd, intel, tru_def };
	}

	static double[] createBuffArray(double[] buff, int[] index) {
		if (buff.length != index.length)
			throw new IllegalStateException("Buff and index arrays must be the same length");
		double[] b = new double[7];
		for (int i = 0; i < buff.length; ++i)
			b[index[i]] = buff[i];
		return b;
	}

	/**
	 * The order of this array is Strength, Crit Chance, Crit Damage, Health, Speed,
	 * Intelligence, True Defense.
	 *
	 * @return an array of all buffs for {@link EquipmentSlotType#FEET}.
	 * @throws IllegalAccessException if the Boots do not exist.
	 */
	double[] getBootsBuffs() throws IllegalAccessException;

	/**
	 * The order of this array is Strength, Crit Chance, Crit Damage, Health, Speed,
	 * Intelligence, True Defense.
	 *
	 * @return an array of all buffs for {@link EquipmentSlotType#CHEST}.
	 * @throws IllegalAccessException if the Chestplate does not exist.
	 */
	double[] getChestplateBuffs() throws IllegalAccessException;

	/**
	 * Add a description to the Armor Pieces of each set.
	 *
	 * @param slotIn {@link EquipmentSlotType} to add the description to.
	 * @return the description of the item.
	 * @throws IllegalAccessException if {@code slotIn} is not a valid
	 *                                {@code EquipmentSlotType}
	 */
	default List<ITextComponent> getDescription(EquipmentSlotType slotIn) throws IllegalAccessException {
		final List<ITextComponent> description = new ArrayList<>();
		double[] buffs;

		switch (slotIn) {
		case HEAD:
			buffs = this.getHelmetBuffs();
			break;
		case CHEST:
			buffs = this.getChestplateBuffs();
			break;
		case LEGS:
			buffs = this.getLeggingsBuffs();
			break;
		case FEET:
			buffs = this.getBootsBuffs();
			break;
		default:
			throw new IllegalAccessException("Illegal Slot: " + slotIn);
		}

		for (int i = 0; i < buffs.length; i++)
			if (buffs[i] == 0)
				continue;
			else
				description.add(buff.get(i).appendString(Double.toString(buffs[i])));
		description.addAll(this.getFullSetBonus());
		return description;
	}

	/**
	 * @return the description for the full set bonus of this set.
	 */
	List<ITextComponent> getFullSetBonus();

	/**
	 * The order of this array is Strength, Crit Chance, Crit Damage, Health, Speed,
	 * Intelligence, True Defense.
	 *
	 * @return an array of all buffs for {@link EquipmentSlotType#HEAD}.
	 * @throws IllegalAccessException if the Helmet does not exist.
	 */
	double[] getHelmetBuffs() throws IllegalAccessException;

	/**
	 * The order of this array is Strength, Crit Chance, Crit Damage, Health, Speed,
	 * Intelligence, True Defense.
	 *
	 * @return an array of all buffs for {@link EquipmentSlotType#LEGS}.
	 * @throws IllegalAccessException if the Leggings do not exist.
	 */
	double[] getLeggingsBuffs() throws IllegalAccessException;

	/**
	 * @return {@link ModArmorMaterial} for this set.
	 */
	ModArmorMaterial getMaterial();

	/**
	 * @return {@link ModItemRarity} for this.
	 */
	ModItemRarity getRarity();
}