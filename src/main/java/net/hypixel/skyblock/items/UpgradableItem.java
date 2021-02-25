package net.hypixel.skyblock.items;

/**
 * Serve as a base where {@link Recombobulator} can apply.
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 07 July 2020
 */
public interface UpgradableItem {
	/**
	 * @return {@link ModItemRarity} of this item.
	 */
	ModItemRarity getRarity();

	/**
	 * Set the {@link ModItemRarity} of this.
	 *
	 * @param rarity new {@code ModItemRarity}
	 */
	void setRarity(ModItemRarity rarity);

	/**
	 * Upgrade the {@link ModItemRarity}. Each {@code Item} can only be upgraded
	 * once.
	 *
	 * @return {@code true} if upgrade successful.<br>
	 *         {@code false} if upgrade unsuccessful.
	 */
	boolean upgrade();
}
