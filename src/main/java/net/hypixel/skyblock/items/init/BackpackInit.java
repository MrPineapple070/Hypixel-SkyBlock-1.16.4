package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.AbstractBackpack.GreaterBackpack;
import net.hypixel.skyblock.items.AbstractBackpack.JumboBackpack;
import net.hypixel.skyblock.items.AbstractBackpack.LargeBackpack;
import net.hypixel.skyblock.items.AbstractBackpack.MediumBackpack;
import net.hypixel.skyblock.items.AbstractBackpack.SmallBackpack;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BackpackInit {
	public static final DeferredRegister<Item> backpack = DeferredRegister.create(ForgeRegistries.ITEMS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Item> small_backpack = backpack.register("small_backpack",
			() -> new SmallBackpack(null));
	public static final RegistryObject<Item> white_small_backpack = backpack.register("white_small_backpack",
			() -> new SmallBackpack(DyeColor.WHITE));
	public static final RegistryObject<Item> orange_small_backpack = backpack.register("orange_small_backpack",
			() -> new SmallBackpack(DyeColor.ORANGE));
	public static final RegistryObject<Item> magenta_small_backpack = backpack.register("magenta_small_backpack",
			() -> new SmallBackpack(DyeColor.MAGENTA));
	public static final RegistryObject<Item> light_blue_small_backpack = backpack.register("light_blue_small_backpack",
			() -> new SmallBackpack(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<Item> yellow_small_backpack = backpack.register("yellow_small_backpack",
			() -> new SmallBackpack(DyeColor.YELLOW));
	public static final RegistryObject<Item> lime_small_backpack = backpack.register("lime_small_backpack",
			() -> new SmallBackpack(DyeColor.LIME));
	public static final RegistryObject<Item> pink_small_backpack = backpack.register("pink_small_backpack",
			() -> new SmallBackpack(DyeColor.PINK));
	public static final RegistryObject<Item> gray_small_backpack = backpack.register("gray_small_backpack",
			() -> new SmallBackpack(DyeColor.GRAY));
	public static final RegistryObject<Item> light_gray_small_backpack = backpack.register("light_gray_small_backpack",
			() -> new SmallBackpack(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<Item> cyan_small_backpack = backpack.register("cyan_small_backpack",
			() -> new SmallBackpack(DyeColor.CYAN));
	public static final RegistryObject<Item> purple_small_backpack = backpack.register("purple_small_backpack",
			() -> new SmallBackpack(DyeColor.PURPLE));
	public static final RegistryObject<Item> blue_small_backpack = backpack.register("blue_small_backpack",
			() -> new SmallBackpack(DyeColor.BLUE));
	public static final RegistryObject<Item> brown_small_backpack = backpack.register("brown_small_backpack",
			() -> new SmallBackpack(DyeColor.BROWN));
	public static final RegistryObject<Item> green_small_backpack = backpack.register("green_small_backpack",
			() -> new SmallBackpack(DyeColor.GREEN));
	public static final RegistryObject<Item> red_small_backpack = backpack.register("red_small_backpack",
			() -> new SmallBackpack(DyeColor.RED));
	public static final RegistryObject<Item> black_small_backpack = backpack.register("black_small_backpack",
			() -> new SmallBackpack(DyeColor.BLACK));

	public static final RegistryObject<Item> medium_backpack = backpack.register("medium_backpack",
			() -> new MediumBackpack(null));
	public static final RegistryObject<Item> white_medium_backpack = backpack.register("white_medium_backpack",
			() -> new MediumBackpack(DyeColor.WHITE));
	public static final RegistryObject<Item> orange_medium_backpack = backpack.register("orange_medium_backpack",
			() -> new MediumBackpack(DyeColor.ORANGE));
	public static final RegistryObject<Item> magenta_medium_backpack = backpack.register("magenta_medium_backpack",
			() -> new MediumBackpack(DyeColor.MAGENTA));
	public static final RegistryObject<Item> light_blue_medium_backpack = backpack
			.register("light_blue_medium_backpack", () -> new MediumBackpack(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<Item> yellow_medium_backpack = backpack.register("yellow_medium_backpack",
			() -> new MediumBackpack(DyeColor.YELLOW));
	public static final RegistryObject<Item> lime_medium_backpack = backpack.register("lime_medium_backpack",
			() -> new MediumBackpack(DyeColor.LIME));
	public static final RegistryObject<Item> pink_medium_backpack = backpack.register("pink_medium_backpack",
			() -> new MediumBackpack(DyeColor.PINK));
	public static final RegistryObject<Item> gray_medium_backpack = backpack.register("gray_medium_backpack",
			() -> new MediumBackpack(DyeColor.GRAY));
	public static final RegistryObject<Item> light_gray_medium_backpack = backpack
			.register("light_gray_medium_backpack", () -> new MediumBackpack(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<Item> cyan_medium_backpack = backpack.register("cyan_medium_backpack",
			() -> new MediumBackpack(DyeColor.CYAN));
	public static final RegistryObject<Item> purple_medium_backpack = backpack.register("purple_medium_backpack",
			() -> new MediumBackpack(DyeColor.PURPLE));
	public static final RegistryObject<Item> blue_medium_backpack = backpack.register("blue_medium_backpack",
			() -> new MediumBackpack(DyeColor.BLUE));
	public static final RegistryObject<Item> brown_medium_backpack = backpack.register("brown_medium_backpack",
			() -> new MediumBackpack(DyeColor.BROWN));
	public static final RegistryObject<Item> green_medium_backpack = backpack.register("green_medium_backpack",
			() -> new MediumBackpack(DyeColor.GREEN));
	public static final RegistryObject<Item> red_medium_backpack = backpack.register("red_medium_backpack",
			() -> new MediumBackpack(DyeColor.RED));
	public static final RegistryObject<Item> black_medium_backpack = backpack.register("black_medium_backpack",
			() -> new MediumBackpack(DyeColor.BLACK));

	public static final RegistryObject<Item> large_backpack = backpack.register("large_backpack",
			() -> new LargeBackpack(null));
	public static final RegistryObject<Item> white_large_backpack = backpack.register("white_large_backpack",
			() -> new LargeBackpack(DyeColor.WHITE));
	public static final RegistryObject<Item> orange_large_backpack = backpack.register("orange_large_backpack",
			() -> new LargeBackpack(DyeColor.ORANGE));
	public static final RegistryObject<Item> magenta_large_backpack = backpack.register("magenta_large_backpack",
			() -> new LargeBackpack(DyeColor.MAGENTA));
	public static final RegistryObject<Item> light_blue_large_backpack = backpack.register("light_blue_large_backpack",
			() -> new LargeBackpack(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<Item> yellow_large_backpack = backpack.register("yellow_large_backpack",
			() -> new LargeBackpack(DyeColor.YELLOW));
	public static final RegistryObject<Item> lime_large_backpack = backpack.register("lime_large_backpack",
			() -> new LargeBackpack(DyeColor.LIME));
	public static final RegistryObject<Item> pink_large_backpack = backpack.register("pink_large_backpack",
			() -> new LargeBackpack(DyeColor.PINK));
	public static final RegistryObject<Item> gray_large_backpack = backpack.register("gray_large_backpack",
			() -> new LargeBackpack(DyeColor.GRAY));
	public static final RegistryObject<Item> light_gray_large_backpack = backpack.register("light_gray_large_backpack",
			() -> new LargeBackpack(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<Item> cyan_large_backpack = backpack.register("cyan_large_backpack",
			() -> new LargeBackpack(DyeColor.CYAN));
	public static final RegistryObject<Item> purple_large_backpack = backpack.register("purple_large_backpack",
			() -> new LargeBackpack(DyeColor.PURPLE));
	public static final RegistryObject<Item> blue_large_backpack = backpack.register("blue_large_backpack",
			() -> new LargeBackpack(DyeColor.BLUE));
	public static final RegistryObject<Item> brown_large_backpack = backpack.register("brown_large_backpack",
			() -> new LargeBackpack(DyeColor.BROWN));
	public static final RegistryObject<Item> green_large_backpack = backpack.register("green_large_backpack",
			() -> new LargeBackpack(DyeColor.GREEN));
	public static final RegistryObject<Item> red_large_backpack = backpack.register("red_large_backpack",
			() -> new LargeBackpack(DyeColor.RED));
	public static final RegistryObject<Item> black_large_backpack = backpack.register("black_large_backpack",
			() -> new LargeBackpack(DyeColor.BLACK));

	public static final RegistryObject<Item> greater_backpack = backpack.register("greater_backpack",
			() -> new GreaterBackpack(null));
	public static final RegistryObject<Item> white_greater_backpack = backpack.register("white_greater_backpack",
			() -> new GreaterBackpack(DyeColor.WHITE));
	public static final RegistryObject<Item> orange_greater_backpack = backpack.register("orange_greater_backpack",
			() -> new GreaterBackpack(DyeColor.ORANGE));
	public static final RegistryObject<Item> magenta_greater_backpack = backpack.register("magenta_greater_backpack",
			() -> new GreaterBackpack(DyeColor.MAGENTA));
	public static final RegistryObject<Item> light_blue_greater_backpack = backpack
			.register("light_blue_greater_backpack", () -> new GreaterBackpack(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<Item> yellow_greater_backpack = backpack.register("yellow_greater_backpack",
			() -> new GreaterBackpack(DyeColor.YELLOW));
	public static final RegistryObject<Item> lime_greater_backpack = backpack.register("lime_greater_backpack",
			() -> new GreaterBackpack(DyeColor.LIME));
	public static final RegistryObject<Item> pink_greater_backpack = backpack.register("pink_greater_backpack",
			() -> new GreaterBackpack(DyeColor.PINK));
	public static final RegistryObject<Item> gray_greater_backpack = backpack.register("gray_greater_backpack",
			() -> new GreaterBackpack(DyeColor.GRAY));
	public static final RegistryObject<Item> light_gray_greater_backpack = backpack
			.register("light_gray_greater_backpack", () -> new GreaterBackpack(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<Item> cyan_greater_backpack = backpack.register("cyan_greater_backpack",
			() -> new GreaterBackpack(DyeColor.CYAN));
	public static final RegistryObject<Item> purple_greater_backpack = backpack.register("purple_greater_backpack",
			() -> new GreaterBackpack(DyeColor.PURPLE));
	public static final RegistryObject<Item> blue_greater_backpack = backpack.register("blue_greater_backpack",
			() -> new GreaterBackpack(DyeColor.BLUE));
	public static final RegistryObject<Item> brown_greater_backpack = backpack.register("brown_greater_backpack",
			() -> new GreaterBackpack(DyeColor.BROWN));
	public static final RegistryObject<Item> green_greater_backpack = backpack.register("green_greater_backpack",
			() -> new GreaterBackpack(DyeColor.GREEN));
	public static final RegistryObject<Item> red_greater_backpack = backpack.register("red_greater_backpack",
			() -> new GreaterBackpack(DyeColor.RED));
	public static final RegistryObject<Item> black_greater_backpack = backpack.register("black_greater_backpack",
			() -> new GreaterBackpack(DyeColor.BLACK));

	public static final RegistryObject<Item> jumbo_backpack = backpack.register("jumbo_backpack",
			() -> new JumboBackpack(null));
	public static final RegistryObject<Item> white_jumbo_backpack = backpack.register("white_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.WHITE));
	public static final RegistryObject<Item> orange_jumbo_backpack = backpack.register("orange_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.ORANGE));
	public static final RegistryObject<Item> magenta_jumbo_backpack = backpack.register("magenta_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.MAGENTA));
	public static final RegistryObject<Item> light_blue_jumbo_backpack = backpack.register("light_blue_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<Item> yellow_jumbo_backpack = backpack.register("yellow_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.YELLOW));
	public static final RegistryObject<Item> lime_jumbo_backpack = backpack.register("lime_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.LIME));
	public static final RegistryObject<Item> pink_jumbo_backpack = backpack.register("pink_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.PINK));
	public static final RegistryObject<Item> gray_jumbo_backpack = backpack.register("gray_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.GRAY));
	public static final RegistryObject<Item> light_gray_jumbo_backpack = backpack.register("light_gray_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<Item> cyan_jumbo_backpack = backpack.register("cyan_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.CYAN));
	public static final RegistryObject<Item> purple_jumbo_backpack = backpack.register("purple_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.PURPLE));
	public static final RegistryObject<Item> blue_jumbo_backpack = backpack.register("blue_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.BLUE));
	public static final RegistryObject<Item> brown_jumbo_backpack = backpack.register("brown_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.BROWN));
	public static final RegistryObject<Item> green_jumbo_backpack = backpack.register("green_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.GREEN));
	public static final RegistryObject<Item> red_jumbo_backpack = backpack.register("red_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.RED));
	public static final RegistryObject<Item> black_jumbo_backpack = backpack.register("black_jumbo_backpack",
			() -> new JumboBackpack(DyeColor.BLACK));
}