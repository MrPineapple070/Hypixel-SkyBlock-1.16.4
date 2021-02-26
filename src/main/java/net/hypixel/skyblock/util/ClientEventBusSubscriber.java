package net.hypixel.skyblock.util;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.client.gui.screen.AbstractMinionScreen;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.LargeMCS;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.MediumMCS;
import net.hypixel.skyblock.client.gui.screen.MinionChestScreen.SmallMCS;
import net.hypixel.skyblock.init.blocks.BlockInit;
import net.hypixel.skyblock.init.blocks.MinionBlockInit;
import net.hypixel.skyblock.inventory.container.ModContainerTypes;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.ChestTileEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
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
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_1.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_2.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_3.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_4.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_5.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_6.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_7.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_8.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_9.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_a.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.acacia_minion_b.get(), AbstractMinionScreen::new);

		ScreenManager.registerFactory(ModContainerTypes.coal_minion_1.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_2.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_3.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_4.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_5.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_6.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_7.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_8.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_9.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_a.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.coal_minion_b.get(), AbstractMinionScreen::new);

		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_1.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_2.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_3.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_4.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_5.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_6.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_7.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_8.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_9.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_a.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.cobblestone_minion_b.get(), AbstractMinionScreen::new);

		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_1.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_2.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_3.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_4.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_5.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_6.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_7.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_8.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_9.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_a.get(), AbstractMinionScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.wheat_minion_b.get(), AbstractMinionScreen::new);

		ScreenManager.registerFactory(ModContainerTypes.small_mcc.get(), SmallMCS::new);
		ScreenManager.registerFactory(ModContainerTypes.medium_mcc.get(), MediumMCS::new);
		ScreenManager.registerFactory(ModContainerTypes.large_mcc.get(), LargeMCS::new);

		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_1.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_2.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_3.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_4.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_5.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_6.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_7.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_8.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_9.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_a.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.acacia_minion_b.get(), RenderType.getCutoutMipped());

		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_1.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_2.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_3.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_4.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_5.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_6.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_7.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_8.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_9.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_a.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.coal_minion_b.get(), RenderType.getTranslucent());

		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_1.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_2.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_3.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_4.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_5.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_6.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_7.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_8.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_9.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_a.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.cobblestone_minion_b.get(), RenderType.getTranslucent());

		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_1.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_2.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_3.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_4.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_5.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_6.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_7.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_8.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_9.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_a.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(MinionBlockInit.wheat_minion_b.get(), RenderType.getTranslucent());

		RenderTypeLookup.setRenderLayer(BlockInit.hard_glass.get(), RenderType.getTranslucent());

		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.small_mcte.get(), ChestTileEntityRenderer::new);
		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.medium_mcte.get(), ChestTileEntityRenderer::new);
		ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.large_mcte.get(), ChestTileEntityRenderer::new);
	}
}