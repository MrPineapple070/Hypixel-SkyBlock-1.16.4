package net.hypixel.skyblock.items.sacks;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public class FishingSack extends Sack {
	/**
	 * An {@link ImmutableSet} of {@link Item} that this {@link Sack} will hold.
	 */
	private static final ImmutableSet<Item> items = ImmutableSet
			.copyOf(new Item[] { Items.COD, Items.SALMON, Items.TROPICAL_FISH, Items.PUFFERFISH, Items.PRISMARINE_SHARD,
					Items.PRISMARINE_CRYSTALS, Items.CLAY_BALL, Items.LILY_PAD, Items.INK_SAC, Items.SPONGE });

	public FishingSack(SackSize type) {
		super(ItemProperties.fi1, type);
	}

	@Override
	protected ImmutableSet<Item> getItems() {
		return items;
	}
}