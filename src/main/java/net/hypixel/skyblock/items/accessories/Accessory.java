package net.hypixel.skyblock.items.accessories;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.ReforgableItem;
import net.hypixel.skyblock.items.Reforge;
import net.hypixel.skyblock.items.UpgradableItem;
import net.hypixel.skyblock.items.reforge_stone.ReforgeStone;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * A Generic Accessory. <br>
 * These {@link Item} will give the player certain effects while in its
 * inventory.
 *
 * @author MrPineapple070
 * @version 18 May 2020
 * @since 21 June 2019
 */
public abstract class Accessory extends Item implements ReforgableItem, UpgradableItem {
	/**
	 * Handle Accessory Reforges.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Reforging">All Reforges</a>
	 *
	 * @version 26 July 2020
	 */
	public enum AccessoryReforge implements Reforge {
		Bizarre(new double[] { 1, 0, 0, .4, 0, -1, 6, 0 }, new double[] { 2, 0, 0, .4, 0, -2, 8, 0 },
				new double[] { 2, 0, 0, .4, 0, -2, 10, 0 }, new double[] { 3, 0, 0, .4, 0, -3, 14, 0 },
				new double[] { 5, 0, 0, .4, 0, -5, 20, 0 }),
		Blessed(new double[0], new double[0], new double[0], new double[0], new double[0]),
		/**
		 * Unique
		 */
		Bloody(new double[] { 1, 0, 1, 0, 0, 3, 0, 1 }, new double[] { 1, 0, 1, 0, 0, 4, 0, 1 },
				new double[] { 1, 0, 1, 0, 0, 5, 0, 1 }, new double[] { 2, 0, 1, 0, 0, 6, 0, 2 },
				new double[] { 3, 0, 1, 0, 0, 9, 0, 2 }),
		Candied(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Demonic(new double[] { 1, 0, 0, 0, 0, 0, 5, 0 }, new double[] { 2, 0, 0, 0, 0, 0, 7, 0 },
				new double[] { 2, 0, 0, 0, 0, 0, 9, 0 }, new double[] { 3, 0, 0, 0, 0, 0, 12, 0 },
				new double[] { 5, 0, 0, 0, 0, 0, 15, 0 }),
		Forceful(new double[] { 4, 0, 0, 0, 0, 0, 0, 0 }, new double[] { 5, 0, 0, 0, 0, 0, 0, 0 },
				new double[] { 7, 0, 0, 0, 0, 0, 0, 0 }, new double[] { 10, 0, 0, 0, 0, 0, 0, 0 },
				new double[] { 15, 0, 0, 0, 0, 0, 0, 0 }),
		Godly(new double[] { 1, 0, 0, 0, 0, 2, 1, 0 }, new double[] { 2, 0, 0, 0, 0, 2, 1, 0 },
				new double[] { 3, 0, 0, 0, 0, 3, 1, 0 }, new double[] { 5, 0, 0, 0, 0, 4, 2, 0 },
				new double[] { 7, 0, 0, 0, 0, 6, 4, 0 }),
		Hurtful(new double[] { 0, 0, 0, 0, 0, 4, 0, 0 }, new double[] { 0, 0, 0, 0, 0, 5, 0, 0 },
				new double[] { 0, 0, 0, 0, 0, 7, 0, 0 }, new double[] { 0, 0, 0, 0, 0, 10, 0, 0 },
				new double[] { 0, 0, 0, 0, 0, 15, 0, 0 }),
		Itchy(new double[] { 1, 0, 0, 0, 0, 3, 0, 0 }, new double[] { 1, 0, 0, 0, 0, 4, 0, 0 },
				new double[] { 1, 0, 0, 0, 0, 5, 0, 1 }, new double[] { 2, 0, 0, 0, 0, 7, 0, 1 },
				new double[] { 3, 0, 0, 0, 0, 10, 0, 1 }),
		Keen(new double[] { 0, 1, 0, 0.2, 0, 0, 1, 0 }, new double[] { 0, 2, 0, 0.4, 0, 0, 1, 0 },
				new double[] { 0, 3, 0, 0.6, 0, 0, 2, 0 }, new double[] { 0, 4, 0, 0.8, 0, 0, 3, 0 },
				new double[] { 0, 5, 0, 1, 0, 0, 5, 0 }),
		Ominous(new double[] { 1, 1, 0, 0.4, 0, 1, 0, 0 }, new double[] { 1, 1, 0, 0.4, 0, 1, 1, 0 },
				new double[] { 1, 1, 0, 0.4, 0, 1, 2, 0 }, new double[] { 2, 2, 0, 0.6, 0, 1, 3, 0 },
				new double[] { 3, 3, 0, 0.8, 0, 1, 4, 0 }),
		Pleasant(new double[] { 0, 4, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 5, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 7, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 10, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 15, 0, 0, 0, 0, 0, 0 }),
		Pretty(new double[] { 0, 0, 0, 0.2, 0, 0, 3, 0 }, new double[] { 0, 0, 0, 0.2, 0, 0, 4, 0 },
				new double[] { 0, 0, 0, 0.4, 0, 0, 6, 1 }, new double[] { 0, 0, 1, 0.4, 0, 0, 9, 1 },
				new double[] { 0, 0, 1, 0.6, 0, 0, 13, 1 }),
		/**
		 * Unique
		 */
		Shaded(new double[] { 2, 0, 0, 0, 0, 3, 0, 0 }, new double[] { 3, 0, 0, 0, 0, 4, 0, 0 },
				new double[] { 4, 0, 0, 0, 0, 5, 0, 0 }, new double[] { 5, 0, 0, 0, 0, 6, 0, 0 },
				new double[] { 6, 0, 0, 0, 1, 9, 0, 0 }),
		Shiny(new double[] { 0, 0, 0, 0.8, 0, 0, 1, 0 }, new double[] { 0, 0, 0, 1, 0, 0, 2, 0 },
				new double[] { 0, 0, 0, 1.4, 0, 0, 2, 0 }, new double[] { 0, 0, 0, 2, 0, 0, 3, 0 },
				new double[] { 0, 0, 0, 3, 0, 0, 5, 0 }),
		/**
		 * Unique
		 */
		Silky(new double[] { 0, 0, 0, 0, 0, 5, 0, 0 }, new double[] { 0, 0, 0, 0, 0, 6, 0, 0 },
				new double[] { 0, 0, 0, 0, 0, 8, 0, 0 }, new double[] { 0, 0, 0, 0, 0, 10, 0, 0 },
				new double[] { 0, 0, 0, 0, 0, 15, 0, 0 }),
		Simple(new double[] { 1, 1, 1, 0.2, 0, 1, 1, 0 }, new double[] { 1, 1, 1, 0.2, 0, 1, 1, 0 },
				new double[] { 1, 1, 1, 0.2, 0, 1, 1, 0 }, new double[] { 1, 1, 1, 0.2, 0, 1, 1, 0 },
				new double[] { 1, 1, 1, 0.2, 0, 1, 1, 0 }),
		Strange(new double[] { 2, 0, 1, 0, 0, 1, 1, -1 }, new double[] { 1, 3, 0, 0, 0, 2, -1, 2 },
				new double[] { -1, 2, 1, 0, 0, 0, 2, 0 }, new double[] { 3, -1, 0, 0, 0, 1, 0, 4 },
				new double[] { 0, 1, 3, 0, 0, 7, 8, 0 }),
		Strong(new double[] { 1, 0, 0, 0, 0, 1, 0, 0 }, new double[] { 2, 0, 0, 0, 0, 2, 0, 0 },
				new double[] { 3, 1, 0, 0, 0, 3, 0, 0 }, new double[] { 5, 2, 0, 0, 0, 5, 0, 0 },
				new double[] { 8, 3, 0, 0, 0, 8, 0, 0 }),
		Superior(new double[] { 2, 0, 0, 0, 0, 2, 0, 0 }, new double[] { 3, 0, 0, 0, 0, 2, 0, 0 },
				new double[] { 4, 0, 0, 0, 0, 2, 0, 0 }, new double[] { 5, 0, 0, 0, 0, 3, 0, 0 },
				new double[] { 7, 0, 0, 0, 0, 3, 0, 0 }),
		Sweet(new double[0], new double[0], new double[0], new double[0], new double[0]),

		Unpleasant(new double[] { 0, 0, 0, 0, 1, 0, 0, 0 }, new double[] { 0, 0, 0, 0, 1, 0, 0, 0 },
				new double[] { 0, 0, 0, 0, 1, 0, 0, 0 }, new double[] { 0, 0, 0, 0, 2, 0, 0, 0 },
				new double[] { 0, 0, 0, 0, 2, 0, 0, 0 }),
		Vivid(new double[] { 0, 0, 1, 0.2, 0, 0, 0, 0 }, new double[] { 0, 0, 2, 0.4, 0, 0, 0, 0 },
				new double[] { 0, 0, 3, 0.6, 0, 0, 0, 0 }, new double[] { 0, 0, 4, 0.8, 0, 0, 0, 0 },
				new double[] { 0, 0, 5, 1, 0, 0, 0, 0 }),

		Zealous(new double[] { 1, 0, 0, 0, 0, 1, 1, 0 }, new double[] { 2, 0, 0, 0, 0, 2, 2, 0 },
				new double[] { 2, 0, 1, 0, 0, 2, 2, 0 }, new double[] { 3, 0, 1, 0, 0, 3, 3, 0 },
				new double[] { 5, 0, 1, 0, 0, 5, 5, 0 });

		/**
		 * A primative type array of {@link AccessoryReforge} that holds all the
		 * nonunique of {@link AccessoryReforge}.<br>
		 * The {@link AccessoryReforge} in this are the ones returned from
		 * {@link #getRandomReforge()}
		 */
		@Nonnull
		private static final AccessoryReforge[] nonunique;

		/**
		 * A primative type array of {@link AccessoryReforge} that holds all the unique
		 * of {@link AccessoryReforge}.<br>
		 * These {@link AccessoryReforge} in this can only be applied through
		 * {@link ReforgeStone}
		 */
		@Nonnull
		private static final AccessoryReforge[] unique;

		static {
			nonunique = new AccessoryReforge[] { Bizarre, Demonic, Forceful, Godly, Hurtful, Itchy, Keen, Ominous,
					Pleasant, Pretty, Shiny, Simple, Strange, Strong, Superior, Unpleasant, Vivid };
			unique = new AccessoryReforge[] { Bloody, Shaded, Silky };
		}

		/**
		 * @return a random {@link AccessoryReforge}
		 */
		@Nonnull
		public static AccessoryReforge getRandomReforge() {
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

		/**
		 * Construct a new Reforge. Each array must have a length of 8.
		 *
		 * @param common    the array for {@link ModItemRarity#Common}
		 * @param uncommon  the array for {@link ModItemRarity#Uncommon}
		 * @param rare      the array for {@link ModItemRarity#Rare}
		 * @param epic      the array for {@link ModItemRarity#Epic}
		 * @param legendary the array for {@link ModItemRarity#Legendary}
		 */
		private AccessoryReforge(double[] common, double[] uncommon, double[] rare, double[] epic, double[] legendary) {
			this.common = Objects.requireNonNull(common, "Common array must be non-null.");
			this.uncommon = Objects.requireNonNull(uncommon, "Uncommon array must be non-null.");
			this.rare = Objects.requireNonNull(rare, "Rare array must be non-null.");
			this.epic = Objects.requireNonNull(epic, "Epic array must be non-null.");
			this.legendary = Objects.requireNonNull(legendary, "Legendary array must be non-null.");
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
	 * The {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * The current {@link AccessoryReforge}
	 */
	@Nullable
	protected Reforge reforge = Reforge.None;

	/**
	 * Determine if this is upgraded.
	 */
	protected boolean upgraded;

	protected Accessory(Properties properties, ModItemRarity rarity) {
		super(properties);
		this.rarity = Objects.requireNonNull(rarity, "Accessory rarity must be non-null");
		this.upgraded = false;
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
		return false;
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 0;
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return ((IFormattableTextComponent) super.getDisplayName(stack)).mergeStyle(this.rarity.color);
	}

	@Override
	public ModItemRarity getRarity() {
		return this.rarity;
	}

	@Override
	public Reforge getReforge() {
		return this.reforge;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isDamageable() {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	public void log() {
		HypixelSkyBlockMod.LOGGER.info(this.getClass().getSimpleName());
		HypixelSkyBlockMod.LOGGER.info("Rarity:\t" + this.rarity.toString());
		HypixelSkyBlockMod.LOGGER.info("Reforge:\t" + this.reforge.toString());
		if (this.reforge != null)
			this.reforge.log();
		HypixelSkyBlockMod.LOGGER.info("Upgraded:\t" + this.upgraded);
	}

	@Override
	public void reforge() {
		this.reforge = AccessoryReforge.getRandomReforge();
	}

	@Override
	public void setRarity(ModItemRarity rarity) {
		this.rarity = Objects.requireNonNull(rarity, "New ModItemRarity cannot be null");
	}

	@Override
	public void setReforge(Reforge reforge) {
		this.reforge = reforge;
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return false;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [rarity=" + this.rarity + ", reforge=" + this.reforge + ", upgraded="
				+ this.upgraded + "]";
	}

	/**
	 * Upgrade {@link #rarity}. Each {@code Accessory} can only be upgraded once.
	 *
	 * @return {@code true} if upgrade successful.<br>
	 *         {@code false} if upgrade unsuccessful.
	 */
	@Override
	public boolean upgrade() {
		if (this.upgraded)
			return false;
		try {
			this.rarity = this.rarity.getNext();
			this.upgraded = true;
			return true;
		} catch (final IllegalStateException ise) {
			return false;
		}
	}
}