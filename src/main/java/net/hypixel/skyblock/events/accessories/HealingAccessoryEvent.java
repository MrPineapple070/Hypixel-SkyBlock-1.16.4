package net.hypixel.skyblock.events.accessories;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.inventory.ExtendedPlayerInventory;
import net.hypixel.skyblock.items.accessories.HealingRing;
import net.hypixel.skyblock.items.accessories.HealingTalisman;
import net.hypixel.skyblock.items.init.AccessoriesInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/**
 * Handles the effects applied by the {@link HealingRing} and
 * {@link HealingTalisman}.
 *
 * @author MrPineapple070
 * @version 10 September 2020
 * @since 10 September 2020
 */
@Mod.EventBusSubscriber(modid = HypixelSkyBlockMod.MOD_ID, bus = Bus.FORGE)
public class HealingAccessoryEvent {
	public static void healEvent(LivingHealEvent event) {
		final LivingEntity entity = event.getEntityLiving();
		if (!(entity instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entity;
		final float heal = event.getAmount();
		if (((ExtendedPlayerInventory) player.inventory)
				.hasItemStack(new ItemStack(AccessoriesInit.healing_talisman.get())))
			event.setAmount(1.05f * heal);
		else if (((ExtendedPlayerInventory) player.inventory)
				.hasItemStack(new ItemStack(AccessoriesInit.healing_talisman.get())))
			event.setAmount(1.1f * heal);
	}
}
