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
 * An {@link Accessory} that gives +3% speed.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Speed_Ring">Speed Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SpeedRing extends Accessory {
	public SpeedRing() {
		super(ItemProperties.f1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				FormatingCodes.gray + "Gives +3% " + FormatingCodes.white + "speed" + FormatingCodes.gray + "."));
	}
}