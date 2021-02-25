package net.hypixel.skyblock.items.biomestick;

import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

/**
 * Serve as a base for
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Biome_Stick">Biome
 * Sticks</a>.
 *
 * @author MrPineapple070
 * @version 24 June 2020
 */
public abstract class AbstractBiomeStick extends Item {
	protected static void sendMessage(PlayerEntity player, ITextComponent text) {
		player.sendMessage(text, PlayerEntity.getUUID(player.getGameProfile()));
	}

	protected int range;

	protected AbstractBiomeStick(Properties properties) {
		super(properties);
		this.range = 0;
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
		if (!worldIn.isRemote)
			this.handleClick(player, worldIn, pos, false, player.getHeldItem(Hand.MAIN_HAND));
		return false;
	}

	protected void handleClick(PlayerEntity player, IWorld worldIn, BlockPos pos, boolean rightClick, ItemStack stack) {
		if (rightClick)
			worldIn.getBiome(pos);
		this.range = ++this.range % 5;
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	@Override
	public abstract ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn);
}
