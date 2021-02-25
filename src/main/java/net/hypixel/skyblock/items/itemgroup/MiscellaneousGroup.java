package net.hypixel.skyblock.items.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MiscellaneousGroup extends ItemGroup {
	public static final MiscellaneousGroup instance = new MiscellaneousGroup(ItemGroup.GROUPS.length);

	public MiscellaneousGroup(int index) {
		super(index, "Miscellaneous");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.BEACON);
	}
}