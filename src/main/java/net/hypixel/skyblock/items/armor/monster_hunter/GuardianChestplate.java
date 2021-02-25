package net.hypixel.skyblock.items.armor.monster_hunter;

import java.util.List;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class GuardianChestplate extends ModArmorItem {

	public GuardianChestplate() {
		super(MonsterHunterSet.instance.getMaterial(), EquipmentSlotType.CHEST, ItemProperties.c1,
				MonsterHunterSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(MonsterHunterSet.instance.getDescription(this.slot));
			tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Block Damage"));
			tooltip.add(new StringTextComponent(
					FormatingCodes.gray + "If you are full Health, the first damage you take will be nullified."));
		} catch (final IllegalAccessException e) {
			HypixelSkyBlockMod.LOGGER.error(e.getMessage());
		}
	}
}