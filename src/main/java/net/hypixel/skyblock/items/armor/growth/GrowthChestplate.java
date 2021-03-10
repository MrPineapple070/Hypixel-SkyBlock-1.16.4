package net.hypixel.skyblock.items.armor.growth;

import java.util.List;

import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Armor_of_Growth#Chestplate">GrowthSet
 * Chestplate</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GrowthChestplate extends ModArmorItem {
	public GrowthChestplate() {
		super(GrowthSet.instance.getMaterial(), EquipmentSlotType.CHEST, ItemProperties.fg1, GrowthSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(GrowthSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException iae) {
		}
	}
}
