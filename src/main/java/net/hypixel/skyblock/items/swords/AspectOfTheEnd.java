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
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_End">Aspect
 * of the End</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class AspectOfTheEnd extends ModSwordItem {
	public AspectOfTheEnd() {
		super(ModSwordTier.AOTE, ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Instant Transmission"));
		tooltip.add(new StringTextComponent(
				FormatingCodes.gray + "Teleports you 8 blocks ahead of you and you gain +50% Speed for 3 seconds."));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack held = playerIn.getHeldItem(handIn);
		if (!worldIn.isRemote)
			return ActionResult.resultPass(held);
		
		double x = playerIn.getPosX(), y = playerIn.getPosY(), z = playerIn.getPosZ();
		float phi = playerIn.rotationYaw, theta = playerIn.rotationPitch;
		phi *= Math.PI/180f;
		theta *= Math.PI/180f;
		
		x += Math.sin(theta);
		y += Math.sin(phi)*Math.cos(theta);
		z += Math.cos(phi)*Math.cos(theta);
		
		x *= 8;
		y *= 8;
		z *= 8;
		
		playerIn.attemptTeleport(x, y, z, false);
		return ActionResult.resultSuccess(held);
	}
}