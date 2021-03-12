package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
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
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Thick_Scorpion_Foil">Thick
 * Scorpion Foil</a>.
 *
 * @author MrPineapple070
 * @version 15 August 2020
 * @since 15 August 2020
 */
public class ThickScorpionFoil extends ModSwordItem {
	private static final ITextComponent before = item_ability.deepCopy().append(new TranslationTextComponent("sword.scorpion")).mergeStyle(TextFormatting.GOLD);
	private static final List<ITextComponent> after = Arrays.asList(
			new TranslationTextComponent("sword.scorpion.0", StatString.health),
			new TranslationTextComponent("sword.scorpion.1"));

	private int tick = 0;
	private int tickers = 4;

	public ThickScorpionFoil() {
		super(ModSwordTier.Thick_Scorpion_Foil, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(before);
		tooltip.add(new TranslationTextComponent("sword.scorpion.ticker", this.tickers, StatString.ticker));
		tooltip.addAll(after);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		this.tick = ++this.tick % 100;
		if (this.tick == 0)
			this.tickers = 4;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		final ItemStack handItem = playerIn.getHeldItem(handIn);
		if (this.tickers != 0) {
			--this.tickers;
			return ActionResult.resultSuccess(handItem);
		}
		return ActionResult.resultPass(handItem);
	}
}