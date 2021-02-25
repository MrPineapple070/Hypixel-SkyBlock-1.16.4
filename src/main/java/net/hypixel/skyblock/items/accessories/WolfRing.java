package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces damage taken from {@link WolfEntity} by
 * 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wolf_Ring">Wolf Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class WolfRing extends Accessory {
	public WolfRing() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Reduces damage taken from Wolves by 10%"));
	}
}