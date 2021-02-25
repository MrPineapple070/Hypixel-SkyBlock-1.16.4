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
 * An {@link Accessory} that gives a 1% discount on most shops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Shady_Ring">Shady Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ShadyRing extends Accessory {
	public ShadyRing() {
		super(ItemProperties.ms1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Gives a 1% discount on most shops."));
	}
}