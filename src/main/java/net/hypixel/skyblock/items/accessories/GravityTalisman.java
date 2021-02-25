package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that increases
 * <font style="color:#e73c3c">Strength</font> and
 * <font style="color:#00d400">Defense</font> depending on the Player's
 * proximity to spawn.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class GravityTalisman extends Accessory {
	public GravityTalisman() {
		super(ItemProperties.m1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(
				new StringTextComponent(FormatingCodes.gray + "The closer you are to the spawn on the island, the more "
						+ FormatingCodes.dark_red + "Strength " + FormatingCodes.gray + "and " + FormatingCodes.green
						+ "Defence " + FormatingCodes.gray + "you will get. (Max +10)"));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (entityIn instanceof ModServerPlayerEntity) {
			final ModServerPlayerEntity player = (ModServerPlayerEntity) entityIn;
			BlockPos.ZERO.distanceSq(player.getPosX(), player.getPosY(), player.getPosZ(), true);
		}
	}
}