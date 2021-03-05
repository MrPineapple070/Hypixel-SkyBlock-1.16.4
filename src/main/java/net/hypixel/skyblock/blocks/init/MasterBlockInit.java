package net.hypixel.skyblock.blocks.init;

import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;

/**
 * Initialize and Register every {@link Block} for this mod.<br>
 * {@link BlockInit} and {@link MinionBlockInit}
 *
 * @author MrPineapple070
 * @version 27 October 2020
 * @since 27 October 2020
 */
public class MasterBlockInit {
	public static void register(final IEventBus bus) {
		BlockInit.blocks.register(bus);
		MinionBlockInit.minionBlocks.register(bus);
	}
}