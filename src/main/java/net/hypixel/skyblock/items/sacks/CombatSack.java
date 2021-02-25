package net.hypixel.skyblock.items.sacks;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Combat_Sack">Combat
 * Sack</a>.
 *
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public class CombatSack extends Sack {
	/**
	 * An {@link ImmutableSet} of {@link Item} that this {@link Sack} can hold.
	 */
	private static final ImmutableSet<Item> items = ImmutableSet
			.copyOf(new Item[] { Items.ROTTEN_FLESH, Items.BONE, Items.STRING, Items.SPIDER_EYE, Items.GUNPOWDER,
					Items.ENDER_PEARL, Items.GHAST_TEAR, Items.SLIME_BALL, Items.BLAZE_ROD, Items.MAGMA_CREAM });

	public CombatSack(SackSize type) {
		super(ItemProperties.c1, type);
	}

	@Override
	protected ImmutableSet<Item> getItems() {
		return items;
	}
}