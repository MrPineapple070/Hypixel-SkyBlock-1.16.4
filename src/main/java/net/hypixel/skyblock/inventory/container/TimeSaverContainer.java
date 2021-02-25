package net.hypixel.skyblock.inventory.container;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.tileentity.TimeSaverTileEntity;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.IWorldPosCallable;

/**
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public abstract class TimeSaverContainer extends Container {
	/**
	 * The {@link IWorldPosCallable} of this.
	 */
	@Nonnull
	protected final IWorldPosCallable canInteractWithCallable;

	/**
	 * The {@link AbstractMinionTileEntity} of this,
	 */
	@Nonnull
	protected final TimeSaverTileEntity time_saver;

	protected TimeSaverContainer(ContainerType<? extends TimeSaverContainer> type, int windowId, PlayerInventory pInvIn,
			TimeSaverTileEntity tileEntity) {
		super(type, windowId);
		this.time_saver = tileEntity;
		this.canInteractWithCallable = IWorldPosCallable.of(this.time_saver.getWorld(), this.time_saver.getPos());
	}

	@Override
	public abstract boolean canInteractWith(PlayerEntity playerIn);
}