package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that grants +6 Intelligence.<Br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Melody%27s_Hair"></a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class MelodyHair extends Accessory {
	private int currentPitch;

	public MelodyHair() {
		super(ItemProperties.ms1, ModItemRarity.Epic);
		this.currentPitch = -12;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Gives +6 " + FormatingCodes.aqua + "Intelligence"));
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, PlayerEntity player) {
		if (player.world.isRemote)
			return false;
		if (++this.currentPitch == 13)
			this.currentPitch = -12;
		return false;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.BLOCK_NOTE_BLOCK_HARP,
				SoundCategory.MUSIC, 1f, (float) Math.pow(2, this.currentPitch / 12d), false);
		return ActionResult.resultPass(playerIn.getHeldItem(handIn));
	}

	// TODO Figure out left click (increase currentPitch by 1 reset back to -12 if
	// necessary
}