package net.hypixel.skyblock.items.armor.hardened_diamond;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Hardened_Diamond_Armor">Hardened
 * Diamond Armor</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 29 July 2020
 */
public class HardenedDiamondSet extends ModArmorItem {
	/**
	 * Construct this
	 *
	 * @param slot {@link EquipmentSlotType}
	 */
	public HardenedDiamondSet(EquipmentSlotType slot) {
		super(ModArmorMaterial.Hardened_Diamond, slot, ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	}
}
