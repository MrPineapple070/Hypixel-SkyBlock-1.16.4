package net.hypixel.skyblock.tileentity.minion;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.init.items.ItemInit;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC1;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC2;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC3;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC4;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC5;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC6;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC7;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC8;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMC9;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMCa;
import net.hypixel.skyblock.inventory.container.minion.WheatMinionContainer.WheatMCb;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.server.ServerWorld;

/**
 * The {@link AbstractMinionTileEntity} for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wheat_Minion">Wheat
 * Minion</a>.
 *
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
public class WheatMinionTileEntity extends AbstractPlacerMTE {
	public static class WheatMTE1 extends WheatMinionTileEntity {
		public WheatMTE1() {
			super(ModTileEntityTypes.wheat_minion_1.get(), MinionTier.I);
		}
	}

	public static class WheatMTE2 extends WheatMinionTileEntity {
		public WheatMTE2() {
			super(ModTileEntityTypes.wheat_minion_2.get(), MinionTier.II);
		}
	}

	public static class WheatMTE3 extends WheatMinionTileEntity {
		public WheatMTE3() {
			super(ModTileEntityTypes.wheat_minion_3.get(), MinionTier.III);
		}
	}

	public static class WheatMTE4 extends WheatMinionTileEntity {
		public WheatMTE4() {
			super(ModTileEntityTypes.wheat_minion_4.get(), MinionTier.IV);
		}
	}

	public static class WheatMTE5 extends WheatMinionTileEntity {
		public WheatMTE5() {
			super(ModTileEntityTypes.wheat_minion_5.get(), MinionTier.V);
		}
	}

	public static class WheatMTE6 extends WheatMinionTileEntity {
		public WheatMTE6() {
			super(ModTileEntityTypes.wheat_minion_6.get(), MinionTier.VI);
		}
	}

	public static class WheatMTE7 extends WheatMinionTileEntity {
		public WheatMTE7() {
			super(ModTileEntityTypes.wheat_minion_7.get(), MinionTier.VII);
		}
	}

	public static class WheatMTE8 extends WheatMinionTileEntity {
		public WheatMTE8() {
			super(ModTileEntityTypes.wheat_minion_8.get(), MinionTier.VIII);
		}
	}

	public static class WheatMTE9 extends WheatMinionTileEntity {
		public WheatMTE9() {
			super(ModTileEntityTypes.wheat_minion_9.get(), MinionTier.IX);
		}
	}

	public static class WheatMTEa extends WheatMinionTileEntity {
		public WheatMTEa() {
			super(ModTileEntityTypes.wheat_minion_a.get(), MinionTier.X);
		}
	}

	public static class WheatMTEb extends WheatMinionTileEntity {
		public WheatMTEb() {
			super(ModTileEntityTypes.wheat_minion_b.get(), MinionTier.XI);
		}
	}

	public WheatMinionTileEntity(TileEntityType<? extends WheatMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		switch (this.tier) {
		case I:
			return new WheatMC1(id, player, this);
		case II:
			return new WheatMC2(id, player, this);
		case III:
			return new WheatMC3(id, player, this);
		case IV:
			return new WheatMC4(id, player, this);
		case V:
			return new WheatMC5(id, player, this);
		case VI:
			return new WheatMC6(id, player, this);
		case VII:
			return new WheatMC7(id, player, this);
		case VIII:
			return new WheatMC8(id, player, this);
		case IX:
			return new WheatMC9(id, player, this);
		case X:
			return new WheatMCa(id, player, this);
		case XI:
			return new WheatMCb(id, player, this);
		default:
			throw new IllegalStateException("Illegal Minion MinionTier " + this.tier.name());
		}
	}

	@Override
	protected Item[] getCompactor() {
		return new Item[] { Items.WHEAT, Items.DIAMOND };
	}

	@Override
	protected SoundEvent getSoundEvent() {
		return SoundEvents.BLOCK_CROP_BREAK;
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return 0;
	}

	@Override
	protected BlockState getState() {
		return Blocks.WHEAT.getDefaultState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.WHEAT, Items.HAY_BLOCK, Items.WHEAT_SEEDS, Items.DIAMOND, Items.DIAMOND_BLOCK, ItemInit.enchanted_diamond.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return null;
	}

	@Override
	protected StringTextComponent initDisplayName() {
		return new StringTextComponent("Wheat Minion Tier " + this.tier.name());
	}

	@Override
	protected BlockPos[][][] initSurround() {
		return new BlockPos[1][7][7];
	}

	@Override
	protected boolean interact(BlockPos pos) {
		if (pos == null)
			return false;
		HypixelSkyBlockMod.LOGGER.info("Interacting with " + pos.toString());
		final BlockState state = this.world.getBlockState(pos);
		if (state.getMaterial() == Material.AIR) {
			this.world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS,
					1f, 1f, true);
			this.world.setBlockState(pos, Blocks.WHEAT.getDefaultState());
		} else {
			this.addItemStacks(Block.getDrops(state, (ServerWorld) this.world, pos, this));
			this.world.playEvent(2001, pos, Block.getStateId(state));
			this.world.setBlockState(pos, Blocks.AIR.getDefaultState());
		}
		return true;
	}

	@Override
	protected void setAirSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering air BlockPos.");
		this.airSurround.clear();
		for (BlockPos pos : this.validSurround) {
			final BlockPos up = pos.up();
			if (this.world.getBlockState(up).getMaterial() == Material.AIR)
				this.airSurround.add(pos);
		}
	}

	@Override
	protected void setSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering Surrounding BlockPos.");
		final int[] dx = this.hasUpgrade(ItemInit.minion_expander.get()) ? expanded_size : default_size;

		for (int i = 0; i < this.surround[0].length; i++)
			for (int j = 0; j < this.surround[0][i].length; j++)
				this.surround[0][i][j] = dx[i] == 0 && dx[j] == 0 ? null
						: new BlockPos(this.x + dx[j], this.y - 1, this.z + dx[i]);
	}

	@Override
	protected void setValidSurround() {
		HypixelSkyBlockMod.LOGGER.info("Gathering Surrounding BlockPos.");
		final boolean hasExpander = this.hasUpgrade(ItemInit.minion_expander.get());
		final int[] dx = hasExpander ? expanded_size : default_size;
		final int iStart = hasExpander ? 1 : 0, iEnd = hasExpander ? this.surround.length : this.surround.length - 1;
		final int jStart = hasExpander ? 1 : 0, jEnd = hasExpander ? this.surround.length : this.surround.length - 1;

		for (int i = iStart; i < iEnd; i++)
			for (int j = jStart; j < jEnd; j++)
				this.surround[0][i][j] = dx[i] == 0 && dx[j] == 0 ? null
						: new BlockPos(this.x + dx[j], this.y - 1, this.z + dx[i]);
	}
}