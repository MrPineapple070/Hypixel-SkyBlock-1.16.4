package net.hypixel.skyblock.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.enchantment.Bank;
import net.hypixel.skyblock.enchantment.LifeSteal;
import net.hypixel.skyblock.enchantment.SmeltingTouch;
import net.hypixel.skyblock.enchantment.Telekinesis;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all the {@link Enchantment} for this Mod.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Enchantments">Click here
 * for a description of the Enchantments</a>
 *
 * @author MrPineapple070
 * @version 17 September 2020
 * @since 11 June 2019
 */
public class EnchantmentInit {
	/**
	 * A {@code DeferredRegister} for {@code Enchantment}
	 */
	public static final DeferredRegister<Enchantment> enchantments = DeferredRegister
			.create(ForgeRegistries.ENCHANTMENTS, HypixelSkyBlockMod.MOD_ID);

	// Sword
	// public static final RegistryObject<Enchantment> critical =
	// enchantments.register("critical" , () -> new Enchantment ());
	// public static final RegistryObjcet<Enchantment> cubism =
	// enchantments.register("cubism" , () -> new Enchantment ());
	// public static final RegistryObject<Enchantment> dragon_hunter =
	// enchantments.register("dragon_hunter" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> ender_slayer =
	// enchantments.register("ender_slayer" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> execute =
	// enchantments.register("execute" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> experience =
	// enchantments.register("experience" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> first_strike =
	// enchantments.register("first_strike" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> impaling =
	// enchantments.register("impaling" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> lethality =
	// enchantments.register("lethality" , () -> new Enchantment());
	public static final RegistryObject<Enchantment> life_steal = enchantments.register("life_steal", LifeSteal::new);
	// Tools
	// public static final RegistryObject<Enchantment> experience =
	// enchantments.register("experience" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> harvesting =
	// enchantments.register("harvesting" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> rainbow =
	// enchantments.register("rainbow" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> replenish =
	// enchantments.register("replenish" , () -> new Enchantment());
	public static final RegistryObject<Enchantment> smelting_touch = enchantments.register("smelting_touch",
			SmeltingTouch::new);

	// Bow
	// public static final RegistryObject<Enchantment> aiming =
	// enchantments.register("aiming" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> cubism =
	// enchantments.register("cubism" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> dragon_hunter =
	// enchantments.register("dragon_hunter" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> impaling =
	// enchantments.register("impaling" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> piercing =
	// enchantments.register("piercing" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> snipe =
	// enchantments.register("snipe" , () -> new Enchantment());
	public static final RegistryObject<Enchantment> telekinesis_bow = enchantments.register("telekinesis_bow",
			() -> new Telekinesis(EnchantmentType.BOW));

	// Armor
	// public static final RegistryObject<Enchantment> growth =
	// enchantments.register("growth" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> rejuvenate =
	// enchantments.register("rejuvenate" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> true_protection =
	// enchantments.register("true_protection" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> sugar_rush =
	// enchantments.register("sugar_rush" , () -> new Enchantment());

	// Fishing Rod
	// public static final RegistryObject<Enchantment> angler =
	// enchantments.register("angler" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> blessing =
	// enchantments.register("blessing" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> caster =
	// enchantments.register("caster" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> frail =
	// enchantments.register("frail" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> magnent =
	// enchantments.register("magnent" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> spiked_hook =
	// enchantments.register("spiked_hook" , () -> new Enchantment());
	public static final RegistryObject<Enchantment> telekinesis_rod = enchantments.register("telekinesis_rod",
			() -> new Telekinesis(EnchantmentType.FISHING_ROD));
	public static final RegistryObject<Enchantment> telekinesis_tool = enchantments.register("telekinesis_tool",
			() -> new Telekinesis(EnchantmentType.DIGGER));

	// public static final RegistryObject<Enchantment> luck =
	// enchantments.register("luck" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> scavenger =
	// enchantments.register("scavenger" , () -> new Enchantment());
	public static final RegistryObject<Enchantment> telekinesis_weapon = enchantments.register("telekinesis_weapon",
			() -> new Telekinesis(EnchantmentType.WEAPON));
	// public static final RegistryObject<Enchantment> vampirism =
	// enchantments.register("vampirism" , () -> new Enchantment());
	// public static final RegistryObject<Enchantment> venomous =
	// enchantments.register("venomous" , () -> new Enchantment());

	public static final RegistryObject<Enchantment> bank = enchantments.register("bank", Bank::new);
}