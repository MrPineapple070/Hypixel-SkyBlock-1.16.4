package net.hypixel.skyblock.items.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ForagingGroup extends ItemGroup {
	public static final ForagingGroup instance = new ForagingGroup(ItemGroup.GROUPS.length);

	private ForagingGroup(int index) {
		super(index, "Foraging");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.OAK_SAPLING);
	}
}