package net.hypixel.skyblock.items.accessories;

import java.util.List;
import java.util.Objects;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.FormatingCodes;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that grants +1
 * <font style="color:#55FFFF">Intelligence</font> per in-game year played.<Br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Crab_Hat_of_Celebration">Crab Hat
 * of Celebration</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class PartyHatCrab extends Accessory {
	/**
	 * The {@link DyeColor} of this.
	 */
	private final DyeColor color;

	/**
	 * @param color {@link DyeColor} for this.
	 */
	public PartyHatCrab(DyeColor color) {
		super(ItemProperties.ms1, ModItemRarity.Common);
		switch (Objects.requireNonNull(color, "Must have a color.")) {
		case RED:
		case ORANGE:
		case YELLOW:
		case LIME:
		case GREEN:
		case LIGHT_BLUE:
		case PURPLE:
		case PINK:
		case BLACK:
			this.color = color;
			break;
		default:
			throw new IllegalArgumentException("Illegal color: " + color);
		}
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(FormatingCodes.gray + "Grants +1 " + FormatingCodes.aqua + "Intelligence "
				+ FormatingCodes.gray + "per in-game year played."));
	}

	/**
	 * @return {@link #color}
	 */
	public DyeColor getColor() {
		return this.color;
	}
}