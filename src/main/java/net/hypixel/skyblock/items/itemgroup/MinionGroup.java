package net.hypixel.skyblock.items.itemgroup;

import net.hypixel.skyblock.init.blocks.MinionBlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MinionGroup extends ItemGroup {
	public static final MinionGroup instance = new MinionGroup(ItemGroup.GROUPS.length);

	private MinionGroup(int index) {
		super(index, "Minions");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(MinionBlockInit.cobblestone_minion_1.get());
	}
}