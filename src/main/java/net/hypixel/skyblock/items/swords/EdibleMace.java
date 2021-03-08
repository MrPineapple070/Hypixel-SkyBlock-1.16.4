package net.hypixel.skyblock.items.swords;

import java.util.Arrays;
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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Edible_Mace">Edible
 * Mace</a>.
 *
 * @author MrPineapple070
 * @version 13 August 2020
 * @since 13 August 2020
 */
public class EdibleMace extends ModSwordItem {
	private static final List<StringTextComponent> tooltip = Arrays.asList(
			new StringTextComponent(FormatingCodes.gold + "Item Ability: ME SMASH HEAD"),
			new StringTextComponent(FormatingCodes.gray + "The next attack deals double damage and weakens animals."));

	public EdibleMace() {
		super(ModSwordTier.Edible_Mace, ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(EdibleMace.tooltip);
		tooltip.add(StringTextComponent.EMPTY);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		final ItemStack held = playerIn.getHeldItem(handIn);
		return ActionResult.resultSuccess(held);
	}
}