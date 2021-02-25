package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces damage taken from {@link ZombieEntity}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Zombie_Talisman">Zombie
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ZombieTalisman extends Accessory {
	public ZombieTalisman() {
		super(ItemProperties.c1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Reduces damage taken from Zombies by 5%."));
	}
}