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

public class SkeletonHelmet extends ModArmorItem {
	public SkeletonHelmet() {
		super(MonsterHunterSet.instance.getMaterial(), EquipmentSlotType.HEAD, ItemProperties.c1,
				MonsterHunterSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		try {
			tooltip.addAll(MonsterHunterSet.instance.getDescription(this.slot));
			tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Bone Shield"));
			tooltip.add(new StringTextComponent(FormatingCodes.gray
					+ "A Bone Shield surrounds you, nullifying damage you take but consuming a bone in the process."));
			tooltip.add(new StringTextComponent("Bones regenerate every 30 seconds."));
			tooltip.add(new StringTextComponent("Does not work on bosses."));
		} catch (final IllegalAccessException e) {
			HypixelSkyBlockMod.LOGGER.error(e.getMessage());
		}
	}
}