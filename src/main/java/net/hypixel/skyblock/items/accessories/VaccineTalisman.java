package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that provides immunity to {@link Effects#POISON}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Vaccine_Talisman">Vaccine
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class VaccineTalisman extends Accessory {
	public VaccineTalisman() {
		super(ItemProperties.f1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Provides immunity to Poison damage."));
	}
}