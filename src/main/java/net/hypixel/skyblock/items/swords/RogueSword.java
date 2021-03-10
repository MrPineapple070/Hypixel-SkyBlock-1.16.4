package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Rogue_Sword">Rogue
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 July 2019
 */
public class RogueSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Speed Boost").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Increases your movement Speed by +20% for 30 seconds."),
			new StringTextComponent("Only gives +10 if already active."));

	public RogueSword() {
		super(ModSwordTier.Rogue_Sword, ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(RogueSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}