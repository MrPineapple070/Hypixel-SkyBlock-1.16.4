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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Frozen_Scythe">Frozen
 * Scythe</a>.
 *
 * @author MrPineapple070
 * @version 30 July 2020
 * @since 18 December 2019
 */
public class FrozenScythe extends ModSwordItem {
	public static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Ice Bold").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Shoots 1 Ice Bold that deals 1000 damage and slows enimies hit for 5 seconds."));

	public FrozenScythe() {
		super(ModSwordTier.Frozen_Scythe, ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(FrozenScythe.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}