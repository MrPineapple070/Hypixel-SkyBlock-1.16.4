package net.hypixel.skyblock.items.accessories;

import java.util.List;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * These {@link Accessory} heal the Player while it is on fire.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Initiate_Badge">Initiate</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Adept_Badge">Adept</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Cultist_Badge">Cultist</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Scion_Badge">Scion</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_God_Badge">Godly</a><br>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CampfireTalisman extends Accessory {
	/**
	 * A {@link ImmutableList} of {@link Float} for {@link #heal} based on
	 * {@link #level}
	 */
	private static final ImmutableList<Float> health = ImmutableList
			.copyOf(new Float[] { .8f, 1.2f, 1.6f, 2f, 2.4f, 2.8f, 3.2f, 3.6f, 4f, 4.4f, 4.8f, 5.2f, 5.6f, 6f, 6.4f,
					6.8f, 7.2f, 7.6f, 8f, 8.4f, 8.8f, 9.2f, 9.6f, 10f, 10.4f, 10.8f, 11.2f, 11.6f, 12f });

	/**
	 * The amount of health points this heals per second.<br>
	 * This number must be positive.
	 */
	private final float heal;

	/**
	 * The level of this.<br>
	 * This number must be between 0 and 29 (inclusive)
	 */
	private final int level;

	/**
	 * Current tick used in
	 * {@link #inventoryTick(ItemStack, World, Entity, int, boolean)}
	 */
	private int tick;

	public CampfireTalisman() {
		super(ItemProperties.ms1, ModItemRarity.Common);
		this.level = 0;
		this.heal = health.get(this.level);
		this.tick = 0;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("accessory.campfire", this.heal, StatString.health));
	}

	/**
	 * @return {@link #level}
	 */
	public int getLevel() {
		return this.level;
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entityIn;
		this.tick = ++this.tick % 20;
		if (this.tick != 0)
			return;
		if (player.getFireTimer() > 0)
			player.heal(this.heal);
	}
}