package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that grants Night Vision I.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Night_Vision_Charm">Night
 * Vision Charm</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class NightVisionCharm extends Accessory {
	public NightVisionCharm() {
		super(ItemProperties.f1, ModItemRarity.Common);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Grants Night Vision I."));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (entityIn instanceof ModServerPlayerEntity)
			((ModServerPlayerEntity) entityIn).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1, 1));
	}
}