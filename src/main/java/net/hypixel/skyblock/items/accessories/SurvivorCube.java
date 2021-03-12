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
 * An {@link Accessory} that makes heals 5% more effective.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Survivor_Cube">Survivor
 * Cube</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SurvivorCube extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.healing", 5);
	
	public SurvivorCube() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}