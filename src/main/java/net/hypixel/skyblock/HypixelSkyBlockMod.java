package net.hypixel.skyblock;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.init.EnchantmentInit;
import net.hypixel.skyblock.init.RecipeSerializerInit;
import net.hypixel.skyblock.init.blocks.MasterBlockInit;
import net.hypixel.skyblock.init.items.MasterItemInit;
import net.hypixel.skyblock.inventory.container.ModContainerTypes;
import net.hypixel.skyblock.proxy.ClientProxy;
import net.hypixel.skyblock.proxy.CommonProxy;
import net.hypixel.skyblock.proxy.ServerProxy;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * A Mod similar to Hypixel's SkyBlock.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Hypixel_SkyBlock_Wiki">Click
 * here</a> for wiki.
 *
 * @author MrPineapple070
 * @version 31 May 2020
 * @since 31 May 2020
 */
@Mod(HypixelSkyBlockMod.MOD_ID)
public class HypixelSkyBlockMod {
	/**
	 * An instance of {@link HypixelSkyBlockMod}.
	 */
	@Nonnull
	public static HypixelSkyBlockMod instance;

	/**
	 * This Mod's {@link Logger}
	 */
	@Nonnull
	public static final Logger LOGGER = LogManager.getLogger();

	/**
	 * A {@link String} for Mod's ID.
	 */
	@Nonnull
	public static final String MOD_ID = "hypixelskyblockmod";

	/**
	 * A {@link CommonProxy} for this.
	 */
	@Nonnull
	public static CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

	public HypixelSkyBlockMod() {
		final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		// ParticleInit.particle_types.register(bus);
		// SoundInit.sounds.register(bus);
		// PotionInit.effects.register(bus);
		// PotionInit.potions.register(bus);

		EnchantmentInit.enchantments.register(bus);

		MasterItemInit.register(bus);
		RecipeSerializerInit.recipe_serializer.register(bus);
		// FluidInit.fluids.register(bus);
		MasterBlockInit.register(bus);

		ModTileEntityTypes.tile_entity_types.register(bus);
		ModContainerTypes.container_types.register(bus);

		// BiomeInit.biomes.register(bus);
		// DimensionInit.dimensions.register(bus);
		// FeatureInit.features.register(bus);
		// FeatureInit.strucutres.register(bus);

		// PortalBlockInit.portal_blocks.register(bus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		proxy.init();
	}
}