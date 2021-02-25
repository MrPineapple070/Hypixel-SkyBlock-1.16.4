package net.hypixel.skyblock.items.sacks;

import java.util.Arrays;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/**
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public class ForagingSack extends Sack {
	/**
	 * An {@link ImmutableSet} of {@link Item} that this {@link Sack} will hold.
	 */
	private static final ImmutableSet<Item> items = ImmutableSet.copyOf(Arrays.asList(Items.OAK_LOG, Items.SPRUCE_LOG,
			Items.BIRCH_LOG, Items.DARK_OAK_LOG, Items.ACACIA_LOG, Items.JUNGLE_LOG));

	/**
	 * @param type {@link SackSize} of this.
	 */
	public ForagingSack(SackSize type) {
		super(ItemProperties.fg1, type);
	}

	@Override
	protected ImmutableSet<Item> getItems() {
		return items;
	}
}