package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that gives +1 speed and increases Potato Minion speed by
 * 5%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Potato_Talisman">Potato
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class PotatoTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.potato", StatString.speed);
	
	public PotatoTalisman() {
		super(ItemProperties.f1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}