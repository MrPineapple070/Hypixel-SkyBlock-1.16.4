package net.hypixel.skyblock.items;

import net.minecraft.item.Item;

/**
 * Serve as a base for all {@link Item} where {@link Reforge} can be applied.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public interface ReforgableItem {
	/**
	 * @return current {@link Reforge} of this.
	 */
	Reforge getReforge();

	/**
	 * Randomly set the current {@link Reforge} of this.
	 */
	void reforge();

	/**
	 * Set the current {@link Reforge} of this.
	 *
	 * @param reforge new {@code Reforge}
	 */
	void setReforge(Reforge reforge);
}