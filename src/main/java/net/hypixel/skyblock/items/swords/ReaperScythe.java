package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Reaper_Scythe">Reaper
 * Scythe</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class ReaperScythe extends ModSwordItem {
	private static final List<StringTextComponent> tooltip = Arrays.asList(
			new StringTextComponent(FormatingCodes.gold + "Item Ability: Desecration"),
			new StringTextComponent(FormatingCodes.gray
					+ "Within 3 seconds of killing an enemy, Desecrate their grave to spawn a zombie."),
			new StringTextComponent("Zombies lose 2% " + StatString.health + "/s"));

	public ReaperScythe() {
		super(ModSwordTier.Reaper_Scythe, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(ReaperScythe.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultPass(playerIn.getHeldItem(handIn));
	}
}