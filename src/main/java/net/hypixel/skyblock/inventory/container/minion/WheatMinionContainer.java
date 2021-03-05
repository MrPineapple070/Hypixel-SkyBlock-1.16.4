package net.hypixel.skyblock.inventory.container.minion;

import net.hypixel.skyblock.blocks.init.MinionBlockInit;
import net.hypixel.skyblock.inventory.container.init.MinionContainerTypes;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE1;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE2;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE3;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE4;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE5;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE6;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE7;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE8;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE9;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTEa;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTEb;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;

/**
 * @author MrPineapple070
 * @version 16 August 2020
 * @since 16 August 2020
 */
public abstract class WheatMinionContainer extends AbstractMinionContainer {
	public static class WheatMC1 extends WheatMinionContainer {
		public WheatMC1(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE1());
		}

		public WheatMC1(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_1.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC2 extends WheatMinionContainer {
		public WheatMC2(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE2());
		}

		public WheatMC2(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_2.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC3 extends WheatMinionContainer {
		public WheatMC3(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE3());
		}

		public WheatMC3(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_3.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC4 extends WheatMinionContainer {
		public WheatMC4(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE4());
		}

		public WheatMC4(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_4.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC5 extends WheatMinionContainer {
		public WheatMC5(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE5());
		}

		public WheatMC5(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_5.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC6 extends WheatMinionContainer {
		public WheatMC6(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE6());
		}

		public WheatMC6(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_6.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC7 extends WheatMinionContainer {
		public WheatMC7(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE7());
		}

		public WheatMC7(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_7.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC8 extends WheatMinionContainer {
		public WheatMC8(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE8());
		}

		public WheatMC8(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_8.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMC9 extends WheatMinionContainer {
		public WheatMC9(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTE9());
		}

		public WheatMC9(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_9.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMCa extends WheatMinionContainer {
		public WheatMCa(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTEa());
		}

		public WheatMCa(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_a.get(), windowId, pInvIn, minion);
		}
	}

	public static class WheatMCb extends WheatMinionContainer {
		public WheatMCb(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new WheatMTEb());
		}

		public WheatMCb(int windowId, PlayerInventory pInvIn, WheatMinionTileEntity minion) {
			super(MinionContainerTypes.wheat_minion_b.get(), windowId, pInvIn, minion);
		}
	}

	/**
	 * Construct this.
	 *
	 * @param type       {@link ContainerType} of this.
	 * @param windowId   Unique ID for this.
	 * @param pInvIn     {@link PlayerInventory} of this.
	 * @param tileEntity {@link WheatMinionTileEntity} of this.
	 */
	protected WheatMinionContainer(ContainerType<? extends AbstractMinionContainer> type, int windowId,
			PlayerInventory pInvIn, WheatMinionTileEntity tileEntity) {
		super(type, windowId, pInvIn, tileEntity);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		Block block = null;
		switch (this.minion.getTier()) {
		case I:
			block = MinionBlockInit.wheat_minion_1.get();
			break;
		case II:
			block = MinionBlockInit.wheat_minion_2.get();
			break;
		case III:
			block = MinionBlockInit.wheat_minion_3.get();
			break;
		case IV:
			block = MinionBlockInit.wheat_minion_4.get();
			break;
		case V:
			block = MinionBlockInit.wheat_minion_5.get();
			break;
		case VI:
			block = MinionBlockInit.wheat_minion_6.get();
			break;
		case VII:
			block = MinionBlockInit.wheat_minion_7.get();
			break;
		case VIII:
			block = MinionBlockInit.wheat_minion_8.get();
			break;
		case IX:
			block = MinionBlockInit.wheat_minion_9.get();
			break;
		case X:
			block = MinionBlockInit.wheat_minion_a.get();
			break;
		case XI:
			block = MinionBlockInit.wheat_minion_b.get();
			break;
		default:
			throw new IllegalStateException("Illegal Minion Tier");
		}
		return isWithinUsableDistance(this.canInteractWithCallable, playerIn, block);
	}
}