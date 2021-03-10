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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Yeti_Sword">Yeti
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 18 December 2019
 */
public class YetiSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Terrain Toss").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Throws a chunk of terrain in the direction you are facing."),
			new StringTextComponent("Deals up to 4000 damage."),
			new StringTextComponent("Maximum range of 32 blocks."));

	public YetiSword() {
		super(ModSwordTier.Yeti_Sowrd, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(YetiSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}