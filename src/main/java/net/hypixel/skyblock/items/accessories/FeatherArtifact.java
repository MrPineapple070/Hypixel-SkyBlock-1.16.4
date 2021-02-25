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
 * An {@link Accessory} that increases distance for fall damage by 10 blocks and
 * reduces fall damage by 15%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Feather_Artifact">Feather
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FeatherArtifact extends Accessory {
	public FeatherArtifact() {
		super(ItemProperties.f1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				"Increases max distance before taking fall damage by 10 blocks and reduces fall damage by 15%."));
	}
}