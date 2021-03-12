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
 * An {@link Accessory} that decreases damage taken from Sea Creatures by
 * 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sea_Creature_Ring">Sea
 * Creature Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SeaCreatureRing extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.sea_creature", "10%");
	
	public SeaCreatureRing() {
		super(ItemProperties.fi1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}

}