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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/End_Stone_Sword">End Stone
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class EndStoneSword extends ModSwordItem {
	public EndStoneSword() {
		super(ModSwordTier.End_Stone_Sword, ItemProperties.m1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Extreme Focus"));
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Consumes all your remaining" + FormatingCodes.aqua
				+ " Mana" + FormatingCodes.gray
				+ "to grant Damage Resistance for 5 seconds and extra Damage on your next hit depending on how much"
				+ FormatingCodes.aqua + " Mana" + FormatingCodes.gray + " was consumed."));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}