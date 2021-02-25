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
 * An {@link Accessory} that ensures that Monster below level 5 will no longer
 * target you.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Intimidation_Ring">Intimidation
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class IntimidationRing extends Accessory {
	public IntimidationRing() {
		super(ItemProperties.c1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Ensures that Monsters below level 5 will no longer target you."));
	}
}