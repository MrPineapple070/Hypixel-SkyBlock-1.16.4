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
 * An {@link Accessory} that provides an immunity to lava.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Lava_Talisman">Lava
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class LavaTalisman extends Accessory {
	public LavaTalisman() {
		super(ItemProperties.c1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Provides an immunity to Lava."));
	}
}