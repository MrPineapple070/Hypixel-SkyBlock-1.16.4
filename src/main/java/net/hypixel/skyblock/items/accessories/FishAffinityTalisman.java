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
 * An {@link Accessory} that decreases fish catching by 5%.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Fish_Affinity_Talisman">Fish
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class FishAffinityTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.fish_affinity", StatString.fishing_speed);
	
	public FishAffinityTalisman() {
		super(ItemProperties.fi1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}