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
 * An {@link Accessory} that increases dungeon class experience 6% faster.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Scarf%27s_Grimoire"></a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ScarfGrimoire extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.scarf", "6%");
	
	public ScarfGrimoire() {
		super(ItemProperties.d1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}