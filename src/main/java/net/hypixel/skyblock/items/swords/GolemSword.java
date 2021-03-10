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
import net.minecraft.world.World;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Golem_Sword">Golem
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 02 August 2019
 * @since 11 June 2019
 */
public class GolemSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Iron Punch").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Punch the ground, damaging enemies in a hexagon around you for 250 base magic damage."));

	public GolemSword() {
		super(ModSwordTier.Golem_Sword, ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(GolemSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack held = playerIn.getHeldItem(handIn);
		if (worldIn.isRemote)
			return ActionResult.resultPass(held);
		playerIn.getCooldownTracker().setCooldown(this, 60);
		return ActionResult.resultSuccess(held);
	}
}