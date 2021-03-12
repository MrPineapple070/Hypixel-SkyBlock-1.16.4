package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that increases healing by 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Healing_Ring">Healing
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class HealingRing extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.healing", 15);
	public HealingRing() {
		super(ItemProperties.c1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}