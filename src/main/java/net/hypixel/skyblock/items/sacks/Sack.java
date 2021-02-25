package net.hypixel.skyblock.items.sacks;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sacks">Sacks</a> allow the
 * player to store a certain amount of Collection items while held in the
 * inventory or a Sack of Sacks.
 *
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public abstract class Sack extends Item {
	/**
	 * The different sizes of each {@link Sack}
	 */
	protected enum SackSize {
		Large(20160), Medium(2240), Small(640);

		public final int size;

		private SackSize(int size) {
			this.size = size;
		}

		/**
		 * @return the next {@link SackSize}
		 * @throws IllegalAccessException if this does not have an upgrade.
		 */
		public SackSize getNext() throws IllegalAccessException {
			switch (this) {
			case Small:
				return Medium;
			case Medium:
				return Large;
			default:
				throw new IllegalAccessException(this.name() + " does not have an upgrade.");
			}
		}
	}

	/**
	 * An {@code int}[] that holds how many of each item is held in this Sack.<br>
	 * The order of these numbers is assumed to be the same as the order of
	 * {@link #getItems()}
	 */
	protected final int[] held;

	/**
	 * {@link SackSize} of this.
	 */
	protected SackSize type;

	protected Sack(@Nonnull Properties properties, @Nonnull SackSize type) {
		super(properties);
		this.type = type;
		this.held = new int[this.getItems().size()];
		this.reset();
	}

	/**
	 * Empties this sack.
	 *
	 * @param player {@link PlayerEntity} to give all the items to.
	 */
	public void empty(@Nonnull PlayerEntity player) {
		final ImmutableList<Item> list = this.getItems().asList();
		for (int i = 0; i < list.size(); i++)
			player.addItemStackToInventory(new ItemStack(list.get(i), this.held[i]));
	}

	/**
	 * Allows the Sack class to access child classes held items.
	 *
	 * @return {@link ImmutableSet} of {@link Item} that this holds
	 */
	@Nonnull
	protected abstract ImmutableSet<Item> getItems();

	/**
	 * Increases the amount of a certain item held in this.
	 *
	 * @param index  which resource to increase
	 * @param amount the amount to increase by.
	 * @return the amount over the max amount of items.<br>
	 *         0 if not over.
	 * @throws ArrayIndexOutOfBoundsException if indexing from {@link #held} fails.
	 */
	public int increase(int index, int amount) throws ArrayIndexOutOfBoundsException {
		try {
			this.held[index] += amount;
		} catch (final ArrayIndexOutOfBoundsException aioobe) {
			throw aioobe;
		}
		if (this.held[index] > this.type.size) {
			final int ret = this.held[index] - this.type.size;
			this.held[index] = this.type.size;
			return ret;
		}
		return 0;
	}

	/**
	 * Set all held items in this to 0.
	 */
	public void reset() {
		Arrays.fill(this.held, 0);
	}

	/**
	 * Sell all items in this.
	 *
	 * @param player {@link ModServerPlayerEntity} that holds this.
	 */
	public void sell(@Nonnull ModServerPlayerEntity player) {
		this.reset();
	}

	/**
	 * Upgrades {@link #type}.
	 */
	public void upgrade() {
		try {
			this.type = this.type.getNext();
		} catch (final IllegalAccessException e) {
			return;
		}
	}
}