package net.hypixel.skyblock.pets;

import net.hypixel.skyblock.items.Collection;
import net.hypixel.skyblock.items.ModItemRarity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Pet">Bat Pet</a>.
 * 
 * @author MrPineapple070
 * @version 30 October 2020
 * @since 21 February 2020
 */
public final class BatPet extends Pet {
	private double scc;
	private double intel;
	private double speed;
	private double candy;
	private double n_intel;
	private double n_speed;
	private double wings;
	private double sonar;

	public BatPet() {
		super(ModItemRarity.Legendary, Collection.Mining, PetType.Bat);
	}

	@Override
	public void effect(PlayerEntity player) {
		this.scc = .05d * this.level;
		this.intel = this.level;
		this.speed = .05d * this.level;
		this.n_intel = 0;
		this.n_speed = 0;
		double c = 0, w = 0, s = 0;
		switch (this.rarity) {
		case Common:
			c = .1;
			break;
		case Uncommon:
			c = .15;
			break;
		case Rare:
			c = .15;
			this.n_intel += .2d * this.level;
			this.n_speed += .4d * this.level;
			break;
		case Epic:
			c = .2;
			this.n_intel += .3d * this.level;
			this.n_speed += .5d * this.level;
			break;
		case Legendary:
			c = .2;
			this.n_intel += .3d * this.level;
			this.n_speed += .5d * this.level;
			w = .5;
			break;
		case Mythic:
			c = .2;
			this.n_intel += .3d * this.level;
			this.n_speed += .5d * this.level;
			w = .5;
			s = .25;
			break;
		default:
			throw new IllegalStateException("Illegal Bet Pet rarity:\t" + this.rarity.name());
		}
		this.candy = c * this.level;
		this.wings = w * this.level;
		this.sonar = s * this.level;
	}

	@Override
	public double[] getBuffs() {
		return new double[] { this.scc, this.intel, this.speed, this.candy, this.n_intel, this.n_speed, this.wings,
				this.sonar };
	}
}