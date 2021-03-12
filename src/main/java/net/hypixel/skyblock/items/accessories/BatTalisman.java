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
 * An {@link Accessory} that buffs.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Talisman">Bat
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatTalisman extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.bat_talisman", StatString.health,
			StatString.speed, StatString.intelligence);
	
	public BatTalisman() {
		super(ItemProperties.ms1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}