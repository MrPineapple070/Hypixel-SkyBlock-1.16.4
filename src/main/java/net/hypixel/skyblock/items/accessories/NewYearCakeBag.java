package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that grants +1 Health for each unique NewYearCake<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/New_Year_Cake_Bag">New Year
 * Cake Bag.</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class NewYearCakeBag extends Accessory {
	public NewYearCakeBag() {
		super(ItemProperties.ms1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Each unique New Year Cake within this bag grants +1" + FormatingCodes.red
				+ " Health" + FormatingCodes.gray + "."));
	}
}