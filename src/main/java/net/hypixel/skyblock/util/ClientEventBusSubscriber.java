package net.hypixel.skyblock.util;

import java.lang.reflect.Field;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.blocks.init.MinionBlockInit;
import net.hypixel.skyblock.client.gui.screen.AbstractMinionScreen;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.LargeMCS;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.MediumMCS;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.SmallMCS;
import net.hypixel.skyblock.client.render.entity.VillageNPCRender;
import net.hypixel.skyblock.entity.ModEntityTypes;
import net.hypixel.skyblock.inventory.container.init.MinionContainerTypes;
import net.hypixel.skyblock.inventory.container.init.ModContainerTypes;
import net.hypixel.skyblock.inventory.container.minion.AbstractMinionContainer;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.ChestTileEntityRenderer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * {@link EventBusSubscriber} for Client.<br>
 * Activates on {@link FMLClientSetupEvent}
 *
 * @author MrPineapple070
 * @version 8 June 2020
 * @since 11 June 2019
 */
@Mod.EventBusSubscriber(modid = HypixelSkyBlockMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	@SuppressWarnings("unchecked")
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		for (Field field : MinionContainerTypes.class.getDeclaredFields())
			if (field.getType() == RegistryObject.class)
				try {
					RegistryObject<ContainerType<AbstractMinionContainer>> obj = null;
					obj = (RegistryObject<ContainerType<AbstractMinionContainer>>) field.get(obj);
					ContainerType<AbstractMinionContainer> screen = obj.get();
					HypixelSkyBlockMod.LOGGER.info(screen.getRegistryName().toString());
					ScreenManager.registerFactory(screen, AbstractMinionScreen::new);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					continue;
				}
		
		ScreenManager.registerFactory(ModContainerTypes.small_mcc.get(), SmallMCS::new);
		ScreenManager.registerFactory(ModContainerTypes.medium_mcc.get(), MediumMCS::new);
		ScreenManager.registerFactory(ModContainerTypes.large_mcc.get(), LargeMCS::new);
		
		for (Field field : MinionBlockInit.class.getDeclaredFields())
			if (field.getType() == RegistryObject.class)
				try {
					RegistryObject<Block> obj = null;
					obj = (RegistryObject<Block>) field.get(obj);
					Block block = obj.get();
					HypixelSkyBlockMod.LOGGER.info(block.getRegistryName().toString());
					RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					continue;
				}
		
		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.small_mcte.get(), ChestTileEntityRenderer::new);
		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.medium_mcte.get(), ChestTileEntityRenderer::new);
		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.large_mcte.get(), ChestTileEntityRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.Andrew.get(), VillageNPCRender::new);
	}
}