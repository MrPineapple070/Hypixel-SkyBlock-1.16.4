package net.hypixel.skyblock.items.swords;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * The <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Thick_Tactician%27s_Sword">Thick
 * Tactician's Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 November 2019
 */
public class ThickTacticianSword extends ModSwordItem {
	public ThickTacticianSword() {
		super(ModSwordTier.Tactician_Sword, ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultPass(playerIn.getHeldItem(handIn));
	}
}