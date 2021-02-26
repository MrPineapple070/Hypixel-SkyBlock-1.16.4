package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_Jerry">Aspect
 * of the Jerry</a>
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class AspectOfTheJerry extends ModSwordItem {
	private static final List<StringTextComponent> tooltip = Arrays.asList(
			new StringTextComponent(FormatingCodes.gold + "Item Ability: Parley"),
			new StringTextComponent(FormatingCodes.gray + "Channel your inner Jerry."));

	public AspectOfTheJerry() {
		super(ModSwordTier.AOTJ, ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(AspectOfTheJerry.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.getCooldownTracker().setCooldown(this, 100);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}