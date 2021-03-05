package net.hypixel.skyblock.potion;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link Potion} for this Mod.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Potions">Click here</a> for
 * a list of all potions.<br>
 * All Potions are named "effect_amplifierduration".<br>
 * Example: {@link #adrenaline_00} is named for {@link #adrenaline_effect} of
 * amplifier 0 lasting for {@link #duration_0}
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 02 June 2020
 */
public class PotionInit {
	/**
	 * The default duration for {@link Potion}.<br>
	 * 210 seconds.
	 */
	private static final int duration_0 = 0x1068;
	/**
	 * The primary extended duration for {@link Potion}.<br>
	 * 480 seconds.
	 */
	private static final int duration_1 = 0x2580;
	/**
	 * The secondary extended duration for {@link Potion}.<br>
	 * 960 seconds.
	 */
	private static final int duration_2 = 0x4B00;
	/**
	 * The tertiary extended duration for the {@link Potion}.<br>
	 * 2400 seconds.
	 */
	private static final int duration_3 = 0xBB80;

	public static final DeferredRegister<Effect> effects = DeferredRegister.create(ForgeRegistries.POTIONS,
			HypixelSkyBlockMod.MOD_ID);
	public static final DeferredRegister<Potion> potions = DeferredRegister.create(ForgeRegistries.POTION_TYPES,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<Effect> agility_effect = effects.register("agility",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x208020));
	public static final RegistryObject<Effect> adrenaline_effect = effects.register("adrenaline",
			() -> new ModEffect(EffectType.BENEFICIAL, 0xFF5555));
	public static final RegistryObject<Effect> archery_effect = effects.register("archery",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x55FFFF));
	public static final RegistryObject<Effect> burning_effect = effects.register("burning",
			() -> new ModEffect(EffectType.HARMFUL, 0xFF8000));
	public static final RegistryObject<Effect> critical_effect = effects.register("critical",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x800000));
	public static final RegistryObject<Effect> dodge_effect = effects.register("dodge",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x5555FF));
	public static final RegistryObject<Effect> experience_effect = effects.register("experience",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x0000FF));
	public static final RegistryObject<Effect> fly_effect = effects.register("fly",
			() -> new ModEffect(EffectType.BENEFICIAL, 0xffffff));
	public static final RegistryObject<Effect> knockback_effect = effects.register("knockback",
			() -> new ModEffect(EffectType.NEUTRAL, 0xFF5555));
	public static final RegistryObject<Effect> pet_luck_effect = effects.register("pet_luck",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x177217));
	public static final RegistryObject<Effect> mana_effect = effects.register("mana",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x000080));
	public static final RegistryObject<Effect> rabbit_effect = effects.register("rabbit",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x008000));
	public static final RegistryObject<Effect> stun_effect = effects.register("stun",
			() -> new ModEffect(EffectType.HARMFUL, 0x800000));
	public static final RegistryObject<Effect> stamina_effect = effects.register("stamina",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x004000));
	public static final RegistryObject<Effect> true_resistance_effect = effects.register("true_resistance",
			() -> new ModEffect(EffectType.BENEFICIAL, 0x088008));
	public static final RegistryObject<Effect> venomous_effect = effects.register("venomous",
			() -> new ModEffect(EffectType.HARMFUL, 0x2E9D22));
	public static final RegistryObject<Effect> wounded_effect = effects.register("wounded",
			() -> new ModEffect(EffectType.HARMFUL, 0x701717));

	public static final RegistryObject<Potion> absorption_00 = potions.register("absorption_00",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 0)));
	public static final RegistryObject<Potion> absorption_01 = potions.register("absorption_01",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 0)));
	public static final RegistryObject<Potion> absorption_02 = potions.register("absorption_02",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 0)));
	public static final RegistryObject<Potion> absorption_03 = potions.register("absorption_03",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 0)));
	public static final RegistryObject<Potion> absorption_10 = potions.register("absorption_10",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 1)));
	public static final RegistryObject<Potion> absorption_11 = potions.register("absorption_11",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 1)));
	public static final RegistryObject<Potion> absorption_12 = potions.register("absorption_12",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 1)));
	public static final RegistryObject<Potion> absorption_13 = potions.register("absorption_13",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 1)));
	public static final RegistryObject<Potion> absorption_20 = potions.register("absorption_20",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 2)));
	public static final RegistryObject<Potion> absorption_21 = potions.register("absorption_21",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 2)));
	public static final RegistryObject<Potion> absorption_22 = potions.register("absorption_22",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 2)));
	public static final RegistryObject<Potion> absorption_23 = potions.register("absorption_23",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 2)));
	public static final RegistryObject<Potion> absorption_30 = potions.register("absorption_30",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 3)));
	public static final RegistryObject<Potion> absorption_31 = potions.register("absorption_31",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 3)));
	public static final RegistryObject<Potion> absorption_32 = potions.register("absorption_32",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 3)));
	public static final RegistryObject<Potion> absorption_33 = potions.register("absorption_33",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 3)));
	public static final RegistryObject<Potion> absorption_40 = potions.register("absorption_40",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 4)));
	public static final RegistryObject<Potion> absorption_41 = potions.register("absorption_41",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 4)));
	public static final RegistryObject<Potion> absorption_42 = potions.register("absorption_42",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 4)));
	public static final RegistryObject<Potion> absorption_43 = potions.register("absorption_43",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 4)));
	public static final RegistryObject<Potion> absorption_50 = potions.register("absorption_50",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 5)));
	public static final RegistryObject<Potion> absorption_51 = potions.register("absorption_51",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 5)));
	public static final RegistryObject<Potion> absorption_52 = potions.register("absorption_52",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 5)));
	public static final RegistryObject<Potion> absorption_53 = potions.register("absorption_53",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 5)));
	public static final RegistryObject<Potion> absorption_60 = potions.register("absorption_60",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 6)));
	public static final RegistryObject<Potion> absorption_61 = potions.register("absorption_61",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 6)));
	public static final RegistryObject<Potion> absorption_62 = potions.register("absorption_62",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 6)));
	public static final RegistryObject<Potion> absorption_63 = potions.register("absorption_63",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 6)));
	public static final RegistryObject<Potion> absorption_70 = potions.register("absorption_70",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_0, 7)));
	public static final RegistryObject<Potion> absorption_71 = potions.register("absorption_71",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_1, 7)));
	public static final RegistryObject<Potion> absorption_72 = potions.register("absorption_72",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_2, 7)));
	public static final RegistryObject<Potion> absorption_73 = potions.register("absorption_73",
			() -> new Potion(new EffectInstance(Effects.ABSORPTION, duration_3, 7)));

	public static final RegistryObject<Potion> adrenaline_00 = potions.register("adrenaline_00",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> adrenaline_01 = potions.register("adrenaline_01",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> adrenaline_02 = potions.register("adrenaline_02",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> adrenaline_03 = potions.register("adrenaline_03",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_3, 0)));
	public static final RegistryObject<Potion> adrenaline_10 = potions.register("adrenaline_10",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_0, 1)));
	public static final RegistryObject<Potion> adrenaline_11 = potions.register("adrenaline_11",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_1, 1)));
	public static final RegistryObject<Potion> adrenaline_12 = potions.register("adrenaline_12",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_2, 1)));
	public static final RegistryObject<Potion> adrenaline_13 = potions.register("adrenaline_13",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_3, 1)));
	public static final RegistryObject<Potion> adrenaline_20 = potions.register("adrenaline_20",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_0, 2)));
	public static final RegistryObject<Potion> adrenaline_21 = potions.register("adrenaline_21",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_1, 2)));
	public static final RegistryObject<Potion> adrenaline_22 = potions.register("adrenaline_22",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_2, 2)));
	public static final RegistryObject<Potion> adrenaline_23 = potions.register("adrenaline_23",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_3, 2)));
	public static final RegistryObject<Potion> adrenaline_30 = potions.register("adrenaline_30",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_0, 3)));
	public static final RegistryObject<Potion> adrenaline_31 = potions.register("adrenaline_31",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_1, 3)));
	public static final RegistryObject<Potion> adrenaline_32 = potions.register("adrenaline_32",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_2, 3)));
	public static final RegistryObject<Potion> adrenaline_33 = potions.register("adrenaline_33",
			() -> new Potion(new EffectInstance(adrenaline_effect.get(), duration_3, 3)));

	public static final RegistryObject<Potion> agility_00 = potions.register("agility_00",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> agility_01 = potions.register("agility_01",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> agility_02 = potions.register("agility_02",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> agility_03 = potions.register("agility_03",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_3, 0)));
	public static final RegistryObject<Potion> agility_10 = potions.register("agility_10",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_0, 1)));
	public static final RegistryObject<Potion> agility_11 = potions.register("agility_11",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_1, 1)));
	public static final RegistryObject<Potion> agility_12 = potions.register("agility_12",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_2, 1)));
	public static final RegistryObject<Potion> agility_13 = potions.register("agility_13",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_3, 1)));
	public static final RegistryObject<Potion> agility_20 = potions.register("agility_20",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_0, 2)));
	public static final RegistryObject<Potion> agility_21 = potions.register("agility_21",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_1, 2)));
	public static final RegistryObject<Potion> agility_22 = potions.register("agility_22",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_2, 2)));
	public static final RegistryObject<Potion> agility_23 = potions.register("agility_23",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_3, 2)));
	public static final RegistryObject<Potion> agility_30 = potions.register("agility_30",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_0, 3)));
	public static final RegistryObject<Potion> agility_31 = potions.register("agility_31",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_1, 3)));
	public static final RegistryObject<Potion> agility_32 = potions.register("agility_32",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_2, 3)));
	public static final RegistryObject<Potion> agility_33 = potions.register("agility_33",
			() -> new Potion(new EffectInstance(agility_effect.get(), duration_3, 3)));

	public static final RegistryObject<Potion> archery_00 = potions.register("archery_00",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> archery_01 = potions.register("archery_01",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> archery_02 = potions.register("archery_02",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> archery_03 = potions.register("archery_03",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_3, 0)));
	public static final RegistryObject<Potion> archery_10 = potions.register("archery_10",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_0, 1)));
	public static final RegistryObject<Potion> archery_11 = potions.register("archery_11",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_1, 1)));
	public static final RegistryObject<Potion> archery_12 = potions.register("archery_12",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_2, 1)));
	public static final RegistryObject<Potion> archery_13 = potions.register("archery_13",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_3, 1)));
	public static final RegistryObject<Potion> archery_20 = potions.register("archery_20",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_0, 2)));
	public static final RegistryObject<Potion> archery_21 = potions.register("archery_21",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_1, 2)));
	public static final RegistryObject<Potion> archery_22 = potions.register("archery_22",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_2, 2)));
	public static final RegistryObject<Potion> archery_23 = potions.register("archery_23",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_3, 2)));
	public static final RegistryObject<Potion> archery_30 = potions.register("archery_30",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_0, 3)));
	public static final RegistryObject<Potion> archery_31 = potions.register("archery_31",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_1, 3)));
	public static final RegistryObject<Potion> archery_32 = potions.register("archery_32",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_2, 3)));
	public static final RegistryObject<Potion> archery_33 = potions.register("archery_33",
			() -> new Potion(new EffectInstance(archery_effect.get(), duration_3, 3)));

	public static final RegistryObject<Potion> burning_00 = potions.register("burning_00",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> burning_01 = potions.register("burning_01",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> burning_02 = potions.register("burning_02",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> burning_03 = potions.register("burning_03",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_3, 0)));
	public static final RegistryObject<Potion> burning_10 = potions.register("burning_10",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_0, 1)));
	public static final RegistryObject<Potion> burning_11 = potions.register("burning_11",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_1, 1)));
	public static final RegistryObject<Potion> burning_12 = potions.register("burning_12",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_2, 1)));
	public static final RegistryObject<Potion> burning_13 = potions.register("burning_13",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_3, 1)));
	public static final RegistryObject<Potion> burning_20 = potions.register("burning_20",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_0, 2)));
	public static final RegistryObject<Potion> burning_21 = potions.register("burning_21",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_1, 2)));
	public static final RegistryObject<Potion> burning_22 = potions.register("burning_22",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_2, 2)));
	public static final RegistryObject<Potion> burning_23 = potions.register("burning_23",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_3, 2)));
	public static final RegistryObject<Potion> burning_30 = potions.register("burning_30",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_0, 3)));
	public static final RegistryObject<Potion> burning_31 = potions.register("burning_31",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_1, 3)));
	public static final RegistryObject<Potion> burning_32 = potions.register("burning_32",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_2, 3)));
	public static final RegistryObject<Potion> burning_33 = potions.register("burning_33",
			() -> new Potion(new EffectInstance(burning_effect.get(), duration_3, 3)));

	public static final RegistryObject<Potion> critical_00 = potions.register("critical_00",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> critical_01 = potions.register("critical_01",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> critical_02 = potions.register("critical_02",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> critical_03 = potions.register("critical_03",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_3, 0)));
	public static final RegistryObject<Potion> critical_10 = potions.register("critical_10",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_0, 1)));
	public static final RegistryObject<Potion> critical_11 = potions.register("critical_11",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_1, 1)));
	public static final RegistryObject<Potion> critical_12 = potions.register("critical_12",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_2, 1)));
	public static final RegistryObject<Potion> critical_13 = potions.register("critical_13",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_3, 1)));
	public static final RegistryObject<Potion> critical_20 = potions.register("critical_20",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_0, 2)));
	public static final RegistryObject<Potion> critical_21 = potions.register("critical_21",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_1, 2)));
	public static final RegistryObject<Potion> critical_22 = potions.register("critical_22",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_2, 2)));
	public static final RegistryObject<Potion> critical_23 = potions.register("critical_23",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_3, 2)));
	public static final RegistryObject<Potion> critical_30 = potions.register("critical_30",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_0, 3)));
	public static final RegistryObject<Potion> critical_31 = potions.register("critical_31",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_1, 3)));
	public static final RegistryObject<Potion> critical_32 = potions.register("critical_32",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_2, 3)));
	public static final RegistryObject<Potion> critical_33 = potions.register("critical_33",
			() -> new Potion(new EffectInstance(critical_effect.get(), duration_3, 3)));

	public static final RegistryObject<Potion> dodge_00 = potions.register("dodge_00",
			() -> new Potion(new EffectInstance(dodge_effect.get(), duration_0, 0)));
	public static final RegistryObject<Potion> dodge_01 = potions.register("dodge_01",
			() -> new Potion(new EffectInstance(dodge_effect.get(), duration_1, 0)));
	public static final RegistryObject<Potion> dodge_02 = potions.register("dodge_02",
			() -> new Potion(new EffectInstance(dodge_effect.get(), duration_2, 0)));
	public static final RegistryObject<Potion> dodge_03 = potions.register("dodge_03",
			() -> new Potion(new EffectInstance(dodge_effect.get(), duration_3, 0)));

	public static final RegistryObject<Potion> experience_00 = potions.register("experience_0",
			() -> new Potion(new EffectInstance(experience_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> fly_00 = potions.register("fly_00",
			() -> new Potion(new EffectInstance(fly_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> knockback_00 = potions.register("knockback_00",
			() -> new Potion(new EffectInstance(knockback_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> mana_00 = potions.register("mana_00",
			() -> new Potion(new EffectInstance(mana_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> pet_luck_00 = potions.register("pet_luck_00",
			() -> new Potion(new EffectInstance(pet_luck_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> rabbit_00 = potions.register("rabbit_00",
			() -> new Potion(new EffectInstance(rabbit_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> stamina_00 = potions.register("stamina_00",
			() -> new Potion(new EffectInstance(stamina_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> stun_00 = potions.register("stun_00",
			() -> new Potion(new EffectInstance(stun_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> true_resistance_00 = potions.register("true_resistance_00",
			() -> new Potion(new EffectInstance(true_resistance_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> venomous_00 = potions.register("venomous_00",
			() -> new Potion(new EffectInstance(venomous_effect.get(), duration_0, 0)));

	public static final RegistryObject<Potion> wounded_00 = potions.register("wounded_00",
			() -> new Potion(new EffectInstance(wounded_effect.get(), duration_0, 0)));
}