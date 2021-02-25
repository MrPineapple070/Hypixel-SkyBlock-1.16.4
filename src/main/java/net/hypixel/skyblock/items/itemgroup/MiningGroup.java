package net.hypixel.skyblock.items.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MiningGroup extends ItemGroup {
	public static final MiningGroup instance = new MiningGroup(ItemGroup.GROUPS.length);

	private MiningGroup(int index) {
		super(index, "Mining");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.DIAMOND_PICKAXE);
	}
}