package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces the amount of damage taken from
 * {@link EnderDragonEntity}, {@link EndermanEntity}, and
 * {@link EndermiteEntity}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ender_Artifact">Ender
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class EnderArtifact extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.ender_artifact");
	
	public EnderArtifact() {
		super(ItemProperties.c1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}