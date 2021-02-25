package net.hypixel.skyblock.items.bows;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.HotPotatoBook;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.PotatoBookableItem;
import net.hypixel.skyblock.items.ReforgableItem;
import net.hypixel.skyblock.items.Reforge;
import net.hypixel.skyblock.items.UpgradableItem;
import net.hypixel.skyblock.items.reforge_stone.ReforgeStone;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * Serve as a base for {@link BowItem}.
 *
 * @author MrPineapple070
 * @version 13 August 2020
 * @since 13 August 2020
 */
public abstract class ModBowItem extends BowItem implements ReforgableItem, UpgradableItem, PotatoBookableItem {
	/**
	 * Handle Sword Reforges.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Reforging">All Reforges</a>
	 *
	 * @version 29 July 2020
	 * @since 11 June 2019
	 */
	public enum BowReforge implements Reforge {
		Awkward(new double[] { 0, 0, 0, 0, 10, 5, -5, 0 }, new double[] { 0, 0, 0, 0, 12, 10, -10, 0 },
				new double[] { 0, 0, 0, 0, 15, 15, -18, 0 }, new double[] { 0, 0, 0, 0, 20, 22, -32, 0 },
				new double[] { 0, 0, 0, 0, 25, 30, -50, 0 }),
		Deadly(new double[] { 0, 0, 0, 0, 10, 5, 0, 0 }, new double[] { 0, 0, 0, 0, 13, 10, 0, 0 },
				new double[] { 0, 0, 0, 0, 16, 18, 0, 0 }, new double[] { 0, 0, 0, 0, 19, 32, 0, 0 },
				new double[] { 0, 0, 0, 0, 22, 50, 0, 0 }),
		Fine(new double[] { 3, 0, 0, 0, 5, 2, 0, 0 }, new double[] { 7, 0, 0, 0, 7, 4, 0, 0 },
				new double[] { 12, 0, 0, 0, 9, 7, 0, 0 }, new double[] { 18, 0, 0, 0, 12, 10, 0, 0 },
				new double[] { 25, 0, 0, 0, 15, 15, 0, 0 }),
		Grand(new double[] { 25, 0, 0, 0, 0, 0, 0, 0 }, new double[] { 32, 0, 0, 0, 0, 0, 0, 0 },
				new double[] { 40, 0, 0, 0, 0, 0, 0, 0 }, new double[] { 50, 0, 0, 0, 0, 0, 0, 0 },
				new double[] { 60, 0, 0, 0, 0, 0, 0, 0 }),
		Hasty(new double[] { 3, 0, 0, 0, 20, 0, 0, 0 }, new double[] { 5, 0, 0, 0, 25, 0, 0, 0 },
				new double[] { 7, 0, 0, 0, 30, 0, 0, 0 }, new double[] { 10, 0, 0, 0, 40, 0, 0, 0 },
				new double[] { 15, 0, 0, 0, 50, 0, 0, 0 }),
		Neat(new double[] { 0, 0, 0, 0, 10, 4, 3, 0 }, new double[] { 0, 0, 0, 0, 12, 8, 8, 0 },
				new double[] { 0, 0, 0, 0, 14, 14, 10, 0 }, new double[] { 0, 0, 0, 0, 17, 20, 15, 0 },
				new double[] { 0, 0, 0, 0, 20, 30, 20, 0 }),
		/**
		 * Unique Reforge
		 */
		Precise(new double[] { 3, 0, 0, 0, 8, 5, 0, 0 }, new double[] { 7, 0, 0, 0, 9, 10, 0, 0 },
				new double[] { 12, 0, 0, 0, 10, 18, 0, 0 }, new double[] { 18, 0, 0, 0, 11, 32, 0, 0 },
				new double[] { 25, 0, 0, 0, 13, 50, 0, 0 }),
		Rapid(new double[] { 2, 0, 0, 0, 0, 35, 0, 0 }, new double[] { 3, 0, 0, 0, 0, 45, 0, 0 },
				new double[] { 4, 0, 0, 0, 0, 55, 0, 0 }, new double[] { 7, 0, 0, 0, 0, 65, 0, 0 },
				new double[] { 10, 0, 0, 0, 0, 75, 0, 0 }),
		Rich(new double[] { 2, 0, 0, 0, 10, 1, 20, 0 }, new double[] { 3, 0, 0, 0, 12, 2, 25, 0 },
				new double[] { 4, 0, 0, 0, 14, 4, 30, 0 }, new double[] { 7, 0, 0, 0, 17, 7, 40, 0 },
				new double[] { 10, 0, 0, 0, 20, 10, 50, 0 }),
		/**
		 * Unique Reforge
		 */
		Spiritual(new double[] { 4, 0, 0, 0, 7, 10, 0, 0 }, new double[] { 8, 0, 0, 0, 8, 15, 0, 0 },
				new double[] { 14, 0, 0, 0, 9, 23, 0, 0 }, new double[] { 20, 0, 0, 0, 10, 37, 0, 0 },
				new double[] { 28, 0, 0, 0, 12, 55, 0, 0 }),
		Unreal(new double[] { 3, 0, 0, 0, 8, 5, 0, 0 }, new double[] { 7, 0, 0, 0, 9, 10, 0, 0 },
				new double[] { 12, 0, 0, 0, 10, 18, 0, 0 }, new double[] { 18, 0, 0, 0, 11, 32, 0, 0 },
				new double[] { 25, 0, 0, 0, 13, 50, 0, 0 });

		/**
		 * A primative type array of {@link BowReforge} that holds all the nonunique of
		 * {@link BowReforge}.<br>
		 * The {@link BowReforge} in this are the ones returned from
		 * {@link #getRandomReforge()}
		 */
		@Nonnull
		private static final BowReforge[] nonunique;

		/**
		 * A primative type array of {@link BowReforge} that holds all the unique of
		 * {@link BowReforge}.<br>
		 * These {@link BowReforge} in this can only be applied through
		 * {@link ReforgeStone}
		 */
		@Nonnull
		private static final BowReforge[] unique;

		static {
			nonunique = new BowReforge[] { Awkward, Deadly, Fine, Grand, Hasty, Neat, Rapid, Unreal };
			unique = new BowReforge[] { Precise, Spiritual };
		}

		public static BowReforge getRandomReforge() {
			return nonunique[rand.nextInt(nonunique.length)];
		}

		/**
		 * The array for {@link ModItemRarity#Common}
		 */
		@Nonnull
		private final double[] common;

		/**
		 * The array for {@link ModItemRarity#Epic}
		 */
		@Nonnull
		private final double[] epic;

		/**
		 * The array for {@link ModItemRarity#Legendary}
		 */
		@Nonnull
		private final double[] legendary;

		/**
		 * The array for {@link ModItemRarity#Rare}
		 */
		@Nonnull
		private final double[] rare;

		/**
		 * The array for {@link ModItemRarity#Uncommon}
		 */
		@Nonnull
		private final double[] uncommon;

		private BowReforge(double[] common, double[] uncommon, double[] rare, double[] epic, double[] legendary) {
			this.common = Objects.requireNonNull(common, "Common buff array must be non-null.");
			this.uncommon = Objects.requireNonNull(uncommon, "Uncommon buff array must be non-null.");
			this.rare = Objects.requireNonNull(rare, "Rare buff array must be non-null.");
			this.epic = Objects.requireNonNull(epic, "Epic buff array must be non-null.");
			this.legendary = Objects.requireNonNull(legendary, "Legendary buff array must be non-null.");
			this.log();
		}

		@Override
		public double[] common() {
			return this.common;
		}

		@Override
		public double[] epic() {
			return this.epic;
		}

		@Override
		public double[] legendary() {
			return this.legendary;
		}

		@Override
		public Reforge[] nonunique() {
			return nonunique;
		}

		@Override
		public double[] rare() {
			return this.rare;
		}

		@Override
		public double[] uncommon() {
			return this.uncommon;
		}

		@Override
		public Reforge[] unique() {
			return unique;
		}
	}

	/**
	 * Determine if {@link #rarity} has been changed.
	 */
	protected boolean isUpgraded;

	/**
	 * The number of {@link HotPotatoBook} applied.
	 */
	@Nonnegative
	protected int numPotatoBook;

	/**
	 * {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * {@link Reforge} of this.
	 */
	@Nullable
	protected Reforge reforge = Reforge.None;

	@Nonnull
	protected ITextComponent reforge_display = new StringTextComponent("");

	protected ModBowItem(Properties builder, ModItemRarity rarity) {
		super(builder);
		this.isUpgraded = false;
		this.numPotatoBook = 0;
		this.rarity = rarity;
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);

	@Override
	public final boolean apply() {
		if (this.numPotatoBook == 10)
			return false;
		++this.numPotatoBook;
		return true;
	}

	@Override
	public final <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
		return super.damageItem(stack, 0, entity, onBroken);
	}

	@Override
	public final ITextComponent getDisplayName(ItemStack stack) {
		return ((IFormattableTextComponent)super.getDisplayName(stack)).mergeStyle(this.rarity.color);
	}

	@Override
	public final ModItemRarity getRarity() {
		return this.rarity;
	}

	@Override
	public final Reforge getReforge() {
		return this.reforge;
	}

	@Override
	public final boolean isDamageable() {
		return false;
	}

	@Override
	public final void reforge() {
		this.reforge = BowReforge.getRandomReforge();
		try {
			this.reforge_display = new StringTextComponent(
					this.reforge.getClass().getMethod("name", (Class<?>[]) null).invoke(this.reforge) + "");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			HypixelSkyBlockMod.LOGGER.error(e.getLocalizedMessage());
			for (StackTraceElement element : e.getStackTrace())
				HypixelSkyBlockMod.LOGGER.error(element.toString());
		}
	}

	@Override
	public final void setRarity(ModItemRarity rarity) {
		HypixelSkyBlockMod.LOGGER.warn("Setting rarity:\t" + rarity.getNext());
		this.rarity = rarity;
	}

	@Override
	public final void setReforge(Reforge reforge) {
		this.reforge = reforge;
	}

	@Override
	public final boolean upgrade() {
		if (this.isUpgraded)
			return false;
		this.rarity = this.rarity.getNext();
		return true;
	}
}