package net.hypixel.skyblock.tileentity.minion;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

/**
 * Place and Break {@link Block}.
 * 
 * @author MrPineapple070
 * @version 17 January 2021
 * @since 11 July 2019
 */
public abstract class AbstractPlacerMTE extends AbstractMinionTileEntity {
	/**
	 * Differentials from the center {@link BlockPos} when {@link #count(Item)}
	 * using {@link ItemInit#minion_expander} is 0
	 */
	@Nonnull
	protected static final int[] default_size = { -2, -1, 0, 1, 2 };

	/**
	 * Differentials from the center {@link BlockPos} when {@link #count(Item)}
	 * using {@link ItemInit#minion_expander} is 2
	 */
	@Nonnull
	protected static final int[] expanded_2_size = { -4, -3, -2, -1, 0, 1, 2, 3, 4 };

	/**
	 * Differentials from the center {@link BlockPos} when {@link #count(Item)}
	 * using {@link ItemInit#minion_expander} is 1
	 */
	@Nonnull
	protected static final int[] expanded_size = { -3, -2, -1, 0, 1, 2, 3 };

	public AbstractPlacerMTE(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	/**
	 * Determines {@link SoundEvent} when {@link #interact(BlockPos)} results in
	 * placing {@link Block}
	 * 
	 * @return {@link SoundEvent} to play when placing a {@link Block}.
	 */
	protected abstract SoundEvent getSoundEvent();

	/**
	 * Determines {@link BlockState} when {@link #interact(BlockPos)} results in
	 * placing {@link Block}
	 * 
	 * @return {@link BlockState} to place when interacting.
	 */
	protected abstract BlockState getState();

	/**
	 * Determines all {@link Block} that this can place.
	 * 
	 * @return an {@link ImmutableSet} of {@link Block}.
	 */
	protected abstract ImmutableSet<Block> getValidBlocks();

	@Override
	protected boolean interact(BlockPos pos) {
		if (pos == null)
			return false;
		HypixelSkyBlockMod.LOGGER.info("Interacting with " + pos.toString());
		final BlockState state = this.world.getBlockState(pos);
		if (state.getMaterial() == Material.AIR) {
			this.world.playSound(pos.getX(), pos.getY(), pos.getZ(), this.getSoundEvent(), SoundCategory.BLOCKS, 1f, 1f,
					true);
			this.world.setBlockState(pos, this.getState());
		} else {
			this.addItemStacks(Block.getDrops(state, (ServerWorld) this.world, pos, this));
			this.world.playEvent(2001, pos, Block.getStateId(state));
			this.world.setBlockState(pos, Blocks.AIR.getDefaultState());
		}
		return true;
	}

	/**
	 * Determine if {@link Block} can be added to {@link #validSurround}.<br>
	 * Help {@link #setValidSurround()} in adding.<br>
	 * {@code AbstractMinionTileEntity} can interact with {@code Block} in 3
	 * dimensions
	 *
	 * @param block The {@code Block} to check.
	 * @return {@code true} if {@code Block} is valid.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean isBlockValid(Block block) {
		ImmutableSet<Block> blocks = this.getValidBlocks();
		Objects.requireNonNull(block, "Inputed block cannot be null");
		if (blocks.size() < 1)
			throw new IllegalArgumentException("validBlocks must have at least one element");
		return blocks.contains(block);
	}

	/**
	 * Picks a random {@link BlockPos} to interact with using {@link #rand}.
	 * 
	 * @return a random {@link BlockPos}
	 */
	protected final BlockPos pickBlockPos() {
		HypixelSkyBlockMod.LOGGER.info("Picking a BlockPos");
		this.setValidSurround();
		this.setAirSurround();
		if (!this.airSurround.isEmpty())
			return this.airSurround.get(rand.nextInt(this.airSurround.size()));
		if (!this.validSurround.isEmpty())
			return this.validSurround.get(rand.nextInt(this.validSurround.size()));
		return null;
	}

	@Override
	public final void tick() {
		if (this.world.isRemote)
			return;
		if (!this.isTicking)
			this.init();
		if (this.isCompletlyFull())
			return;
		this.tick = ++this.tick % (int) (getSpeed(this.tier) * this.getFuelSpeed());
		if (this.tick == 0)
			this.interact(this.pickBlockPos());
	}
}