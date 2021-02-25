package net.hypixel.skyblock.items.bows;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * @author MrPineapple070
 * @version 24 October 2020
 * @since 24 October 2020
 */
public class EnderBow extends ModBowItem {
	public EnderBow() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Ender Warp"));
		tooltip.add(new StringTextComponent(FormatingCodes.reset + "Shoots an Ender Pearl."));
		tooltip.add(new StringTextComponent(FormatingCodes.reset
				+ "Upon landing, you deal damage to all Monsters in an 8 block radius for 10% of their "
				+ StatString.health + "."));
	}
}