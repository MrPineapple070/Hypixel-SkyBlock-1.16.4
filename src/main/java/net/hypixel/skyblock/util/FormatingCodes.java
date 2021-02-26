package net.hypixel.skyblock.util;

import net.minecraft.item.DyeColor;
import net.minecraft.util.text.TextFormatting;

/**
 * Hold Minecraft Format Codes.<br>
 * <a href="https://minecraft.gamepedia.com/Formatting_codes">Formatting
 * Codes</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FormatingCodes {
	/**
	 * <font style="color:#55FFFF">Aqua</font>
	 */
	public static final String aqua = "\u00A7b";

	/**
	 * <font style="color:#000000">Black</font>
	 */
	public static final String black = "\u00A70";

	/**
	 * <font style="color:#5555FF">Blue</font>
	 */
	public static final String blue = "\u00A79";

	/**
	 * <font style="color:#00AAAA">Dark Aqua</font>
	 */
	public static final String dark_aqua = "\u00A73";

	/**
	 * <font style="color:#0000AA">Dark Blue</font>
	 */
	public static final String dark_blue = "\u00A71";

	/**
	 * <font style="color:#555555">Dark Gray</font>
	 */
	public static final String dark_gray = "\u00A78";

	/**
	 * <font style="color:#00AA00">Dark Green</font>
	 */
	public static final String dark_green = "\u00A72";

	/**
	 * <font style="color:#AA00AA">Dark Purple</font>
	 */
	public static final String dark_purple = "\u00A75";

	/**
	 * <font style="color:#AA0000">Dark Red</font>
	 */
	public static final String dark_red = "\u00A74";

	/**
	 * <font style="color:#FFAA00">Gold</font>
	 */
	public static final String gold = "\u00A76";

	/**
	 * <font style="color:#AAAAAA">Gray</font>
	 */
	public static final String gray = "\u00A77";

	/**
	 * <font style="color:#55FF55">Green</font>
	 */
	public static final String green = "\u00A7a";

	/**
	 * <font style="color:#FF55FF">Light Purple</font>
	 */
	public static final String light_purple = "\u00A7d";

	/**
	 * <font style="color:#FF5555">Red</font>
	 */
	public static final String red = "\u00A7c";

	/**
	 * <font style="color:#FFFFFF">White</font>
	 */
	public static final String white = "\u00A7f";

	/**
	 * <font style="color:#FFFF55">Yellow</font>
	 */
	public static final String yellow = "\u00A7e";

	/**
	 * <b>Bold</b>
	 */
	public static final String bold = "\u00A7l";

	/**
	 * <i>Italic</i>
	 */
	public static final String italic = "\u00A7o";

	/**
	 * Obfuscated
	 */
	public static final String obfuscated = "\u00A7k";

	/**
	 * Reset formating.
	 */
	public static final String reset = "\u00A7r";

	/**
	 * <s>Strikethrough</s>
	 */
	public static final String strikethrough = "\u00A7m";

	/**
	 * <u>Underline</u>
	 */
	public static final String underline = "\u00A7n";

	/**
	 * Convert {@link TextFormatting} into its {@link String} representation.
	 * 
	 * @param format {@link TextFormatting} to convert.
	 * @return {@link String} converted from {@link TextFormatting}
	 */
	public static final String getColorCode(TextFormatting format) {
		switch (format) {
		case AQUA:
			return aqua;
		case BLACK:
			return black;
		case BLUE:
			return blue;
		case BOLD:
			return bold;
		case DARK_AQUA:
			return dark_aqua;
		case DARK_BLUE:
			return dark_blue;
		case DARK_GRAY:
			return dark_gray;
		case DARK_GREEN:
			return dark_green;
		case DARK_PURPLE:
			return dark_purple;
		case DARK_RED:
			return dark_red;
		case GOLD:
			return gold;
		case GRAY:
			return gray;
		case GREEN:
			return green;
		case ITALIC:
			return italic;
		case LIGHT_PURPLE:
			return light_purple;
		case OBFUSCATED:
			return obfuscated;
		case RED:
			return red;
		case RESET:
			return reset;
		case STRIKETHROUGH:
			return strikethrough;
		case UNDERLINE:
			return underline;
		case WHITE:
			return white;
		case YELLOW:
			return yellow;
		default:
			throw new IllegalStateException("Illegal TextFormating:\t" + format.name());
		}
	}

	public static final TextFormatting getColorCode(DyeColor color) {
		switch (color) {
		case BLACK:
			return TextFormatting.BLACK;
		case BLUE:
			return TextFormatting.BLUE;
		case BROWN:
			return TextFormatting.DARK_BLUE;
		case CYAN:
			return TextFormatting.DARK_AQUA;
		case GRAY:
			return TextFormatting.DARK_GRAY;
		case GREEN:
			return TextFormatting.DARK_GREEN;
		case LIGHT_BLUE:
			return TextFormatting.AQUA;
		case LIGHT_GRAY:
			return TextFormatting.GRAY;
		case LIME:
			return TextFormatting.GREEN;
		case MAGENTA:
			return TextFormatting.LIGHT_PURPLE;
		case ORANGE:
			return TextFormatting.GOLD;
		case PINK:
			return TextFormatting.RED;
		case PURPLE:
			return TextFormatting.DARK_PURPLE;
		case RED:
			return TextFormatting.DARK_RED;
		case WHITE:
			return TextFormatting.WHITE;
		case YELLOW:
			return TextFormatting.YELLOW;
		default:
			return TextFormatting.RESET;
		}
	}
}