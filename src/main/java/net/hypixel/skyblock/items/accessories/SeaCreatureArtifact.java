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
 * An {@link}
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SeaCreatureArtifact extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.sea_creature", "15%");
	
	public SeaCreatureArtifact() {
		super(ItemProperties.fi1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}