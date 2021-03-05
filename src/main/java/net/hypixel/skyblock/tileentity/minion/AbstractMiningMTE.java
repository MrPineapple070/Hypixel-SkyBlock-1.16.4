package net.hypixel.skyblock.tileentity.minion;

import java.util.Arrays;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class AbstractMiningMTE extends AbstractPlacerMTE {
	public AbstractMiningMTE(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected final BlockPos[][][] initSurround() {
		return new BlockPos[1][9][9];
	}

	@Override
	protected final void setSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering Surrounding BlockPos.");
		final int[] dx = expanded_2_size.clone();
		for (int x = 0; x < this.surround[0].length; x++)
			for (int y = 0; y < this.surround[0][x].length; y++)
				this.surround[0][x][y] = dx[x] == 0 && dx[y] == 0 ? null
						: new BlockPos(this.x + dx[y], this.y - 1, this.z + dx[x]);
		for (BlockPos[] row : this.surround[0])
			HypixelSkyBlockMod.LOGGER.info(Arrays.deepToString(row));
	}

	@Override
	protected final void setValidSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering valid BlockPos");
		this.validSurround.clear();
		int xStart, xEnd, zStart, zEnd;
		switch (this.count(ItemInit.minion_expander.get())) {
		case 0:
		default:
			xStart = 2;
			xEnd = 7;
			zStart = 2;
			zEnd = 7;
		case 1:
			xStart = 1;
			xEnd = 8;
			zStart = 1;
			zEnd = 8;
		case 2:
			xStart = 0;
			xEnd = 9;
			zStart = 0;
			zEnd = 9;
		}
		for (int x = xStart; x < xEnd; ++x)
			for (int z = zStart; z < zEnd; ++z) {
				final BlockPos pos = this.surround[0][x][z];
				if (pos == null)
					continue;
				final BlockState state = this.world.getBlockState(pos);
				if (state.getMaterial() == Material.AIR)
					this.validSurround.add(pos);
				else if (this.isBlockValid(state.getBlock()))
					this.validSurround.add(pos);
				else
					continue;
			}
		HypixelSkyBlockMod.LOGGER.info(this.validSurround.toString());
	}
}