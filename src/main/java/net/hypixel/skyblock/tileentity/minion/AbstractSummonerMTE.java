package net.hypixel.skyblock.tileentity.minion;

import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class AbstractSummonerMTE extends AbstractMinionTileEntity {
	public AbstractSummonerMTE(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected BlockPos[][][] initSurround() {
		return new BlockPos[0][0][0];
	}

	@Override
	protected void setSurround() {
	}

	@Override
	protected void setValidSurround() {
	}
}