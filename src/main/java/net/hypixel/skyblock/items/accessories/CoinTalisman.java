package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.init.items.ItemInit;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that will occasionally spawn Coins.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Talisman_of_Coins">Talisman
 * of Coins</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class CoinTalisman extends Accessory {
	private int tick;

	public CoinTalisman() {
		super(ItemProperties.ms1, ModItemRarity.Common);
		this.tick = 0;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Accationaly spawns Coins while in your inventory."));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		this.tick = ++this.tick % 6000;
		if (this.tick == 0)
			worldIn.addEntity(new ItemEntity(worldIn, entityIn.getPosX() + Item.random.nextInt(32) - 16,
					entityIn.getPosY(), entityIn.getPosZ() + Item.random.nextInt(32) - 16,
					new ItemStack(ItemInit.enchanted_diamond_block.get())));
	}
}