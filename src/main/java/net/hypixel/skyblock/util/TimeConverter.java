package net.hypixel.skyblock.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import com.google.common.collect.ImmutableList;

/**
 * A conversion between hours and in-game ticks.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class TimeConverter {
	/**
	 * An {@link ImmutableList} that converts hours to Minecraft Ticks.<br>
	 */
	public static final ImmutableList<Long> hours = ImmutableList
			.copyOf(Arrays.asList(0x4650l, 0x4A38l, 0x4E20l, 0x5208l, 0l, 1000l, 2000l, 3000l, 4000l, 5000l, 6000l,
					7000l, 8000l, 9000l, 0x2710l, 0x2AF8l, 0x2EE0l, 13000l, 14000l, 15000l, 15000l, 16000l, 17000l));

	/**
	 * A {@link Map} from {@link String} to {@link Long}.<br>
	 * Useful for getting time using common names.<br>
	 * Example: the {@link Map#get(Object)} with {@code "sunrise"} as input will
	 * return {@code 23000l}
	 */
	private static final Map<String, Long> nameToTicks = new HashMap<>();

	/**
	 * A {@link SimpleDateFormat} used to format time to 12-hour format.
	 */
	private static final SimpleDateFormat SDFTwelve = new SimpleDateFormat("h:mm:ss aa", Locale.ENGLISH);

	/**
	 * A {@link SimpleDateFormat} used to format time to 24-hour format.
	 */
	private static final SimpleDateFormat SDFTwentyFour = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);

	/**
	 * The number of ticks in a day
	 */
	public static final int ticksPerDay = 0x5dc0;

	/**
	 * The number of ticks in an hour.
	 */
	public static final int ticksPerHour = 0x3e8;

	/**
	 * The number of ticks in a minute.
	 */
	public static final double ticksPerMinute = ticksPerHour / 60d;

	/**
	 * The number of ticks in a second.
	 */
	public static final double ticksPerSecond = ticksPerHour / 3600d;

	static {
		SDFTwentyFour.setTimeZone(TimeZone.getTimeZone("GMT"));
		SDFTwelve.setTimeZone(TimeZone.getTimeZone("GMT"));

		nameToTicks.put("sunrise", 23000l);
		nameToTicks.put("dawn", 23000l);
		nameToTicks.put("daystart", 0l);
		nameToTicks.put("day", 0l);
		nameToTicks.put("morning", 1000l);
		nameToTicks.put("midday", 6000l);
		nameToTicks.put("noon", 6000l);
		nameToTicks.put("afternoon", 9000l);
		nameToTicks.put("sunset", 12000l);
		nameToTicks.put("dusk", 12000l);
		nameToTicks.put("sundown", 12000l);
		nameToTicks.put("nightfall", 12000l);
		nameToTicks.put("nightstart", 14000l);
		nameToTicks.put("night", 14000l);
		nameToTicks.put("midnight", 18000l);
	}

	/**
	 * Formats the number of ticks in a 12-hour format.
	 *
	 * @param ticks the number of ticks.
	 * @return ticks formated.
	 */
	public static String format12(final long ticks) {
		synchronized (SDFTwelve) {
			return formatDateFormat(ticks, SDFTwelve);
		}
	}

	/**
	 * Formats the number of ticks in a 24-hour format.
	 *
	 * @param ticks the number of ticks.
	 * @return ticks formated.
	 */
	public static String format24(final long ticks) {
		synchronized (SDFTwentyFour) {
			return formatDateFormat(ticks, SDFTwentyFour);
		}
	}

	/**
	 * Formats the number of ticks using {@code format}.
	 *
	 * @param ticks  the number of ticks.
	 * @param format the {@link SimpleDateFormat}.
	 * @return ticks formated.
	 */
	public static String formatDateFormat(final long ticks, final SimpleDateFormat format) {
		final Date date = ticksToDate(ticks);
		return format.format(date);
	}

	/**
	 * Formats the number of ticks to be readable.
	 *
	 * @param ticks the number of ticks.
	 * @return ticks formated.
	 */
	public static String formatTicks(final long ticks) {
		return ticks % ticksPerDay + " ticks";
	}

	/**
	 * Converts hours and minutes into in-game time.<br>
	 * This method does not ensure that {@code minutes} &#60; 60 or {@code minutes}
	 * and {@code hours} &#62; 0.<br>
	 * Essentially, negative values for hours and minutes will be allowed.
	 *
	 * @param hours   the number of hours
	 * @param minutes the number of minutes.
	 * @return converted time.
	 */
	public static long hoursMinutesToTicks(final int hours, final int minutes) {
		long ret = TimeConverter.hours.get(0);
		ret += hours * ticksPerHour;
		ret += minutes * ticksPerMinute;
		ret %= ticksPerDay;
		return ret;
	}

	/**
	 * Master Converter.<br>
	 * Converts a description of the ticks into the number of ticks. Attepts to
	 * convert in this order.
	 * <ol>
	 * <li>{@link #parseTicks(String)}</li>
	 * <li>{@link #parse24(String)}</li>
	 * <li>{@link #parse12(String)}</li>
	 * <li>{@link #parseAlias(String)}</li>
	 * </ol>
	 *
	 * @param desc the description of the ticks.
	 * @return the number of ticks described
	 * @throws NumberFormatException if {@code desc} is not valid.
	 */
	public static long parse(String desc) throws NumberFormatException {
		desc = desc.toLowerCase(Locale.ENGLISH).replaceAll("[^A-Za-z0-9:]", "");
		try {
			return parseTicks(desc);
		} catch (final NumberFormatException nfe) {
		}
		try {
			return parse24(desc);
		} catch (final NumberFormatException nfe) {
		}
		try {
			return parse12(desc);
		} catch (final NumberFormatException nfe) {
		}
		try {
			return parseAlias(desc);
		} catch (final NumberFormatException nfe) {
		}
		throw new NumberFormatException(desc + " is not a valid description.");
	}

	/**
	 * Converts a 12-hour description to the number of ticks.<br>
	 * The description is expected to {@link String#matches(String)} with
	 * {@code "^[0-9]{1,2}([^0-9]?[0-9]{2})?(pm|am)$"}<br>
	 * Uses {@link #hoursMinutesToTicks(int, int)} to convert.
	 *
	 * @param desc the description of the time.
	 * @return the number of ticks described.
	 * @throws NumberFormatException if {@code desc} is not valid.
	 */
	public static long parse12(String desc) throws NumberFormatException {
		if (!desc.matches("^[0-9]{1,2}([^0-9]?[0-9]{2})?(pm|am)$"))
			throw new NumberFormatException();

		int hours = 0;
		int minutes = 0;
		desc = desc.toLowerCase(Locale.ENGLISH);
		final String parsetime = desc.replaceAll("[^0-9]", "");

		switch (parsetime.length()) {
		case 4:
			hours += Integer.parseInt(parsetime.substring(0, 2));
			minutes += Integer.parseInt(parsetime.substring(2, 4));
			break;
		case 3:
			hours += Integer.parseInt(parsetime.substring(0, 1));
			minutes += Integer.parseInt(parsetime.substring(1, 3));
			break;
		case 2:
			hours += Integer.parseInt(parsetime.substring(0, 2));
			break;
		case 1:
			hours += Integer.parseInt(parsetime.substring(0, 1));
			break;
		default:
			throw new NumberFormatException(desc + " is not a valid description");
		}

		if (desc.endsWith("pm") && hours != 12)
			hours += 12;
		if (desc.endsWith("am") && hours == 12)
			hours -= 12;
		return hoursMinutesToTicks(hours, minutes);
	}

	/**
	 * Converts a description of the ticks into the number of ticks.<br>
	 * The description is expected to {@link String#matches(String)} with
	 * {@code "^[0-9]{2}[^0-9]?[0-9]{2}$"}.<br>
	 * Uses {@link #hoursMinutesToTicks(int, int)}
	 *
	 * @param desc the description of the ticks.
	 * @return the number of ticks described
	 * @throws NumberFormatException if {@code desc} is not valid.
	 */
	public static long parse24(String desc) throws NumberFormatException {
		if (!desc.matches("^[0-9]{2}[^0-9]?[0-9]{2}$"))
			throw new NumberFormatException(desc + " is not a valid description");
		desc = desc.toLowerCase(Locale.ENGLISH).replaceAll("[^0-9]", "");
		if (desc.length() != 4)
			throw new NumberFormatException();
		return hoursMinutesToTicks(Integer.parseInt(desc.substring(0, 2)), Integer.parseInt(desc.substring(2, 4)));
	}

	/**
	 * Converts a description into in-game time.<br>
	 * Uses {@link #nameToTicks}.
	 *
	 * @param desc the description of the time.
	 * @return the number of ticks
	 * @throws NumberFormatException if {@code desc}
	 */
	public static long parseAlias(final String desc) throws NumberFormatException {
		final Long ret = nameToTicks.get(desc);
		if (ret == null)
			throw new NumberFormatException(desc + " is not a valid description");
		return ret;
	}

	/**
	 * Converts a description of the ticks into the number of ticks.<br>
	 * The description is expected to {@link String#matches(String)} with
	 * {@code "^[0-9]+ti?c?k?s?$"}<br>
	 * Examples: 0t, 0ticks
	 *
	 * @param desc the description of the ticks.
	 * @return the number of ticks described
	 * @throws NumberFormatException if {@code desc} is not valid.
	 */
	public static long parseTicks(String desc) throws NumberFormatException {
		if (!desc.matches("^[0-9]+ti?c?k?s?$"))
			throw new NumberFormatException(desc + " is not a valid description");
		desc = desc.replaceAll("[^0-9]", "");
		return Long.parseLong(desc) % ticksPerDay;
	}

	/**
	 * Converts a number of ticks to a {@link Date}.
	 *
	 * @param ticks the current in-game time.
	 * @return converted ticks.
	 */
	public static Date ticksToDate(long ticks) {
		// Assume the server time starts at 0. It would start on a day.
		// But we will simulate that the server started with 0 at midnight.
		ticks = ticks - TimeConverter.hours.get(0) + ticksPerDay;

		// How many in-game days have passed since the server start?
		final long days = ticks / ticksPerDay;
		ticks -= days * ticksPerDay;

		// How many hours on the last day?
		final long hours = ticks / ticksPerHour;
		ticks -= hours * ticksPerHour;

		// How many minutes on the last day?
		final long minutes = (long) (ticks / ticksPerMinute);
		final double dticks = ticks - minutes * ticksPerMinute;

		// How many seconds on the last day?
		final long seconds = (long) (dticks / ticksPerSecond);

		// Now we create an English UTC calendar
		final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
		cal.setLenient(true);

		// And we set the time to 0. And append the time that passed!
		cal.set(0, Calendar.JANUARY, 1, 0, 0, 0);
		cal.add(Calendar.DAY_OF_YEAR, (int) days);
		cal.add(Calendar.HOUR_OF_DAY, (int) hours);
		cal.add(Calendar.MINUTE, (int) minutes);
		cal.add(Calendar.SECOND, (int) seconds + 1); // To solve rounding errors.

		return cal.getTime();
	}
}