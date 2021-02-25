package net.hypixel.skyblock.items.swords;

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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Ink_Wand">Ink Wand</a>.
 *
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 11 June 2019
 */
public class InkWand extends ModSwordItem {
	public InkWand() {
		super(ModSwordTier.Ink_Wand, ItemProperties.fi1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Ink Bomb"));
		tooltip.add(new StringTextComponent(
				FormatingCodes.gray + "Shoot an ink bomb in front of you dealing 10000 damage and giving Blindless."));
	}

	@OnlyIn(Dist.DEDICATED_SERVER)
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.getCooldownTracker().setCooldown(this, 600);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}