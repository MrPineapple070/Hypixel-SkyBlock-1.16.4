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
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Silk-Edge_Sword">Silk-Edge
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 02 August 2019
 */
public class SilkEdgeSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			item_ability.deepCopy().append(new TranslationTextComponent("sword.silk")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("sword.silk.0", StatString.ability_damage),
			new TranslationTextComponent("sword.silk.1"));

	public SilkEdgeSword() {
		super(ModSwordTier.Silk_Edge_Sword, ItemProperties.c1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(SilkEdgeSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}