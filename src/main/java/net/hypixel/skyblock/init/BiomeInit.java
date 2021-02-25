package net.hypixel.skyblock.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author MrPineapple070
 * @version 11 September 2020
 * @since 11 September 2020
 */
public class BiomeInit {
	public static final DeferredRegister<Biome> biome = DeferredRegister.create(ForgeRegistries.BIOMES,
			HypixelSkyBlockMod.MOD_ID);

}