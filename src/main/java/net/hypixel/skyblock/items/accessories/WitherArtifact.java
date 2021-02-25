package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces the damage taken from {@link WitherEntity}
 * by 20%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wither_Artifact">Wither
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class WitherArtifact extends Accessory {
	public WitherArtifact() {
		super(ItemProperties.c1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Reduces that damage taken from Withers by 20%."));
	}
}