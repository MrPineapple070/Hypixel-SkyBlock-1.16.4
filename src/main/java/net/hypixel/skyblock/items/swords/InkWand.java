package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Ink_Wand">Ink Wand</a>.
 *
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 11 June 2019
 */
public class InkWand extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			item_ability.deepCopy().append(new TranslationTextComponent("sword.ink")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("sword.ink.0", StatString.ability_damage,
					((IFormattableTextComponent) Effects.BLINDNESS.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.BLINDNESS.getLiquidColor())))));

	public InkWand() {
		super(ModSwordTier.Ink_Wand, ItemProperties.fi1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(InkWand.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack held = playerIn.getHeldItem(handIn);
		if (worldIn.isRemote)
			return ActionResult.resultPass(held);
		playerIn.getCooldownTracker().setCooldown(this, 600);
		return ActionResult.resultSuccess(held);
	}
}