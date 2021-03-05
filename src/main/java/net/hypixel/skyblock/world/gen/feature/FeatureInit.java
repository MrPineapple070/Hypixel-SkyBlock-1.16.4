package net.hypixel.skyblock.world.gen.feature;

import java.util.Locale;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.world.gen.feature.structure.PrivateIslandPieces;
import net.hypixel.skyblock.world.gen.feature.structure.PrivateIslandStructure;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {
	public static final DeferredRegister<Structure<?>> features = DeferredRegister
			.create(ForgeRegistries.STRUCTURE_FEATURES, HypixelSkyBlockMod.MOD_ID);

	public static IStructurePieceType private_island_piece = PrivateIslandPieces.Piece::new;

	public static final RegistryObject<PrivateIslandStructure> private_island = features.register("private_island",
			PrivateIslandStructure::new);

	@SubscribeEvent
	public static void registerStructurePieces(Register<Feature<?>> event) {
		Registry.register(Registry.STRUCTURE_PIECE, "HOUSE".toLowerCase(Locale.ROOT), private_island_piece);
	}
}