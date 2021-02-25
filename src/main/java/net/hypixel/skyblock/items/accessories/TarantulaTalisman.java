package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that ensures that every 10th hit on the same
 * {@link Entity} will do 10% more damage.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Tarantula_Talisman">Tarantula
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class TarantulaTalisman extends Accessory {
	public TarantulaTalisman() {
		super(ItemProperties.c1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Every 10th hit on the same entity will do 10% damage."));
	}
}