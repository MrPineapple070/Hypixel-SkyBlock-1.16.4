package net.hypixel.skyblock.items.armor.pack;

import java.util.List;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class PackLeggings extends ModArmorItem {
	public PackLeggings() {
		super(PackSet.instance.getMaterial(), EquipmentSlotType.LEGS, ItemProperties.c1, PackSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(PackSet.instance.getDescription(this.getEquipmentSlot()));
		} catch (IllegalAccessException e) {
			HypixelSkyBlockMod.LOGGER.info(e.getLocalizedMessage());
		}
	}
}