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
 * An {@link Accessory} that adds buffs.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Artifact">Bat
 * Artifact</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/382fc3f71b41769376a9e92fe3adbaac3772b999b219c9d6b4680ba9983e527">Texture</a>.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatArtifact extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.bat_artifact", StatString.health,
			StatString.speed, StatString.intelligence);

	public BatArtifact() {
		super(ItemProperties.ms1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}