package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.armor.angler.AnglerBoots;
import net.hypixel.skyblock.items.armor.angler.AnglerChestplate;
import net.hypixel.skyblock.items.armor.angler.AnglerHelmet;
import net.hypixel.skyblock.items.armor.angler.AnglerLeggings;
import net.hypixel.skyblock.items.armor.bat_person.BatPersonSet;
import net.hypixel.skyblock.items.armor.blaze.BlazeBoots;
import net.hypixel.skyblock.items.armor.blaze.BlazeChestplate;
import net.hypixel.skyblock.items.armor.blaze.BlazeHelmet;
import net.hypixel.skyblock.items.armor.blaze.BlazeLeggings;
import net.hypixel.skyblock.items.armor.cactus.CactusBoots;
import net.hypixel.skyblock.items.armor.cactus.CactusChestplate;
import net.hypixel.skyblock.items.armor.cactus.CactusHelmet;
import net.hypixel.skyblock.items.armor.cactus.CactusLeggings;
import net.hypixel.skyblock.items.armor.cheap_tuxedo.CheapTuxedoBoots;
import net.hypixel.skyblock.items.armor.cheap_tuxedo.CheapTuxedoChestplate;
import net.hypixel.skyblock.items.armor.cheap_tuxedo.CheapTuxedoLeggings;
import net.hypixel.skyblock.items.armor.crystal.CrystalBoots;
import net.hypixel.skyblock.items.armor.crystal.CrystalChestplate;
import net.hypixel.skyblock.items.armor.crystal.CrystalHelmet;
import net.hypixel.skyblock.items.armor.crystal.CrystalLeggings;
import net.hypixel.skyblock.items.armor.diver.DiverBoots;
import net.hypixel.skyblock.items.armor.diver.DiverChestplate;
import net.hypixel.skyblock.items.armor.diver.DiverHelmet;
import net.hypixel.skyblock.items.armor.diver.DiverLeggings;
import net.hypixel.skyblock.items.armor.elegant_tuxedo.ElegantTuxedoBoots;
import net.hypixel.skyblock.items.armor.elegant_tuxedo.ElegantTuxedoChestplate;
import net.hypixel.skyblock.items.armor.elegant_tuxedo.ElegantTuxedoLeggings;
import net.hypixel.skyblock.items.armor.ember.EmberBoots;
import net.hypixel.skyblock.items.armor.ember.EmberChestplate;
import net.hypixel.skyblock.items.armor.ember.EmberHelmet;
import net.hypixel.skyblock.items.armor.ember.EmberLeggings;
import net.hypixel.skyblock.items.armor.emerald.EmeraldBoots;
import net.hypixel.skyblock.items.armor.emerald.EmeraldChestplate;
import net.hypixel.skyblock.items.armor.emerald.EmeraldHelmet;
import net.hypixel.skyblock.items.armor.emerald.EmeraldLeggings;
import net.hypixel.skyblock.items.armor.ender.EnderBoots;
import net.hypixel.skyblock.items.armor.ender.EnderChestplate;
import net.hypixel.skyblock.items.armor.ender.EnderHelmet;
import net.hypixel.skyblock.items.armor.ender.EnderLeggings;
import net.hypixel.skyblock.items.armor.fairy.FairyBoots;
import net.hypixel.skyblock.items.armor.fairy.FairyChestplate;
import net.hypixel.skyblock.items.armor.fairy.FairyHelmet;
import net.hypixel.skyblock.items.armor.fairy.FairyLeggings;
import net.hypixel.skyblock.items.armor.fancy_tuxedo.FancyTuxedoBoots;
import net.hypixel.skyblock.items.armor.fancy_tuxedo.FancyTuxedoChestplate;
import net.hypixel.skyblock.items.armor.fancy_tuxedo.FancyTuxedoLeggings;
import net.hypixel.skyblock.items.armor.farm.FarmBoots;
import net.hypixel.skyblock.items.armor.farm.FarmChestplate;
import net.hypixel.skyblock.items.armor.farm.FarmHelmet;
import net.hypixel.skyblock.items.armor.farm.FarmLeggings;
import net.hypixel.skyblock.items.armor.farm_suit.FarmSuitBoots;
import net.hypixel.skyblock.items.armor.farm_suit.FarmSuitChestplate;
import net.hypixel.skyblock.items.armor.farm_suit.FarmSuitHelmet;
import net.hypixel.skyblock.items.armor.farm_suit.FarmSuitLeggings;
import net.hypixel.skyblock.items.armor.frozen_blaze.FrozenBlazeBoots;
import net.hypixel.skyblock.items.armor.frozen_blaze.FrozenBlazeChestplate;
import net.hypixel.skyblock.items.armor.frozen_blaze.FrozenBlazeHelmet;
import net.hypixel.skyblock.items.armor.frozen_blaze.FrozenBlazeLeggings;
import net.hypixel.skyblock.items.armor.golem.GolemBoots;
import net.hypixel.skyblock.items.armor.golem.GolemChestplate;
import net.hypixel.skyblock.items.armor.golem.GolemHelmet;
import net.hypixel.skyblock.items.armor.golem.GolemLeggings;
import net.hypixel.skyblock.items.armor.growth.GrowthBoots;
import net.hypixel.skyblock.items.armor.growth.GrowthChestplate;
import net.hypixel.skyblock.items.armor.growth.GrowthHelmet;
import net.hypixel.skyblock.items.armor.growth.GrowthLeggings;
import net.hypixel.skyblock.items.armor.hardened_diamond.HardenedDiamondSet;
import net.hypixel.skyblock.items.armor.holy_dragon.HolyDragonBoots;
import net.hypixel.skyblock.items.armor.holy_dragon.HolyDragonChestplate;
import net.hypixel.skyblock.items.armor.holy_dragon.HolyDragonHelmet;
import net.hypixel.skyblock.items.armor.holy_dragon.HolyDragonLeggings;
import net.hypixel.skyblock.items.armor.lapis.LapisSet;
import net.hypixel.skyblock.items.armor.leaflet.LeafletBoots;
import net.hypixel.skyblock.items.armor.leaflet.LeafletChestplate;
import net.hypixel.skyblock.items.armor.leaflet.LeafletHelmet;
import net.hypixel.skyblock.items.armor.leaflet.LeafletLeggings;
import net.hypixel.skyblock.items.armor.magma.MagmaBoots;
import net.hypixel.skyblock.items.armor.magma.MagmaChestplate;
import net.hypixel.skyblock.items.armor.magma.MagmaHelmet;
import net.hypixel.skyblock.items.armor.magma.MagmaLeggings;
import net.hypixel.skyblock.items.armor.mastiff.MastiffBoots;
import net.hypixel.skyblock.items.armor.mastiff.MastiffChestplate;
import net.hypixel.skyblock.items.armor.mastiff.MastiffHelmet;
import net.hypixel.skyblock.items.armor.mastiff.MastiffLeggings;
import net.hypixel.skyblock.items.armor.miner.MinerBoots;
import net.hypixel.skyblock.items.armor.miner.MinerChestplate;
import net.hypixel.skyblock.items.armor.miner.MinerHelmet;
import net.hypixel.skyblock.items.armor.miner.MinerLeggings;
import net.hypixel.skyblock.items.armor.miner_outfit.MinerOutfitSet;
import net.hypixel.skyblock.items.armor.mushroom.MushroomBoots;
import net.hypixel.skyblock.items.armor.mushroom.MushroomChestplate;
import net.hypixel.skyblock.items.armor.mushroom.MushroomHelmet;
import net.hypixel.skyblock.items.armor.mushroom.MushroomLeggings;
import net.hypixel.skyblock.items.armor.old_dragon.OldDragonBoots;
import net.hypixel.skyblock.items.armor.old_dragon.OldDragonChestplate;
import net.hypixel.skyblock.items.armor.old_dragon.OldDragonHelmet;
import net.hypixel.skyblock.items.armor.old_dragon.OldDragonLeggings;
import net.hypixel.skyblock.items.armor.pack.PackBoots;
import net.hypixel.skyblock.items.armor.pack.PackChestplate;
import net.hypixel.skyblock.items.armor.pack.PackHelmet;
import net.hypixel.skyblock.items.armor.pack.PackLeggings;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect1;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect2;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect3;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect4;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect5;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect6;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect7;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect8;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.Perfect9;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.PerfectA;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.PerfectB;
import net.hypixel.skyblock.items.armor.perfect.PerfectSet.PerfectC;
import net.hypixel.skyblock.items.armor.protector_dragon.ProtectorDragonBoots;
import net.hypixel.skyblock.items.armor.protector_dragon.ProtectorDragonChestplate;
import net.hypixel.skyblock.items.armor.protector_dragon.ProtectorDragonHelmet;
import net.hypixel.skyblock.items.armor.protector_dragon.ProtectorDragonLeggings;
import net.hypixel.skyblock.items.armor.pumpkin.PumpkinBoots;
import net.hypixel.skyblock.items.armor.pumpkin.PumpkinChestplate;
import net.hypixel.skyblock.items.armor.pumpkin.PumpkinHelmet;
import net.hypixel.skyblock.items.armor.pumpkin.PumpkinLeggings;
import net.hypixel.skyblock.items.armor.revenant.RevenantBoots;
import net.hypixel.skyblock.items.armor.revenant.RevenantChestplate;
import net.hypixel.skyblock.items.armor.revenant.RevenantLeggings;
import net.hypixel.skyblock.items.armor.snow.SnowBoots;
import net.hypixel.skyblock.items.armor.snow.SnowChestplate;
import net.hypixel.skyblock.items.armor.snow.SnowHelmet;
import net.hypixel.skyblock.items.armor.snow.SnowLeggings;
import net.hypixel.skyblock.items.armor.speedster.SpeedsterBoots;
import net.hypixel.skyblock.items.armor.speedster.SpeedsterChestplate;
import net.hypixel.skyblock.items.armor.speedster.SpeedsterHelmet;
import net.hypixel.skyblock.items.armor.speedster.SpeedsterLeggings;
import net.hypixel.skyblock.items.armor.sponge.SpongeBoots;
import net.hypixel.skyblock.items.armor.sponge.SpongeChestplate;
import net.hypixel.skyblock.items.armor.sponge.SpongeHelmet;
import net.hypixel.skyblock.items.armor.sponge.SpongeLeggings;
import net.hypixel.skyblock.items.armor.spooky.SpookyBoots;
import net.hypixel.skyblock.items.armor.spooky.SpookyChestplate;
import net.hypixel.skyblock.items.armor.spooky.SpookyHelmet;
import net.hypixel.skyblock.items.armor.spooky.SpookyLeggings;
import net.hypixel.skyblock.items.armor.strong_dragon.StrongDragonBoots;
import net.hypixel.skyblock.items.armor.strong_dragon.StrongDragonChestplate;
import net.hypixel.skyblock.items.armor.strong_dragon.StrongDragonHelmet;
import net.hypixel.skyblock.items.armor.strong_dragon.StrongDragonLeggings;
import net.hypixel.skyblock.items.armor.superior_dragon.SuperiorDragonBoots;
import net.hypixel.skyblock.items.armor.superior_dragon.SuperiorDragonChestplate;
import net.hypixel.skyblock.items.armor.superior_dragon.SuperiorDragonHelmet;
import net.hypixel.skyblock.items.armor.superior_dragon.SuperiorDragonLeggings;
import net.hypixel.skyblock.items.armor.tarantula.TarantulaBoots;
import net.hypixel.skyblock.items.armor.tarantula.TarantulaChestplate;
import net.hypixel.skyblock.items.armor.tarantula.TarantulaHelmet;
import net.hypixel.skyblock.items.armor.tarantula.TarantulaLeggings;
import net.hypixel.skyblock.items.armor.unstable_dragon.UnstableDragonBoots;
import net.hypixel.skyblock.items.armor.unstable_dragon.UnstableDragonChestplate;
import net.hypixel.skyblock.items.armor.unstable_dragon.UnstableDragonHelmet;
import net.hypixel.skyblock.items.armor.unstable_dragon.UnstableDragonLeggings;
import net.hypixel.skyblock.items.armor.wise_dragon.WiseDragonBoots;
import net.hypixel.skyblock.items.armor.wise_dragon.WiseDragonChestplate;
import net.hypixel.skyblock.items.armor.wise_dragon.WiseDragonHelmet;
import net.hypixel.skyblock.items.armor.wise_dragon.WiseDragonLeggings;
import net.hypixel.skyblock.items.armor.young_dragon.YoungDragonBoots;
import net.hypixel.skyblock.items.armor.young_dragon.YoungDragonChestplate;
import net.hypixel.skyblock.items.armor.young_dragon.YoungDragonHelmet;
import net.hypixel.skyblock.items.armor.young_dragon.YoungDragonLeggings;
import net.hypixel.skyblock.items.armor.zombie.ZombieBoots;
import net.hypixel.skyblock.items.armor.zombie.ZombieChestplate;
import net.hypixel.skyblock.items.armor.zombie.ZombieLeggings;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link ArmorItem} for this Mod.
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 11 June 2019
 */
public class ArmorInit {
	public static final DeferredRegister<Item> armor = DeferredRegister.create(ForgeRegistries.ITEMS,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<ArmorItem> angler_helmet = armor.register("angler_helmet", AnglerHelmet::new);
	public static final RegistryObject<ArmorItem> angler_chestplate = armor.register("angler_chestplate",
			AnglerChestplate::new);
	public static final RegistryObject<ArmorItem> angler_leggings = armor.register("angler_leggings",
			AnglerLeggings::new);
	public static final RegistryObject<ArmorItem> angler_boots = armor.register("angler_boots", AnglerBoots::new);

	public static final RegistryObject<ArmorItem> bat_person_helmet = armor.register("bat_person_helmet",
			() -> new BatPersonSet(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> bat_person_chestplate = armor.register("bat_person_chestplate",
			() -> new BatPersonSet(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> bat_person_leggings = armor.register("bat_person_leggings",
			() -> new BatPersonSet(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> bat_person_boots = armor.register("bat_person_boots",
			() -> new BatPersonSet(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> blaze_helmet = armor.register("blaze_helmet", BlazeHelmet::new);
	public static final RegistryObject<ArmorItem> blaze_chestplate = armor.register("blaze_chestplate",
			BlazeChestplate::new);
	public static final RegistryObject<ArmorItem> blaze_leggings = armor.register("blaze_leggings", BlazeLeggings::new);
	public static final RegistryObject<ArmorItem> blaze_boots = armor.register("blaze_boots", BlazeBoots::new);

	public static final RegistryObject<ArmorItem> cactus_helmet = armor.register("cactus_helmet", CactusHelmet::new);
	public static final RegistryObject<ArmorItem> cactus_chestplate = armor.register("cactus_chestplate",
			CactusChestplate::new);
	public static final RegistryObject<ArmorItem> cactus_leggings = armor.register("cactus_leggings",
			CactusLeggings::new);
	public static final RegistryObject<ArmorItem> cactus_boots = armor.register("cactus_boots", CactusBoots::new);

	public static final RegistryObject<ArmorItem> cheap_tuxedo_chestplate = armor.register("cheap_tuxedo_chestplate",
			CheapTuxedoChestplate::new);
	public static final RegistryObject<ArmorItem> cheap_tuxedo_leggings = armor.register("cheap_tuxedo_leggings",
			CheapTuxedoLeggings::new);
	public static final RegistryObject<ArmorItem> cheap_tuxedo_boots = armor.register("cheap_tuxedo_boots",
			CheapTuxedoBoots::new);

	public static final RegistryObject<ArmorItem> crystal_helmet = armor.register("crystal_helmet", CrystalHelmet::new);
	public static final RegistryObject<ArmorItem> crystal_chestplate = armor.register("crystal_chestplate",
			CrystalChestplate::new);
	public static final RegistryObject<ArmorItem> crystal_leggings = armor.register("crystal_leggings",
			CrystalLeggings::new);
	public static final RegistryObject<ArmorItem> crystal_boots = armor.register("crystal_boots", CrystalBoots::new);

	public static final RegistryObject<ArmorItem> diver_helmet = armor.register("diver_helmet", DiverHelmet::new);
	public static final RegistryObject<ArmorItem> diver_chestplate = armor.register("diver_chestplate",
			DiverChestplate::new);
	public static final RegistryObject<ArmorItem> diver_leggings = armor.register("diver_leggings", DiverLeggings::new);
	public static final RegistryObject<ArmorItem> diver_boots = armor.register("diver_boots", DiverBoots::new);

	public static final RegistryObject<ArmorItem> elegant_tuxedo_chestplate = armor
			.register("elegant_tuxedo_chestplate", ElegantTuxedoChestplate::new);
	public static final RegistryObject<ArmorItem> elegant_tuxedo_leggings = armor.register("elegant_tuxedo_leggings",
			ElegantTuxedoLeggings::new);
	public static final RegistryObject<ArmorItem> elegant_tuxedo_boots = armor.register("elegant_tuxedo_boots",
			ElegantTuxedoBoots::new);

	public static final RegistryObject<ArmorItem> ember_helmet = armor.register("ember_helmet", EmberHelmet::new);
	public static final RegistryObject<ArmorItem> ember_chestplate = armor.register("ember_chestplate",
			EmberChestplate::new);
	public static final RegistryObject<ArmorItem> ember_leggings = armor.register("ember_leggings", EmberLeggings::new);
	public static final RegistryObject<ArmorItem> ember_boots = armor.register("ember_boots", EmberBoots::new);

	public static final RegistryObject<ArmorItem> emerald_helmet = armor.register("emerald_helmet", EmeraldHelmet::new);
	public static final RegistryObject<ArmorItem> emerald_chestplate = armor.register("emerald_chestplate",
			EmeraldChestplate::new);
	public static final RegistryObject<ArmorItem> emerald_leggings = armor.register("emerald_leggings",
			EmeraldLeggings::new);
	public static final RegistryObject<ArmorItem> emerald_boots = armor.register("emerald_boots", EmeraldBoots::new);

	public static final RegistryObject<ArmorItem> ender_helmet = armor.register("ender_helmet", EnderHelmet::new);
	public static final RegistryObject<ArmorItem> ender_chestplate = armor.register("ender_chestplate",
			EnderChestplate::new);
	public static final RegistryObject<ArmorItem> ender_leggings = armor.register("ender_leggings", EnderLeggings::new);
	public static final RegistryObject<ArmorItem> ender_boots = armor.register("ender_boots", EnderBoots::new);

	public static final RegistryObject<ArmorItem> fairy_helmet = armor.register("fairy_helmet", FairyHelmet::new);
	public static final RegistryObject<ArmorItem> fairy_chestplate = armor.register("fairy_chestplate",
			FairyChestplate::new);
	public static final RegistryObject<ArmorItem> fairy_leggings = armor.register("fairy_leggings", FairyLeggings::new);
	public static final RegistryObject<ArmorItem> fairy_boots = armor.register("fairy_boots", FairyBoots::new);

	public static final RegistryObject<ArmorItem> fancy_tuxedo_chestplate = armor.register("fancy_tuxedo_chestplate",
			FancyTuxedoChestplate::new);
	public static final RegistryObject<ArmorItem> fancy_tuxedo_leggings = armor.register("fancy_tuxedo_leggings",
			FancyTuxedoLeggings::new);
	public static final RegistryObject<ArmorItem> fancy_tuxedo_boots = armor.register("fancy_tuxedo_boots",
			FancyTuxedoBoots::new);

	public static final RegistryObject<ArmorItem> farm_helmet = armor.register("farm_helmet", FarmHelmet::new);
	public static final RegistryObject<ArmorItem> farm_chestplate = armor.register("farm_chestplate",
			FarmChestplate::new);
	public static final RegistryObject<ArmorItem> farm_leggings = armor.register("farm_leggings", FarmLeggings::new);
	public static final RegistryObject<ArmorItem> farm_boots = armor.register("farm_boots", FarmBoots::new);

	public static final RegistryObject<ArmorItem> farm_suit_helmet = armor.register("farm_suit_helmet",
			FarmSuitHelmet::new);
	public static final RegistryObject<ArmorItem> farm_suit_chestplate = armor.register("farm_suit_chestplate",
			FarmSuitChestplate::new);
	public static final RegistryObject<ArmorItem> farm_suit_leggings = armor.register("farm_suit_leggings",
			FarmSuitLeggings::new);
	public static final RegistryObject<ArmorItem> farm_suit_boots = armor.register("farm_suit_boots",
			FarmSuitBoots::new);

	public static final RegistryObject<ArmorItem> frozen_blaze_helmet = armor.register("frozen_blaze_helmet",
			FrozenBlazeHelmet::new);
	public static final RegistryObject<ArmorItem> frozen_blaze_chestplate = armor.register("frozen_blaze_chestplate",
			FrozenBlazeChestplate::new);
	public static final RegistryObject<ArmorItem> frozen_blaze_leggings = armor.register("frozen_blaze_leggings",
			FrozenBlazeLeggings::new);
	public static final RegistryObject<ArmorItem> frozen_blaze_boots = armor.register("frozen_blaze_boots",
			FrozenBlazeBoots::new);

	public static final RegistryObject<ArmorItem> golem_helmet = armor.register("golem_helmet", GolemHelmet::new);
	public static final RegistryObject<ArmorItem> golem_chestplate = armor.register("golem_chestplate",
			GolemChestplate::new);
	public static final RegistryObject<ArmorItem> golem_leggings = armor.register("golem_leggings", GolemLeggings::new);
	public static final RegistryObject<ArmorItem> golem_boots = armor.register("golem_boots", GolemBoots::new);

	public static final RegistryObject<ArmorItem> growth_helmet = armor.register("growth_helmet", GrowthHelmet::new);
	public static final RegistryObject<ArmorItem> growth_chestplate = armor.register("growth_chestplate",
			GrowthChestplate::new);
	public static final RegistryObject<ArmorItem> growth_leggings = armor.register("growth_leggings",
			GrowthLeggings::new);
	public static final RegistryObject<ArmorItem> growth_boots = armor.register("growth_boots", GrowthBoots::new);

	public static final RegistryObject<ArmorItem> hardened_diamond_helmet = armor.register("hardened_diamond_helmet",
			() -> new HardenedDiamondSet(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> hardened_diamond_chestplate = armor
			.register("hardened_diamond_chestplate", () -> new HardenedDiamondSet(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> hardened_diamond_leggings = armor
			.register("hardened_diamond_leggings", () -> new HardenedDiamondSet(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> hardened_diamond_boots = armor.register("hardened_diamond_boots",
			() -> new HardenedDiamondSet(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> holy_dragon_helmet = armor.register("holy_dragon_helmet",
			HolyDragonHelmet::new);
	public static final RegistryObject<ArmorItem> holy_dragon_chestplate = armor.register("holy_dragon_chestplate",
			HolyDragonChestplate::new);
	public static final RegistryObject<ArmorItem> holy_dragon_leggings = armor.register("holy_dragon_leggings",
			HolyDragonLeggings::new);
	public static final RegistryObject<ArmorItem> holy_dragon_boots = armor.register("holy_dragon_boots",
			HolyDragonBoots::new);

	public static final RegistryObject<ArmorItem> lapis_helmet = armor.register("lapis_helmet",
			() -> new LapisSet(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> lapis_chestplate = armor.register("lapis_chestplate",
			() -> new LapisSet(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> lapis_leggings = armor.register("lapis_leggings",
			() -> new LapisSet(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> lapis_boots = armor.register("lapis_boots",
			() -> new LapisSet(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> leaflet_helmet = armor.register("leaflet_helmet", LeafletHelmet::new);
	public static final RegistryObject<ArmorItem> leaflet_chestplate = armor.register("leaflet_chestplate",
			LeafletChestplate::new);
	public static final RegistryObject<ArmorItem> leaflet_leggings = armor.register("leaflet_leggings",
			LeafletLeggings::new);
	public static final RegistryObject<ArmorItem> leaflet_boots = armor.register("leaflet_boots", LeafletBoots::new);

	public static final RegistryObject<ArmorItem> magma_helmet = armor.register("magma_helmet", MagmaHelmet::new);
	public static final RegistryObject<ArmorItem> magma_chestplate = armor.register("magma_chestplate",
			MagmaChestplate::new);
	public static final RegistryObject<ArmorItem> magma_leggings = armor.register("magma_leggings", MagmaLeggings::new);
	public static final RegistryObject<ArmorItem> magma_boots = armor.register("magma_boots", MagmaBoots::new);

	public static final RegistryObject<ArmorItem> mastiff_helmet = armor.register("mastiff_helmet", MastiffHelmet::new);
	public static final RegistryObject<ArmorItem> mastiff_chestplate = armor.register("mastiff_chestplate",
			MastiffChestplate::new);
	public static final RegistryObject<ArmorItem> mastiff_leggings = armor.register("mastiff_leggings",
			MastiffLeggings::new);
	public static final RegistryObject<ArmorItem> mastiff_boots = armor.register("mastiff_boots", MastiffBoots::new);

	public static final RegistryObject<ArmorItem> miner_helmet = armor.register("miner_helmet", MinerHelmet::new);
	public static final RegistryObject<ArmorItem> miner_chestplate = armor.register("miner_chestplate",
			MinerChestplate::new);
	public static final RegistryObject<ArmorItem> miner_leggings = armor.register("miner_leggings", MinerLeggings::new);
	public static final RegistryObject<ArmorItem> miner_boots = armor.register("miner_boots", MinerBoots::new);

	public static final RegistryObject<ArmorItem> miner_outfit_helmet = armor.register("miner_outfit_helmet",
			() -> new MinerOutfitSet(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> miner_outfit_chestplate = armor.register("miner_outfit_chestplate",
			() -> new MinerOutfitSet(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> miner_outfit_leggings = armor.register("miner_outfit_leggings",
			() -> new MinerOutfitSet(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> miner_outfit_boots = armor.register("miner_outfit_boots",
			() -> new MinerOutfitSet(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> mushroom_helmet = armor.register("mushroom_helmet",
			MushroomHelmet::new);
	public static final RegistryObject<ArmorItem> mushroom_chestplate = armor.register("mushroom_chestplate",
			MushroomChestplate::new);
	public static final RegistryObject<ArmorItem> mushroom_leggings = armor.register("mushroom_leggings",
			MushroomLeggings::new);
	public static final RegistryObject<ArmorItem> mushroom_boots = armor.register("mushroom_boots", MushroomBoots::new);

	public static final RegistryObject<ArmorItem> old_dragon_helmet = armor.register("old_dragon_helmet",
			OldDragonHelmet::new);
	public static final RegistryObject<ArmorItem> old_dragon_chestplate = armor.register("old_dragon_chestplate",
			OldDragonChestplate::new);
	public static final RegistryObject<ArmorItem> old_dragon_leggings = armor.register("old_dragon_leggings",
			OldDragonLeggings::new);
	public static final RegistryObject<ArmorItem> old_dragon_boots = armor.register("old_dragon_boots",
			OldDragonBoots::new);

	public static final RegistryObject<ArmorItem> pack_helmet = armor.register("pack_helmet", PackHelmet::new);
	public static final RegistryObject<ArmorItem> pack_chestplate = armor.register("pack_chestplate",
			PackChestplate::new);
	public static final RegistryObject<ArmorItem> pack_leggings = armor.register("pack_leggings", PackLeggings::new);
	public static final RegistryObject<ArmorItem> pack_boots = armor.register("pack_boots", PackBoots::new);

	public static final RegistryObject<ArmorItem> perfect_helmet_1 = armor.register("perfect_helmet_1",
			() -> new Perfect1(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_2 = armor.register("perfect_helmet_2",
			() -> new Perfect2(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_3 = armor.register("perfect_helmet_3",
			() -> new Perfect3(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_4 = armor.register("perfect_helmet_4",
			() -> new Perfect4(EquipmentSlotType.HEAD));

	public static final RegistryObject<ArmorItem> perfect_helmet_5 = armor.register("perfect_helmet_5",
			() -> new Perfect5(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_6 = armor.register("perfect_helmet_6",
			() -> new Perfect6(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_7 = armor.register("perfect_helmet_7",
			() -> new Perfect7(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_8 = armor.register("perfect_helmet_8",
			() -> new Perfect8(EquipmentSlotType.HEAD));

	public static final RegistryObject<ArmorItem> perfect_helmet_9 = armor.register("perfect_helmet_9",
			() -> new Perfect9(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_a = armor.register("perfect_helmet_a",
			() -> new PerfectA(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_b = armor.register("perfect_helmet_b",
			() -> new PerfectB(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> perfect_helmet_c = armor.register("perfect_helmet_c",
			() -> new PerfectC(EquipmentSlotType.HEAD));

	public static final RegistryObject<ArmorItem> perfect_chestplate_1 = armor.register("perfect_chestplate_1",
			() -> new Perfect1(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_2 = armor.register("perfect_chestplate_2",
			() -> new Perfect2(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_3 = armor.register("perfect_chestplate_3",
			() -> new Perfect3(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_4 = armor.register("perfect_chestplate_4",
			() -> new Perfect4(EquipmentSlotType.CHEST));

	public static final RegistryObject<ArmorItem> perfect_chestplate_5 = armor.register("perfect_chestplate_5",
			() -> new Perfect5(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_6 = armor.register("perfect_chestplate_6",
			() -> new Perfect6(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_7 = armor.register("perfect_chestplate_7",
			() -> new Perfect7(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_8 = armor.register("perfect_chestplate_8",
			() -> new Perfect8(EquipmentSlotType.CHEST));

	public static final RegistryObject<ArmorItem> perfect_chestplate_9 = armor.register("perfect_chestplate_9",
			() -> new Perfect9(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_a = armor.register("perfect_chestplate_a",
			() -> new PerfectA(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_b = armor.register("perfect_chestplate_b",
			() -> new PerfectB(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> perfect_chestplate_c = armor.register("perfect_chestplate_c",
			() -> new PerfectC(EquipmentSlotType.CHEST));

	public static final RegistryObject<ArmorItem> perfect_leggings_1 = armor.register("perfect_leggings_1",
			() -> new Perfect1(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_2 = armor.register("perfect_leggings_2",
			() -> new Perfect2(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_3 = armor.register("perfect_leggings_3",
			() -> new Perfect3(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_4 = armor.register("perfect_leggings_4",
			() -> new Perfect4(EquipmentSlotType.LEGS));

	public static final RegistryObject<ArmorItem> perfect_leggings_5 = armor.register("perfect_leggings_5",
			() -> new Perfect5(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_6 = armor.register("perfect_leggings_6",
			() -> new Perfect6(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_7 = armor.register("perfect_leggings_7",
			() -> new Perfect7(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_8 = armor.register("perfect_leggings_8",
			() -> new Perfect8(EquipmentSlotType.LEGS));

	public static final RegistryObject<ArmorItem> perfect_leggings_9 = armor.register("perfect_leggings_9",
			() -> new Perfect9(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_a = armor.register("perfect_leggings_a",
			() -> new PerfectA(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_b = armor.register("perfect_leggings_b",
			() -> new PerfectB(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> perfect_leggings_c = armor.register("perfect_leggings_c",
			() -> new PerfectC(EquipmentSlotType.LEGS));

	public static final RegistryObject<ArmorItem> perfect_boots_1 = armor.register("perfect_boots_1",
			() -> new Perfect1(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_2 = armor.register("perfect_boots_2",
			() -> new Perfect2(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_3 = armor.register("perfect_boots_3",
			() -> new Perfect3(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_4 = armor.register("perfect_boots_4",
			() -> new Perfect4(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> perfect_boots_5 = armor.register("perfect_boots_5",
			() -> new Perfect5(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_6 = armor.register("perfect_boots_6",
			() -> new Perfect6(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_7 = armor.register("perfect_boots_7",
			() -> new Perfect7(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_8 = armor.register("perfect_boots_8",
			() -> new Perfect8(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> perfect_boots_9 = armor.register("perfect_boots_9",
			() -> new Perfect9(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_a = armor.register("perfect_boots_a",
			() -> new PerfectA(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_b = armor.register("perfect_boots_b",
			() -> new PerfectB(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> perfect_boots_c = armor.register("perfect_boots_c",
			() -> new PerfectC(EquipmentSlotType.FEET));

	public static final RegistryObject<ArmorItem> protector_dragon_helmet = armor.register("protector_dragon_helmet",
			ProtectorDragonHelmet::new);
	public static final RegistryObject<ArmorItem> protector_dragon_chestplate = armor
			.register("protector_dragon_chestplate", ProtectorDragonChestplate::new);
	public static final RegistryObject<ArmorItem> protector_dragon_leggings = armor
			.register("protector_dragon_leggings", ProtectorDragonLeggings::new);
	public static final RegistryObject<ArmorItem> protector_dragon_boots = armor.register("protector_dragon_boots",
			ProtectorDragonBoots::new);

	public static final RegistryObject<ArmorItem> pumpkin_helmet = armor.register("pumpkin_helmet", PumpkinHelmet::new);
	public static final RegistryObject<ArmorItem> pumpkin_chestplate = armor.register("pumpkin_chestplate",
			PumpkinChestplate::new);
	public static final RegistryObject<ArmorItem> pumpkin_leggings = armor.register("pumpkin_leggings",
			PumpkinLeggings::new);
	public static final RegistryObject<ArmorItem> pumpkin_boots = armor.register("pumpkin_boots", PumpkinBoots::new);

	public static final RegistryObject<ArmorItem> revenant_boots = armor.register("revenant_boots", RevenantBoots::new);
	public static final RegistryObject<ArmorItem> revenant_chestplate = armor.register("revenant_chestplate",
			RevenantChestplate::new);
	public static final RegistryObject<ArmorItem> revenant_leggings = armor.register("revenant_leggings",
			RevenantLeggings::new);

	public static final RegistryObject<ArmorItem> snow_helmet = armor.register("snow_helmet", SnowHelmet::new);
	public static final RegistryObject<ArmorItem> snow_chestplate = armor.register("snow_chestplate",
			SnowChestplate::new);
	public static final RegistryObject<ArmorItem> snow_leggings = armor.register("snow_leggings", SnowLeggings::new);
	public static final RegistryObject<ArmorItem> snow_boots = armor.register("snow_boots", SnowBoots::new);

	public static final RegistryObject<ArmorItem> speedster_helmet = armor.register("speedster_helmet",
			SpeedsterHelmet::new);
	public static final RegistryObject<ArmorItem> speedster_chestplate = armor.register("speedster_chestplate",
			SpeedsterChestplate::new);
	public static final RegistryObject<ArmorItem> speedster_leggings = armor.register("speedster_leggings",
			SpeedsterLeggings::new);
	public static final RegistryObject<ArmorItem> speedster_boots = armor.register("speedster_boots",
			SpeedsterBoots::new);

	public static final RegistryObject<ArmorItem> sponge_helmet = armor.register("sponge_helmet", SpongeHelmet::new);
	public static final RegistryObject<ArmorItem> sponge_chestplate = armor.register("sponge_chestplate",
			SpongeChestplate::new);
	public static final RegistryObject<ArmorItem> sponge_leggings = armor.register("sponge_leggings",
			SpongeLeggings::new);
	public static final RegistryObject<ArmorItem> sponge_boots = armor.register("sponge_boots", SpongeBoots::new);

	public static final RegistryObject<ArmorItem> spooky_helmet = armor.register("spooky_helmet", SpookyHelmet::new);
	public static final RegistryObject<ArmorItem> spooky_chestplate = armor.register("spooky_chestplate",
			SpookyChestplate::new);
	public static final RegistryObject<ArmorItem> spooky_leggings = armor.register("spooky_leggings",
			SpookyLeggings::new);
	public static final RegistryObject<ArmorItem> spooky_boots = armor.register("spooky_boots", SpookyBoots::new);

	public static final RegistryObject<ArmorItem> strong_dragon_helmet = armor.register("strong_dragon_helmet",
			StrongDragonHelmet::new);
	public static final RegistryObject<ArmorItem> strong_dragon_chestplate = armor.register("strong_dragon_chestplate",
			StrongDragonChestplate::new);
	public static final RegistryObject<ArmorItem> strong_dragon_leggings = armor.register("strong_dragon_leggings",
			StrongDragonLeggings::new);
	public static final RegistryObject<ArmorItem> strong_dragon_boots = armor.register("strong_dragon_boots",
			StrongDragonBoots::new);

	public static final RegistryObject<ArmorItem> superior_dragon_helmet = armor.register("superior_dragon_helmet",
			SuperiorDragonHelmet::new);
	public static final RegistryObject<ArmorItem> superior_dragon_chestplate = armor
			.register("superior_dragon_chestplate", SuperiorDragonChestplate::new);
	public static final RegistryObject<ArmorItem> superior_dragon_leggings = armor.register("superior_dragon_leggings",
			SuperiorDragonLeggings::new);
	public static final RegistryObject<ArmorItem> superior_dragon_boots = armor.register("superior_dragon_boots",
			SuperiorDragonBoots::new);

	public static final RegistryObject<ArmorItem> tarantula_helmet = armor.register("tarantula_helmet",
			TarantulaHelmet::new);
	public static final RegistryObject<ArmorItem> tarantula_chestplate = armor.register("tarantula_chestplate",
			TarantulaChestplate::new);
	public static final RegistryObject<ArmorItem> tarantula_leggings = armor.register("tarantula_leggings",
			TarantulaLeggings::new);
	public static final RegistryObject<ArmorItem> tarantula_boots = armor.register("tarantula_boots",
			TarantulaBoots::new);

	public static final RegistryObject<ArmorItem> unstable_dragon_helmet = armor.register("unstable_dragon_helmet",
			UnstableDragonHelmet::new);
	public static final RegistryObject<ArmorItem> unstable_dragon_chestplate = armor
			.register("unstable_dragon_chestplate", UnstableDragonChestplate::new);
	public static final RegistryObject<ArmorItem> unstable_dragon_leggings = armor.register("unstable_dragon_leggings",
			UnstableDragonLeggings::new);
	public static final RegistryObject<ArmorItem> unstable_dragon_boots = armor.register("unstable_dragon_boots",
			UnstableDragonBoots::new);

	public static final RegistryObject<ArmorItem> wise_dragon_helmet = armor.register("wise_dragon_helmet",
			WiseDragonHelmet::new);
	public static final RegistryObject<ArmorItem> wise_dragon_chestplate = armor.register("wise_dragon_chestplate",
			WiseDragonChestplate::new);
	public static final RegistryObject<ArmorItem> wise_dragon_leggings = armor.register("wise_dragon_leggings",
			WiseDragonLeggings::new);
	public static final RegistryObject<ArmorItem> wise_dragon_boots = armor.register("wise_dragon_boots",
			WiseDragonBoots::new);

	public static final RegistryObject<ArmorItem> young_dragon_helmet = armor.register("young_dragon_helmet",
			YoungDragonHelmet::new);
	public static final RegistryObject<ArmorItem> young_dragon_chestplate = armor.register("young_dragon_chestplate",
			YoungDragonChestplate::new);
	public static final RegistryObject<ArmorItem> young_dragon_leggings = armor.register("young_dragon_leggings",
			YoungDragonLeggings::new);
	public static final RegistryObject<ArmorItem> young_dragon_boots = armor.register("young_dragon_boots",
			YoungDragonBoots::new);

	public static final RegistryObject<ArmorItem> zombie_chestplate = armor.register("zombie_chestplate",
			ZombieChestplate::new);
	public static final RegistryObject<ArmorItem> zombie_leggings = armor.register("zombie_leggings",
			ZombieLeggings::new);
	public static final RegistryObject<ArmorItem> zombie_boots = armor.register("zombie_boots", ZombieBoots::new);
}