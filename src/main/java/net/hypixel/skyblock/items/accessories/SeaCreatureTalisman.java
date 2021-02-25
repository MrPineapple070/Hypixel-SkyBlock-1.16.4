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
 * An {@link Accessory} that decreases the damage taken from Sea Creatures by
 * 5%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sea_Creature_Talisman">Sea
 * Creature Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SeaCreatureTalisman extends Accessory {
	public SeaCreatureTalisman() {
		super(ItemProperties.fi1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Take 5% less damage from Sea Creatures."));
	}
}