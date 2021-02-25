package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
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
	public MineAffinityTalisman() {
		super(ItemProperties.m1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Increases your " + FormatingCodes.white + "speed "
				+ FormatingCodes.gray
				+ "while in the Coal Mine, Gold Mine, Deep Caverns, Gunpowder Mines, Lapis Quarry, Pigmen's Den, Slimehill, Diamond Reserve, Obsidian Sanctuary."));
	}
}