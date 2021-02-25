package net.hypixel.skyblock.items.armor;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.inventory.EquipmentSlotType;

/**
 * Serve as a basis for all Dungeon Armor<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor">All Armor</a>
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 07 July 2020
 */
public abstract class DungeonArmorItem extends ModArmorItem {
	public DungeonArmorItem(ModArmorMaterial materialIn, EquipmentSlotType slot, ModItemRarity rarity) {
		super(materialIn, slot, ItemProperties.d1, rarity);
	}
}
