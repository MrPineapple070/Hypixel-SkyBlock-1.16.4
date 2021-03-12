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
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Midas_Sword">Midas
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 09 July 2019
 * @since 02 July 2019
 */
public class MidasSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			item_ability.deepCopy().append(new TranslationTextComponent("sword.midas")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("sword.midas.0"), new TranslationTextComponent("sword.midas.1"));

	public MidasSword() {
		super(ModSwordTier.Midas_Sword, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(MidasSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultPass(playerIn.getHeldItem(handIn));
	}
}