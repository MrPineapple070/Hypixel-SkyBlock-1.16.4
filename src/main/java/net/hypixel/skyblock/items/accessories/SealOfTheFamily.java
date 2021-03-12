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
 * An {@link Accessory} that gives a 3% discount of most shops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Seal_of_the_Family">Seal of
 * the Family</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SealOfTheFamily extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.seal", "3%");
	
	public SealOfTheFamily() {
		super(ItemProperties.ms1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}