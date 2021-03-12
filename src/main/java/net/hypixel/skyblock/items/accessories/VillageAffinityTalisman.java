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
import net.minecraft.world.biome.Biome;

/**
 * An {@link Accessory} that gives +10% speed while in certain
 * {@link Biome}.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Village_Affinity_Talisman">Village
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class VillageAffinityTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.village", StatString.speed);
	
	public VillageAffinityTalisman() {
		super(ItemProperties.ms1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}