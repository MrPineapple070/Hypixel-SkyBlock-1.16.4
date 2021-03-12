package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that gives Haste I for 15 seconds when breaking any
 * block.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class HasteRing extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.haste",
			((IFormattableTextComponent) Effects.HASTE.getDisplayName())
					.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.HASTE.getLiquidColor()))));

	public HasteRing() {
		super(ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}