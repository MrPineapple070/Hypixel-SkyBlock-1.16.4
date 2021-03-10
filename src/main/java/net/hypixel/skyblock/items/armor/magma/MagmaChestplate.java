package net.hypixel.skyblock.items.armor.magma;

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
 * "https://hypixel-skyblock.fandom.com/wiki/Armor_of_Magma#Chestplate">MagmaSet
 * Chestplate</a>
 *
 * @author MrPineapple070
 * @version 31 July 2020
 * @since 31 July 2020
 */
public class MagmaChestplate extends ModArmorItem {

	public MagmaChestplate() {
		super(MagmaSet.instance.getMaterial(), EquipmentSlotType.CHEST, ItemProperties.c1, MagmaSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(MagmaSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException e) {
		}
	}
}