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

public class TarantulaBoots extends ModArmorItem {
	private static final List<ITextComponent> discription = new ArrayList<>();

	static {
		try {
			discription.addAll(TarantulaSet.instance.getDescription(EquipmentSlotType.FEET));
			discription.add(new StringTextComponent(FormatingCodes.gold + "Item Ability: Double Jump"));
			discription.add(new StringTextComponent(FormatingCodes.gray + "Allows you to Double Jump."));
			discription.add(new StringTextComponent(FormatingCodes.gold + "Piece Bonus: Spider Bulwark"));
			discription.add(new StringTextComponent(
					FormatingCodes.gray + "Every spider you kill will accumulate defense against them."));
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public TarantulaBoots() {
		super(TarantulaSet.instance.getMaterial(), EquipmentSlotType.FEET, ItemProperties.c1,
				TarantulaSet.instance.getRarity());
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.addAll(discription);
	}
}