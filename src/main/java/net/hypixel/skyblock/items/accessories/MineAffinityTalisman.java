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
 * An {@link Accessory} that increases the player's speed by 10% while in <br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Mine_Affinity_Talisman">Mine
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class MineAffinityTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.mine", StatString.speed);
	
	public MineAffinityTalisman() {
		super(ItemProperties.m1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}