package net.hypixel.skyblock.pets;

import net.hypixel.skyblock.items.Collection;
import net.hypixel.skyblock.items.ModItemRarity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Chicken_Pet">Chicken
 * Pet</a>.
 * 
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 21 February 2020
 */
public class ChickenPet extends Pet {
	protected ChickenPet() {
		super(ModItemRarity.Common, Collection.Farming, PetType.Chicken);
	}

	@Override
	public void effect(PlayerEntity player) {
	}

	@Override
	public double[] getBuffs() {
		return null;
	}
}