package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * A {@link Bait} that grants a small chance to get double drops, higher chance
 * to catch Rare Sea Creatures, and 20% faster catch rate.
 *
 * @author MrPineapple070
 * @version 30 July 2020
 * @since 30 July 2020
 */
public class WhaleBait extends Bait {
	private static final ITextComponent info = new TranslationTextComponent("bait.whale", StatString.fishing_speed);
	public WhaleBait() {
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}