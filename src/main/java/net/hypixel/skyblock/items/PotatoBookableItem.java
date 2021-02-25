package net.hypixel.skyblock.items;

import net.minecraft.item.Item;

/**
 * Serve as a base for all {@link Item} where {@link HotPotatoBook} can be
 * applied.
 *
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 09 July 2019
 */
public interface PotatoBookableItem {
	/**
	 * Apply the {@link HotPotatoBook} to an {@link Item}.
	 *
	 * @return {@code true} if successfully applied.<br>
	 *         {@code false} if unsuccessfully applied.
	 */
	boolean apply();
}
