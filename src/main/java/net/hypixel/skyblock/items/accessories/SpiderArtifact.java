package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces the damage taken from {@link SpiderEntity}
 * and {@link CaveSpiderEntity}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Spider_Artifact">Spider
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SpiderArtifact extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.spider", "15%");
	
	public SpiderArtifact() {
		super(ItemProperties.c1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}