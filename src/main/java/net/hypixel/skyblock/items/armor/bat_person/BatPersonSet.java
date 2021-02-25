package net.hypixel.skyblock.items.armor.bat_person;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Person_Armor">Bat
 * Person Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 24 October 2019
 */
public class BatPersonSet extends ModArmorItem {

	public BatPersonSet(EquipmentSlotType slot) {
		super(ModArmorMaterial.Bat_Person, slot, ItemProperties.m1, ModItemRarity.Legendary);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Bat Powers Activate!\n"
				+ FormatingCodes.gray + "Removes the cooldown from the Grappling Hook."));
	}
}