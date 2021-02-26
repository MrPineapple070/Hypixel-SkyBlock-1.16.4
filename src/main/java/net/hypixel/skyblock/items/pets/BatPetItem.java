package net.hypixel.skyblock.items.pets;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.pets.BatPet;
import net.hypixel.skyblock.pets.PetItem;
import net.hypixel.skyblock.pets.Pets;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * {@link PetItem} for {@link BatPet}.
 * 
 * @author MrPineapple070
 * @version 28 December 2020
 * @since 11 July 2019
 */
public final class BatPetItem extends PetItem {
	private static final ITextComponent candy_lover = new StringTextComponent(FormatingCodes.gold + "Candy Lover");
	private static final ITextComponent nightmare = new StringTextComponent(FormatingCodes.gold + "Nightmare");
	private static final ITextComponent wings = new StringTextComponent(FormatingCodes.gold + "Wings of Steel");
	private static final ITextComponent sonar = new StringTextComponent(FormatingCodes.gold + "Sonar");

	private static final String intel = StatString.intelligence + ": %.1f";
	private static final String speed = StatString.speed + ": %.1f";
	private static final String seacc = StatString.sea_creature_chance + ": %.1f";
	private static final String candy = "Increases drop chance of candies from mobs by " + FormatingCodes.green
			+ "%.1f%%";
	private static final String night = "During night, gain %.1f" + StatString.intelligence + ", %.1f"
			+ StatString.speed + ", and night vision";

	public BatPetItem() {
		super(ItemProperties.m1, Pets.bat);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		double[] buff = this.pet.getBuffs();
		tooltip.add(new StringTextComponent(String.format(intel, buff[1])));
		tooltip.add(new StringTextComponent(String.format(speed, buff[2])));
		if (buff[0] != 0)
			tooltip.add(new StringTextComponent(String.format(seacc, buff[0])));
		tooltip.add(blank);
		tooltip.add(candy_lover);
		tooltip.add(new StringTextComponent(String.format(candy, buff[3])));

		ModItemRarity rarity = this.getPetRarity();

		if (rarity.rank >= ModItemRarity.Rare.rank) {
			tooltip.add(blank);
			tooltip.add(nightmare);
			tooltip.add(new StringTextComponent(String.format(night, buff[4], buff[5])));
		}

		if (rarity.rank >= ModItemRarity.Legendary.rank) {
			tooltip.add(blank);
			tooltip.add(wings);
		}

		if (rarity.rank >= ModItemRarity.Mythic.rank) {
			tooltip.add(blank);
			tooltip.add(sonar);
		}

		tooltip.add(new StringTextComponent(this.lvl_progress));
	}
}