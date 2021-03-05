package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.blocks.init.MinionBlockInit;
import net.hypixel.skyblock.items.minion.MinionBlockItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link MinionBlockItem} for this Mod.
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class MinionBlockItemInit {
	public static final DeferredRegister<Item> minionItems = DeferredRegister.create(ForgeRegistries.ITEMS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Item> acacia_minion_1 = minionItems.register("acacia_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_2 = minionItems.register("acacia_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_3 = minionItems.register("acacia_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_4 = minionItems.register("acacia_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_5 = minionItems.register("acacia_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_6 = minionItems.register("acacia_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_7 = minionItems.register("acacia_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_8 = minionItems.register("acacia_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_9 = minionItems.register("acacia_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_a = minionItems.register("acacia_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> acacia_minion_b = minionItems.register("acacia_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.acacia_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> birch_minion_1 = minionItems.register("birch_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_2 = minionItems.register("birch_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_3 = minionItems.register("birch_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_4 = minionItems.register("birch_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_5 = minionItems.register("birch_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_6 = minionItems.register("birch_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_7 = minionItems.register("birch_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_8 = minionItems.register("birch_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_9 = minionItems.register("birch_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_a = minionItems.register("birch_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> birch_minion_b = minionItems.register("birch_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.birch_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> blaze_minion_1 = minionItems.register("blaze_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_2 = minionItems.register("blaze_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_3 = minionItems.register("blaze_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_4 = minionItems.register("blaze_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_5 = minionItems.register("blaze_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_6 = minionItems.register("blaze_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_7 = minionItems.register("blaze_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_8 = minionItems.register("blaze_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_9 = minionItems.register("blaze_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_a = minionItems.register("blaze_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> blaze_minion_b = minionItems.register("blaze_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.blaze_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> cactus_minion_1 = minionItems.register("cactus_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_2 = minionItems.register("cactus_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_3 = minionItems.register("cactus_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_4 = minionItems.register("cactus_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_5 = minionItems.register("cactus_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_6 = minionItems.register("cactus_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_7 = minionItems.register("cactus_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_8 = minionItems.register("cactus_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_9 = minionItems.register("cactus_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_a = minionItems.register("cactus_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cactus_minion_b = minionItems.register("cactus_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.cactus_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> carrot_minion_1 = minionItems.register("carrot_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_2 = minionItems.register("carrot_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_3 = minionItems.register("carrot_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_4 = minionItems.register("carrot_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_5 = minionItems.register("carrot_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_6 = minionItems.register("carrot_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_7 = minionItems.register("carrot_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_8 = minionItems.register("carrot_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_9 = minionItems.register("carrot_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_a = minionItems.register("carrot_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> carrot_minion_b = minionItems.register("carrot_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.carrot_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> cave_spider_minion_1 = minionItems.register("cave_spider_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_2 = minionItems.register("cave_spider_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_3 = minionItems.register("cave_spider_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_4 = minionItems.register("cave_spider_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_5 = minionItems.register("cave_spider_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_6 = minionItems.register("cave_spider_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_7 = minionItems.register("cave_spider_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_8 = minionItems.register("cave_spider_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_9 = minionItems.register("cave_spider_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_a = minionItems.register("cave_spider_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cave_spider_minion_b = minionItems.register("cave_spider_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.cave_spider_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> chicken_minion_1 = minionItems.register("chicken_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_2 = minionItems.register("chicken_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_3 = minionItems.register("chicken_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_4 = minionItems.register("chicken_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_5 = minionItems.register("chicken_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_6 = minionItems.register("chicken_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_7 = minionItems.register("chicken_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_8 = minionItems.register("chicken_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_9 = minionItems.register("chicken_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_a = minionItems.register("chicken_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> chicken_minion_b = minionItems.register("chicken_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.chicken_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> clay_minion_1 = minionItems.register("clay_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_2 = minionItems.register("clay_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_3 = minionItems.register("clay_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_4 = minionItems.register("clay_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_5 = minionItems.register("clay_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_6 = minionItems.register("clay_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_7 = minionItems.register("clay_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_8 = minionItems.register("clay_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_9 = minionItems.register("clay_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_a = minionItems.register("clay_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> clay_minion_b = minionItems.register("clay_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.clay_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> coal_minion_1 = minionItems.register("coal_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_2 = minionItems.register("coal_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_3 = minionItems.register("coal_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_4 = minionItems.register("coal_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_5 = minionItems.register("coal_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_6 = minionItems.register("coal_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_7 = minionItems.register("coal_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_8 = minionItems.register("coal_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_9 = minionItems.register("coal_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_a = minionItems.register("coal_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> coal_minion_b = minionItems.register("coal_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.coal_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> cobblestone_minion1 = minionItems.register("cobblestone_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion2 = minionItems.register("cobblestone_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion3 = minionItems.register("cobblestone_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion4 = minionItems.register("cobblestone_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion5 = minionItems.register("cobblestone_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion6 = minionItems.register("cobblestone_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion7 = minionItems.register("cobblestone_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion8 = minionItems.register("cobblestone_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minion9 = minionItems.register("cobblestone_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_miniona = minionItems.register("cobblestone_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cobblestone_minionb = minionItems.register("cobblestone_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.cobblestone_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> cocoa_beans_minion_1 = minionItems.register("cocoa_beans_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_2 = minionItems.register("cocoa_beans_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_3 = minionItems.register("cocoa_beans_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_4 = minionItems.register("cocoa_beans_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_5 = minionItems.register("cocoa_beans_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_6 = minionItems.register("cocoa_beans_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_7 = minionItems.register("cocoa_beans_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_8 = minionItems.register("cocoa_beans_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_9 = minionItems.register("cocoa_beans_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_a = minionItems.register("cocoa_beans_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cocoa_beans_minion_b = minionItems.register("cocoa_beans_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.cocoa_beans_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> cow_minion_1 = minionItems.register("cow_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_2 = minionItems.register("cow_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_3 = minionItems.register("cow_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_4 = minionItems.register("cow_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_5 = minionItems.register("cow_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_6 = minionItems.register("cow_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_7 = minionItems.register("cow_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_8 = minionItems.register("cow_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_9 = minionItems.register("cow_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_a = minionItems.register("cow_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> cow_minion_b = minionItems.register("cow_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.cow_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> creeper_minion_1 = minionItems.register("creeper_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_2 = minionItems.register("creeper_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_3 = minionItems.register("creeper_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_4 = minionItems.register("creeper_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_5 = minionItems.register("creeper_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_6 = minionItems.register("creeper_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_7 = minionItems.register("creeper_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_8 = minionItems.register("creeper_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_9 = minionItems.register("creeper_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_a = minionItems.register("creeper_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> creeper_minion_b = minionItems.register("creeper_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.creeper_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> dark_oak_minion_1 = minionItems.register("dark_oak_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_2 = minionItems.register("dark_oak_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_3 = minionItems.register("dark_oak_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_4 = minionItems.register("dark_oak_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_5 = minionItems.register("dark_oak_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_6 = minionItems.register("dark_oak_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_7 = minionItems.register("dark_oak_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_8 = minionItems.register("dark_oak_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_9 = minionItems.register("dark_oak_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_a = minionItems.register("dark_oak_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> dark_oak_minion_b = minionItems.register("dark_oak_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.dark_oak_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> diamond_minion_1 = minionItems.register("diamond_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_2 = minionItems.register("diamond_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_3 = minionItems.register("diamond_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_4 = minionItems.register("diamond_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_5 = minionItems.register("diamond_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_6 = minionItems.register("diamond_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_7 = minionItems.register("diamond_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_8 = minionItems.register("diamond_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_9 = minionItems.register("diamond_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_a = minionItems.register("diamond_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> diamond_minion_b = minionItems.register("diamond_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.diamond_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> emerald_minion_1 = minionItems.register("emerald_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_2 = minionItems.register("emerald_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_3 = minionItems.register("emerald_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_4 = minionItems.register("emerald_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_5 = minionItems.register("emerald_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_6 = minionItems.register("emerald_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_7 = minionItems.register("emerald_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_8 = minionItems.register("emerald_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_9 = minionItems.register("emerald_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_a = minionItems.register("emerald_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> emerald_minion_b = minionItems.register("emerald_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.emerald_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> end_stone_minion_1 = minionItems.register("end_stone_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_2 = minionItems.register("end_stone_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_3 = minionItems.register("end_stone_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_4 = minionItems.register("end_stone_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_5 = minionItems.register("end_stone_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_6 = minionItems.register("end_stone_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_7 = minionItems.register("end_stone_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_8 = minionItems.register("end_stone_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_9 = minionItems.register("end_stone_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_a = minionItems.register("end_stone_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> end_stone_minion_b = minionItems.register("end_stone_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.end_stone_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> enderman_minion_1 = minionItems.register("enderman_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_2 = minionItems.register("enderman_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_3 = minionItems.register("enderman_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_4 = minionItems.register("enderman_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_5 = minionItems.register("enderman_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_6 = minionItems.register("enderman_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_7 = minionItems.register("enderman_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_8 = minionItems.register("enderman_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_9 = minionItems.register("enderman_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_a = minionItems.register("enderman_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> enderman_minion_b = minionItems.register("enderman_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.enderman_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> fishing_minion_1 = minionItems.register("fishing_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_2 = minionItems.register("fishing_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_3 = minionItems.register("fishing_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_4 = minionItems.register("fishing_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_5 = minionItems.register("fishing_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_6 = minionItems.register("fishing_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_7 = minionItems.register("fishing_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_8 = minionItems.register("fishing_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_9 = minionItems.register("fishing_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_a = minionItems.register("fishing_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> fishing_minion_b = minionItems.register("fishing_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.fishing_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> flower_minion_1 = minionItems.register("flower_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_2 = minionItems.register("flower_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_3 = minionItems.register("flower_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_4 = minionItems.register("flower_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_5 = minionItems.register("flower_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_6 = minionItems.register("flower_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_7 = minionItems.register("flower_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_8 = minionItems.register("flower_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_9 = minionItems.register("flower_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_a = minionItems.register("flower_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> flower_minion_b = minionItems.register("flower_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.flower_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> ghast_minion_1 = minionItems.register("ghast_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_2 = minionItems.register("ghast_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_3 = minionItems.register("ghast_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_4 = minionItems.register("ghast_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_5 = minionItems.register("ghast_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_6 = minionItems.register("ghast_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_7 = minionItems.register("ghast_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_8 = minionItems.register("ghast_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_9 = minionItems.register("ghast_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_a = minionItems.register("ghast_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ghast_minion_b = minionItems.register("ghast_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.ghast_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> glowstone_minion_1 = minionItems.register("glowstone_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_2 = minionItems.register("glowstone_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_3 = minionItems.register("glowstone_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_4 = minionItems.register("glowstone_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_5 = minionItems.register("glowstone_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_6 = minionItems.register("glowstone_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_7 = minionItems.register("glowstone_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_8 = minionItems.register("glowstone_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_9 = minionItems.register("glowstone_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_a = minionItems.register("glowstone_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> glowstone_minion_b = minionItems.register("glowstone_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.glowstone_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> gold_minion_1 = minionItems.register("gold_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_2 = minionItems.register("gold_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_3 = minionItems.register("gold_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_4 = minionItems.register("gold_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_5 = minionItems.register("gold_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_6 = minionItems.register("gold_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_7 = minionItems.register("gold_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_8 = minionItems.register("gold_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_9 = minionItems.register("gold_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_a = minionItems.register("gold_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gold_minion_b = minionItems.register("gold_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.gold_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> gravel_minion_1 = minionItems.register("gravel_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_2 = minionItems.register("gravel_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_3 = minionItems.register("gravel_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_4 = minionItems.register("gravel_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_5 = minionItems.register("gravel_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_6 = minionItems.register("gravel_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_7 = minionItems.register("gravel_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_8 = minionItems.register("gravel_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_9 = minionItems.register("gravel_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_a = minionItems.register("gravel_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> gravel_minion_b = minionItems.register("gravel_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.gravel_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> ice_minion_1 = minionItems.register("ice_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_2 = minionItems.register("ice_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_3 = minionItems.register("ice_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_4 = minionItems.register("ice_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_5 = minionItems.register("ice_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_6 = minionItems.register("ice_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_7 = minionItems.register("ice_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_8 = minionItems.register("ice_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_9 = minionItems.register("ice_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_a = minionItems.register("ice_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> ice_minion_b = minionItems.register("ice_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.ice_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> iron_minion_1 = minionItems.register("iron_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_2 = minionItems.register("iron_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_3 = minionItems.register("iron_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_4 = minionItems.register("iron_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_5 = minionItems.register("iron_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_6 = minionItems.register("iron_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_7 = minionItems.register("iron_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_8 = minionItems.register("iron_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_9 = minionItems.register("iron_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_a = minionItems.register("iron_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> iron_minion_b = minionItems.register("iron_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.iron_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> jungle_minion_1 = minionItems.register("jungle_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_2 = minionItems.register("jungle_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_3 = minionItems.register("jungle_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_4 = minionItems.register("jungle_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_5 = minionItems.register("jungle_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_6 = minionItems.register("jungle_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_7 = minionItems.register("jungle_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_8 = minionItems.register("jungle_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_9 = minionItems.register("jungle_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_a = minionItems.register("jungle_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> jungle_minion_b = minionItems.register("jungle_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.jungle_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> lapis_minion_1 = minionItems.register("lapis_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_2 = minionItems.register("lapis_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_3 = minionItems.register("lapis_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_4 = minionItems.register("lapis_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_5 = minionItems.register("lapis_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_6 = minionItems.register("lapis_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_7 = minionItems.register("lapis_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_8 = minionItems.register("lapis_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_9 = minionItems.register("lapis_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_a = minionItems.register("lapis_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> lapis_minion_b = minionItems.register("lapis_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.lapis_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> magma_cube_minion_1 = minionItems.register("magma_cube_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_2 = minionItems.register("magma_cube_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_3 = minionItems.register("magma_cube_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_4 = minionItems.register("magma_cube_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_5 = minionItems.register("magma_cube_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_6 = minionItems.register("magma_cube_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_7 = minionItems.register("magma_cube_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_8 = minionItems.register("magma_cube_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_9 = minionItems.register("magma_cube_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_a = minionItems.register("magma_cube_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> magma_cube_minion_b = minionItems.register("magma_cube_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.magma_cube_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> melon_minion_1 = minionItems.register("melon_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_2 = minionItems.register("melon_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_3 = minionItems.register("melon_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_4 = minionItems.register("melon_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_5 = minionItems.register("melon_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_6 = minionItems.register("melon_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_7 = minionItems.register("melon_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_8 = minionItems.register("melon_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_9 = minionItems.register("melon_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_a = minionItems.register("melon_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> melon_minion_b = minionItems.register("melon_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.melon_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> mushroom_minion_1 = minionItems.register("mushroom_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_2 = minionItems.register("mushroom_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_3 = minionItems.register("mushroom_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_4 = minionItems.register("mushroom_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_5 = minionItems.register("mushroom_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_6 = minionItems.register("mushroom_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_7 = minionItems.register("mushroom_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_8 = minionItems.register("mushroom_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_9 = minionItems.register("mushroom_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_a = minionItems.register("mushroom_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> mushroom_minion_b = minionItems.register("mushroom_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.mushroom_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> nether_wart_minion_1 = minionItems.register("nether_wart_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_2 = minionItems.register("nether_wart_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_3 = minionItems.register("nether_wart_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_4 = minionItems.register("nether_wart_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_5 = minionItems.register("nether_wart_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_6 = minionItems.register("nether_wart_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_7 = minionItems.register("nether_wart_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_8 = minionItems.register("nether_wart_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_9 = minionItems.register("nether_wart_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_a = minionItems.register("nether_wart_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> nether_wart_minion_b = minionItems.register("nether_wart_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.nether_wart_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> oak_minion_1 = minionItems.register("oak_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_2 = minionItems.register("oak_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_3 = minionItems.register("oak_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_4 = minionItems.register("oak_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_5 = minionItems.register("oak_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_6 = minionItems.register("oak_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_7 = minionItems.register("oak_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_8 = minionItems.register("oak_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_9 = minionItems.register("oak_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_a = minionItems.register("oak_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> oak_minion_b = minionItems.register("oak_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.oak_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> obsidian_minion_1 = minionItems.register("obsidian_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_2 = minionItems.register("obsidian_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_3 = minionItems.register("obsidian_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_4 = minionItems.register("obsidian_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_5 = minionItems.register("obsidian_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_6 = minionItems.register("obsidian_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_7 = minionItems.register("obsidian_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_8 = minionItems.register("obsidian_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_9 = minionItems.register("obsidian_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_a = minionItems.register("obsidian_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> obsidian_minion_b = minionItems.register("obsidian_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.obsidian_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> pig_minion_1 = minionItems.register("pig_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_2 = minionItems.register("pig_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_3 = minionItems.register("pig_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_4 = minionItems.register("pig_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_5 = minionItems.register("pig_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_6 = minionItems.register("pig_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_7 = minionItems.register("pig_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_8 = minionItems.register("pig_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_9 = minionItems.register("pig_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_a = minionItems.register("pig_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pig_minion_b = minionItems.register("pig_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.pig_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> potato_minion_1 = minionItems.register("potato_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_2 = minionItems.register("potato_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_3 = minionItems.register("potato_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_4 = minionItems.register("potato_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_5 = minionItems.register("potato_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_6 = minionItems.register("potato_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_7 = minionItems.register("potato_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_8 = minionItems.register("potato_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_9 = minionItems.register("potato_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_a = minionItems.register("potato_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> potato_minion_b = minionItems.register("potato_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.potato_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> pumpkin_minion_1 = minionItems.register("pumpkin_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_2 = minionItems.register("pumpkin_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_3 = minionItems.register("pumpkin_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_4 = minionItems.register("pumpkin_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_5 = minionItems.register("pumpkin_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_6 = minionItems.register("pumpkin_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_7 = minionItems.register("pumpkin_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_8 = minionItems.register("pumpkin_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_9 = minionItems.register("pumpkin_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_a = minionItems.register("pumpkin_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> pumpkin_minion_b = minionItems.register("pumpkin_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.pumpkin_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> quartz_minion_1 = minionItems.register("quartz_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_2 = minionItems.register("quartz_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_3 = minionItems.register("quartz_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_4 = minionItems.register("quartz_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_5 = minionItems.register("quartz_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_6 = minionItems.register("quartz_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_7 = minionItems.register("quartz_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_8 = minionItems.register("quartz_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_9 = minionItems.register("quartz_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_a = minionItems.register("quartz_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> quartz_minion_b = minionItems.register("quartz_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.quartz_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> rabbit_minion_1 = minionItems.register("rabbit_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_2 = minionItems.register("rabbit_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_3 = minionItems.register("rabbit_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_4 = minionItems.register("rabbit_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_5 = minionItems.register("rabbit_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_6 = minionItems.register("rabbit_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_7 = minionItems.register("rabbit_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_8 = minionItems.register("rabbit_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_9 = minionItems.register("rabbit_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_a = minionItems.register("rabbit_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> rabbit_minion_b = minionItems.register("rabbit_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.rabbit_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> redstone_minion_1 = minionItems.register("redstone_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_2 = minionItems.register("redstone_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_3 = minionItems.register("redstone_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_4 = minionItems.register("redstone_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_5 = minionItems.register("redstone_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_6 = minionItems.register("redstone_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_7 = minionItems.register("redstone_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_8 = minionItems.register("redstone_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_9 = minionItems.register("redstone_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_a = minionItems.register("redstone_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> redstone_minion_b = minionItems.register("redstone_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.redstone_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> sand_minion_1 = minionItems.register("sand_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_2 = minionItems.register("sand_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_3 = minionItems.register("sand_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_4 = minionItems.register("sand_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_5 = minionItems.register("sand_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_6 = minionItems.register("sand_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_7 = minionItems.register("sand_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_8 = minionItems.register("sand_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_9 = minionItems.register("sand_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_a = minionItems.register("sand_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sand_minion_b = minionItems.register("sand_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.sand_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> sheep_minion_1 = minionItems.register("sheep_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_2 = minionItems.register("sheep_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_3 = minionItems.register("sheep_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_4 = minionItems.register("sheep_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_5 = minionItems.register("sheep_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_6 = minionItems.register("sheep_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_7 = minionItems.register("sheep_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_8 = minionItems.register("sheep_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_9 = minionItems.register("sheep_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_a = minionItems.register("sheep_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sheep_minion_b = minionItems.register("sheep_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.sheep_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> skeleton_minion_1 = minionItems.register("skeleton_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_2 = minionItems.register("skeleton_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_3 = minionItems.register("skeleton_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_4 = minionItems.register("skeleton_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_5 = minionItems.register("skeleton_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_6 = minionItems.register("skeleton_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_7 = minionItems.register("skeleton_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_8 = minionItems.register("skeleton_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_9 = minionItems.register("skeleton_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_a = minionItems.register("skeleton_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> skeleton_minion_b = minionItems.register("skeleton_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.skeleton_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> slime_minion_1 = minionItems.register("slime_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_2 = minionItems.register("slime_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_3 = minionItems.register("slime_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_4 = minionItems.register("slime_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_5 = minionItems.register("slime_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_6 = minionItems.register("slime_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_7 = minionItems.register("slime_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_8 = minionItems.register("slime_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_9 = minionItems.register("slime_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_a = minionItems.register("slime_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> slime_minion_b = minionItems.register("slime_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.slime_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> snow_minion_1 = minionItems.register("snow_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_2 = minionItems.register("snow_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_3 = minionItems.register("snow_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_4 = minionItems.register("snow_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_5 = minionItems.register("snow_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_6 = minionItems.register("snow_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_7 = minionItems.register("snow_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_8 = minionItems.register("snow_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_9 = minionItems.register("snow_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_a = minionItems.register("snow_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> snow_minion_b = minionItems.register("snow_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.snow_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> spider_minion_1 = minionItems.register("spider_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_2 = minionItems.register("spider_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_3 = minionItems.register("spider_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_4 = minionItems.register("spider_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_5 = minionItems.register("spider_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_6 = minionItems.register("spider_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_7 = minionItems.register("spider_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_8 = minionItems.register("spider_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_9 = minionItems.register("spider_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_a = minionItems.register("spider_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spider_minion_b = minionItems.register("spider_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.spider_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> spruce_minion_1 = minionItems.register("spruce_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_2 = minionItems.register("spruce_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_3 = minionItems.register("spruce_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_4 = minionItems.register("spruce_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_5 = minionItems.register("spruce_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_6 = minionItems.register("spruce_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_7 = minionItems.register("spruce_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_8 = minionItems.register("spruce_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_9 = minionItems.register("spruce_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_a = minionItems.register("spruce_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> spruce_minion_b = minionItems.register("spruce_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.spruce_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> sugar_cane_minion_1 = minionItems.register("sugar_cane_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_2 = minionItems.register("sugar_cane_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_3 = minionItems.register("sugar_cane_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_4 = minionItems.register("sugar_cane_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_5 = minionItems.register("sugar_cane_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_6 = minionItems.register("sugar_cane_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_7 = minionItems.register("sugar_cane_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_8 = minionItems.register("sugar_cane_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_9 = minionItems.register("sugar_cane_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_a = minionItems.register("sugar_cane_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> sugar_cane_minion_b = minionItems.register("sugar_cane_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.sugar_cane_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> wheat_minion1 = minionItems.register("wheat_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion2 = minionItems.register("wheat_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion3 = minionItems.register("wheat_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion4 = minionItems.register("wheat_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion5 = minionItems.register("wheat_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion6 = minionItems.register("wheat_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion7 = minionItems.register("wheat_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion8 = minionItems.register("wheat_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minion9 = minionItems.register("wheat_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_miniona = minionItems.register("wheat_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> wheat_minionb = minionItems.register("wheat_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.wheat_minion_b.get(), ItemProperties.mn1));

	public static final RegistryObject<Item> zombie_minion_1 = minionItems.register("zombie_minion_1",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_1.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_2 = minionItems.register("zombie_minion_2",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_2.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_3 = minionItems.register("zombie_minion_3",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_3.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_4 = minionItems.register("zombie_minion_4",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_4.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_5 = minionItems.register("zombie_minion_5",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_5.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_6 = minionItems.register("zombie_minion_6",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_6.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_7 = minionItems.register("zombie_minion_7",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_7.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_8 = minionItems.register("zombie_minion_8",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_8.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_9 = minionItems.register("zombie_minion_9",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_9.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_a = minionItems.register("zombie_minion_a",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_a.get(), ItemProperties.mn1));
	public static final RegistryObject<Item> zombie_minion_b = minionItems.register("zombie_minion_b",
			() -> new MinionBlockItem(MinionBlockInit.zombie_minion_b.get(), ItemProperties.mn1));
}