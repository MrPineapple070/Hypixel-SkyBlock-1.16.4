package net.hypixel.skyblock.items.armor;

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
import net.hypixel.skyblock.items.accessories.Accessory.AccessoryReforge;
import net.hypixel.skyblock.items.reforge_stone.ReforgeStone;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * Mod version of {@link ArmorItem}<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor">All Armor</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 11 June 2019
 */
public abstract class ModArmorItem extends ArmorItem implements ReforgableItem, PotatoBookableItem, UpgradableItem {
	/**
	 * Handle Armor Reforges.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Reforging">All Reforges</a>
	 *
	 * @version 29 July 2020
	 * @since 11 June 2019
	 */
	public enum ArmorReforge implements Reforge {
		/**
		 * Unique
		 */
		Ancient(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Clean(new double[] { 0, 5, 0, 1, 2, 0, 0, 0 }, new double[] { 0, 7, 0, 1.4, 4, 0, 0, 0 },
				new double[] { 0, 10, 0, 2, 6, 0, 0, 0 }, new double[] { 0, 15, 0, 3, 8, 0, 0, 0 },
				new double[] { 0, 20, 0, 4, 10, 0, 0, 0 }),
		/**
		 * Unique
		 */
		Cubic(new double[] { 3, 0, 0, 1, 0, 0, 0, 0 }, new double[] { 5, 0, 0, 1.4, 0, 0, 0, 0 },
				new double[] { 7, 0, 0, 2, 0, 0, 0, 0 }, new double[] { 10, 0, 0, 3, 0, 0, 0, 0 },
				new double[] { 12, 0, 0, 4, 0, 0, 0, 0 }),
		/**
		 * Unique
		 */
		Empowered(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Fierce(new double[] { 2, 0, 0, 0, 2, 4, 0, 0 }, new double[] { 4, 0, 0, 0, 3, 7, 0, 0 },
				new double[] { 6, 0, 0, 0, 4, 10, 0, 0 }, new double[] { 8, 0, 0, 0, 5, 14, 0, 0 },
				new double[] { 10, 0, 0, 0, 6, 18, 0, 0 }),
		/**
		 * Unique
		 */
		Giant(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Heavy(new double[] { 0, 25, -1, 0, 0, -1, 0, 0 }, new double[] { 0, 35, -1, 0, 0, -2, 0, 0 },
				new double[] { 0, 50, -1, 0, 0, -2, 0, 0 }, new double[] { 0, 65, -1, 0, 0, -3, 0, 0 },
				new double[] { 0, 80, -1, 0, 0, -5, 0, 0 }),
		Light(new double[] { 0, 1, 1, 1, 1, 1, 0, 1 }, new double[] { 0, 2, 2, 1.4, 1, 2, 0, 2 },
				new double[] { 0, 3, 3, 2, 2, 3, 0, 3 }, new double[] { 0, 4, 4, 3, 2, 4, 0, 4 },
				new double[] { 0, 5, 5, 4, 3, 5, 0, 5 }),
		/**
		 * This {@link ArmorReforge} can only be applied on
		 * {@link EquipmentSlotType#CHEST}.<br>
		 * Unique.
		 */
		Loving(new double[] { 0, 4, 0, .8, 0, 0, 20, 0 }, new double[] { 0, 5, 0, 1, 0, 0, 40, 0 },
				new double[] { 0, 6, 0, 1.2, 0, 0, 60, 0 }, new double[] { 0, 7, 0, 1.6, 0, 0, 80, 0 },
				new double[] { 0, 10, 0, 2, 0, 0, 100, 0 }),
		Mythic(new double[] { 2, 2, 2, .4, 1, 0, 20, 0 }, new double[] { 4, 4, 2, .8, 2, 0, 25, 0 },
				new double[] { 6, 6, 2, 1.2, 3, 0, 30, 0 }, new double[] { 8, 8, 2, 1.6, 4, 0, 40, 0 },
				new double[] { 10, 10, 2, 2, 5, 0, 50, 0 }),
		/**
		 * Unique
		 */
		Necrotic(new double[] { 0, 0, 0, 0, 0, 0, 30, 0 }, new double[] { 0, 0, 0, 0, 0, 0, 60, 0 },
				new double[] { 0, 0, 0, 0, 0, 0, 90, 0 }, new double[] { 0, 0, 0, 0, 0, 0, 120, 0 },
				new double[] { 0, 0, 0, 0, 0, 0, 150, 0 }),
		/**
		 * Unique
		 */
		Perfect(new double[] { 0, 25, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 35, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 50, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 65, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 80, 0, 0, 0, 0, 0, 0 }),
		Pure(new double[] { 2, 2, 1, .4, 2, 2, 2, 1 }, new double[] { 3, 3, 1, .6, 4, 3, 3, 1 },
				new double[] { 4, 4, 1, .8, 6, 4, 4, 2 }, new double[] { 6, 6, 1, 1.2, 8, 5, 6, 3 },
				new double[] { 8, 8, 1, 1.6, 10, 8, 8, 4 }),
		/**
		 * Unique
		 */
		Reinforced(new double[] { 0, 25, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 35, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 50, 0, 0, 0, 0, 0, 0 }, new double[] { 0, 65, 0, 0, 0, 0, 0, 0 },
				new double[] { 0, 80, 0, 0, 0, 0, 0, 0 }),
		/**
		 * Unique
		 */
		Renowned(new double[] {}, new double[] {}, new double[] {}, new double[] {},
				new double[] { 8, 8, 1, 1.6, 10, 10, 10, 4 }),
		/**
		 * This {@link ArmorReforge} can only be applied on
		 * {@link EquipmentSlotType#HEAD}.<br>
		 * Unique.
		 */
		Ridiculous(new double[] { 0, 10, 0, 2, 1, 0, 0, 0 }, new double[] { 0, 15, 0, 3, 2, 0, 0, 0 },
				new double[] { 0, 20, 0, 4, 3, 0, 0, 0 }, new double[] { 0, 25, 0, 5, 4, 0, 0, 0 },
				new double[] { 0, 35, 0, 7, 5, 0, 0, 0 }),
		Silky(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Smart(new double[] { 0, 4, 0, .8, 0, 0, 20, 0 }, new double[] { 0, 6, 0, 1.2, 0, 0, 40, 0 },
				new double[] { 0, 9, 0, 1.8, 0, 0, 60, 0 }, new double[] { 0, 12, 0, 2.4, 0, 0, 80, 0 },
				new double[] { 0, 15, 0, 3, 0, 0, 100, 0 }),
		/**
		 * Unique
		 */
		Spiked(new double[] {}, new double[] {}, new double[] {}, new double[] { 8, 6, 1, 1.2, 8, 8, 8, 3 },
				new double[] { 8, 8, 1, 1.6, 10, 10, 10, 4 }),
		Strong(AccessoryReforge.Strong.common(), AccessoryReforge.Strong.uncommon(), AccessoryReforge.Strong.rare(),
				AccessoryReforge.Strong.epic(), AccessoryReforge.Strong.legendary()),
		/**
		 * Unique
		 */
		Submerged(new double[0], new double[0], new double[0], new double[0], new double[0]),
		Superior(AccessoryReforge.Superior.common(), AccessoryReforge.Superior.uncommon(),
				AccessoryReforge.Superior.rare(), AccessoryReforge.Superior.epic(),
				AccessoryReforge.Superior.legendary()),
		Titanic(new double[] { 0, 10, 0, 2, 0, 0, 0, 0 }, new double[] { 0, 15, 0, 3, 0, 0, 0, 0 },
				new double[] { 0, 20, 0, 4, 0, 0, 0, 0 }, new double[] { 0, 25, 0, 5, 0, 0, 0, 0 },
				new double[] { 0, 35, 0, 7, 0, 0, 0, 0 }),
		/**
		 * Unique
		 */
		Undead(new double[0], new double[0], new double[0], new double[0], new double[0]),
		/**
		 * Unique
		 */
		Warped(new double[] { 2, 0, 1, 0, 0, 0, 0, 2 }, new double[] { 4, 0, 1, 0, 0, 0, 0, 3 },
				new double[] { 6, 0, 2, 0, 0, 0, 0, 4 }, new double[] { 7, 0, 2, 0, 0, 0, 0, 5 },
				new double[] { 10, 0, 3, 0, 0, 0, 0, 6 }),
		Wise(new double[] { 0, 0, 1, 1.2, 0, 0, 25, 0 }, new double[] { 0, 0, 1, 1.6, 0, 0, 50, 0 },
				new double[] { 0, 0, 1, 2, 0, 0, 75, 0 }, new double[] { 0, 0, 2, 2.4, 0, 0, 100, 0 },
				new double[] { 0, 0, 2, 3, 0, 0, 125, 0 });

		/**
		 * A primative type array of {@link AccessoryReforge} that holds all the
		 * nonunique of {@link AccessoryReforge}.<br>
		 * The {@link AccessoryReforge} in this are the ones returned from
		 * {@link #getRandomReforge()}
		 */
		@Nonnull
		private static final ArmorReforge[] nonunique;

		/**
		 * A primative type array of {@link AccessoryReforge} that holds all the unique
		 * of {@link AccessoryReforge}.<br>
		 * These {@link AccessoryReforge} in this can only be applied through
		 * {@link ReforgeStone}
		 */
		@Nonnull
		private static final ArmorReforge[] unique;

		static {
			nonunique = new ArmorReforge[] { Clean, Fierce, Heavy, Light, Mythic, Pure, Smart, Titanic, Wise };
			unique = new ArmorReforge[] { Cubic, Loving, Necrotic, Perfect, Reinforced, Renowned, Ridiculous, Spiked,
					Warped };
		}

		public static ArmorReforge getRandomReforge() {
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

		private ArmorReforge(double[] common, double[] uncommon, double[] rare, double[] epic, double[] legendary) {
			this.common = Objects.requireNonNull(common, "Common buff array must be non-null.");
			this.uncommon = Objects.requireNonNull(uncommon, "Uncommon buff array must be non-null.");
			this.rare = Objects.requireNonNull(rare, "Rare buff array must be non-null.");
			this.epic = Objects.requireNonNull(epic, "Epic buff array must be non-null.");
			this.legendary = Objects.requireNonNull(legendary, "Legendary buff array must be non-null.");
			this.log();
		}

		@Override
		public strictfp double[] common() {
			return this.common;
		}

		@Override
		public strictfp double[] epic() {
			return this.epic;
		}

		@Override
		public strictfp double[] legendary() {
			return this.legendary;
		}

		@Override
		public Reforge[] nonunique() {
			return nonunique;
		}

		@Override
		public strictfp double[] rare() {
			return this.rare;
		}

		@Override
		public strictfp double[] uncommon() {
			return this.uncommon;
		}

		@Override
		public Reforge[] unique() {
			return unique;
		}
	}

	/**
	 * Determine if {@link #rarity} has been upgraded.
	 */
	protected boolean isUpgraded;

	/**
	 * The number of applied {@link HotPotatoBook}
	 */
	@Nonnegative
	protected int numPotatoBooks;

	/**
	 * The {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * The current {@link ArmorReforge}
	 */
	@Nullable
	protected Reforge reforge = Reforge.None;

	protected ITextComponent reforge_display = new StringTextComponent("");

	/**
	 * Construct this.
	 *
	 * @param materialIn {@link ModArmorMaterial} of this.
	 * @param slot       {@link EquipmentSlotType} of this.
	 * @param builder    {@link Properties} of this.
	 * @param rarity     {@link ModItemRarity} of this.
	 */
	protected ModArmorItem(ModArmorMaterial materialIn, EquipmentSlotType slot, Properties builder,
			ModItemRarity rarity) {
		super(materialIn, slot, builder);
		this.rarity = Objects.requireNonNull(rarity, "Armor must have a rarity.");
		this.isUpgraded = false;
		this.numPotatoBooks = 0;
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);

	@Override
	public boolean apply() {
		if (this.numPotatoBooks == 10)
			return false;
		++this.numPotatoBooks;
		return true;
	}

	@Override
	public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
		return super.damageItem(stack, 0, entity, onBroken);
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		IFormattableTextComponent rd = this.reforge_display.deepCopy();
		ITextComponent dp = super.getDisplayName(stack).deepCopy();
		if (this.material == ModArmorMaterial.Wise_Dragon && this.reforge == ArmorReforge.Wise)
			rd = new StringTextComponent("Very");
		else if (this.material == ModArmorMaterial.Strong_Dragon && this.reforge == ArmorReforge.Strong)
			rd = new StringTextComponent("Very");
		else if (this.material == ModArmorMaterial.Superior_Dragon && this.reforge == ArmorReforge.Superior)
			rd = new StringTextComponent("Highly");
		else if (this.material == ModArmorMaterial.Heavy) {
			if (this.reforge == ArmorReforge.Heavy)
				rd = new StringTextComponent("Extremly");
			else if (this.reforge == ArmorReforge.Light)
				rd = new StringTextComponent("Not So");
		} else if (ModArmorMaterial.isPerfect(this.material) && this.reforge == ArmorReforge.Perfect)
			rd = new StringTextComponent("Absolutely");
		return (rd.append(dp)).mergeStyle(this.rarity.color);
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
	public boolean isDamageable() {
		return false;
	}

	public void log() {
		HypixelSkyBlockMod.LOGGER.info(this.getClass().getSimpleName());
		HypixelSkyBlockMod.LOGGER.info("numPotatoBooks:\t" + this.numPotatoBooks);
		HypixelSkyBlockMod.LOGGER.info("rarity:\t\t" + this.rarity.toString());
		HypixelSkyBlockMod.LOGGER.info("reforge:\t" + this.reforge.toString());
		HypixelSkyBlockMod.LOGGER.info("isUpgraded:\t" + this.isUpgraded);
	}

	@Override
	public void reforge() {
		this.reforge = ArmorReforge.getRandomReforge();
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
	public void setRarity(ModItemRarity rarity) {
		HypixelSkyBlockMod.LOGGER.warn("setRarity() method called.");
		this.rarity = Objects.requireNonNull(rarity, "New ModItemRarity cannot be null.");
	}

	@Override
	public void setReforge(Reforge reforge) {
		this.reforge = reforge;
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
	public boolean upgrade() {
		if (this.isUpgraded)
			return false;
		try {
			this.rarity = this.rarity.getNext();
			this.isUpgraded = true;
			return true;
		} catch (final IllegalStateException ise) {
			HypixelSkyBlockMod.LOGGER.error(ise.getMessage());
			return false;
		}
	}
}