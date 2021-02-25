package net.hypixel.skyblock.items.armor.miner_outfit;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner%27s_Outfit">Miner
 * Set</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class MinerOutfitSet extends ModArmorItem {
	public MinerOutfitSet(EquipmentSlotType slot) {
		super(ModArmorMaterial.Miner_Outfit, slot, ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				FormatingCodes.gold + "Full Set Bonus: Haste\n" + FormatingCodes.gray + "Grants the wearer permanent "
						+ FormatingCodes.dark_green + "Haste II " + FormatingCodes.gray + "while worn."));
	}
}
