package net.hypixel.skyblock.inventory.container.minion;

import net.hypixel.skyblock.blocks.init.MinionBlockInit;
import net.hypixel.skyblock.inventory.container.init.MinionContainerTypes;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE1;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE2;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE3;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE4;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE5;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE6;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE7;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE8;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE9;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTEa;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTEb;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;

public class AcaciaMinionContainer extends AbstractMinionContainer {
	public static class AcaciaMC1 extends AcaciaMinionContainer {
		public AcaciaMC1(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_1.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC1(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE1());
		}
	}

	public static class AcaciaMC2 extends AcaciaMinionContainer {
		public AcaciaMC2(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_2.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC2(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE2());
		}
	}

	public static class AcaciaMC3 extends AcaciaMinionContainer {
		public AcaciaMC3(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_3.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC3(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE3());
		}
	}

	public static class AcaciaMC4 extends AcaciaMinionContainer {
		public AcaciaMC4(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_4.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC4(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE4());
		}
	}

	public static class AcaciaMC5 extends AcaciaMinionContainer {
		public AcaciaMC5(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_5.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC5(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE5());
		}
	}

	public static class AcaciaMC6 extends AcaciaMinionContainer {
		public AcaciaMC6(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_6.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC6(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE6());
		}
	}

	public static class AcaciaMC7 extends AcaciaMinionContainer {
		public AcaciaMC7(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_7.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC7(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE7());
		}
	}

	public static class AcaciaMC8 extends AcaciaMinionContainer {
		public AcaciaMC8(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_8.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC8(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE8());
		}
	}

	public static class AcaciaMC9 extends AcaciaMinionContainer {
		public AcaciaMC9(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_9.get(), windowId, pInvIn, minion);
		}

		public AcaciaMC9(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTE9());
		}
	}

	public static class AcaciaMCa extends AcaciaMinionContainer {
		public AcaciaMCa(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_a.get(), windowId, pInvIn, minion);
		}

		public AcaciaMCa(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTEa());
		}
	}

	public static class AcaciaMCb extends AcaciaMinionContainer {
		public AcaciaMCb(int windowId, PlayerInventory pInvIn, AcaciaMinionTileEntity minion) {
			super(MinionContainerTypes.acacia_minion_b.get(), windowId, pInvIn, minion);
		}

		public AcaciaMCb(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new AcaciaMTEb());
		}
	}

	public AcaciaMinionContainer(ContainerType<? extends AbstractMinionContainer> type, int windowId,
			PlayerInventory pInvIn, AbstractMinionTileEntity tileEntity) {
		super(type, windowId, pInvIn, tileEntity);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		Block block = null;
		switch (this.minion.getTier()) {
		case I:
			block = MinionBlockInit.acacia_minion_1.get();
			break;
		case II:
			block = MinionBlockInit.acacia_minion_2.get();
			break;
		case III:
			block = MinionBlockInit.acacia_minion_3.get();
			break;
		case IV:
			block = MinionBlockInit.acacia_minion_4.get();
			break;
		case V:
			block = MinionBlockInit.acacia_minion_5.get();
			break;
		case VI:
			block = MinionBlockInit.acacia_minion_6.get();
			break;
		case VII:
			block = MinionBlockInit.acacia_minion_7.get();
			break;
		case VIII:
			block = MinionBlockInit.acacia_minion_8.get();
			break;
		case IX:
			block = MinionBlockInit.acacia_minion_9.get();
			break;
		case X:
			block = MinionBlockInit.acacia_minion_a.get();
			break;
		case XI:
			block = MinionBlockInit.acacia_minion_b.get();
			break;
		default:
			throw new IllegalStateException("Illegal Minion Tier");
		}
		return isWithinUsableDistance(this.canInteractWithCallable, playerIn, block);
	}
}