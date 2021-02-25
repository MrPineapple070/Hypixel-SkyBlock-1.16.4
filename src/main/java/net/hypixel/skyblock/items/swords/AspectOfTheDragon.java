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

/**
 * The <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_Dragons">Aspect of
 * the Dragons</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class AspectOfTheDragon extends ModSwordItem {
	public AspectOfTheDragon() {
		super(ModSwordTier.AOTD, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Dragon Rage"));
		tooltip.add(new StringTextComponent(FormatingCodes.gray	+ "Deal 12000 Damage to all Monsters in front of you."));
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Damaged Monsters take huge Knockback."));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		// TODO Determine entities in front of player. Do damage to them.
		final ItemStack handItem = playerIn.getHeldItem(handIn);
		if (!worldIn.isRemote)
			return ActionResult.resultPass(handItem);
		return ActionResult.resultSuccess(handItem);
	}
}