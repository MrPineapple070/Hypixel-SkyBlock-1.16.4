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
 * An {@link Accessory} that increases distance for fall damage by 7 blocks and
 * reduces fall damage by 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Feather_Ring">Feather
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FeatherRing extends Accessory {
	public FeatherRing() {
		super(ItemProperties.f1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				"Increases the max distance before taking fall damage by 7 blocks and reduces fall damage by 10%."));
	}
}