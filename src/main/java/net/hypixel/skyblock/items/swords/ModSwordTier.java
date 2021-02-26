package net.hypixel.skyblock.items.swords;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

/**
 * An enumerated type that implements {@link IItemTier}.<br>
 * Used for custom {@link ModSwordItem} in this mod.
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
public enum ModSwordTier implements IItemTier {
	Adaptive_Blade(170), AOTD(225), AOTE(100), AOTJ(1), Bonzo_Staff(160), Cleaver(40), Crypt_Witherlord_Sword(62),
	Daedalus_Axe(0), Dreadlord_Sword(52), Edible_Mace(125), Ember_Rod(80), Emerald_Blade(130), End_Stone_Sword(120),
	End_Sword(35), Fancy_Sword(20), Flaming_Sword(50), Frozen_Scythe(80), Golem_Sword(80), Hunter_Knife(80),
	Hyper_Cleaver(145), Ink_Wand(130), Leaping_Sword(150), Midas_Sword(150), Ornate_Zombie_Sword(110),
	Pigman_Sword(110), Pooch_Sword(120), Prismarine_Blade(50), Raider_Axe(80), Reaper_Falchion(120), Reaper_Scythe(333),
	Recluse_Fang(120), Revenant_Falchion(90), Rogue_Sword(20), Scorpion_Foil(100), Shaman_Sword(100), Silent_Death(85),
	Silk_Edge_Sword(175), Silver_Fang(100), Spider_Sword(30), Spirit_Sceptre(180), Spirit_Sword(210), Super_Cleaver(85),
	Tactician_Sword(50), Thick_AOTJ(1), Thick_Scorpion_Foil(100), Thick_Tactician_Sword(50), Undead_Sword(30),
	Yeti_Sowrd(150), Zombie_Commander_Whip(65), Zombie_Knight_Sword(82), Zombie_Soldier_Cutlass(52), Zombie_Sword(100);

	private float attackDamage;

	private ModSwordTier(float attackDamage) {
		this.attackDamage = attackDamage / 5f;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() {
		return Float.POSITIVE_INFINITY;
	}

	@Override
	public int getEnchantability() {
		return 0x20;
	}

	@Override
	public int getHarvestLevel() {
		return 4;
	}

	@Override
	public int getMaxUses() {
		return Integer.MAX_VALUE;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.EMPTY;
	}

	/**
	 * Increment {@link #attackDamage}
	 *
	 * @param increment amount to increase.
	 */
	public void incrementAttackDamage(float increment) {
		this.attackDamage += increment;
	}

	/**
	 * Set {@link #attackDamage}
	 *
	 * @param attackDamage new value.
	 */
	public void setAttackDamage(float attackDamage) {
		this.attackDamage = attackDamage;
	}
}