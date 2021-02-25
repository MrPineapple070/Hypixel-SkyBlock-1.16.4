package net.hypixel.skyblock.items.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DungeonGroup extends ItemGroup {
	public static final DungeonGroup instance = new DungeonGroup(ItemGroup.GROUPS.length);

	public DungeonGroup(int index) {
		super(index, "Dungeon");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.DRAGON_EGG);
	}
}