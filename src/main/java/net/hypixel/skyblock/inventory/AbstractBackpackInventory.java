package net.hypixel.skyblock.inventory;

import net.hypixel.skyblock.items.AbstractBackpack.BackpackType;
import net.hypixel.skyblock.util.InventoryHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraftforge.common.util.Constants;

/**
 * Serve as a base for Backpack Inventories.
 *
 * @author MrPineapple070
 * @version 26 June 2020
 */
public abstract class AbstractBackpackInventory extends Inventory {
	public static class GreaterBI extends AbstractBackpackInventory {
		public GreaterBI() {
			super(BackpackType.Greater);
		}
	}

	public static class LargeBI extends AbstractBackpackInventory {
		public LargeBI() {
			super(BackpackType.Large);
		}
	}

	public static class MediumBI extends AbstractBackpackInventory {
		public MediumBI() {
			super(BackpackType.Medium);
		}
	}

	public static class SmallBI extends AbstractBackpackInventory {
		public SmallBI() {
			super(BackpackType.Small);
		}
	}

	/**
	 * Construct this
	 *
	 * @param type the {@link BackpackType} of this.
	 */
	protected AbstractBackpackInventory(BackpackType type) {
		super(type.size);
	}

	@Override
	public void closeInventory(PlayerEntity player) {
		final ItemStack backpack = player.getHeldItemMainhand();
		if (!backpack.isEmpty()) {
			CompoundNBT compound = backpack.getTag();
			if (compound == null)
				compound = new CompoundNBT();
			final ListNBT list = new ListNBT();
			InventoryHelper.saveAllItems(list, this);
			compound.put("Items", list);
			backpack.setTag(compound);
		}
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player) {
		return true;
	}

	@Override
	public void openInventory(PlayerEntity player) {
		this.clear();
		final ItemStack backpack = player.getHeldItemMainhand();
		if (!backpack.isEmpty()) {
			final CompoundNBT compound = backpack.getTag();
			if (compound != null)
				if (compound.contains("Items", Constants.NBT.TAG_LIST))
					InventoryHelper.loadAllItems(compound.getList("Items", Constants.NBT.TAG_COMPOUND), this);
		}
	}
}