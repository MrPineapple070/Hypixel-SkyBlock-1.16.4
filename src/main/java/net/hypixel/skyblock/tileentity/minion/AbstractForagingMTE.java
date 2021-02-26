package net.hypixel.skyblock.tileentity.minion;

import java.util.Arrays;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.init.items.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

/**
 * Serve as a base for all Foraging Minions.
 * 
 * @author MrPineapple070
 * @version 20 January 2021
 * @since 11 July 2019
 */
public abstract class AbstractForagingMTE extends AbstractPlacerMTE {
	/**
	 * Array of {@link Item} that {@link #getCompactor()} will return.
	 */
	protected static final Item[] comp = new Item[] { Items.DIAMOND };

	/**
	 * Array of differentials when {@link #count(Item)} of
	 * {@link ItemInit#minion_expander} == 0
	 */
	protected static final int[] default_size = { -2, 0, 2 };

	/**
	 * Array of differentials when {@link #count(Item)} of
	 * {@link ItemInit#minion_expander} == 1
	 */
	protected static final int[] expanded_size = { -3, -1, 1, 3 };

	/**
	 * Array of differentials when {@link #count(Item)} of
	 * {@link ItemInit#minion_expander} == 2
	 */
	protected static final int[] expanded_1_size = { -4, -2, 0, 2, 4 };

	public AbstractForagingMTE(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected final Item[] getCompactor() {
		return comp;
	}

	@Override
	protected final BlockPos[][][] initSurround() {
		return new BlockPos[1][5][9];
	}

	@Override
	protected final void setSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering Surrounding BlockPos.");
		int index_x = 0;
		for (int x : expanded_1_size) {
			int index_z = 0;
			for (int z : expanded_1_size) {
				this.surround[0][index_x][index_z] = x == 0 && z == 0 ? null
						: new BlockPos(this.x + x, this.y, this.z + z);
				index_z += 2;
			}
			index_x += 1;
		}
		index_x = 0;
		for (int x : expanded_size) {
			int index_z = 1;
			for (int z : expanded_size) {
				this.surround[0][index_x][index_z] = Math.abs(x) <= 1 && Math.abs(z) <= 1 ? null
						: new BlockPos(this.x + x, this.y, this.z + z);
				index_z += 2;
			}
			index_x += 1;
		}

		for (BlockPos[] row : this.surround[0])
			HypixelSkyBlockMod.LOGGER.info(Arrays.deepToString(row));
	}

	@Override
	protected void setValidSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering valid BlockPos");
		this.validSurround.clear();
		for (BlockPos[][] y : this.surround)
			for (BlockPos[] x : y)
				for (BlockPos pos : x) {
					if (pos == null)
						continue;
					BlockState state = this.world.getBlockState(pos);
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