package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * A {@link Bait} that increases the chance to catch winter Sea Creatures by
 * 20%.
 *
 * @author MrPineapple070
 * @version 2 June 2020
 * @since 18 December 2019
 */
public class IceBait extends Bait {
	public IceBait() {
		super();
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("When cast, increase the chance to catch winter Sea Creatures by 20%."));
	}

}
