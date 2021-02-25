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
 * An {@link Accessory} that increases that chance for mobs to drop Candy by
 * 15%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Candy_Artifact">Candy
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CandyArtifact extends Accessory {
	public CandyArtifact() {
		super(ItemProperties.ms1, ModItemRarity.Epic);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Increases the chance for mobs to drop Candy by"
				+ FormatingCodes.green + " 15%" + FormatingCodes.gray + "."));
	}
}