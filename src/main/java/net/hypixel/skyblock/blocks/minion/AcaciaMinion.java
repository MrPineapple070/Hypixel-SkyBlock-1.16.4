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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Acacia_Minion">Acacia
 * Minion</a>.
 * 
 * @author MrPineapple070
 * @version 31 December 2020
 * @since 11 July 2019
 */
public class AcaciaMinion extends AbstractMinionBlock {
	public static final ImmutableList<Integer> speed = ImmutableList
			.copyOf(Arrays.asList(960, 960, 900, 900, 840, 840, 760, 760, 660, 660, 540));

	public AcaciaMinion(MinionTier tier) {
		super(Properties.create(Material.WOOD).sound(SoundType.WOOD), tier);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		switch (this.tier) {
		case I:
			return ModTileEntityTypes.acacia_minion_1.get().create();
		case II:
			return ModTileEntityTypes.acacia_minion_2.get().create();
		case III:
			return ModTileEntityTypes.acacia_minion_3.get().create();
		case IV:
			return ModTileEntityTypes.acacia_minion_4.get().create();
		case IX:
			return ModTileEntityTypes.acacia_minion_5.get().create();
		case V:
			return ModTileEntityTypes.acacia_minion_6.get().create();
		case VI:
			return ModTileEntityTypes.acacia_minion_7.get().create();
		case VII:
			return ModTileEntityTypes.acacia_minion_8.get().create();
		case VIII:
			return ModTileEntityTypes.acacia_minion_9.get().create();
		case X:
			return ModTileEntityTypes.acacia_minion_a.get().create();
		case XI:
			return ModTileEntityTypes.acacia_minion_b.get().create();
		default:
			throw new IllegalStateException("Illegal Minion Tier:\t" + this.tier.name());
		}
	}
}