package net.hypixel.skyblock.tileentity.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.blocks.minion.AcaciaMinion;
import net.hypixel.skyblock.init.items.ItemInit;
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

/**
 * @author MrPineapple070
 * @version 31 December 2020
 * @since 11 July 2019
 */
public class AcaciaMinionTileEntity extends AbstractForagingMTE {
	public static class AcaciaMTE1 extends AcaciaMinionTileEntity {
		public AcaciaMTE1() {
			super(ModTileEntityTypes.acacia_minion_1.get(), MinionTier.I);
		}
	}

	public static class AcaciaMTE2 extends AcaciaMinionTileEntity {
		public AcaciaMTE2() {
			super(ModTileEntityTypes.acacia_minion_2.get(), MinionTier.II);
		}
	}

	public static class AcaciaMTE3 extends AcaciaMinionTileEntity {
		public AcaciaMTE3() {
			super(ModTileEntityTypes.acacia_minion_3.get(), MinionTier.III);
		}
	}

	public static class AcaciaMTE4 extends AcaciaMinionTileEntity {
		public AcaciaMTE4() {
			super(ModTileEntityTypes.acacia_minion_4.get(), MinionTier.IV);
		}
	}

	public static class AcaciaMTE5 extends AcaciaMinionTileEntity {
		public AcaciaMTE5() {
			super(ModTileEntityTypes.acacia_minion_5.get(), MinionTier.V);
		}
	}

	public static class AcaciaMTE6 extends AcaciaMinionTileEntity {
		public AcaciaMTE6() {
			super(ModTileEntityTypes.acacia_minion_6.get(), MinionTier.VI);
		}
	}

	public static class AcaciaMTE7 extends AcaciaMinionTileEntity {
		public AcaciaMTE7() {
			super(ModTileEntityTypes.acacia_minion_7.get(), MinionTier.VII);
		}
	}

	public static class AcaciaMTE8 extends AcaciaMinionTileEntity {
		public AcaciaMTE8() {
			super(ModTileEntityTypes.acacia_minion_8.get(), MinionTier.VIII);
		}
	}

	public static class AcaciaMTE9 extends AcaciaMinionTileEntity {
		public AcaciaMTE9() {
			super(ModTileEntityTypes.acacia_minion_9.get(), MinionTier.IX);
		}
	}

	public static class AcaciaMTEa extends AcaciaMinionTileEntity {
		public AcaciaMTEa() {
			super(ModTileEntityTypes.acacia_minion_a.get(), MinionTier.X);
		}
	}

	public static class AcaciaMTEb extends AcaciaMinionTileEntity {
		public AcaciaMTEb() {
			super(ModTileEntityTypes.acacia_minion_b.get(), MinionTier.XI);
		}
	}

	protected static final ImmutableSet<Block> validBlocks = ImmutableSet.copyOf(Arrays.asList(Blocks.ACACIA_LOG));

	public AcaciaMinionTileEntity(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
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
		return AcaciaMinion.speed.get(tier.asInt);
	}

	@Override
	protected BlockState getState() {
		return Blocks.ACACIA_SAPLING.getDefaultState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.DIAMOND, Items.ACACIA_LOG, ItemInit.enchanted_acacia.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return validBlocks;
	}

	@Override
	public StringTextComponent initDisplayName() {
		return new StringTextComponent("Acacia Minion Tier " + this.tier.name());
	}
}