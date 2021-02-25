package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
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

	public WhaleBait() {
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				"When cast, grant a small chance to get double drops, higher chance to catch Rare Sea Creatures, and 20% faster catch rate."));
	}

}
