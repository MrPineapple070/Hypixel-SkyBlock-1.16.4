package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Zombie_Sword">Zombie
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class ZombieSword extends ModSwordItem {
	private static final List<ITextComponent> tooltip = Arrays.asList(
			new StringTextComponent("Item Ability: Instant Heal").mergeStyle(TextFormatting.GOLD),
			new StringTextComponent("Heal yourself for 24 + 5% max ").append(StatString.health)
			.appendString(" and Players within 7 blocks for 10 ").append(StatString.health)
			.appendString("."));

	public ZombieSword() {
		super(ModSwordTier.Zombie_Sword, ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(ZombieSword.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.heal(24);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}