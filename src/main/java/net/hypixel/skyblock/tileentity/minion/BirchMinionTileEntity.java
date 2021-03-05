package net.hypixel.skyblock.tileentity.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.items.init.ItemInit;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.StringTextComponent;

public class BirchMinionTileEntity extends AbstractForagingMTE {
	public static class BirchMTE1 extends BirchMinionTileEntity {
		public BirchMTE1() {
			super(ModTileEntityTypes.birch_minion_1.get(), MinionTier.I);
		}
	}

	public static class BirchMTE2 extends BirchMinionTileEntity {
		public BirchMTE2() {
			super(ModTileEntityTypes.birch_minion_2.get(), MinionTier.II);
		}
	}

	public static class BirchMTE3 extends BirchMinionTileEntity {
		public BirchMTE3() {
			super(ModTileEntityTypes.birch_minion_3.get(), MinionTier.III);
		}
	}

	public static class BirchMTE4 extends BirchMinionTileEntity {
		public BirchMTE4() {
			super(ModTileEntityTypes.birch_minion_4.get(), MinionTier.IV);
		}
	}

	public static class BirchMTE5 extends BirchMinionTileEntity {
		public BirchMTE5() {
			super(ModTileEntityTypes.birch_minion_5.get(), MinionTier.V);
		}
	}

	public static class BirchMTE6 extends BirchMinionTileEntity {
		public BirchMTE6() {
			super(ModTileEntityTypes.birch_minion_6.get(), MinionTier.VI);
		}
	}

	public static class BirchMTE7 extends BirchMinionTileEntity {
		public BirchMTE7() {
			super(ModTileEntityTypes.birch_minion_7.get(), MinionTier.VII);
		}
	}

	public static class BirchMTE8 extends BirchMinionTileEntity {
		public BirchMTE8() {
			super(ModTileEntityTypes.birch_minion_8.get(), MinionTier.VIII);
		}
	}

	public static class BirchMTE9 extends BirchMinionTileEntity {
		public BirchMTE9() {
			super(ModTileEntityTypes.birch_minion_9.get(), MinionTier.IX);
		}
	}

	public static class BirchMTEa extends BirchMinionTileEntity {
		public BirchMTEa() {
			super(ModTileEntityTypes.birch_minion_a.get(), MinionTier.X);
		}
	}

	public static class BirchMTEb extends BirchMinionTileEntity {
		public BirchMTEb() {
			super(ModTileEntityTypes.birch_minion_b.get(), MinionTier.XI);
		}
	}

	protected static final ImmutableSet<Block> validBlocks = ImmutableSet.copyOf(Arrays.asList(Blocks.BIRCH_LOG));

	public BirchMinionTileEntity(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return null;
	}

	@Override
	protected SoundEvent getSoundEvent() {
		return SoundEvents.BLOCK_WOOD_BREAK;
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return 0;
	}

	@Override
	protected BlockState getState() {
		return Blocks.BIRCH_LOG.getDefaultState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.DIAMOND, Items.BIRCH_LOG, ItemInit.enchanted_diamond.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return validBlocks;
	}

	@Override
	protected StringTextComponent initDisplayName() {
		return new StringTextComponent("Birch Minion Tier " + this.tier.name());
	}
}