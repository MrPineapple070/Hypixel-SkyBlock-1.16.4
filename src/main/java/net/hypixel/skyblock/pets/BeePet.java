package net.hypixel.skyblock.pets;

import net.hypixel.skyblock.items.Collection;
import net.minecraft.entity.player.PlayerEntity;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Bee_Pet"> Bee Pet</a>.
 * 
 * @author MrPineapple070
 * @version 21 Febuaru 2019
 * @since 21 February 2019
 */
public final class BeePet extends Pet {
	public BeePet() {
		super(Pet.getRandomRarityLow(), Collection.Farming, PetType.Bee);
	}

	@Override
	public void effect(PlayerEntity player) {
	}

	@Override
	public double[] getBuffs() {
		return null;
	}
}