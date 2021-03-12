package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/End_Stone_Sword">End Stone
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class EndStoneSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(item_ability.deepCopy()
			.append(new TranslationTextComponent("sword.end_stone")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("sword.end_stone.0", StatString.intelligence));

	public EndStoneSword() {
		super(ModSwordTier.End_Stone_Sword, ItemProperties.m1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(EndStoneSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}