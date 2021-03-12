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
 * An {@link Accessory} that increases healing by 5%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Healing_Talisman">Healing
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class HealingTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.healing", 5);
	public HealingTalisman() {
		super(ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}