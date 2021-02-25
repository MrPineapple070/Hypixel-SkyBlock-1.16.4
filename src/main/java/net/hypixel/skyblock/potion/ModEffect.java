package net.hypixel.skyblock.potion;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

/**
 * A class to create {@link Effect} for this Mod.
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class ModEffect extends Effect {
	public ModEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}
}