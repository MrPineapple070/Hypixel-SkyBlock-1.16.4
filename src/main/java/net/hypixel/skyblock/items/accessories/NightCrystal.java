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

public class NightCrystal extends Accessory {
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ATTACK_DAMAGE}
	 * by 0xA.
	 */
	private static final AttributeModifier attack_mod = new AttributeModifier(
			Attributes.ATTACK_DAMAGE.getAttributeName(), 0xA, Operation.ADDITION);

	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ARMOR} by 0xA.
	 */
	private static final AttributeModifier defense_mod = new AttributeModifier(Attributes.ARMOR.getAttributeName(), 0xA,
			Operation.ADDITION);
	
	private static final ITextComponent info = new TranslationTextComponent("accessory.night_crystal", StatString.strength, StatString.defense);

	public NightCrystal() {
		super(ItemProperties.m1, ModItemRarity.Rare);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (worldIn.isDaytime())
			return;
		if (entityIn instanceof PlayerEntity) {
			final PlayerEntity player = (PlayerEntity) entityIn;
			final ModifiableAttributeInstance atk_dmg = player.getAttribute(Attributes.ATTACK_DAMAGE);
			final ModifiableAttributeInstance def = player.getAttribute(Attributes.ARMOR);
			atk_dmg.applyNonPersistentModifier(attack_mod);
			def.applyNonPersistentModifier(defense_mod);
		}
	}
}