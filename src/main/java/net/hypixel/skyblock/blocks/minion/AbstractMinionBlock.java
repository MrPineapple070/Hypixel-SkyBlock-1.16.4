package net.hypixel.skyblock.blocks.minion;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

/**
 * This class serves as the base for all Minions.
 *
 * @author MrPineapple070
 * @version 28 May 2020
 */
public abstract class AbstractMinionBlock extends Block {
	/**
	 * A {@link DirectionProperty} for this
	 */
	@Nonnull
	public static final DirectionProperty facing = HorizontalBlock.HORIZONTAL_FACING;

	/**
	 * The {@link MinionTier} for this
	 */
	@Nonnull
	protected final MinionTier tier;

	protected AbstractMinionBlock(Properties properties, MinionTier tier) {
		super(properties.hardnessAndResistance(0, 0x800).notSolid());
		this.setDefaultState(this.stateContainer.getBaseState().with(facing, Direction.NORTH));
		this.tier = Objects.requireNonNull(tier, "Minion Block must have a Tier");
	}

	@Override
	public abstract TileEntity createTileEntity(BlockState state, IBlockReader world);

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(facing);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(facing, context.getPlacementHorizontalFacing().getOpposite());
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	@Deprecated
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(facing)));
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand hand, BlockRayTraceResult result) {
		if (worldIn.isRemote)
			return ActionResultType.SUCCESS;
		else if (player.isSpectator())
			return ActionResultType.SUCCESS;
		else {
			final TileEntity tileentity = worldIn.getTileEntity(pos);
			if (tileentity instanceof AbstractMinionTileEntity) {
				player.openContainer((AbstractMinionTileEntity) tileentity);
				return ActionResultType.SUCCESS;
			}
			return ActionResultType.PASS;
		}
	}

	@Override
	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			final TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof AbstractMinionTileEntity)
				InventoryHelper.dropItems(worldIn, pos, ((AbstractMinionTileEntity) te).getItems());
		}
	}

	@Override
	@Deprecated
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(facing, rot.rotate(state.get(facing)));
	}
}