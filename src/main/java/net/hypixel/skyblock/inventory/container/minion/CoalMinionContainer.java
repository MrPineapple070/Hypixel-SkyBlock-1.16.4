package net.hypixel.skyblock.inventory.container.minion;

import net.hypixel.skyblock.blocks.init.MinionBlockInit;
import net.hypixel.skyblock.inventory.container.init.MinionContainerTypes;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE1;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE2;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE3;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE4;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE5;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE6;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE7;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE8;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE9;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTEa;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTEb;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;

/**
 * Serve as a base for Coal Minion Containers
 *
 * @author MrPineapple070
 * @version 24 July 2020
 * @since 17 June 2019
 */
public abstract class CoalMinionContainer extends AbstractMinionContainer {
	public static class CoalMC1 extends CoalMinionContainer {
		public CoalMC1(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_1.get(), windowId, pInvIn, minion);
		}

		public CoalMC1(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE1());
		}
	}

	public static class CoalMC2 extends CoalMinionContainer {
		public CoalMC2(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_2.get(), windowId, pInvIn, minion);
		}

		public CoalMC2(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE2());
		}
	}

	public static class CoalMC3 extends CoalMinionContainer {
		public CoalMC3(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_3.get(), windowId, pInvIn, minion);
		}

		public CoalMC3(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE3());
		}
	}

	public static class CoalMC4 extends CoalMinionContainer {
		public CoalMC4(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_4.get(), windowId, pInvIn, minion);
		}

		public CoalMC4(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE4());
		}
	}

	public static class CoalMC5 extends CoalMinionContainer {
		public CoalMC5(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_5.get(), windowId, pInvIn, minion);
		}

		public CoalMC5(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE5());
		}
	}

	public static class CoalMC6 extends CoalMinionContainer {
		public CoalMC6(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_6.get(), windowId, pInvIn, minion);
		}

		public CoalMC6(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE6());
		}
	}

	public static class CoalMC7 extends CoalMinionContainer {
		public CoalMC7(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_7.get(), windowId, pInvIn, minion);
		}

		public CoalMC7(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE7());
		}
	}

	public static class CoalMC8 extends CoalMinionContainer {
		public CoalMC8(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_8.get(), windowId, pInvIn, minion);
		}

		public CoalMC8(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE8());
		}
	}

	public static class CoalMC9 extends CoalMinionContainer {
		public CoalMC9(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_9.get(), windowId, pInvIn, minion);
		}

		public CoalMC9(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTE9());
		}
	}

	public static class CoalMCa extends CoalMinionContainer {
		public CoalMCa(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_a.get(), windowId, pInvIn, minion);
		}

		public CoalMCa(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTEa());
		}
	}

	public static class CoalMCb extends CoalMinionContainer {
		public CoalMCb(int windowId, PlayerInventory pInvIn, CoalMinionTileEntity minion) {
			super(MinionContainerTypes.coal_minion_b.get(), windowId, pInvIn, minion);
		}

		public CoalMCb(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CoalMTEb());
		}
	}

	/**
	 * Construct a Coal Minion Container
	 *
	 * @param type       the {@link ContainerType} of this.
	 * @param windowId   the unique ID of this.
	 * @param pInvIn     the {@link PlayerInventory} of the player interacting with
	 *                   this.
	 * @param tileEntity the {@link CoalMinionTileEntity} for this.
	 */
	protected CoalMinionContainer(ContainerType<? extends CoalMinionContainer> type, int windowId,
			PlayerInventory pInvIn, CoalMinionTileEntity tileEntity) {
		super(type, windowId, pInvIn, tileEntity);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		Block block = null;
		switch (this.minion.getTier()) {
		case I:
			block = MinionBlockInit.coal_minion_1.get();
			break;
		case II:
			block = MinionBlockInit.coal_minion_2.get();
			break;
		case III:
			block = MinionBlockInit.coal_minion_3.get();
			break;
		case IV:
			block = MinionBlockInit.coal_minion_4.get();
			break;
		case V:
			block = MinionBlockInit.coal_minion_5.get();
			break;
		case VI:
			block = MinionBlockInit.coal_minion_6.get();
			break;
		case VII:
			block = MinionBlockInit.coal_minion_7.get();
			break;
		case VIII:
			block = MinionBlockInit.coal_minion_8.get();
			break;
		case IX:
			block = MinionBlockInit.coal_minion_9.get();
			break;
		case X:
			block = MinionBlockInit.coal_minion_a.get();
			break;
		case XI:
			block = MinionBlockInit.coal_minion_b.get();
			break;
		default:
			throw new IllegalStateException("Illegal Minion Tier");
		}
		return isWithinUsableDistance(this.canInteractWithCallable, playerIn, block);
	}
}