package net.hypixel.skyblock.items.pets;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.pets.BatPet;
import net.hypixel.skyblock.pets.Pets;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * {@link PetItem} for {@link BatPet}.
 * 
 * @author MrPineapple070
 * @version 28 December 2020
 * @since 11 July 2019
 */
public final class BatPetItem extends PetItem {
	private static final ITextComponent ability0 = new TranslationTextComponent("pet.bat.ability.0")
			.mergeStyle(TextFormatting.GOLD);
	private static final ITextComponent ability1 = new TranslationTextComponent("pet.bat.ability.1")
			.mergeStyle(TextFormatting.GOLD);
	private static final ITextComponent ability2 = new TranslationTextComponent("pet.bat.ability.2")
			.mergeStyle(TextFormatting.GOLD);
	private static final ITextComponent ability3 = new TranslationTextComponent("pet.bat.ability.3")
			.mergeStyle(TextFormatting.GOLD);

	public BatPetItem() {
		super(ItemProperties.m1, Pets.bat);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		double[] buff = this.pet.getBuffs();
		tooltip.add(StatString.intelligence.deepCopy().appendString(String.format(PetItem.buff, buff[1])));
		tooltip.add(StatString.speed.deepCopy().appendString(String.format(PetItem.buff, buff[2])));
		tooltip.add(StatString.sea_creature_chance.deepCopy().appendString(String.format(PetItem.buff, buff[0])));
		tooltip.add(StringTextComponent.EMPTY);
		tooltip.add(ability0);
		tooltip.add(new TranslationTextComponent("pet.bat.ability.0.discription", buff[3]));

		ModItemRarity rarity = this.getPetRarity();

		if (rarity.rank >= ModItemRarity.Rare.rank) {
			tooltip.add(StringTextComponent.EMPTY);
			tooltip.add(ability1);
			tooltip.add(new TranslationTextComponent("pet.bat.ability.1.discription", buff[4], StatString.intelligence,
					buff[5], StatString.speed, ((IFormattableTextComponent) Effects.NIGHT_VISION.getDisplayName())
							.mergeStyle(Style.EMPTY.setColor(Color.fromInt(Effects.NIGHT_VISION.getLiquidColor())))));
		}

		if (rarity.rank >= ModItemRarity.Legendary.rank) {
			tooltip.add(StringTextComponent.EMPTY);
			tooltip.add(ability2);
			tooltip.add(new TranslationTextComponent("pet.bat.ability.2.discription", buff[6]));
		}

		if (rarity.rank >= ModItemRarity.Mythic.rank) {
			tooltip.add(StringTextComponent.EMPTY);
			tooltip.add(ability3);
			tooltip.add(new TranslationTextComponent("pet.bat.ability.3.discription", buff[7]));
		}

		if (this.held_item != null)
			tooltip.add(this.held_item.getDisplayName(new ItemStack(this.held_item)));

		if (this.pet.getLevel() == 100)
			tooltip.add(max_level);
		else {
			this.changeLevelProgress();
			tooltip.add(new StringTextComponent(this.lvl_progress));
		}
	}
}