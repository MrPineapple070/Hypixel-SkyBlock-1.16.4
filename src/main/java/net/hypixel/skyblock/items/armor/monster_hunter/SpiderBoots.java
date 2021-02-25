package net.hypixel.skyblock.items.armor.monster_hunter;

import java.util.List;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpiderBoots extends ModArmorItem {
	public SpiderBoots(ModArmorMaterial materialIn, EquipmentSlotType slot, Properties builder, ModItemRarity rarity) {
		super(MonsterHunterSet.instance.getMaterial(), EquipmentSlotType.FEET, ItemProperties.c1,
				MonsterHunterSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(MonsterHunterSet.instance.getDescription(this.slot));
			tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Double Jump"));
			tooltip.add(new StringTextComponent(FormatingCodes.gray + "Allows you to double jump!"));
		} catch (final IllegalAccessException e) {
			HypixelSkyBlockMod.LOGGER.error(e.getMessage());
		}
	}
}