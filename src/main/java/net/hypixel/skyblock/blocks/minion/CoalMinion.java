package net.hypixel.skyblock.blocks.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

/**
 * The base for all Coal Minion
 *
 * @author MrPineapple070
 * @version 23 July 2020
 */
public class CoalMinion extends AbstractMinionBlock {
	/**
	 * An {@code Array} of {@code int} that determine the number of ticks between
	 * actions.
	 */
	public static final ImmutableList<Integer> speed = ImmutableList
			.copyOf(Arrays.asList(300, 300, 260, 260, 240, 240, 200, 200, 180, 180, 140));

	public CoalMinion(MinionTier tier) {
		super(Properties.create(Material.ROCK).sound(SoundType.STONE), tier);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		switch (this.tier) {
		case I:
			return ModTileEntityTypes.coal_minion_1.get().create();
		case II:
			return ModTileEntityTypes.coal_minion_2.get().create();
		case III:
			return ModTileEntityTypes.coal_minion_3.get().create();
		case IV:
			return ModTileEntityTypes.coal_minion_4.get().create();
		case V:
			return ModTileEntityTypes.coal_minion_5.get().create();
		case VI:
			return ModTileEntityTypes.coal_minion_6.get().create();
		case VII:
			return ModTileEntityTypes.coal_minion_7.get().create();
		case VIII:
			return ModTileEntityTypes.coal_minion_8.get().create();
		case IX:
			return ModTileEntityTypes.coal_minion_9.get().create();
		case X:
			return ModTileEntityTypes.coal_minion_a.get().create();
		case XI:
			return ModTileEntityTypes.coal_minion_b.get().create();
		default:
			throw new IllegalStateException("Invalid Minion Tier");
		}
	}
}