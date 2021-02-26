package net.hypixel.skyblock.blocks;

import java.util.Random;

import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.hypixel.skyblock.util.TimeConverter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.world.ClientWorld.ClientWorldInfo;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.storage.IServerWorldInfo;
import net.minecraft.world.storage.IWorldInfo;

/**
 * When this block exists in the world, the world will remain at the indicated
 * time.<br>
 * Extended by {@link DaySaver} and {@link NightSaver}.<br>
 * If both of these blocks exist in the world, both blocks have no effect.
 *
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public abstract class TimeSaver extends Block {
	/**
	 * While this block exists in the world, the world will remain at the indicated
	 * day time.
	 */
	public static class DaySaver extends TimeSaver {
		public DaySaver(Properties properties) {
			super(properties);
		}

		@Override
		public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		}

		@Override
		public TileEntity createTileEntity(BlockState state, IBlockReader world) {
			return ModTileEntityTypes.day_saver.get().create();
		}

		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer,
				ItemStack stack) {
			IWorldInfo info = worldIn.getWorldInfo();
			if (info instanceof IServerWorldInfo)
				((IServerWorldInfo) info).setGameTime(TimeConverter.hours.get(0));
			else if (info instanceof ClientWorldInfo)
				((ClientWorldInfo) info).setGameTime(TimeConverter.hours.get(0));
			return;
		}
	}

	/**
	 * While this block exists in the world, the world will remain at the indicated
	 * night time.
	 */
	public static class NightSaver extends TimeSaver {
		public NightSaver(Properties properties) {
			super(properties);
		}

		@Override
		public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		}

		@Override
		public TileEntity createTileEntity(BlockState state, IBlockReader world) {
			return ModTileEntityTypes.night_saver.get().create();
		}

		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer,
				ItemStack stack) {
			IWorldInfo info = worldIn.getWorldInfo();
			if (info instanceof IServerWorldInfo)
				((IServerWorldInfo) info).setGameTime(TimeConverter.hours.get(0));
			else if (info instanceof ClientWorldInfo)
				((ClientWorldInfo) info).setGameTime(TimeConverter.hours.get(0));
			return;
		}
	}

	/**
	 * A {@link VoxelShape}
	 */
	protected static final VoxelShape shape = Block.makeCuboidShape(0d, 0d, 0d, 16d, 6d, 16d);

	protected TimeSaver(Properties properties) {
		super(properties);
	}

	@Override
	public abstract void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand);

	@Override
	public abstract TileEntity createTileEntity(BlockState state, IBlockReader world);

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return shape;
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
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
	public abstract void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer,
			ItemStack stack);
}