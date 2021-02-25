package net.hypixel.skyblock.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionTileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * This class helps read and write {@link CompoundNBT}
 *
 * @author MrPineapple070
 * @version 27 May 2020.
 */
public class NBTHelper {
	/**
	 * Read {@code c}. The reverse of {@link #toNBT(Object)}
	 *
	 * @param c is the {@link CompoundNBT} to read from.
	 * @return the object read from {@code c}
	 */
	@Nullable
	public static Object fromNBT(@Nonnull CompoundNBT c) {
		switch (c.getByte("type")) {
		case 0:
			return readItemStack(c);
		default:
			return null;
		}
	}

	/**
	 * Read {@code c}. The reverse of {@link #writeItemStack(ItemStack)}
	 *
	 * @param c the {@link CompoundNBT} to read from.
	 * @return the {@link ItemStack} read from {@code c}
	 */
	private static ItemStack readItemStack(CompoundNBT c) {
		return new ItemStack(
				ForgeRegistries.ITEMS.getValue(new ResourceLocation(HypixelSkyBlockMod.MOD_ID, c.getString("item"))),
				c.getInt("count"));
	}

	/**
	 * Creates {@link CompoundNBT} from {@code o}
	 *
	 * @param o the {@link Object} to write {@code CompoundNBT} for.
	 * @return the written {@code CompoundNBT}
	 */
	public static CompoundNBT toNBT(Object o) {
		if (o instanceof ItemStack)
			return writeItemStack((ItemStack) o);
		if (o instanceof AbstractMinionTileEntity)
			return writeMinion((AbstractMinionTileEntity) o);
		return null;
	}

	/**
	 * Write {@link CompoundNBT} for {@link ItemStack}
	 *
	 * @param i the {@code ItemStack} to write {@code CompoundNBT} for.
	 * @return the written {@code CompoundNBT}
	 */
	private static CompoundNBT writeItemStack(ItemStack i) {
		final CompoundNBT c = new CompoundNBT();
		c.putInt("count", i.getCount());
		c.putString("item", i.getItem().getRegistryName().toString());
		c.putByte("type", (byte) 0);
		return c;
	}

	/**
	 * Write {@link CompoundNBT} for {@link AbstractMinionTileEntity}
	 *
	 * @param minion the {@code AbstractMinionTileEntity} to write
	 *               {@code CompoundNBT} for.
	 * @return the written {@code CompoundNBT}
	 */
	private static CompoundNBT writeMinion(AbstractMinionTileEntity minion) {
		final CompoundNBT c = new CompoundNBT();
		c.putInt("x", minion.x);
		c.putInt("y", minion.y);
		c.putInt("z", minion.z);
		return c;
	}
}
