package net.hypixel.skyblock.events.accessories;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.init.AccessoriesInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/**
 * Handle the effects applied by {@link AccessoriesInit#haste_ring}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Haste_Ring">Click here for
 * more information.</a>
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
@Mod.EventBusSubscriber(modid = HypixelSkyBlockMod.MOD_ID, bus = Bus.FORGE)
public class HasteRingEvent {
	/**
	 * Called whenever {@link BreakEvent} is fired.
	 *
	 * @param event {@code BreakEvent}
	 */
	@SubscribeEvent
	public static void hasteRingEvent(BreakEvent event) {
		final PlayerEntity player = event.getPlayer();
		if (player.inventory.hasItemStack(new ItemStack(AccessoriesInit.haste_ring.get()))) {
			HypixelSkyBlockMod.LOGGER.info("Haste Ring Effect Applied");
			player.addPotionEffect(new EffectInstance(Effects.HASTE, 300, 0));
			return;
		}
	}
}