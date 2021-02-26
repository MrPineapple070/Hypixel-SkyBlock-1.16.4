package net.hypixel.skyblock.tileentity.minion;

import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;

public class BlazeMinionTileEntity extends AbstractMinionTileEntity {
	public static class BlazeMTE1 extends BlazeMinionTileEntity {
		public BlazeMTE1() {
			super(ModTileEntityTypes.blaze_minion_1.get(), MinionTier.I);
		}
	}

	public static class BlazeMTE2 extends BlazeMinionTileEntity {
		public BlazeMTE2() {
			super(ModTileEntityTypes.blaze_minion_2.get(), MinionTier.II);
		}
	}

	public static class BlazeMTE3 extends BlazeMinionTileEntity {
		public BlazeMTE3() {
			super(ModTileEntityTypes.blaze_minion_3.get(), MinionTier.III);
		}
	}

	public static class BlazeMTE4 extends BlazeMinionTileEntity {
		public BlazeMTE4() {
			super(ModTileEntityTypes.blaze_minion_4.get(), MinionTier.IV);
		}
	}

	public static class BlazeMTE5 extends BlazeMinionTileEntity {
		public BlazeMTE5() {
			super(ModTileEntityTypes.blaze_minion_5.get(), MinionTier.V);
		}
	}

	public static class BlazeMTE6 extends BlazeMinionTileEntity {
		public BlazeMTE6() {
			super(ModTileEntityTypes.blaze_minion_6.get(), MinionTier.VI);
		}
	}

	public static class BlazeMTE7 extends BlazeMinionTileEntity {
		public BlazeMTE7() {
			super(ModTileEntityTypes.blaze_minion_7.get(), MinionTier.VII);
		}
	}

	public static class BlazeMTE8 extends BlazeMinionTileEntity {
		public BlazeMTE8() {
			super(ModTileEntityTypes.blaze_minion_8.get(), MinionTier.VIII);
		}
	}

	public static class BlazeMTE9 extends BlazeMinionTileEntity {
		public BlazeMTE9() {
			super(ModTileEntityTypes.blaze_minion_9.get(), MinionTier.IX);
		}
	}

	public static class BlazeMTEa extends BlazeMinionTileEntity {
		public BlazeMTEa() {
			super(ModTileEntityTypes.blaze_minion_a.get(), MinionTier.X);
		}
	}

	public static class BlazeMTEb extends BlazeMinionTileEntity {
		public BlazeMTEb() {
			super(ModTileEntityTypes.blaze_minion_b.get(), MinionTier.XI);
		}
	}

	public BlazeMinionTileEntity(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return null;
	}

	@Override
	protected Item[] getCompactor() {
		return null;
	}

	@Override
	protected Item[] getSuperCompactor() {
		return null;
	}

	@Override
	protected BlockPos[][][] initSurround() {
		return null;
	}

	@Override
	protected StringTextComponent initDisplayName() {
		return new StringTextComponent("Blaze Minion Tier " + this.tier.name());
	}

	@Override
	protected BlockPos pickBlockPos() {
		return null;
	}

	@Override
	protected void setSurround() {
	}

	@Override
	protected void setValidSurround() {
	}

	@Override
	public void tick() {
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return 0;
	}
}