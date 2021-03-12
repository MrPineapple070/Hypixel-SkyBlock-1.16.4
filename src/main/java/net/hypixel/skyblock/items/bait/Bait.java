package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * The base for Fishing Baits.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fishing_Bait">Click
 * here</a> for more information.
 *
 * @author MrPineapple070
 * @version 2 June 2019
 * @since 2 July 2019
 */
public abstract class Bait extends Item {
	/**
	 * Construct this.
	 */
	protected Bait() {
		super(ItemProperties.fi64);
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);
}