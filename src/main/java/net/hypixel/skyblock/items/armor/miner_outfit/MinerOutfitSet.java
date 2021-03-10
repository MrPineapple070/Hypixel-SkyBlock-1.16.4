package net.hypixel.skyblock.items.armor.miner_outfit;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner%27s_Outfit">Miner
 * Set</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class MinerOutfitSet extends ModArmorItem {
	private static final List<ITextComponent> fsb = Arrays.asList(
			FullSetInformation.full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.miner_outfit.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.miner_outfit.fsb.discription",
					((IFormattableTextComponent) Effects.HASTE.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.HASTE.getLiquidColor())))));

	public MinerOutfitSet(EquipmentSlotType slot) {
		super(ModArmorMaterial.Miner_Outfit, slot, ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(fsb);
	}
}
