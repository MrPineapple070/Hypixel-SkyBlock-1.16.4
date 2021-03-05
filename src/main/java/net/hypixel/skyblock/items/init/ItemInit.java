package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.ModExperienceBottleItem;
import net.hypixel.skyblock.items.ModExperienceBottleItem.Type;
import net.hypixel.skyblock.items.enchanted_items.EnchantedFuelItem;
import net.hypixel.skyblock.items.enchanted_items.EnchantedItem;
import net.hypixel.skyblock.items.minion.UpgradeItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link Item} for this Mod. <br>
 * Certain {@code Item} are Initialized and Registered in other files.<br>
 *
 * @author MrPineapple070
 * @version 22 June 2020
 */
public class ItemInit {
	public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Item> enchanted_acacia = items.register("enchanted_acacia",
			() -> new EnchantedItem(ItemProperties.fg64));

	public static final RegistryObject<Item> enchanted_bread = items.register("enchanted_bread",
			() -> new Item(ItemProperties.f64));
	public static final RegistryObject<Item> enchanted_egg = items.register("enchanted_egg",
			() -> new Item(ItemProperties.f64));

	public static final RegistryObject<Item> auto_smelter = items.register("auto_smelter",
			() -> new UpgradeItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_cobblestone = items.register("enchanted_cobblestone",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> compactor = items.register("compactor",
			() -> new UpgradeItem(ItemProperties.m64));
	public static final RegistryObject<Item> super_compactor_3000 = items.register("super_compactor_3000",
			() -> new UpgradeItem(ItemProperties.m64));

	public static final RegistryObject<Item> budget_hopper = items.register("budget_hopper",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_hopper = items.register("enchanted_hopper",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> perfect_hopper = items.register("perfect_hopper",
			() -> new Item(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_charcoal = items.register("enchanted_charcoal",
			() -> new EnchantedFuelItem(ItemProperties.m64, 2592000, .8));
	public static final RegistryObject<Item> enchanted_coal = items.register("enchanted_coal",
			() -> new EnchantedFuelItem(ItemProperties.m64, 1728000, .9));
	public static final RegistryObject<Item> enchanted_coal_block = items.register("enchanted_coal_block",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_lava_bucket = items.register("enchanted_lava_bucket",
			() -> new EnchantedFuelItem(ItemProperties.m64, -1, .75));

	public static final RegistryObject<Item> enchanted_diamond = items.register("enchanted_diamond",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_diamond_block = items.register("enchanted_diamond_block",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> diamond_spreading = items.register("diamond_spreading",
			() -> new UpgradeItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_emerald = items.register("enchanted_emerald",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_emerald_block = items.register("enchanted_emerald_block",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_end_stone = items.register("enchanted_end_stone",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> catalyst = items.register("catalyst",
			() -> new EnchantedFuelItem(ItemProperties.m64, 216000, 1 / 3d));

	public static final RegistryObject<Item> enchanted_glowstone_dust = items.register("enchanted_glowstone_dust",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_glowstone = items.register("enchanted_glowstone",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_gold_ingot = items.register("enchanted_gold_ingot",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_gold_block = items.register("enchanted_gold_block",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_iron_ingot = items.register("enchanted_iron_ingot",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_iron_block = items.register("enchanted_iron_block",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_lapis_lazuli = items.register("enchanted_lapis_lazuli",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_lapis_block = items.register("enchanted_lapis_block",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> grand_xp_bottle = items.register("grand_xp_bottle",
			() -> new ModExperienceBottleItem(ItemProperties.m64, Type.GRAND));
	public static final RegistryObject<Item> titanic_xp_bottle = items.register("titanic_xp_bottle",
			() -> new ModExperienceBottleItem(ItemProperties.m64, Type.TITANIC));

	public static final RegistryObject<Item> enchanted_obsidian = items.register("enchanted_obsidian",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_ice = items.register("enchanted_ice",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_packed_ice = items.register("enchanted_packed_ice",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> ice_bait = items.register("ice_bait", () -> new Item(ItemProperties.m64));
	public static final RegistryObject<Item> magical_water_bucket = items.register("magical_water_bucket",
			() -> new Item(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_redstone = items.register("enchanted_redstone",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_redstone_block = items.register("enchanted_redstone_block",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_redstone_lamp = items.register("enchanted_redstone_lamp",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_sand = items.register("enchanted_sand",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> enchanted_flint = items.register("enchanted_flint",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> flint_shovel = items.register("flint_shovel",
			() -> new ShovelItem(ItemTier.DIAMOND, 0, Float.MAX_VALUE, ItemProperties.m1));

	public static final RegistryObject<Item> minion_expander = items.register("minion_expander",
			() -> new UpgradeItem(ItemProperties.m64));
	public static final RegistryObject<Item> solar_panel = items.register("solar_panel",
			() -> new UpgradeItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_quartz = items.register("enchanted_quartz",
			() -> new EnchantedItem(ItemProperties.m64));
	public static final RegistryObject<Item> enchanted_quartz_block = items.register("enchanted_quartz_block",
			() -> new EnchantedItem(ItemProperties.m64));

	public static final RegistryObject<Item> weather_stick = items.register("weather_stick",
			() -> new EnchantedItem(ItemProperties.m1));

	public static final RegistryObject<Item> desert_biome_stick = items.register("desert_biome_stick",
			() -> new EnchantedItem(ItemProperties.m1));
	public static final RegistryObject<Item> end_biome_stick = items.register("end_biome_stick",
			() -> new EnchantedItem(ItemProperties.m1));
}