package net.hypixel.skyblock.items.swords;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
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
	private int tick = 0;
	private int tickers = 4;

	public ThickScorpionFoil() {
		super(ModSwordTier.Thick_Scorpion_Foil, ItemProperties.c1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Heartstopper\n" + FormatingCodes.gray
				+ "You have 4 tickers.\nBlocking clears 1 of them and heals 12 hp.\n"
				+ "Once all tickers are cleared, your next attck is empowered for +250% damage.\nTickers refill after 5 seconds."));
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