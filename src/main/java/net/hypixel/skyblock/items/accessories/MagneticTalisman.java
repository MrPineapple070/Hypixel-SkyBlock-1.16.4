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
 * An {@link Accessory} that triples the players pickup radius.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Magnetic_Talisman">Magnetic
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class MagneticTalisman extends Accessory {
	public MagneticTalisman() {
		super(ItemProperties.m1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Increases your item pickup range by 3 times."));
	}
}