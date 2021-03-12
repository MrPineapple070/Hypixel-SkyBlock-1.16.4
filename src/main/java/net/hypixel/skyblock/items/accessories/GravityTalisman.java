package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
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
	private static final ITextComponent info = new TranslationTextComponent("accessory.gravity", StatString.strength, StatString.defense);
	
	public GravityTalisman() {
		super(ItemProperties.m1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
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