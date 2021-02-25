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
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
public class WheatMinion extends AbstractMinionBlock {
	public static final ImmutableList<Integer> speed = ImmutableList
			.copyOf(Arrays.asList(300, 300, 260, 260, 220, 220, 200, 200, 180, 180, 180));

	public WheatMinion(MinionTier tier) {
		super(Properties.create(Material.ORGANIC).sound(SoundType.CROP), tier);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		switch (this.tier) {
		case I:
			return ModTileEntityTypes.wheat_minion_1.get().create();
		case II:
			return ModTileEntityTypes.wheat_minion_2.get().create();
		case III:
			return ModTileEntityTypes.wheat_minion_3.get().create();
		case IV:
			return ModTileEntityTypes.wheat_minion_4.get().create();
		case V:
			return ModTileEntityTypes.wheat_minion_5.get().create();
		case VI:
			return ModTileEntityTypes.wheat_minion_6.get().create();
		case VII:
			return ModTileEntityTypes.wheat_minion_7.get().create();
		case VIII:
			return ModTileEntityTypes.wheat_minion_8.get().create();
		case IX:
			return ModTileEntityTypes.wheat_minion_9.get().create();
		case X:
			return ModTileEntityTypes.wheat_minion_a.get().create();
		case XI:
			return ModTileEntityTypes.wheat_minion_b.get().create();
		default:
			throw new IllegalStateException("Invalid Minion Tier");
		}
	}
}