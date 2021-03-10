package net.hypixel.skyblock.items.armor.lapis;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * A class for all Lapis Armor pieces.
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class LapisSet extends ModArmorItem {
	private static final List<ITextComponent> fsb = Arrays.asList(
			new TranslationTextComponent("armor.lapis.discription"),
			FullSetInformation.full_set_bonus.deepCopy().append(new TranslationTextComponent("armor.lapis.fsb"))
					.mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.lapis.fsb.discription", StatString.health));

	public LapisSet(EquipmentSlotType slot) {
		super(ModArmorMaterial.Lapis, slot, ItemProperties.m1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(fsb);
	}
}
