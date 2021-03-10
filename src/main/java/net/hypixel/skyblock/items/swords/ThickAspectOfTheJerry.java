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
 * The <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Thick_Aspect_of_the_Jerry">Thick
 * Aspect of the Jerry</a>.
 *
 * @author MrPineapple070
 * @version 15 August 2020
 * @since 15 August 2020
 */
public class ThickAspectOfTheJerry extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Parley").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Channel your inner Jerry."));

	public ThickAspectOfTheJerry() {
		super(ModSwordTier.Thick_AOTJ, ItemProperties.c1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(ThickAspectOfTheJerry.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}