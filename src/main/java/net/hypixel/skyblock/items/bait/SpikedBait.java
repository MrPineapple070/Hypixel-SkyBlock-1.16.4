package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * A {@link Bait} that increases Sea Creature spawn rate by 6%.
 *
 * @author MrPineapple070
 * @version 2 June 2020
 * @since 2 July 2019
 */
public class SpikedBait extends Bait {
	private static final ITextComponent info = new TranslationTextComponent("bait.spiked");
	public SpikedBait() {
		super();
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}