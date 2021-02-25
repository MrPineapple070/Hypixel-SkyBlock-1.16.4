package net.hypixel.skyblock.init.blocks;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.blocks.TimeSaver.DaySaver;
import net.hypixel.skyblock.blocks.TimeSaver.NightSaver;
import net.hypixel.skyblock.blocks.minion.MinionChestBlock.LargeMCB;
import net.hypixel.skyblock.blocks.minion.MinionChestBlock.MediumMCB;
import net.hypixel.skyblock.blocks.minion.MinionChestBlock.SmallMCB;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link Block} for this Mod. <br>
 * Some {@code Blocks} are Initialized and Registered in other classes.
 *
 * @author MrPineapple070
 * @version 31 May 2020
 */
public class BlockInit {
	/**
	 * A {@code DeferredRegister} for {@code Block}.
	 */
	public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Block> hard_glass = blocks.register("hard_glass",
			() -> new Block(Properties.create(Material.GLASS).hardnessAndResistance(.3f, 1200f).sound(SoundType.GLASS)
					.harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> haste_block = blocks.register("haste_block", () -> new Block(Properties
			.create(Material.ROCK).hardnessAndResistance(3f, 9f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> silence_block = blocks.register("silence_block",
			() -> new Block(Properties.create(Material.WOOD).hardnessAndResistance(.8f, .8f).sound(SoundType.WOOD)
					.harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> night_saver = blocks.register("night_saver",
			() -> new NightSaver(Properties.create(Material.WOOD).hardnessAndResistance(.2f, .2f).sound(SoundType.WOOD)
					.harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> day_saver = blocks.register("day_saver", () -> new DaySaver(Properties
			.create(Material.WOOD).hardnessAndResistance(.2f, .2f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<SmallMCB> small_mcb = blocks.register("small_mcb", () -> new SmallMCB(Properties
			.create(Material.WOOD).hardnessAndResistance(0f, 0f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<MediumMCB> medium_mcb = blocks.register("medium_mcb",
			() -> new MediumMCB(Properties.create(Material.WOOD).hardnessAndResistance(0f, 0f).sound(SoundType.WOOD)
					.harvestTool(ToolType.AXE)));
	public static final RegistryObject<LargeMCB> large_mcb = blocks.register("large_mcb", () -> new LargeMCB(Properties
			.create(Material.WOOD).hardnessAndResistance(0f, 0f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
}