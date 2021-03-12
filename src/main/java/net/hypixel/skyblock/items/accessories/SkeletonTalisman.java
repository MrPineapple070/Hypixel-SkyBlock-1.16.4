package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces the damage taken from
 * {@link SkeletonEntity}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Skeleton_Talisman">Skeleton
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SkeletonTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.skeleton");
	
	public SkeletonTalisman() {
		super(ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}