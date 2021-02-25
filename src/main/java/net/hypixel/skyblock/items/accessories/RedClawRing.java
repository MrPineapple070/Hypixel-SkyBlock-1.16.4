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
 * An {@link Accessory} that increases Crit Damage by 3%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Red_Claw_Ring">Red Claw
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class RedClawRing extends Accessory {
	public RedClawRing() {
		super(ItemProperties.c1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Increases " + FormatingCodes.blue + "Crit Damage "
				+ FormatingCodes.gray + "by 3%."));
	}
}