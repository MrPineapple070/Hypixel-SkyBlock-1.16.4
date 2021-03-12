package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that ensures that Monsters below level 25 will no longer
 * target the player.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Intimidation_Artifact">Intimidation
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class IntimidationArtifact extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.intimidation", 25);
	
	public IntimidationArtifact() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}