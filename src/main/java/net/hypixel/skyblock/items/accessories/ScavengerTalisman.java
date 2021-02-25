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
 * An {@link Accessory} that causes coins to drop when Monsters are killed.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Scavenger_Talisman">Scavenger
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ScavengerTalisman extends Accessory {
	public ScavengerTalisman() {
		super(ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Monsters will drop coins when killed."));
	}
}