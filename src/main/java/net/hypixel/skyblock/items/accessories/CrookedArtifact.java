package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that gives a 2% discount on most shops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Crooked_Artifact">Crooked
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CrookedArtifact extends Accessory {
	public CrookedArtifact() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Gives a 2% discount on most shops."));
	}
}