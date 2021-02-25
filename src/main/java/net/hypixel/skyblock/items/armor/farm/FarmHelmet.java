package net.hypixel.skyblock.items.armor.farm;

import java.util.List;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class FarmHelmet extends ModArmorItem {
	public FarmHelmet() {
		super(FarmSet.instance.getMaterial(), EquipmentSlotType.HEAD, ItemProperties.f1, FarmSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(FarmSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			HypixelSkyBlockMod.LOGGER.error(e.getMessage());
		}
	}
}