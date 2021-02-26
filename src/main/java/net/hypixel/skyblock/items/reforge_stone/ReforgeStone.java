package net.hypixel.skyblock.items.reforge_stone;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.items.ReforgableItem;
import net.hypixel.skyblock.items.Reforge;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author MrPineapple070
 * @version 22 October 2020
 * @since 22 October 2020
 */
public class ReforgeStone extends Item {
	/**
	 * The {@link Reforge} that this applies to items.
	 */
	@Nonnull
	protected final Reforge reforge;

	public ReforgeStone(Properties properties, Reforge reforge) {
		super(properties);
		this.reforge = Objects.requireNonNull(reforge);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
		return false;
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 0;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	public void consume(ReforgableItem item) {
		item.setReforge(this.reforge);
	}
}