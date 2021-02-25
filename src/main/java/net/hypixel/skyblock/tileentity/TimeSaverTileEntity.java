package net.hypixel.skyblock.tileentity;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.InvWrapper;

/**
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public class TimeSaverTileEntity extends TileEntity implements IInventory {
	public static final class DaySaverTileEntity extends TimeSaverTileEntity {
		public DaySaverTileEntity() {
			super(ModTileEntityTypes.day_saver.get());
		}
	}

	public static final class NightSaverTileEntity extends TimeSaverTileEntity {
		public NightSaverTileEntity() {
			super(ModTileEntityTypes.night_saver.get());
		}
	}

	/**
	 * {@link LazyOptional} of {@link IItemHandlerModifiable}
	 */
	@Nonnull
	protected LazyOptional<IItemHandlerModifiable> saverHandler = LazyOptional.of(() -> new InvWrapper(this));

	public TimeSaverTileEntity(TileEntityType<? extends TimeSaverTileEntity> typeIn) {
		super(typeIn);
	}

	@Override
	public void clear() {
		return;
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		return ItemStack.EMPTY;
	}

	@Override
	public int getSizeInventory() {
		return 12;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return ItemStack.EMPTY;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player) {
		return true;
	}

	@Override
	public void markDirty() {
		return;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStack.EMPTY;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		return;
	}
}