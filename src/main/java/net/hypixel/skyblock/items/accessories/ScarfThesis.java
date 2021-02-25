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
 * An {@link Accessory} that increases dungeon class experience by 4%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Scarf%27s_Thesis">Scarf's
 * Thesis</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ScarfThesis extends Accessory {
	public ScarfThesis() {
		super(ItemProperties.d1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Gain dungeon class experience 4% faster."));
	}
}