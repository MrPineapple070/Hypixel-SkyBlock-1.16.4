package net.hypixel.skyblock.items.tools;

import java.util.Objects;
import java.util.Set;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.Reforge;
import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ToolItem;

/**
 * Mod version of {@link ToolItem}
 * 
 * @author MrPineapple070
 * @version 03 December 2020
 * @since 11 July 2019
 */
public class ModToolItem extends ToolItem {
	public static enum ToolReforge implements Reforge {
		Moil(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Magnetic(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Refined(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Toil(new double[0], new double[0], new double[0], new double[0], new double[0]);

		private static final Reforge[] unique = new Reforge[] { Magnetic };

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

		private ToolReforge(double[] common, double[] uncommon, double[] rare, double[] epic, double[] legendary) {
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
			return new Reforge[0];
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

	public ModToolItem(IItemTier tier, Set<Block> effectiveBlocksIn, Properties builderIn) {
		super(0, Float.POSITIVE_INFINITY, tier, effectiveBlocksIn, builderIn);
	}

}