package net.hypixel.skyblock.items.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FishingGroup extends ItemGroup {
	public static final FishingGroup instance = new FishingGroup(ItemGroup.GROUPS.length, "Fishing");

	private FishingGroup(int index, String label) {
		super(index, label);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.FISHING_ROD);
	}
}