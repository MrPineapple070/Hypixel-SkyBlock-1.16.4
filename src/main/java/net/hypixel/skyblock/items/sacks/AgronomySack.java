package net.hypixel.skyblock.items.sacks;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Agronomy_Sack">Agronomy
 * Sack</a>.
 *
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public final class AgronomySack extends Sack {
	/**
	 * An {@link ImmutableSet} of {@link Item} that this {@link Sack} can hold.
	 */
	private static final ImmutableSet<Item> items = ImmutableSet.copyOf(new Item[] { Items.WHEAT, Items.CARROT,
			Items.POTATO, Items.PUMPKIN, Items.MELON, Items.WHEAT_SEEDS, Items.RED_MUSHROOM, Items.BROWN_MUSHROOM,
			Items.COCOA_BEANS, Items.CACTUS, Items.SUGAR_CANE, Items.NETHER_WART });

	public AgronomySack(SackSize type) {
		super(ItemProperties.f1, type);
	}

	@Override
	public ImmutableSet<Item> getItems() {
		return items;
	}
}