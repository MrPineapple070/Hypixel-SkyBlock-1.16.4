package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that have a 5% chance to not consume {@link Bait}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bait_Ring">Bait
 * Ring</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/5a316d585b789b582f2d99e8e6cb2d70433e8996fab024a74bc790e22aedcdeb">Texture</a>.
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class BaitRing extends Accessory {
	public BaitRing() {
		super(ItemProperties.fi1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Grants a " + FormatingCodes.white + "5% "
				+ FormatingCodes.gray + "chance to not consume " + FormatingCodes.yellow + "Bait."));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof ModServerPlayerEntity))
			return;
		final ModServerPlayerEntity player = (ModServerPlayerEntity) entityIn;
		if (player.fishingBobber == null)
			return;
		if (Item.random.nextInt(100) >= 5)
			player.consumeBait();
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
}