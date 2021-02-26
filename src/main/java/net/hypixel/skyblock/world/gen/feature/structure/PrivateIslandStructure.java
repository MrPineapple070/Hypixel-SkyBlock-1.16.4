package net.hypixel.skyblock.world.gen.feature.structure;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

/**
 * {@link Structure} for
 * ".\src\main\resources\data\hypixelskyblockmod\structures\private_island.nbt"
 * 
 * @author MrPineapple070
 * @version 03 December 2020
 * @since 11 July 2019
 */
public class PrivateIslandStructure extends Structure<NoFeatureConfig> {
	public PrivateIslandStructure() {
		super(NoFeatureConfig.field_236558_a_);
	}

	@Override
	public IStartFactory<NoFeatureConfig> getStartFactory() {
		return PrivateIslandStructure.Start::new;
	}

	@Override
	public String getStructureName() {
		return HypixelSkyBlockMod.MOD_ID + ":private_island";
	}

	protected int getSeedModifier() {
		return 0x0;
	}

	public static class Start extends StructureStart<NoFeatureConfig> {
		public Start(Structure<NoFeatureConfig> structure, int chunkX, int chunkZ, MutableBoundingBox boundingBox,
				int reference, long seed) {
			super(structure, chunkX, chunkZ, boundingBox, reference, seed);
		}

		@Override
		public void func_230364_a_(DynamicRegistries p_230364_1_, ChunkGenerator generator,
				TemplateManager templateManagerIn, int chunkX, int chunkY, Biome biomeIn, NoFeatureConfig p_230364_7_) {
			Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
			int x = (chunkX << 4) + 7;
			int z = (chunkX << 4) + 7;
			int y = generator.getHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);
			BlockPos pos = new BlockPos(x, y, z);
			PrivateIslandPieces.start(templateManagerIn, pos, rotation, this.components, this.rand);
			this.recalculateStructureSize();
			HypixelSkyBlockMod.LOGGER.info("We can find a private island at: " + pos);
		}
	}

	public int getSize() {
		return 0;
	}
}