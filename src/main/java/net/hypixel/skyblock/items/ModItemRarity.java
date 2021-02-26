package net.hypixel.skyblock.items;

import com.google.common.collect.ImmutableList;

import net.minecraft.util.text.TextFormatting;

/**
 * A mod version of {@link net.minecraft.item.Rarity}
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public enum ModItemRarity {
	Common(TextFormatting.WHITE, 0), Uncommon(TextFormatting.GREEN, 1), Rare(TextFormatting.BLUE, 2),
	Epic(TextFormatting.DARK_PURPLE, 3), Legendary(TextFormatting.GOLD, 4), Mythic(TextFormatting.LIGHT_PURPLE, 5),
	Special(TextFormatting.RED, 6), Very_Special(TextFormatting.DARK_RED, 7);

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are higher rarities.
	 */
	public static final ImmutableList<ModItemRarity> high = ImmutableList
			.copyOf(new ModItemRarity[] { Epic, Legendary });

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are lower rarities.
	 */
	public static final ImmutableList<ModItemRarity> low = ImmutableList
			.copyOf(new ModItemRarity[] { Common, Uncommon, Rare });

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are only obtained
	 * through artificial means.
	 */
	public static final ImmutableList<ModItemRarity> special = ImmutableList
			.copyOf(new ModItemRarity[] { Mythic, Special, Very_Special });

	/**
	 * The {@link TextFormatting} of this {@code ModItemRarity}
	 */
	public final TextFormatting color;

	public final int rank;

	private ModItemRarity(TextFormatting color, int rank) {
		this.color = color;
		this.rank = rank;
	}

	/**
	 * Determines the next tier of {@link ModItemRarity}
	 *
	 * @return the next {@code ModItemRarity}.
	 */
	public ModItemRarity getNext() {
		switch (this) {
		case Common:
			return Uncommon;
		case Uncommon:
			return Rare;
		case Rare:
			return Epic;
		case Epic:
			return Legendary;
		case Legendary:
			return Mythic;
		case Mythic:
			return Special;
		case Special:
			return Very_Special;
		default:
			throw new IllegalStateException(this.name() + " does not have an upgrade.");
		}
	}
}