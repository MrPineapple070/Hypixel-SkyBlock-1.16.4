package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * A {@link Bait} that decreases catch rate by 30#.
 *
 * @author MrPineapple070
 * @version 30 July 2020
 * @since 2 July 2019
 */
public class FishBait extends Bait {
	public FishBait() {
		super();
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("When cast, decrease catch rate by 30%."));
	}

}
