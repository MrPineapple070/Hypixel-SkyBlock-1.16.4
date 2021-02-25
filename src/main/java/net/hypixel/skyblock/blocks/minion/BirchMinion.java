package net.hypixel.skyblock.blocks.minion;

import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Birch_Minion">Birch Minion</a>.
 * 
 * @author MrPineapple070
 * @version 04 January 2021
 * @since 11 July 2019
 */
public class BirchMinion extends AbstractMinionBlock {
	public BirchMinion(MinionTier tier) {
		super(Properties.create(Material.WOOD).sound(SoundType.WOOD), tier);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		switch (this.tier) {
		case I:
			return ModTileEntityTypes.birch_minion_1.get().create();
		case II:
			return ModTileEntityTypes.birch_minion_2.get().create();
		case III:
			return ModTileEntityTypes.birch_minion_3.get().create();
		case IV:
			return ModTileEntityTypes.birch_minion_4.get().create();
		case IX:
			return ModTileEntityTypes.birch_minion_5.get().create();
		case V:
			return ModTileEntityTypes.birch_minion_6.get().create();
		case VI:
			return ModTileEntityTypes.birch_minion_7.get().create();
		case VII:
			return ModTileEntityTypes.birch_minion_8.get().create();
		case VIII:
			return ModTileEntityTypes.birch_minion_9.get().create();
		case X:
			return ModTileEntityTypes.birch_minion_a.get().create();
		case XI:
			return ModTileEntityTypes.birch_minion_b.get().create();
		default:
			throw new IllegalStateException("Illegal Minion Tier:\t" + this.tier.name());
		}
	}
}