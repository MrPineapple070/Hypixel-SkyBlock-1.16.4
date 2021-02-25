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
 * An {@link Accessory} that increases Combat XP by 5%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Hunter_Ring">Hunter
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class HunterRing extends Accessory {
	public HunterRing() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Increases Combat XP gained by 5%"));
	}
}