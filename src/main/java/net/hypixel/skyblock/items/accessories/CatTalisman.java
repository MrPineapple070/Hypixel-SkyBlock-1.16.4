package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that increases the Player's speed.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Cat_Talisman">Cat
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class CatTalisman extends Accessory {
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#MOVEMENT_SPEED}
	 * by 1%
	 */
	private static final AttributeModifier speed_mod = new AttributeModifier(
			Attributes.MOVEMENT_SPEED.getAttributeName(), .001, Operation.ADDITION);
	
	private static final ITextComponent info = new TranslationTextComponent("accessory.cat_talisman", StatString.speed);

	public CatTalisman() {
		super(ItemProperties.ms1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entityIn;
		final ModifiableAttributeInstance spd = player.getAttribute(Attributes.MOVEMENT_SPEED);
		try {
			spd.applyNonPersistentModifier(speed_mod);
		} catch (final IllegalArgumentException iae) {
			return;
		}
	}
}