package net.hypixel.skyblock.events.accessories;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.init.items.AccessoriesInit;
import net.hypixel.skyblock.items.accessories.FeatherArtifact;
import net.hypixel.skyblock.items.accessories.FeatherRing;
import net.hypixel.skyblock.items.accessories.FeatherTalisman;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/**
 * Handle the effects applied by {@link FeatherArtifact}, {@link FeatherRing},
 * and {@link FeatherTalisman}
 *
 * @author MrPineapple070
 * @version 10 September 2020
 * @since 10 September 2020
 */
@Mod.EventBusSubscriber(modid = HypixelSkyBlockMod.MOD_ID, bus = Bus.FORGE)
public class FeatherAccessoryEvent {
	@SubscribeEvent
	public static void featherEvent(LivingFallEvent event) {
		final LivingEntity entity = event.getEntityLiving();
		if (!(entity instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entity;
		final float distance = event.getDistance();
		if (player.inventory.hasItemStack(new ItemStack(AccessoriesInit.feather_artifact.get())))
			event.setDistance(distance * .85f - 10);
		else if (player.inventory.hasItemStack(new ItemStack(AccessoriesInit.feather_ring.get())))
			event.setDistance(distance * .9f - 7);
		else if (player.inventory.hasItemStack(new ItemStack(AccessoriesInit.feather_talisman.get())))
			event.setDistance(distance * .95f);
	}
}
