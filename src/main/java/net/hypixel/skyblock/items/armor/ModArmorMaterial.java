package net.hypixel.skyblock.items.armor;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * An enumerated type that implements {@link IArmorMaterial}. <br>
 * Used for the custom {@link ModArmorItem} in this mod.
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
public enum ModArmorMaterial implements IArmorMaterial {
	Adaptive("adaptive", new int[] { 45, 65, 85, 50 }), Angler("angler", new int[] { 10, 25, 40, 15 }),
	Bat_Person("bat_person", new int[] { 15, 25, 30, 15 }), Blaze("blaze", new int[] { 70, 110, 150, 80 }),
	Blaze_Hat("blaze_hat", new int[] { -1, -1, -1, 0 }), Blobfish_Hat("blobfish_hat", new int[] { -1, -1, -1, 0 }),
	Bonzo_Mask("bonzo_mask", new int[] { -1, -1, -1, 100 }), Cactus("cactus", new int[] { 10, 20, 25, 10 }),
	Cheap_Tuxedo("cheap_tuxedo", new int[] { 0, 0, 0, -1 }), Chicket_Head("chicket_head", new int[] { -1, -1, -1, 0 }),
	Clownfish_Hat("clownfish_hat", new int[] { -1, -1, -1, 0 }), Cow_Head("cow_head", new int[] { -1, -1, -1, 5 }),
	Creeper_Hat("creeper_hat", new int[] { -1, -1, -1, 5 }), Crystal("crystal", new int[] { 15, 30, 35, 20 }),
	Crystallized_Heart("crystallized_heart", new int[] { -1, -1, -1, 10 }),
	Dark_Goggles("dark_goggles", new int[] { -1, -1, -1, 0 }), Diver("diver", new int[] { 60, 75, 200, 65 }),
	Elegant_Tuxedo("elegant_tuxedo", new int[] { 0, 0, 0, -1 }), Ember("ember", new int[] { 30, 55, 60, 35 }),
	Emerald("emerald", new int[] { 45, 75, 100, 50 }), Ender("ender", new int[] { 25, 50, 60, 35 }),
	Enderman_Mask("enderman_mask", new int[] { -1, -1, -1, 1 }), Fairy("fairy", new int[] { 1, 1, 1, 1 }),
	Fancy_Tuxedo("fancy_tuxedo", new int[] { 0, 0, 0, -1 }), Farm("farm", new int[] { 35, 50, 75, 40 }),
	Farm_Suit("farm_suit", new int[] { 15, 35, 40, 15 }), Farmer_Boots("farmer_boots", new int[] { 20, -1, -1, -1 }),
	Fish_Hat("fish_hat", new int[] { -1, -1, -1, 0 }), Frozen_Blaze("frozen_blaze", new int[] { 100, 140, 180, 110 }),
	Ghast_Head("ghast_head", new int[] { -1, -1, -1, 0 }), Golem("golem", new int[] { 40, 55, 65, 45 }),
	Growth("growth", new int[] { 25, 40, 50, 30 }), Hardened_Diamond("hardened", new int[] { 55, 95, 120, 60 }),
	Heavy("heavy", new int[] { 72, 107, 127, 77 }), Holy_Dragon("holy_dragon", new int[] { 90, 140, 160, 110 }),
	Krampus_Helmet("krampus_helmet", new int[] { -1, -1, -1, 0 }),
	Lantern_Helmet("lantern_helmet", new int[] { -1, -1, -1, 10 }), Lapis("lapis", new int[] { 20, 35, 40, 25 }),
	Leaflet("leaflet", new int[] { 0, 0, 0, 0 }), Magma("magma", new int[] { 15, 25, 30, 50 }),
	Magma_Cube_Head("magma_cube_head", new int[] { -1, -1, -1, 25 }),
	Mastiff("mastiff", new int[] { -10000, -10000, -10000, -10000 }),
	Mender_Fedora("mender_fedora", new int[] { -1, -1, -1, 5 }),
	Mender_Helmet("mender_helmet", new int[] { -1, -1, -1, 0 }), Miner("miner", new int[] { 5, 5, 5, 5 }),
	Miner_Outfit("miner_outfit", new int[] { 15, 30, 40, 15 }),
	Monster_Hunter("monster_hunter", new int[] { 45, 65, 50, 75 }),
	Monster_Raider("monster_raider", new int[] { 100, 65, 50, 75 }), Mushroom("mushroom", new int[] { 0, 10, 10, 0 }),
	Obsidian_Chestplate("obsidian_chestplate", new int[] { -1, -1, 250, -1 }),
	Old_Dragon("old_dragon", new int[] { 90, 140, 150, 90 }), Pack("pack", new int[] { 60, 70, 110, 80 }),
	Perfect1("perfect_1", new int[] { 90, 140, 160, 110 }), Perfect2("perfect_2", new int[] { 110, 160, 180, 130 }),
	Perfect3("perfect_3", new int[] { 130, 180, 200, 150 }), Perfect4("perfect_4", new int[] { 150, 200, 220, 170 }),
	Perfect5("perfect_5", new int[] { 170, 220, 240, 190 }), Perfect6("perfect_6", new int[] { 190, 240, 260, 210 }),
	Perfect7("perfect_7", new int[] { 210, 260, 280, 230 }), Perfect8("perfect_8", new int[] { 230, 280, 300, 250 }),
	Perfect9("perfect_9", new int[] { 250, 300, 320, 270 }), PerfectA("perfect_a", new int[] { 270, 320, 340, 290 }),
	PerfectB("perfect_b", new int[] { 290, 340, 360, 310 }), PerfectC("perfect_c", new int[] { 310, 360, 380, 330 }),
	Protector_Dragon("protector_dragon", new int[] { 115, 165, 185, 135 }),
	Pufferfish_Hat("pufferfish_hat", new int[] { -1, -1, -1, 0 }), Pumpkin("pumpkin", new int[] { 8, 10, 14, 8 }),
	Rabbit_Hat("rabbit_hat", new int[] { -1, -1, -1, 0 }), Reaper_Mask("reaper_mask", new int[] { -1, -1, -1, 60 }),
	Revenant("revenant", new int[] { 30, 50, 70, 0 }), Revived_Heart("revived_heart", new int[] { -1, -1, -1, 35 }),
	Rotten("rotten", new int[] { 15, 15, 15, 15 }), Salmon_Hat("salmon_hat", new int[] { -1, -1, -1, 0 }),
	Skeleton_Grunt("skeleton_grunt", new int[] { 20, 34, 38, 23 }),
	Skeleton_Hat("skeleton_hat", new int[] { -1, -1, -1, 0 }), Skeleton_Master("skeleton_master", new int[] {}),
	Skeleton_Soldier("skeleton_soldier", new int[] {}), Skeletor("skeletor", new int[] {}),
	Slime_Hat("slime_hat", new int[] { -1, -1, -1, 0 }), Sniper_Helmet("sniper_helmet", new int[] { -1, -1, -1, 0 }),
	Snow("snow", new int[] { 25, 30, 40, 30 }), Speedster("speedster", new int[] { 65, 95, 120, 70 }),
	Spider_Hat("spider_hat", new int[] { -1, -1, -1, 0 }), Spirit_Mask("spirit_mask", new int[] { -1, -1, -1, 50 }),
	Sponge("sponge", new int[] { 60, 100, 145, 80 }), Spooky("spooky", new int[] { 25, 35, 50, 25 }),
	Squid_Boots("squid_boots", new int[] { 0, -1, -1, -1 }), Squid_Hat("squid_hat", new int[] { -1, -1, -1, 0 }),
	Stereo_Pants("stereo_pants", new int[] { -1, 35, -1, -1 }),
	Strong_Dragon("strong_dragon", new int[] { 90, 140, 160, 110 }), Super_Heavy("super_heavy", new int[] {}),
	Superior_Dragon("superior_dragon", new int[] { 110, 170, 190, 130 }),
	Tarantula("tarantula", new int[] { 100, 20, 100, 80 }),
	Unstable_Dragon("unstable_dragon", new int[] { 90, 140, 160, 110 }),
	Vampire_Mask("vampire_mask", new int[] { -1, -1, -1, 110 }),
	Water_Hydra("water_hydra", new int[] { -1, -1, -1, 100 }),
	Wise_Dragon("wise_dragon", new int[] { 90, 140, 160, 110 }),
	Young_Dragon("young_dragon", new int[] { 90, 140, 160, 110 }), Zombie("zombie", new int[] { 25, 160, 200, -1 }),
	Zombie_Hat("zombie_hat", new int[] { -1, -1, -1, 10 }), Zombie_Heart("zombie_heart", new int[] { -1, -1, -1, 0 }),
	Zombie_Knight("zombie_knight", new int[] {}), Zombie_Soldier("zombie_soldier", new int[] {});

	/**
	 * An array of defense values
	 */
	private final int[] damageReducionAmountArray;

	/**
	 * Help correct Hypixel values into Vanila values.
	 */
	private final int maxDamageFactor = 5;

	/**
	 * Name of this.
	 */
	private final String name;

	private ModArmorMaterial(String nameIn, int[] damageReductionAmountIn) {
		this.name = nameIn;
		this.damageReducionAmountArray = damageReductionAmountIn;
	}

	/**
	 * Determine if a {@link IArmorMaterial} is one of the Perfect Materials.
	 * 
	 * @param material {@link IArmorMaterial} for the Armor to check.
	 * @return true/false
	 */
	public static boolean isPerfect(IArmorMaterial material) {
		if (material == Perfect1)
			return true;
		else if (material == Perfect2)
			return true;
		else if (material == Perfect3)
			return true;
		else if (material == Perfect4)
			return true;
		else if (material == Perfect5)
			return true;
		else if (material == Perfect6)
			return true;
		else if (material == Perfect7)
			return true;
		else if (material == Perfect8)
			return true;
		else if (material == Perfect9)
			return true;
		else if (material == PerfectA)
			return true;
		else if (material == PerfectB)
			return true;
		else if (material == PerfectC)
			return true;
		return false;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		if (this.damageReducionAmountArray[slotIn.getIndex()] == -1)
			return 0;
		return this.damageReducionAmountArray[slotIn.getIndex()] / this.maxDamageFactor;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return Integer.MAX_VALUE;
	}

	@Override
	public int getEnchantability() {
		return 25;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return HypixelSkyBlockMod.MOD_ID + ':' + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.EMPTY;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public float getToughness() {
		return 0;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}