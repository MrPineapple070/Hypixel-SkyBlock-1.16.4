package net.hypixel.skyblock.items.armor.mastiff;

import java.util.List;

import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class MastiffHelmet extends ModArmorItem {
	public MastiffHelmet() {
		super(MastiffSet.instance.getMaterial(), EquipmentSlotType.HEAD, ItemProperties.c1,
				MastiffSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(MastiffSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}