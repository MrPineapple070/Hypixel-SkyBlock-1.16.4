package net.hypixel.skyblock.util;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import net.hypixel.skyblock.items.init.AccessoriesInit;
import net.hypixel.skyblock.items.init.ItemInit;
import net.hypixel.skyblock.items.init.WeaponInit;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * Contains Maps to help with {@link ItemInit#super_compactor_3000}
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 11 June 2019
 */
public class ItemMap {
	/**
	 * Help determine how many items it takes to compact.<br>
	 * If an {@link Item} is not in this map, the {@link Integer} will be defaulted
	 * to 9
	 */
	public static final ImmutableMap<Item, Integer> compCountMap = ImmutableMap.copyOf(compCountMapMake());

	/**
	 * Help determine what item to give when compacting.
	 */
	public static final ImmutableMap<Item, Item> compMap = ImmutableMap.copyOf(compMapMake());

	/**
	 * Help determine how many items to give when super compacting.<br>
	 * If an {@link Item} is not in this map, the {@link Integer} will be defaulted
	 * to 1.
	 */
	public static final ImmutableMap<Item, Integer> enchCountMap = ImmutableMap.copyOf(ItemMap.enchCountMake());

	/**
	 * Help determine what item to give when super compacting.
	 */
	public static final ImmutableMap<Item, Item> enchMap = ImmutableMap.copyOf(ItemMap.enchMapMake());

	/**
	 * Help determine how many items it takes to craft a single enchanted item.<br>
	 * If an {@link Item} is not in this map, the {@link Integer} will be defaulted
	 * to 160
	 */
	public static final ImmutableMap<Item, Integer> enchReqMap = ImmutableMap.copyOf(enchReqMake());

	/**
	 * Help determine what items to give when auto-smelting.
	 */
	public static final ImmutableMap<Item, Item> smeltMap = ImmutableMap.copyOf(smeltMapMake());

	/**
	 * Help determine how many coins to give the player when selling an item to an
	 * NPC.
	 */
	public static final ImmutableMap<Item, Integer> sell = ImmutableMap.copyOf(sellMap());

	/**
	 * Create {@link #compCountMap}
	 *
	 * @return {@link #compCountMap}
	 */
	private static Map<Item, Integer> compCountMapMake() {
		final Map<Item, Integer> temp = new HashMap<>();
		temp.put(Items.QUARTZ, 4);
		temp.put(Items.GLOWSTONE_DUST, 4);
		temp.put(Items.CLAY_BALL, 4);
		temp.put(Items.SNOWBALL, 4);
		return temp;
	}

	/**
	 * Create {@link #compMap}
	 *
	 * @return {@link #compMap}
	 */
	private static Map<Item, Item> compMapMake() {
		final Map<Item, Item> temp = new HashMap<>();
		temp.put(Items.WHEAT, Items.HAY_BLOCK);
		temp.put(Items.MELON_SLICE, Items.MELON);
		temp.put(Items.SLIME_BALL, Items.SLIME_BLOCK);
		temp.put(Items.COAL, Items.COAL_BLOCK);
		temp.put(Items.IRON_INGOT, Items.IRON_BLOCK);
		temp.put(Items.GOLD_INGOT, Items.GOLD_BLOCK);
		temp.put(Items.DIAMOND, Items.DIAMOND_BLOCK);
		temp.put(Items.LAPIS_LAZULI, Items.LAPIS_BLOCK);
		temp.put(Items.REDSTONE, Items.REDSTONE_BLOCK);
		temp.put(Items.EMERALD, Items.EMERALD_BLOCK);
		temp.put(Items.QUARTZ, Items.QUARTZ_BLOCK);
		temp.put(Items.GLOWSTONE_DUST, Items.GLOWSTONE);
		temp.put(Items.ICE, Items.PACKED_ICE);
		temp.put(Items.PACKED_ICE, Items.BLUE_ICE);
		temp.put(Items.CLAY_BALL, Items.CLAY);
		temp.put(Items.SNOWBALL, Items.SNOW_BLOCK);
		return temp;
	}

	/**
	 * Create {@link #enchCountMap}
	 *
	 * @return {@link #enchCountMap}
	 */
	private static Map<Item, Integer> enchCountMake() {
		final Map<Item, Integer> temp = new HashMap<>();
		temp.put(Items.GLOWSTONE, 4);
		temp.put(Items.BLUE_ICE, 81);
		return temp;
	}

	/**
	 * Create {@link #enchMap}
	 *
	 * @return {@link #enchMap}
	 */
	private static Map<Item, Item> enchMapMake() {
		final Map<Item, Item> temp = new HashMap<>();
		temp.put(Items.COBBLESTONE, ItemInit.enchanted_cobblestone.get());
		temp.put(Items.COAL, ItemInit.enchanted_coal.get());
		temp.put(Items.COAL_BLOCK, ItemInit.enchanted_coal.get());
		temp.put(ItemInit.enchanted_coal.get(), ItemInit.enchanted_coal_block.get());
		temp.put(Items.IRON_INGOT, ItemInit.enchanted_iron_ingot.get());
		temp.put(Items.IRON_BLOCK, ItemInit.enchanted_iron_ingot.get());
		temp.put(ItemInit.enchanted_iron_ingot.get(), ItemInit.enchanted_iron_block.get());
		temp.put(Items.GOLD_INGOT, ItemInit.enchanted_gold_ingot.get());
		temp.put(Items.GOLD_BLOCK, ItemInit.enchanted_gold_ingot.get());
		temp.put(ItemInit.enchanted_gold_ingot.get(), ItemInit.enchanted_gold_block.get());
		temp.put(Items.DIAMOND, ItemInit.enchanted_diamond.get());
		temp.put(Items.DIAMOND_BLOCK, ItemInit.enchanted_diamond.get());
		temp.put(ItemInit.enchanted_diamond.get(), ItemInit.enchanted_diamond_block.get());
		temp.put(Items.LAPIS_LAZULI, ItemInit.enchanted_lapis_lazuli.get());
		temp.put(Items.LAPIS_BLOCK, ItemInit.enchanted_lapis_lazuli.get());
		temp.put(ItemInit.enchanted_lapis_lazuli.get(), ItemInit.enchanted_lapis_block.get());
		temp.put(Items.EMERALD, ItemInit.enchanted_emerald.get());
		temp.put(Items.EMERALD_BLOCK, ItemInit.enchanted_emerald.get());
		temp.put(ItemInit.enchanted_emerald.get(), ItemInit.enchanted_emerald_block.get());
		temp.put(Items.REDSTONE, ItemInit.enchanted_redstone.get());
		temp.put(Items.REDSTONE_BLOCK, ItemInit.enchanted_redstone.get());
		temp.put(ItemInit.enchanted_redstone.get(), ItemInit.enchanted_redstone_block.get());
		temp.put(Items.QUARTZ, ItemInit.enchanted_quartz.get());
		temp.put(Items.QUARTZ_BLOCK, ItemInit.enchanted_quartz.get());
		temp.put(ItemInit.enchanted_quartz.get(), ItemInit.enchanted_quartz_block.get());
		temp.put(Items.OBSIDIAN, ItemInit.enchanted_obsidian.get());
		temp.put(Items.GLOWSTONE_DUST, ItemInit.enchanted_glowstone_dust.get());
		temp.put(Items.GLOWSTONE, ItemInit.enchanted_glowstone_dust.get());
		temp.put(ItemInit.enchanted_glowstone_dust.get(), ItemInit.enchanted_glowstone.get());
		temp.put(Items.FLINT, ItemInit.enchanted_flint.get());
		temp.put(Items.ICE, ItemInit.enchanted_ice.get());
		temp.put(Items.PACKED_ICE, ItemInit.enchanted_ice.get());
		temp.put(Items.BLUE_ICE, ItemInit.enchanted_ice.get());
		temp.put(ItemInit.enchanted_ice.get(), ItemInit.enchanted_packed_ice.get());
		temp.put(Items.SAND, ItemInit.enchanted_sand.get());
		temp.put(Items.END_STONE, ItemInit.enchanted_end_stone.get());
		return temp;
	}

	/**
	 * Create {@link #enchReqMap}
	 *
	 * @return {@link #enchReqMap}
	 */
	private static Map<Item, Integer> enchReqMake() {
		final Map<Item, Integer> temp = new HashMap<>();
		temp.put(ItemInit.enchanted_glowstone_dust.get(), 192);
		return temp;
	}

	/**
	 * Create {@link #smeltMap}
	 *
	 * @return {@link #smeltMap}
	 */
	private static Map<Item, Item> smeltMapMake() {
		final Map<Item, Item> temp = new HashMap<>();
		temp.put(Items.COBBLESTONE, Items.STONE);
		temp.put(Items.IRON_ORE, Items.IRON_INGOT);
		temp.put(Items.GOLD_ORE, Items.GOLD_INGOT);
		temp.put(Items.SAND, Items.GLASS);
		temp.put(Items.CLAY, Items.TERRACOTTA);
		temp.put(Items.CLAY_BALL, Items.BRICK);
		temp.put(Items.CACTUS, Items.GREEN_DYE);
		temp.put(Items.ACACIA_LOG, Items.COAL);
		temp.put(Items.OAK_LOG, Items.COAL);
		return temp;
	}

	/**
	 * Create {@link #sell}
	 * 
	 * @return {@link #sell}
	 */
	private static Map<Item, Integer> sellMap() {
		final Map<Item, Integer> temp = new HashMap<>();
		temp.put(AccessoriesInit.bait_ring.get(), 0);

		temp.put(WeaponInit.aotd.get(), 100000);
		temp.put(WeaponInit.aote.get(), 50000);
		temp.put(WeaponInit.aotj.get(), 0);
		temp.put(WeaponInit.cleaver.get(), 0);
		temp.put(WeaponInit.edible_mace.get(), 0);
		temp.put(WeaponInit.ember_rod.get(), 0);
		temp.put(WeaponInit.emerald_blade.get(), 0);
		temp.put(WeaponInit.end_stone_sword.get(), 0);
		temp.put(WeaponInit.end_sword.get(), 0);
		temp.put(WeaponInit.fancy_sword.get(), 0);
		temp.put(WeaponInit.flaming_sword.get(), 0);
		temp.put(WeaponInit.frozen_scythe.get(), 0);
		temp.put(WeaponInit.golem_sword.get(), 0);
		temp.put(WeaponInit.hunter_knife.get(), 0);
		temp.put(WeaponInit.ink_wand.get(), 0);
		temp.put(WeaponInit.leaping_sword.get(), 0);
		temp.put(WeaponInit.midas_sword.get(), 0);
		temp.put(WeaponInit.ornate_zombie_sword.get(), 0);
		temp.put(WeaponInit.pigman_sword.get(), 0);
		temp.put(WeaponInit.pooch_sword.get(), 0);
		temp.put(WeaponInit.prismarine_blade.get(), 0);
		temp.put(WeaponInit.raider_axe.get(), 0);
		temp.put(WeaponInit.reaper_falchion.get(), 0);
		temp.put(WeaponInit.reaper_scythe.get(), 0);
		temp.put(WeaponInit.recluse_fang.get(), 0);
		temp.put(WeaponInit.revenant_falchion.get(), 0);
		temp.put(WeaponInit.rogue_sword.get(), 0);
		temp.put(WeaponInit.scorpion_foil.get(), 0);
		temp.put(WeaponInit.shaman_sword.get(), 0);
		temp.put(WeaponInit.silk_edge_sword.get(), 0);
		temp.put(WeaponInit.silver_fang.get(), 0);
		temp.put(WeaponInit.spider_sword.get(), 0);
		temp.put(WeaponInit.spider_sword.get(), 0);
		temp.put(WeaponInit.tactician_sword.get(), 0);
		temp.put(WeaponInit.thick_aotj.get(), 0);
		temp.put(WeaponInit.thick_scorpion_foil.get(), 0);
		temp.put(WeaponInit.thick_tactician_sword.get(), 0);
		temp.put(WeaponInit.undead_sword.get(), 0);
		temp.put(WeaponInit.yeti_sword.get(), 0);
		temp.put(WeaponInit.zombie_sword.get(), 0);
		return temp;
	}
}