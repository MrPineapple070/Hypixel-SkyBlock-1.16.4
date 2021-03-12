package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that reduces damage taken from {@link ZombieEntity}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Zombie_Ring">Zombie
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ZombieRing extends Accessory {
	private static final ITextComponent info = new TranslationTextComponent("accessory.zombie", 10);
	
	public ZombieRing() {
		super(ItemProperties.c1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}
}