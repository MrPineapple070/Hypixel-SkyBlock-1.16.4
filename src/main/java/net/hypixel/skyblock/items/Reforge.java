package net.hypixel.skyblock.items;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.accessories.Accessory;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.bows.ModBowItem;
import net.hypixel.skyblock.items.swords.ModSwordItem;

/**
 * An interface to serve as the base for all Reforges.
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Reforging">All Reforges</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 11 June 2019
 */
public interface Reforge {
	/**
	 * Index for attack speed buff.
	 */
	int attack_speed = 0x7;

	/**
	 * Index for crit chance buff.
	 */
	int crit_chance = 0x4;

	/**
	 * Index for crit damage buff.
	 */
	int crit_damage = 0x5;

	/**
	 * Index for defense buff.
	 */
	int defense = 0x1;

	/**
	 * Index for health buff.
	 */
	int health = 0x3;

	/**
	 * Index for intelligence buff.
	 */
	int intelligence = 0x6;

	/**
	 * When the current Item has no {@code Reforge}
	 */
	Reforge None = null;

	/**
	 * {@link Random} to chose a random Reforge.
	 */
	@Nonnull
	Random rand = new Random();

	/**
	 * Index for strength buff.
	 */
	int strength = 0x0;

	/**
	 * Index for walkspeed buff.
	 */
	int walkspeed = 0x2;

	/**
	 * Creates a buff array from inputs and index;
	 *
	 * @param inputs the amount to buff each stat
	 * @param index  the index of each stat.
	 * @return the created buff array.
	 */
	@Nonnull
	static strictfp double[] create(double[] inputs, int[] index) {
		if (inputs.length != index.length)
			throw new IllegalArgumentException("input and index arrays must be the same length");
		final double[] temp = new double[8];
		for (int i = 0; i < inputs.length; ++i)
			temp[index[i]] = index[i] == health ? inputs[i] * .2 : inputs[i];
		return temp;
	}

	/**
	 * @return The array for {@link ModItemRarity#Common}
	 */
	@Nonnull
	double[] common();

	/**
	 * @return The array for {@link ModItemRarity#Epic}
	 */
	@Nonnull
	double[] epic();

	/**
	 *
	 * @param rarity the {@link ModItemRarity} of the {@link Accessory},
	 *               {@link ModArmorItem}, {@link ModBowItem}, or
	 *               {@link ModSwordItem}
	 * @return the appropriate buff array from the given {@link ModItemRarity}
	 */
	@Nonnull
	default strictfp double[] getBuffArray(ModItemRarity rarity) {
		switch (rarity) {
		case Common:
			return this.common();
		case Uncommon:
			return this.uncommon();
		case Rare:
			return this.rare();
		case Epic:
			return this.epic();
		case Legendary:
			return this.legendary();
		default:
			throw new IllegalStateException("ModItemRarity " + rarity.name() + " does not have a buff array.");
		}
	}

	/**
	 * @return The array for {@link ModItemRarity#Legendary}
	 */
	@Nonnull
	double[] legendary();

	/**
	 * Logs this {@link Reforge} to {@link HypixelSkyBlockMod#LOGGER}.<br>
	 */
	default void log() {
		try {
			HypixelSkyBlockMod.LOGGER
					.info(this.getClass().getMethod("name", (Class<?>[]) null).invoke(this) + " reforge.");
			HypixelSkyBlockMod.LOGGER.info("Common:\t  " + Arrays.toString(this.common()));
			HypixelSkyBlockMod.LOGGER.info("Uncommon: " + Arrays.toString(this.uncommon()));
			HypixelSkyBlockMod.LOGGER.info("Rare:\t  " + Arrays.toString(this.rare()));
			HypixelSkyBlockMod.LOGGER.info("Epic:\t  " + Arrays.toString(this.epic()));
			HypixelSkyBlockMod.LOGGER.info("Legendary:" + Arrays.toString(this.legendary()));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			for (final StackTraceElement element : e.getStackTrace())
				HypixelSkyBlockMod.LOGGER.error(element);
		}
	}

	/**
	 * @return nonunique {@link Reforge} stored in {@link Enum}.
	 */
	@Nonnull
	Reforge[] nonunique();

	/**
	 * @return The array for {@link ModItemRarity#Rare}
	 */
	@Nonnull
	double[] rare();

	/**
	 * @return The array for {@link ModItemRarity#Uncommon}
	 */
	@Nonnull
	double[] uncommon();

	/**
	 * @return unique {@link Reforge} stored in {@link Enum}.
	 */
	@Nonnull
	Reforge[] unique();
}