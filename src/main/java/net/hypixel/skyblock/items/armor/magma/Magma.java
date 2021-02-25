package net.hypixel.skyblock.items.armor.magma;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_Magma">Magma
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 31 July 2020
 * @since 31 July 2020
 */
public class Magma {
	public static final int boots = 9;
	public static final int chestplate = 20;

	public static final String fsb = FormatingCodes.gold + "Full Set Bonus: Absorb\n" + FormatingCodes.gray
			+ "Every 10 Magma Cubes killed gives +1 " + FormatingCodes.red + "Health " + FormatingCodes.gray + "and +1 "
			+ FormatingCodes.aqua + "Intelligence " + FormatingCodes.gray + "Max 200 each stat.";
	public static final int helmet = 3;
	public static final int leggings = 15;
	public static final ModArmorMaterial material = ModArmorMaterial.Magma;

	public static final ModItemRarity rarity = ModItemRarity.Epic;
}
