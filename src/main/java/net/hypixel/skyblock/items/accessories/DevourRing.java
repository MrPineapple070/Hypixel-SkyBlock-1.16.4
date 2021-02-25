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
 * An {@link Accessory} that heals .1 when killing a monster.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Devour_Ring">Devour
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class DevourRing extends Accessory {
	public DevourRing() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				FormatingCodes.red + "Heals .1 " + FormatingCodes.gray + "when killing a monster."));
	}
}