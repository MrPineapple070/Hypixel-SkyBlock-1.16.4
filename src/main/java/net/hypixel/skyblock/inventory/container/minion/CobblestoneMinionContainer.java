package net.hypixel.skyblock.inventory.container.minion;

import net.hypixel.skyblock.init.blocks.MinionBlockInit;
import net.hypixel.skyblock.inventory.container.ModContainerTypes;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE1;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE2;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE3;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE4;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE5;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE6;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE7;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE8;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE9;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTEa;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTEb;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;

/**
 * Serve as the basis for all 11 tiers of CobblestoneMinionContainer.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public abstract class CobblestoneMinionContainer extends AbstractMinionContainer {
	public static class CobbleMC1 extends CobblestoneMinionContainer {
		public CobbleMC1(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_1.get(), windowId, pInvIn, minion);
		}

		public CobbleMC1(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE1());
		}
	}

	public static class CobbleMC2 extends CobblestoneMinionContainer {
		public CobbleMC2(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_2.get(), windowId, pInvIn, minion);
		}

		public CobbleMC2(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE2());
		}
	}

	public static class CobbleMC3 extends CobblestoneMinionContainer {
		public CobbleMC3(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_3.get(), windowId, pInvIn, minion);
		}

		public CobbleMC3(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE3());
		}
	}

	public static class CobbleMC4 extends CobblestoneMinionContainer {
		public CobbleMC4(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_4.get(), windowId, pInvIn, minion);
		}

		public CobbleMC4(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE4());
		}
	}

	public static class CobbleMC5 extends CobblestoneMinionContainer {
		public CobbleMC5(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_5.get(), windowId, pInvIn, minion);
		}

		public CobbleMC5(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE5());
		}
	}

	public static class CobbleMC6 extends CobblestoneMinionContainer {
		public CobbleMC6(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_6.get(), windowId, pInvIn, minion);
		}

		public CobbleMC6(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE6());
		}
	}

	public static class CobbleMC7 extends CobblestoneMinionContainer {
		public CobbleMC7(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_7.get(), windowId, pInvIn, minion);
		}

		public CobbleMC7(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE7());
		}
	}

	public static class CobbleMC8 extends CobblestoneMinionContainer {
		public CobbleMC8(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_8.get(), windowId, pInvIn, minion);
		}

		public CobbleMC8(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE8());
		}
	}

	public static class CobbleMC9 extends CobblestoneMinionContainer {
		public CobbleMC9(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_9.get(), windowId, pInvIn, minion);
		}

		public CobbleMC9(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTE9());
		}
	}

	public static class CobbleMCa extends CobblestoneMinionContainer {
		public CobbleMCa(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_a.get(), windowId, pInvIn, minion);
		}

		public CobbleMCa(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTEa());
		}
	}

	public static class CobbleMCb extends CobblestoneMinionContainer {
		public CobbleMCb(int windowId, PlayerInventory pInvIn, CobblestoneMinionTileEntity minion) {
			super(ModContainerTypes.cobblestone_minion_b.get(), windowId, pInvIn, minion);
		}

		public CobbleMCb(int windowId, PlayerInventory pInvIn, PacketBuffer data) {
			this(windowId, pInvIn, new CobbleMTEb());
		}
	}

	/**
	 * Construct Cobblestone Minion Container
	 *
	 * @param type     {@link ContainerType} of this.
	 * @param windowId Unique ID of this.
	 * @param pInvIn   {@link PlayerInventory} of this.
	 * @param minion   {@link AbstractMinionTileEntity} of this.
	 */
	protected CobblestoneMinionContainer(ContainerType<? extends AbstractMinionContainer> type, int windowId,
			PlayerInventory pInvIn, AbstractMinionTileEntity minion) {
		super(type, windowId, pInvIn, minion);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		Block block = null;
		switch (this.minion.getTier()) {
		case I:
			block = MinionBlockInit.cobblestone_minion_1.get();
			break;
		case II:
			block = MinionBlockInit.cobblestone_minion_2.get();
			break;
		case III:
			block = MinionBlockInit.cobblestone_minion_3.get();
			break;
		case IV:
			block = MinionBlockInit.cobblestone_minion_4.get();
			break;
		case V:
			block = MinionBlockInit.cobblestone_minion_5.get();
			break;
		case VI:
			block = MinionBlockInit.cobblestone_minion_6.get();
			break;
		case VII:
			block = MinionBlockInit.cobblestone_minion_7.get();
			break;
		case VIII:
			block = MinionBlockInit.cobblestone_minion_8.get();
			break;
		case IX:
			block = MinionBlockInit.cobblestone_minion_9.get();
			break;
		case X:
			block = MinionBlockInit.cobblestone_minion_a.get();
			break;
		case XI:
			block = MinionBlockInit.cobblestone_minion_b.get();
			break;
		default:
			throw new IllegalStateException("Illegal Minion Tier");
		}
		return isWithinUsableDistance(this.canInteractWithCallable, playerIn, block);
	}
}