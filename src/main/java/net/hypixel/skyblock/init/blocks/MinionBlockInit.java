package net.hypixel.skyblock.init.blocks;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.blocks.minion.AbstractMinionBlock;
import net.hypixel.skyblock.blocks.minion.AcaciaMinion;
import net.hypixel.skyblock.blocks.minion.CoalMinion;
import net.hypixel.skyblock.blocks.minion.CobblestoneMinion;
import net.hypixel.skyblock.blocks.minion.WheatMinion;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link AbstractMinionBlock} for this Mod.
 *
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 11 June 2019
 */
public class MinionBlockInit {
	public static final DeferredRegister<Block> minionBlocks = DeferredRegister.create(ForgeRegistries.BLOCKS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Block> acacia_minion_1 = minionBlocks.register("acacia_minion_1",
			() -> new AcaciaMinion(MinionTier.I));
	public static final RegistryObject<Block> acacia_minion_2 = minionBlocks.register("acacia_minion_2",
			() -> new AcaciaMinion(MinionTier.II));
	public static final RegistryObject<Block> acacia_minion_3 = minionBlocks.register("acacia_minion_3",
			() -> new AcaciaMinion(MinionTier.III));
	public static final RegistryObject<Block> acacia_minion_4 = minionBlocks.register("acacia_minion_4",
			() -> new AcaciaMinion(MinionTier.IV));
	public static final RegistryObject<Block> acacia_minion_5 = minionBlocks.register("acacia_minion_5",
			() -> new AcaciaMinion(MinionTier.V));
	public static final RegistryObject<Block> acacia_minion_6 = minionBlocks.register("acacia_minion_6",
			() -> new AcaciaMinion(MinionTier.VI));
	public static final RegistryObject<Block> acacia_minion_7 = minionBlocks.register("acacia_minion_7",
			() -> new AcaciaMinion(MinionTier.VII));
	public static final RegistryObject<Block> acacia_minion_8 = minionBlocks.register("acacia_minion_8",
			() -> new AcaciaMinion(MinionTier.VIII));
	public static final RegistryObject<Block> acacia_minion_9 = minionBlocks.register("acacia_minion_9",
			() -> new AcaciaMinion(MinionTier.IX));
	public static final RegistryObject<Block> acacia_minion_a = minionBlocks.register("acacia_minion_a",
			() -> new AcaciaMinion(MinionTier.X));
	public static final RegistryObject<Block> acacia_minion_b = minionBlocks.register("acacia_minion_b",
			() -> new AcaciaMinion(MinionTier.XI));

	public static final RegistryObject<Block> birch_minion_1 = minionBlocks.register("birch_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_2 = minionBlocks.register("birch_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_3 = minionBlocks.register("birch_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_4 = minionBlocks.register("birch_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_5 = minionBlocks.register("birch_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_6 = minionBlocks.register("birch_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_7 = minionBlocks.register("birch_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_8 = minionBlocks.register("birch_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_9 = minionBlocks.register("birch_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_a = minionBlocks.register("birch_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> birch_minion_b = minionBlocks.register("birch_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> blaze_minion_1 = minionBlocks.register("blaze_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_2 = minionBlocks.register("blaze_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_3 = minionBlocks.register("blaze_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_4 = minionBlocks.register("blaze_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_5 = minionBlocks.register("blaze_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_6 = minionBlocks.register("blaze_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_7 = minionBlocks.register("blaze_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_8 = minionBlocks.register("blaze_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_9 = minionBlocks.register("blaze_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_a = minionBlocks.register("blaze_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> blaze_minion_b = minionBlocks.register("blaze_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> cactus_minion_1 = minionBlocks.register("cactus_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_2 = minionBlocks.register("cactus_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_3 = minionBlocks.register("cactus_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_4 = minionBlocks.register("cactus_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_5 = minionBlocks.register("cactus_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_6 = minionBlocks.register("cactus_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_7 = minionBlocks.register("cactus_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_8 = minionBlocks.register("cactus_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_9 = minionBlocks.register("cactus_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_a = minionBlocks.register("cactus_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cactus_minion_b = minionBlocks.register("cactus_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> carrot_minion_1 = minionBlocks.register("carrot_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_2 = minionBlocks.register("carrot_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_3 = minionBlocks.register("carrot_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_4 = minionBlocks.register("carrot_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_5 = minionBlocks.register("carrot_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_6 = minionBlocks.register("carrot_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_7 = minionBlocks.register("carrot_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_8 = minionBlocks.register("carrot_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_9 = minionBlocks.register("carrot_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_a = minionBlocks.register("carrot_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> carrot_minion_b = minionBlocks.register("carrot_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> cave_spider_minion_1 = minionBlocks.register("cave_spider_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_2 = minionBlocks.register("cave_spider_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_3 = minionBlocks.register("cave_spider_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_4 = minionBlocks.register("cave_spider_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_5 = minionBlocks.register("cave_spider_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_6 = minionBlocks.register("cave_spider_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_7 = minionBlocks.register("cave_spider_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_8 = minionBlocks.register("cave_spider_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_9 = minionBlocks.register("cave_spider_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_a = minionBlocks.register("cave_spider_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cave_spider_minion_b = minionBlocks.register("cave_spider_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> chicken_minion_1 = minionBlocks.register("chicken_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_2 = minionBlocks.register("chicken_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_3 = minionBlocks.register("chicken_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_4 = minionBlocks.register("chicken_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_5 = minionBlocks.register("chicken_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_6 = minionBlocks.register("chicken_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_7 = minionBlocks.register("chicken_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_8 = minionBlocks.register("chicken_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_9 = minionBlocks.register("chicken_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_a = minionBlocks.register("chicken_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> chicken_minion_b = minionBlocks.register("chicken_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> clay_minion_1 = minionBlocks.register("clay_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_2 = minionBlocks.register("clay_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_3 = minionBlocks.register("clay_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_4 = minionBlocks.register("clay_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_5 = minionBlocks.register("clay_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_6 = minionBlocks.register("clay_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_7 = minionBlocks.register("clay_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_8 = minionBlocks.register("clay_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_9 = minionBlocks.register("clay_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_a = minionBlocks.register("clay_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> clay_minion_b = minionBlocks.register("clay_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> coal_minion_1 = minionBlocks.register("coal_minion_1",
			() -> new CoalMinion(MinionTier.I));
	public static final RegistryObject<Block> coal_minion_2 = minionBlocks.register("coal_minion_2",
			() -> new CoalMinion(MinionTier.II));
	public static final RegistryObject<Block> coal_minion_3 = minionBlocks.register("coal_minion_3",
			() -> new CoalMinion(MinionTier.III));
	public static final RegistryObject<Block> coal_minion_4 = minionBlocks.register("coal_minion_4",
			() -> new CoalMinion(MinionTier.IV));
	public static final RegistryObject<Block> coal_minion_5 = minionBlocks.register("coal_minion_5",
			() -> new CoalMinion(MinionTier.V));
	public static final RegistryObject<Block> coal_minion_6 = minionBlocks.register("coal_minion_6",
			() -> new CoalMinion(MinionTier.VI));
	public static final RegistryObject<Block> coal_minion_7 = minionBlocks.register("coal_minion_7",
			() -> new CoalMinion(MinionTier.VII));
	public static final RegistryObject<Block> coal_minion_8 = minionBlocks.register("coal_minion_8",
			() -> new CoalMinion(MinionTier.VIII));
	public static final RegistryObject<Block> coal_minion_9 = minionBlocks.register("coal_minion_9",
			() -> new CoalMinion(MinionTier.IX));
	public static final RegistryObject<Block> coal_minion_a = minionBlocks.register("coal_minion_a",
			() -> new CoalMinion(MinionTier.X));
	public static final RegistryObject<Block> coal_minion_b = minionBlocks.register("coal_minion_b",
			() -> new CoalMinion(MinionTier.XI));

	public static final RegistryObject<Block> cobblestone_minion_1 = minionBlocks.register("cobblestone_minion_1",
			() -> new CobblestoneMinion(MinionTier.I));
	public static final RegistryObject<Block> cobblestone_minion_2 = minionBlocks.register("cobblestone_minion_2",
			() -> new CobblestoneMinion(MinionTier.II));
	public static final RegistryObject<Block> cobblestone_minion_3 = minionBlocks.register("cobblestone_minion_3",
			() -> new CobblestoneMinion(MinionTier.III));
	public static final RegistryObject<Block> cobblestone_minion_4 = minionBlocks.register("cobblestone_minion_4",
			() -> new CobblestoneMinion(MinionTier.IV));
	public static final RegistryObject<Block> cobblestone_minion_5 = minionBlocks.register("cobblestone_minion_5",
			() -> new CobblestoneMinion(MinionTier.V));
	public static final RegistryObject<Block> cobblestone_minion_6 = minionBlocks.register("cobblestone_minion_6",
			() -> new CobblestoneMinion(MinionTier.VI));
	public static final RegistryObject<Block> cobblestone_minion_7 = minionBlocks.register("cobblestone_minion_7",
			() -> new CobblestoneMinion(MinionTier.VII));
	public static final RegistryObject<Block> cobblestone_minion_8 = minionBlocks.register("cobblestone_minion_8",
			() -> new CobblestoneMinion(MinionTier.VIII));
	public static final RegistryObject<Block> cobblestone_minion_9 = minionBlocks.register("cobblestone_minion_9",
			() -> new CobblestoneMinion(MinionTier.IX));
	public static final RegistryObject<Block> cobblestone_minion_a = minionBlocks.register("cobblestone_minion_a",
			() -> new CobblestoneMinion(MinionTier.X));
	public static final RegistryObject<Block> cobblestone_minion_b = minionBlocks.register("cobblestone_minion_b",
			() -> new CobblestoneMinion(MinionTier.XI));

	public static final RegistryObject<Block> cocoa_beans_minion_1 = minionBlocks.register("cocoa_beans_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_2 = minionBlocks.register("cocoa_beans_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_3 = minionBlocks.register("cocoa_beans_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_4 = minionBlocks.register("cocoa_beans_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_5 = minionBlocks.register("cocoa_beans_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_6 = minionBlocks.register("cocoa_beans_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_7 = minionBlocks.register("cocoa_beans_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_8 = minionBlocks.register("cocoa_beans_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_9 = minionBlocks.register("cocoa_beans_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_a = minionBlocks.register("cocoa_beans_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cocoa_beans_minion_b = minionBlocks.register("cocoa_beans_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> cow_minion_1 = minionBlocks.register("cow_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_2 = minionBlocks.register("cow_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_3 = minionBlocks.register("cow_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_4 = minionBlocks.register("cow_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_5 = minionBlocks.register("cow_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_6 = minionBlocks.register("cow_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_7 = minionBlocks.register("cow_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_8 = minionBlocks.register("cow_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_9 = minionBlocks.register("cow_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_a = minionBlocks.register("cow_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> cow_minion_b = minionBlocks.register("cow_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> creeper_minion_1 = minionBlocks.register("creeper_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_2 = minionBlocks.register("creeper_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_3 = minionBlocks.register("creeper_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_4 = minionBlocks.register("creeper_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_5 = minionBlocks.register("creeper_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_6 = minionBlocks.register("creeper_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_7 = minionBlocks.register("creeper_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_8 = minionBlocks.register("creeper_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_9 = minionBlocks.register("creeper_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_a = minionBlocks.register("creeper_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> creeper_minion_b = minionBlocks.register("creeper_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> dark_oak_minion_1 = minionBlocks.register("dark_oak_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_2 = minionBlocks.register("dark_oak_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_3 = minionBlocks.register("dark_oak_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_4 = minionBlocks.register("dark_oak_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_5 = minionBlocks.register("dark_oak_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_6 = minionBlocks.register("dark_oak_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_7 = minionBlocks.register("dark_oak_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_8 = minionBlocks.register("dark_oak_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_9 = minionBlocks.register("dark_oak_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_a = minionBlocks.register("dark_oak_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> dark_oak_minion_b = minionBlocks.register("dark_oak_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> diamond_minion_1 = minionBlocks.register("diamond_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_2 = minionBlocks.register("diamond_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_3 = minionBlocks.register("diamond_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_4 = minionBlocks.register("diamond_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_5 = minionBlocks.register("diamond_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_6 = minionBlocks.register("diamond_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_7 = minionBlocks.register("diamond_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_8 = minionBlocks.register("diamond_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_9 = minionBlocks.register("diamond_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_a = minionBlocks.register("diamond_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> diamond_minion_b = minionBlocks.register("diamond_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> emerald_minion_1 = minionBlocks.register("emerald_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_2 = minionBlocks.register("emerald_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_3 = minionBlocks.register("emerald_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_4 = minionBlocks.register("emerald_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_5 = minionBlocks.register("emerald_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_6 = minionBlocks.register("emerald_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_7 = minionBlocks.register("emerald_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_8 = minionBlocks.register("emerald_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_9 = minionBlocks.register("emerald_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_a = minionBlocks.register("emerald_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> emerald_minion_b = minionBlocks.register("emerald_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> end_stone_minion_1 = minionBlocks.register("end_stone_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_2 = minionBlocks.register("end_stone_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_3 = minionBlocks.register("end_stone_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_4 = minionBlocks.register("end_stone_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_5 = minionBlocks.register("end_stone_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_6 = minionBlocks.register("end_stone_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_7 = minionBlocks.register("end_stone_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_8 = minionBlocks.register("end_stone_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_9 = minionBlocks.register("end_stone_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_a = minionBlocks.register("end_stone_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> end_stone_minion_b = minionBlocks.register("end_stone_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> enderman_minion_1 = minionBlocks.register("enderman_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_2 = minionBlocks.register("enderman_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_3 = minionBlocks.register("enderman_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_4 = minionBlocks.register("enderman_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_5 = minionBlocks.register("enderman_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_6 = minionBlocks.register("enderman_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_7 = minionBlocks.register("enderman_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_8 = minionBlocks.register("enderman_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_9 = minionBlocks.register("enderman_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_a = minionBlocks.register("enderman_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> enderman_minion_b = minionBlocks.register("enderman_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> fishing_minion_1 = minionBlocks.register("fishing_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_2 = minionBlocks.register("fishing_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_3 = minionBlocks.register("fishing_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_4 = minionBlocks.register("fishing_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_5 = minionBlocks.register("fishing_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_6 = minionBlocks.register("fishing_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_7 = minionBlocks.register("fishing_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_8 = minionBlocks.register("fishing_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_9 = minionBlocks.register("fishing_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_a = minionBlocks.register("fishing_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> fishing_minion_b = minionBlocks.register("fishing_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> flower_minion_1 = minionBlocks.register("flower_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_2 = minionBlocks.register("flower_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_3 = minionBlocks.register("flower_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_4 = minionBlocks.register("flower_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_5 = minionBlocks.register("flower_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_6 = minionBlocks.register("flower_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_7 = minionBlocks.register("flower_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_8 = minionBlocks.register("flower_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_9 = minionBlocks.register("flower_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_a = minionBlocks.register("flower_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> flower_minion_b = minionBlocks.register("flower_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> ghast_minion_1 = minionBlocks.register("ghast_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_2 = minionBlocks.register("ghast_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_3 = minionBlocks.register("ghast_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_4 = minionBlocks.register("ghast_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_5 = minionBlocks.register("ghast_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_6 = minionBlocks.register("ghast_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_7 = minionBlocks.register("ghast_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_8 = minionBlocks.register("ghast_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_9 = minionBlocks.register("ghast_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_a = minionBlocks.register("ghast_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ghast_minion_b = minionBlocks.register("ghast_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> glowstone_minion_1 = minionBlocks.register("glowstone_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_2 = minionBlocks.register("glowstone_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_3 = minionBlocks.register("glowstone_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_4 = minionBlocks.register("glowstone_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_5 = minionBlocks.register("glowstone_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_6 = minionBlocks.register("glowstone_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_7 = minionBlocks.register("glowstone_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_8 = minionBlocks.register("glowstone_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_9 = minionBlocks.register("glowstone_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_a = minionBlocks.register("glowstone_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> glowstone_minion_b = minionBlocks.register("glowstone_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> gold_minion_1 = minionBlocks.register("gold_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_2 = minionBlocks.register("gold_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_3 = minionBlocks.register("gold_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_4 = minionBlocks.register("gold_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_5 = minionBlocks.register("gold_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_6 = minionBlocks.register("gold_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_7 = minionBlocks.register("gold_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_8 = minionBlocks.register("gold_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_9 = minionBlocks.register("gold_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_a = minionBlocks.register("gold_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gold_minion_b = minionBlocks.register("gold_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> gravel_minion_1 = minionBlocks.register("gravel_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_2 = minionBlocks.register("gravel_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_3 = minionBlocks.register("gravel_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_4 = minionBlocks.register("gravel_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_5 = minionBlocks.register("gravel_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_6 = minionBlocks.register("gravel_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_7 = minionBlocks.register("gravel_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_8 = minionBlocks.register("gravel_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_9 = minionBlocks.register("gravel_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_a = minionBlocks.register("gravel_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> gravel_minion_b = minionBlocks.register("gravel_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> ice_minion_1 = minionBlocks.register("ice_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_2 = minionBlocks.register("ice_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_3 = minionBlocks.register("ice_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_4 = minionBlocks.register("ice_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_5 = minionBlocks.register("ice_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_6 = minionBlocks.register("ice_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_7 = minionBlocks.register("ice_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_8 = minionBlocks.register("ice_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_9 = minionBlocks.register("ice_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_a = minionBlocks.register("ice_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> ice_minion_b = minionBlocks.register("ice_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> iron_minion_1 = minionBlocks.register("iron_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_2 = minionBlocks.register("iron_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_3 = minionBlocks.register("iron_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_4 = minionBlocks.register("iron_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_5 = minionBlocks.register("iron_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_6 = minionBlocks.register("iron_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_7 = minionBlocks.register("iron_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_8 = minionBlocks.register("iron_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_9 = minionBlocks.register("iron_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_a = minionBlocks.register("iron_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> iron_minion_b = minionBlocks.register("iron_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> jungle_minion_1 = minionBlocks.register("jungle_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_2 = minionBlocks.register("jungle_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_3 = minionBlocks.register("jungle_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_4 = minionBlocks.register("jungle_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_5 = minionBlocks.register("jungle_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_6 = minionBlocks.register("jungle_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_7 = minionBlocks.register("jungle_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_8 = minionBlocks.register("jungle_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_9 = minionBlocks.register("jungle_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_a = minionBlocks.register("jungle_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> jungle_minion_b = minionBlocks.register("jungle_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> lapis_minion_1 = minionBlocks.register("lapis_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_2 = minionBlocks.register("lapis_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_3 = minionBlocks.register("lapis_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_4 = minionBlocks.register("lapis_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_5 = minionBlocks.register("lapis_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_6 = minionBlocks.register("lapis_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_7 = minionBlocks.register("lapis_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_8 = minionBlocks.register("lapis_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_9 = minionBlocks.register("lapis_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_a = minionBlocks.register("lapis_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> lapis_minion_b = minionBlocks.register("lapis_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> magma_cube_minion_1 = minionBlocks.register("magma_cube_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_2 = minionBlocks.register("magma_cube_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_3 = minionBlocks.register("magma_cube_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_4 = minionBlocks.register("magma_cube_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_5 = minionBlocks.register("magma_cube_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_6 = minionBlocks.register("magma_cube_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_7 = minionBlocks.register("magma_cube_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_8 = minionBlocks.register("magma_cube_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_9 = minionBlocks.register("magma_cube_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_a = minionBlocks.register("magma_cube_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> magma_cube_minion_b = minionBlocks.register("magma_cube_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> melon_minion_1 = minionBlocks.register("melon_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_2 = minionBlocks.register("melon_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_3 = minionBlocks.register("melon_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_4 = minionBlocks.register("melon_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_5 = minionBlocks.register("melon_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_6 = minionBlocks.register("melon_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_7 = minionBlocks.register("melon_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_8 = minionBlocks.register("melon_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_9 = minionBlocks.register("melon_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_a = minionBlocks.register("melon_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> melon_minion_b = minionBlocks.register("melon_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> mushroom_minion_1 = minionBlocks.register("mushroom_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_2 = minionBlocks.register("mushroom_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_3 = minionBlocks.register("mushroom_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_4 = minionBlocks.register("mushroom_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_5 = minionBlocks.register("mushroom_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_6 = minionBlocks.register("mushroom_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_7 = minionBlocks.register("mushroom_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_8 = minionBlocks.register("mushroom_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_9 = minionBlocks.register("mushroom_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_a = minionBlocks.register("mushroom_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> mushroom_minion_b = minionBlocks.register("mushroom_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> nether_wart_minion_1 = minionBlocks.register("nether_wart_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_2 = minionBlocks.register("nether_wart_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_3 = minionBlocks.register("nether_wart_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_4 = minionBlocks.register("nether_wart_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_5 = minionBlocks.register("nether_wart_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_6 = minionBlocks.register("nether_wart_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_7 = minionBlocks.register("nether_wart_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_8 = minionBlocks.register("nether_wart_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_9 = minionBlocks.register("nether_wart_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_a = minionBlocks.register("nether_wart_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> nether_wart_minion_b = minionBlocks.register("nether_wart_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> oak_minion_1 = minionBlocks.register("oak_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_2 = minionBlocks.register("oak_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_3 = minionBlocks.register("oak_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_4 = minionBlocks.register("oak_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_5 = minionBlocks.register("oak_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_6 = minionBlocks.register("oak_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_7 = minionBlocks.register("oak_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_8 = minionBlocks.register("oak_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_9 = minionBlocks.register("oak_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_a = minionBlocks.register("oak_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> oak_minion_b = minionBlocks.register("oak_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> obsidian_minion_1 = minionBlocks.register("obsidian_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_2 = minionBlocks.register("obsidian_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_3 = minionBlocks.register("obsidian_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_4 = minionBlocks.register("obsidian_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_5 = minionBlocks.register("obsidian_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_6 = minionBlocks.register("obsidian_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_7 = minionBlocks.register("obsidian_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_8 = minionBlocks.register("obsidian_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_9 = minionBlocks.register("obsidian_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_a = minionBlocks.register("obsidian_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> obsidian_minion_b = minionBlocks.register("obsidian_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> pig_minion_1 = minionBlocks.register("pig_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_2 = minionBlocks.register("pig_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_3 = minionBlocks.register("pig_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_4 = minionBlocks.register("pig_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_5 = minionBlocks.register("pig_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_6 = minionBlocks.register("pig_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_7 = minionBlocks.register("pig_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_8 = minionBlocks.register("pig_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_9 = minionBlocks.register("pig_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_a = minionBlocks.register("pig_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pig_minion_b = minionBlocks.register("pig_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> potato_minion_1 = minionBlocks.register("potato_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_2 = minionBlocks.register("potato_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_3 = minionBlocks.register("potato_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_4 = minionBlocks.register("potato_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_5 = minionBlocks.register("potato_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_6 = minionBlocks.register("potato_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_7 = minionBlocks.register("potato_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_8 = minionBlocks.register("potato_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_9 = minionBlocks.register("potato_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_a = minionBlocks.register("potato_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> potato_minion_b = minionBlocks.register("potato_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> pumpkin_minion_1 = minionBlocks.register("pumpkin_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_2 = minionBlocks.register("pumpkin_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_3 = minionBlocks.register("pumpkin_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_4 = minionBlocks.register("pumpkin_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_5 = minionBlocks.register("pumpkin_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_6 = minionBlocks.register("pumpkin_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_7 = minionBlocks.register("pumpkin_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_8 = minionBlocks.register("pumpkin_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_9 = minionBlocks.register("pumpkin_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_a = minionBlocks.register("pumpkin_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> pumpkin_minion_b = minionBlocks.register("pumpkin_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> quartz_minion_1 = minionBlocks.register("quartz_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_2 = minionBlocks.register("quartz_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_3 = minionBlocks.register("quartz_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_4 = minionBlocks.register("quartz_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_5 = minionBlocks.register("quartz_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_6 = minionBlocks.register("quartz_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_7 = minionBlocks.register("quartz_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_8 = minionBlocks.register("quartz_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_9 = minionBlocks.register("quartz_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_a = minionBlocks.register("quartz_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> quartz_minion_b = minionBlocks.register("quartz_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> rabbit_minion_1 = minionBlocks.register("rabbit_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_2 = minionBlocks.register("rabbit_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_3 = minionBlocks.register("rabbit_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_4 = minionBlocks.register("rabbit_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_5 = minionBlocks.register("rabbit_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_6 = minionBlocks.register("rabbit_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_7 = minionBlocks.register("rabbit_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_8 = minionBlocks.register("rabbit_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_9 = minionBlocks.register("rabbit_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_a = minionBlocks.register("rabbit_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> rabbit_minion_b = minionBlocks.register("rabbit_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> redstone_minion_1 = minionBlocks.register("redstone_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_2 = minionBlocks.register("redstone_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_3 = minionBlocks.register("redstone_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_4 = minionBlocks.register("redstone_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_5 = minionBlocks.register("redstone_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_6 = minionBlocks.register("redstone_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_7 = minionBlocks.register("redstone_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_8 = minionBlocks.register("redstone_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_9 = minionBlocks.register("redstone_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_a = minionBlocks.register("redstone_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> redstone_minion_b = minionBlocks.register("redstone_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> revenant_minion_1 = minionBlocks.register("revenant_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_2 = minionBlocks.register("revenant_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_3 = minionBlocks.register("revenant_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_4 = minionBlocks.register("revenant_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_5 = minionBlocks.register("revenant_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_6 = minionBlocks.register("revenant_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_7 = minionBlocks.register("revenant_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_8 = minionBlocks.register("revenant_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_9 = minionBlocks.register("revenant_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_a = minionBlocks.register("revenant_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> revenant_minion_b = minionBlocks.register("revenant_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> sand_minion_1 = minionBlocks.register("sand_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_2 = minionBlocks.register("sand_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_3 = minionBlocks.register("sand_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_4 = minionBlocks.register("sand_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_5 = minionBlocks.register("sand_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_6 = minionBlocks.register("sand_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_7 = minionBlocks.register("sand_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_8 = minionBlocks.register("sand_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_9 = minionBlocks.register("sand_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_a = minionBlocks.register("sand_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sand_minion_b = minionBlocks.register("sand_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> sheep_minion_1 = minionBlocks.register("sheep_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_2 = minionBlocks.register("sheep_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_3 = minionBlocks.register("sheep_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_4 = minionBlocks.register("sheep_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_5 = minionBlocks.register("sheep_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_6 = minionBlocks.register("sheep_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_7 = minionBlocks.register("sheep_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_8 = minionBlocks.register("sheep_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_9 = minionBlocks.register("sheep_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_a = minionBlocks.register("sheep_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sheep_minion_b = minionBlocks.register("sheep_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> skeleton_minion_1 = minionBlocks.register("skeleton_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_2 = minionBlocks.register("skeleton_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_3 = minionBlocks.register("skeleton_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_4 = minionBlocks.register("skeleton_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_5 = minionBlocks.register("skeleton_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_6 = minionBlocks.register("skeleton_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_7 = minionBlocks.register("skeleton_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_8 = minionBlocks.register("skeleton_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_9 = minionBlocks.register("skeleton_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_a = minionBlocks.register("skeleton_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> skeleton_minion_b = minionBlocks.register("skeleton_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> slime_minion_1 = minionBlocks.register("slime_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_2 = minionBlocks.register("slime_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_3 = minionBlocks.register("slime_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_4 = minionBlocks.register("slime_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_5 = minionBlocks.register("slime_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_6 = minionBlocks.register("slime_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_7 = minionBlocks.register("slime_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_8 = minionBlocks.register("slime_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_9 = minionBlocks.register("slime_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_a = minionBlocks.register("slime_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> slime_minion_b = minionBlocks.register("slime_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> snow_minion_1 = minionBlocks.register("snow_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_2 = minionBlocks.register("snow_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_3 = minionBlocks.register("snow_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_4 = minionBlocks.register("snow_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_5 = minionBlocks.register("snow_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_6 = minionBlocks.register("snow_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_7 = minionBlocks.register("snow_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_8 = minionBlocks.register("snow_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_9 = minionBlocks.register("snow_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_a = minionBlocks.register("snow_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> snow_minion_b = minionBlocks.register("snow_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> spider_minion_1 = minionBlocks.register("spider_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_2 = minionBlocks.register("spider_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_3 = minionBlocks.register("spider_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_4 = minionBlocks.register("spider_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_5 = minionBlocks.register("spider_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_6 = minionBlocks.register("spider_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_7 = minionBlocks.register("spider_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_8 = minionBlocks.register("spider_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_9 = minionBlocks.register("spider_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_a = minionBlocks.register("spider_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spider_minion_b = minionBlocks.register("spider_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> spruce_minion_1 = minionBlocks.register("spruce_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_2 = minionBlocks.register("spruce_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_3 = minionBlocks.register("spruce_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_4 = minionBlocks.register("spruce_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_5 = minionBlocks.register("spruce_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_6 = minionBlocks.register("spruce_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_7 = minionBlocks.register("spruce_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_8 = minionBlocks.register("spruce_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_9 = minionBlocks.register("spruce_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_a = minionBlocks.register("spruce_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> spruce_minion_b = minionBlocks.register("spruce_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> sugar_cane_minion_1 = minionBlocks.register("sugar_cane_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_2 = minionBlocks.register("sugar_cane_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_3 = minionBlocks.register("sugar_cane_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_4 = minionBlocks.register("sugar_cane_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_5 = minionBlocks.register("sugar_cane_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_6 = minionBlocks.register("sugar_cane_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_7 = minionBlocks.register("sugar_cane_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_8 = minionBlocks.register("sugar_cane_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_9 = minionBlocks.register("sugar_cane_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_a = minionBlocks.register("sugar_cane_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> sugar_cane_minion_b = minionBlocks.register("sugar_cane_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> tarantula_minion_1 = minionBlocks.register("tarantula_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_2 = minionBlocks.register("tarantula_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_3 = minionBlocks.register("tarantula_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_4 = minionBlocks.register("tarantula_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_5 = minionBlocks.register("tarantula_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_6 = minionBlocks.register("tarantula_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_7 = minionBlocks.register("tarantula_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_8 = minionBlocks.register("tarantula_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_9 = minionBlocks.register("tarantula_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_a = minionBlocks.register("tarantula_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> tarantula_minion_b = minionBlocks.register("tarantula_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> wheat_minion_1 = minionBlocks.register("wheat_minion_1",
			() -> new WheatMinion(MinionTier.I));
	public static final RegistryObject<Block> wheat_minion_2 = minionBlocks.register("wheat_minion_2",
			() -> new WheatMinion(MinionTier.II));
	public static final RegistryObject<Block> wheat_minion_3 = minionBlocks.register("wheat_minion_3",
			() -> new WheatMinion(MinionTier.III));
	public static final RegistryObject<Block> wheat_minion_4 = minionBlocks.register("wheat_minion_4",
			() -> new WheatMinion(MinionTier.IV));
	public static final RegistryObject<Block> wheat_minion_5 = minionBlocks.register("wheat_minion_5",
			() -> new WheatMinion(MinionTier.V));
	public static final RegistryObject<Block> wheat_minion_6 = minionBlocks.register("wheat_minion_6",
			() -> new WheatMinion(MinionTier.VI));
	public static final RegistryObject<Block> wheat_minion_7 = minionBlocks.register("wheat_minion_7",
			() -> new WheatMinion(MinionTier.VII));
	public static final RegistryObject<Block> wheat_minion_8 = minionBlocks.register("wheat_minion_8",
			() -> new WheatMinion(MinionTier.VIII));
	public static final RegistryObject<Block> wheat_minion_9 = minionBlocks.register("wheat_minion_9",
			() -> new WheatMinion(MinionTier.IX));
	public static final RegistryObject<Block> wheat_minion_a = minionBlocks.register("wheat_minion_a",
			() -> new WheatMinion(MinionTier.X));
	public static final RegistryObject<Block> wheat_minion_b = minionBlocks.register("wheat_minion_b",
			() -> new WheatMinion(MinionTier.XI));

	public static final RegistryObject<Block> zombie_minion_1 = minionBlocks.register("zombie_minion_1",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_2 = minionBlocks.register("zombie_minion_2",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_3 = minionBlocks.register("zombie_minion_3",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_4 = minionBlocks.register("zombie_minion_4",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_5 = minionBlocks.register("zombie_minion_5",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_6 = minionBlocks.register("zombie_minion_6",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_7 = minionBlocks.register("zombie_minion_7",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_8 = minionBlocks.register("zombie_minion_8",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_9 = minionBlocks.register("zombie_minion_9",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_a = minionBlocks.register("zombie_minion_a",
			() -> new Block(Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> zombie_minion_b = minionBlocks.register("zombie_minion_b",
			() -> new Block(Properties.from(Blocks.STONE)));

}