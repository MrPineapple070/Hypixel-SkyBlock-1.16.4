package net.hypixel.skyblock.items.sacks;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mining_Sack">Mining
 * Sack</a>.
 *
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public class MiningSack extends Sack {
	/**
	 * An {@link ImmutableSet} of {@link Item} that this {@link Sack} will hold.
	 */
	private static final ImmutableSet<Item> items = ImmutableSet
			.copyOf(new Item[] { Items.COBBLESTONE, Items.COAL, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND,
					Items.LAPIS_LAZULI, Items.EMERALD, Items.REDSTONE, Items.QUARTZ, Items.OBSIDIAN,
					Items.GLOWSTONE_DUST, Items.GRAVEL, Items.ICE, Items.NETHERRACK, Items.SAND, Items.END_STONE });

	public MiningSack(SackSize type) {
		super(ItemProperties.m1, type);
	}

	@Override
	protected ImmutableSet<Item> getItems() {
		return items;
	}
}