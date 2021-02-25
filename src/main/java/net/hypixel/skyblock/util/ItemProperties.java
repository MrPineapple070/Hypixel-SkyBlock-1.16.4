package net.hypixel.skyblock.util;

import net.hypixel.skyblock.items.itemgroup.CombatGroup;
import net.hypixel.skyblock.items.itemgroup.DungeonGroup;
import net.hypixel.skyblock.items.itemgroup.FarmingGroup;
import net.hypixel.skyblock.items.itemgroup.FishingGroup;
import net.hypixel.skyblock.items.itemgroup.ForagingGroup;
import net.hypixel.skyblock.items.itemgroup.MiningGroup;
import net.hypixel.skyblock.items.itemgroup.MinionGroup;
import net.hypixel.skyblock.items.itemgroup.MiscellaneousGroup;
import net.minecraft.item.Item.Properties;

/**
 * This class holds {@link Properties} for this Mod.
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
public class ItemProperties {
	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link CombatGroup} 1 max stack size.
	 */
	public static final Properties c1 = new Properties().maxStackSize(0x01).group(CombatGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link CombatGroup} 64 max stack size.
	 */
	public static final Properties c64 = new Properties().maxStackSize(0x40).group(CombatGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link DungeonGroup} 64 max stack size.
	 */
	public static final Properties d1 = new Properties().maxStackSize(0x01).group(DungeonGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link DungeonGroup} 64 max stack size.
	 */
	public static final Properties d64 = new Properties().maxStackSize(0x40).group(DungeonGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link FarmingGroup} 1 max stack size.
	 */
	public static final Properties f1 = new Properties().maxStackSize(0x01).group(FarmingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link FarmingGroup} 64 max stack size.
	 */
	public static final Properties f64 = new Properties().maxStackSize(0x40).group(FarmingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link ForagingGroup} 1 max stack size.
	 */
	public static final Properties fg1 = new Properties().maxStackSize(0x01).group(ForagingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link ForagingGroup} 64 max stack size.
	 */
	public static final Properties fg64 = new Properties().maxStackSize(0x40).group(ForagingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link FishingGroup} 1 max stack size.
	 */
	public static final Properties fi1 = new Properties().maxStackSize(0x01).group(FishingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link FishingGroup} 64 max stack size.
	 */
	public static final Properties fi64 = new Properties().maxStackSize(0x40).group(FishingGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MiningGroup} 1 max stack size.
	 */
	public static final Properties m1 = new Properties().maxStackSize(0x01).group(MiningGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MiningGroup} 64 max stack size.
	 */
	public static final Properties m64 = new Properties().maxStackSize(0x40).group(MiningGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MiningGroup} 64 max stack size.
	 */
	public static final Properties mn1 = new Properties().maxStackSize(0x01).group(MinionGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MinionGroup} 64 max stack size.
	 */
	public static final Properties mn64 = new Properties().maxStackSize(0x40).group(MinionGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MiscellaneousGroup} 1 max stack size.
	 */
	public static final Properties ms1 = new Properties().maxStackSize(0x01).group(MiscellaneousGroup.instance);

	/**
	 * {@code Properties} for the {@code Item}<br>
	 * {@link MiscellaneousGroup} 64 max stack size.
	 */
	public static final Properties ms64 = new Properties().maxStackSize(0x40).group(MiscellaneousGroup.instance);
}