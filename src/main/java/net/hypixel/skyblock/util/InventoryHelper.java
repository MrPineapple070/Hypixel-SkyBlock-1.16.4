package net.hypixel.skyblock.util;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;

/**
 * Help save and load items from {@link Inventory}.
 *
 * @author MrPineapple070
 * @version 26 June 2020
 * @since 11 June 2019
 */
public class InventoryHelper {
	/**
	 * Load all items in {@code inventory}
	 *
	 * @param list      {@link ListNBT} to load from.
	 * @param inventory {@link Inventory} to load.
	 */
	public static void loadAllItems(@Nonnull ListNBT list, @Nonnull Inventory inventory) {
		HypixelSkyBlockMod.LOGGER.info("Loading all Items");
		HypixelSkyBlockMod.LOGGER.info("ListNBT:\t" + list.toString());
		HypixelSkyBlockMod.LOGGER.info("Inventory:\t" + inventory.toString());
		for (int i = 0; i < list.size(); i++) {
			final CompoundNBT compound = list.getCompound(i);
			final int slot = compound.getByte("Slot") & 0xFF;
			if (slot < inventory.getSizeInventory())
				inventory.setInventorySlotContents(slot, ItemStack.read(compound));
		}
	}

	/**
	 * Save all items in {@code inventory}
	 *
	 * @param list      {@link ListNBT} to store it in.
	 * @param inventory {@link Inventory} to save.
	 * @return a {@code ListNBT} with everything in {@code inventory}
	 */
	public static ListNBT saveAllItems(@Nonnull ListNBT list, @Nonnull Inventory inventory) {
		HypixelSkyBlockMod.LOGGER.info("Saving all Items");
		HypixelSkyBlockMod.LOGGER.info("ListNBT:\t" + list.toString());
		HypixelSkyBlockMod.LOGGER.info("Inventory:\t" + inventory.toString());
		for (int i = 0; i < inventory.getSizeInventory(); ++i) {
			final ItemStack itemstack = inventory.getStackInSlot(i);
			if (!itemstack.isEmpty()) {
				final CompoundNBT compound = new CompoundNBT();
				compound.putByte("Slot", (byte) i);
				itemstack.write(compound);
				list.add(compound);
			}
		}
		return list;
	}
}
