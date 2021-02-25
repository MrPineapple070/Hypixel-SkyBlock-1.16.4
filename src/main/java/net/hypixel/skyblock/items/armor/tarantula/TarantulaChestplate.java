package net.hypixel.skyblock.items.armor.tarantula;

import java.util.ArrayList;
import java.util.List;

import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class TarantulaChestplate extends ModArmorItem {
	private static final List<ITextComponent> discription = new ArrayList<>();

	static {
		try {
			discription.addAll(TarantulaSet.instance.getDescription(EquipmentSlotType.CHEST));
			discription.add(new StringTextComponent(FormatingCodes.gold + "Piece Bonus: Anti-Toxin"));
			discription.add(new StringTextComponent(FormatingCodes.gray + "Gain immunity to healing reduction."));
			discription.add(new StringTextComponent(FormatingCodes.gold + "Piece Bonus: Spider Bulwark"));
			discription.add(
					new StringTextComponent(FormatingCodes.gray + "Kill Spiders to accumulate Defense against them."));
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public TarantulaChestplate() {
		super(TarantulaSet.instance.getMaterial(), EquipmentSlotType.CHEST, ItemProperties.c1,
				TarantulaSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(discription);
	}
}