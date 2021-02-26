package net.hypixel.skyblock.tileentity;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.init.blocks.BlockInit;
import net.hypixel.skyblock.init.blocks.MinionBlockInit;
import net.hypixel.skyblock.tileentity.TimeSaverTileEntity.DaySaverTileEntity;
import net.hypixel.skyblock.tileentity.TimeSaverTileEntity.NightSaverTileEntity;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionChestTileEntity.LargeMCTE;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionChestTileEntity.MediumMCTE;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionChestTileEntity.SmallMCTE;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE1;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE2;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE3;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE4;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE5;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE6;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE7;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE8;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTE9;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTEa;
import net.hypixel.skyblock.tileentity.minion.AcaciaMinionTileEntity.AcaciaMTEb;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE1;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE2;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE3;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE4;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE5;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE6;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE7;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE8;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTE9;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTEa;
import net.hypixel.skyblock.tileentity.minion.BirchMinionTileEntity.BirchMTEb;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE1;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE2;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE3;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE4;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE5;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE6;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE7;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE8;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTE9;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTEa;
import net.hypixel.skyblock.tileentity.minion.BlazeMinionTileEntity.BlazeMTEb;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE1;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE2;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE3;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE4;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE5;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE6;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE7;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE8;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTE9;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTEa;
import net.hypixel.skyblock.tileentity.minion.CoalMinionTileEntity.CoalMTEb;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE1;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE2;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE3;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE4;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE5;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE6;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE7;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE8;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTE9;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTEa;
import net.hypixel.skyblock.tileentity.minion.CobblestoneMinionTileEntity.CobbleMTEb;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE1;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE2;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE3;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE4;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE5;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE6;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE7;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE8;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTE9;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTEa;
import net.hypixel.skyblock.tileentity.minion.WheatMinionTileEntity.WheatMTEb;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.tileentity.TileEntityType.Builder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link TileEntityType} for this mod.
 *
 * @author MrPineapple070
 * @version 5 June 2020
 * @since 11 June 2019
 */
public class ModTileEntityTypes {
	public static final DeferredRegister<TileEntityType<?>> tile_entity_types = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<TileEntityType<AcaciaMTE1>> acacia_minion_1 = tile_entity_types.register(
			"acacia_minion_1",
			() -> Builder.create(AcaciaMTE1::new, MinionBlockInit.acacia_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE2>> acacia_minion_2 = tile_entity_types.register(
			"acacia_minion_2",
			() -> Builder.create(AcaciaMTE2::new, MinionBlockInit.acacia_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE3>> acacia_minion_3 = tile_entity_types.register(
			"acacia_minion_3",
			() -> Builder.create(AcaciaMTE3::new, MinionBlockInit.acacia_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE4>> acacia_minion_4 = tile_entity_types.register(
			"acacia_minion_4",
			() -> Builder.create(AcaciaMTE4::new, MinionBlockInit.acacia_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE5>> acacia_minion_5 = tile_entity_types.register(
			"acacia_minion_5",
			() -> Builder.create(AcaciaMTE5::new, MinionBlockInit.acacia_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE6>> acacia_minion_6 = tile_entity_types.register(
			"acacia_minion_6",
			() -> Builder.create(AcaciaMTE6::new, MinionBlockInit.acacia_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE7>> acacia_minion_7 = tile_entity_types.register(
			"acacia_minion_7",
			() -> Builder.create(AcaciaMTE7::new, MinionBlockInit.acacia_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE8>> acacia_minion_8 = tile_entity_types.register(
			"acacia_minion_8",
			() -> Builder.create(AcaciaMTE8::new, MinionBlockInit.acacia_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTE9>> acacia_minion_9 = tile_entity_types.register(
			"acacia_minion_9",
			() -> Builder.create(AcaciaMTE9::new, MinionBlockInit.acacia_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTEa>> acacia_minion_a = tile_entity_types.register(
			"acacia_minion_a",
			() -> Builder.create(AcaciaMTEa::new, MinionBlockInit.acacia_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<AcaciaMTEb>> acacia_minion_b = tile_entity_types.register(
			"acacia_minion_b",
			() -> Builder.create(AcaciaMTEb::new, MinionBlockInit.acacia_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<BirchMTE1>> birch_minion_1 = tile_entity_types.register(
			"birch_minion_1", () -> Builder.create(BirchMTE1::new, MinionBlockInit.birch_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE2>> birch_minion_2 = tile_entity_types.register(
			"birch_minion_2", () -> Builder.create(BirchMTE2::new, MinionBlockInit.birch_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE3>> birch_minion_3 = tile_entity_types.register(
			"birch_minion_3", () -> Builder.create(BirchMTE3::new, MinionBlockInit.birch_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE4>> birch_minion_4 = tile_entity_types.register(
			"birch_minion_4", () -> Builder.create(BirchMTE4::new, MinionBlockInit.birch_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE5>> birch_minion_5 = tile_entity_types.register(
			"birch_minion_5", () -> Builder.create(BirchMTE5::new, MinionBlockInit.birch_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE6>> birch_minion_6 = tile_entity_types.register(
			"birch_minion_6", () -> Builder.create(BirchMTE6::new, MinionBlockInit.birch_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE7>> birch_minion_7 = tile_entity_types.register(
			"birch_minion_7", () -> Builder.create(BirchMTE7::new, MinionBlockInit.birch_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE8>> birch_minion_8 = tile_entity_types.register(
			"birch_minion_8", () -> Builder.create(BirchMTE8::new, MinionBlockInit.birch_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTE9>> birch_minion_9 = tile_entity_types.register(
			"birch_minion_9", () -> Builder.create(BirchMTE9::new, MinionBlockInit.birch_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTEa>> birch_minion_a = tile_entity_types.register(
			"birch_minion_a", () -> Builder.create(BirchMTEa::new, MinionBlockInit.birch_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<BirchMTEb>> birch_minion_b = tile_entity_types.register(
			"birch_minion_b", () -> Builder.create(BirchMTEb::new, MinionBlockInit.birch_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<BlazeMTE1>> blaze_minion_1 = tile_entity_types.register(
			"blaze_minion_1", () -> Builder.create(BlazeMTE1::new, MinionBlockInit.blaze_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE2>> blaze_minion_2 = tile_entity_types.register(
			"blaze_minion_2", () -> Builder.create(BlazeMTE2::new, MinionBlockInit.blaze_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE3>> blaze_minion_3 = tile_entity_types.register(
			"blaze_minion_3", () -> Builder.create(BlazeMTE3::new, MinionBlockInit.blaze_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE4>> blaze_minion_4 = tile_entity_types.register(
			"blaze_minion_4", () -> Builder.create(BlazeMTE4::new, MinionBlockInit.blaze_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE5>> blaze_minion_5 = tile_entity_types.register(
			"blaze_minion_5", () -> Builder.create(BlazeMTE5::new, MinionBlockInit.blaze_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE6>> blaze_minion_6 = tile_entity_types.register(
			"blaze_minion_6", () -> Builder.create(BlazeMTE6::new, MinionBlockInit.blaze_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE7>> blaze_minion_7 = tile_entity_types.register(
			"blaze_minion_7", () -> Builder.create(BlazeMTE7::new, MinionBlockInit.blaze_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE8>> blaze_minion_8 = tile_entity_types.register(
			"blaze_minion_8", () -> Builder.create(BlazeMTE8::new, MinionBlockInit.blaze_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTE9>> blaze_minion_9 = tile_entity_types.register(
			"blaze_minion_9", () -> Builder.create(BlazeMTE9::new, MinionBlockInit.blaze_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTEa>> blaze_minion_a = tile_entity_types.register(
			"blaze_minion_a", () -> Builder.create(BlazeMTEa::new, MinionBlockInit.blaze_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<BlazeMTEb>> blaze_minion_b = tile_entity_types.register(
			"blaze_minion_b", () -> Builder.create(BlazeMTEb::new, MinionBlockInit.blaze_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<CoalMTE1>> coal_minion_1 = tile_entity_types.register(
			"coal_minion_1", () -> Builder.create(CoalMTE1::new, MinionBlockInit.coal_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE2>> coal_minion_2 = tile_entity_types.register(
			"coal_minion_2", () -> Builder.create(CoalMTE2::new, MinionBlockInit.coal_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE3>> coal_minion_3 = tile_entity_types.register(
			"coal_minion_3", () -> Builder.create(CoalMTE3::new, MinionBlockInit.coal_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE4>> coal_minion_4 = tile_entity_types.register(
			"coal_minion_4", () -> Builder.create(CoalMTE4::new, MinionBlockInit.coal_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE5>> coal_minion_5 = tile_entity_types.register(
			"coal_minion_5", () -> Builder.create(CoalMTE5::new, MinionBlockInit.coal_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE6>> coal_minion_6 = tile_entity_types.register(
			"coal_minion_6", () -> Builder.create(CoalMTE6::new, MinionBlockInit.coal_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE7>> coal_minion_7 = tile_entity_types.register(
			"coal_minion_7", () -> Builder.create(CoalMTE7::new, MinionBlockInit.coal_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE8>> coal_minion_8 = tile_entity_types.register(
			"coal_minion_8", () -> Builder.create(CoalMTE8::new, MinionBlockInit.coal_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTE9>> coal_minion_9 = tile_entity_types.register(
			"coal_minion_9", () -> Builder.create(CoalMTE9::new, MinionBlockInit.coal_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTEa>> coal_minion_a = tile_entity_types.register(
			"coal_minion_a", () -> Builder.create(CoalMTEa::new, MinionBlockInit.coal_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<CoalMTEb>> coal_minion_b = tile_entity_types.register(
			"coal_minion_b", () -> Builder.create(CoalMTEb::new, MinionBlockInit.coal_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<CobbleMTE1>> cobblestone_minion_1 = tile_entity_types.register(
			"cobblestone_minion_1",
			() -> Builder.create(CobbleMTE1::new, MinionBlockInit.cobblestone_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE2>> cobblestone_minion_2 = tile_entity_types.register(
			"cobblestone_minion_2",
			() -> Builder.create(CobbleMTE2::new, MinionBlockInit.cobblestone_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE3>> cobblestone_minion_3 = tile_entity_types.register(
			"cobblestone_minion_3",
			() -> Builder.create(CobbleMTE3::new, MinionBlockInit.cobblestone_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE4>> cobblestone_minion_4 = tile_entity_types.register(
			"cobblestone_minion_4",
			() -> Builder.create(CobbleMTE4::new, MinionBlockInit.cobblestone_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE5>> cobblestone_minion_5 = tile_entity_types.register(
			"cobblestone_minion_5",
			() -> Builder.create(CobbleMTE5::new, MinionBlockInit.cobblestone_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE6>> cobblestone_minion_6 = tile_entity_types.register(
			"cobblestone_minion_6",
			() -> Builder.create(CobbleMTE6::new, MinionBlockInit.cobblestone_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE7>> cobblestone_minion_7 = tile_entity_types.register(
			"cobblestone_minion_7",
			() -> Builder.create(CobbleMTE7::new, MinionBlockInit.cobblestone_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE8>> cobblestone_minion_8 = tile_entity_types.register(
			"cobblestone_minion_8",
			() -> Builder.create(CobbleMTE8::new, MinionBlockInit.cobblestone_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTE9>> cobblestone_minion_9 = tile_entity_types.register(
			"cobblestone_minion_9",
			() -> Builder.create(CobbleMTE9::new, MinionBlockInit.cobblestone_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTEa>> cobblestone_minion_a = tile_entity_types.register(
			"cobblestone_minion_a",
			() -> Builder.create(CobbleMTEa::new, MinionBlockInit.cobblestone_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<CobbleMTEb>> cobblestone_minion_b = tile_entity_types.register(
			"cobblestone_minion_b",
			() -> Builder.create(CobbleMTEb::new, MinionBlockInit.cobblestone_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<WheatMTE1>> wheat_minion_1 = tile_entity_types.register(
			"wheat_minion_1", () -> Builder.create(WheatMTE1::new, MinionBlockInit.wheat_minion_1.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE2>> wheat_minion_2 = tile_entity_types.register(
			"wheat_minion_2", () -> Builder.create(WheatMTE2::new, MinionBlockInit.wheat_minion_2.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE3>> wheat_minion_3 = tile_entity_types.register(
			"wheat_minion_3", () -> Builder.create(WheatMTE3::new, MinionBlockInit.wheat_minion_3.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE4>> wheat_minion_4 = tile_entity_types.register(
			"wheat_minion_4", () -> Builder.create(WheatMTE4::new, MinionBlockInit.wheat_minion_4.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE5>> wheat_minion_5 = tile_entity_types.register(
			"wheat_minion_5", () -> Builder.create(WheatMTE5::new, MinionBlockInit.wheat_minion_5.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE6>> wheat_minion_6 = tile_entity_types.register(
			"wheat_minion_6", () -> Builder.create(WheatMTE6::new, MinionBlockInit.wheat_minion_6.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE7>> wheat_minion_7 = tile_entity_types.register(
			"wheat_minion_7", () -> Builder.create(WheatMTE7::new, MinionBlockInit.wheat_minion_7.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE8>> wheat_minion_8 = tile_entity_types.register(
			"wheat_minion_8", () -> Builder.create(WheatMTE8::new, MinionBlockInit.wheat_minion_8.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTE9>> wheat_minion_9 = tile_entity_types.register(
			"wheat_minion_9", () -> Builder.create(WheatMTE9::new, MinionBlockInit.wheat_minion_9.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTEa>> wheat_minion_a = tile_entity_types.register(
			"wheat_minion_a", () -> Builder.create(WheatMTEa::new, MinionBlockInit.wheat_minion_a.get()).build(null));
	public static final RegistryObject<TileEntityType<WheatMTEb>> wheat_minion_b = tile_entity_types.register(
			"wheat_minion_b", () -> Builder.create(WheatMTEb::new, MinionBlockInit.wheat_minion_b.get()).build(null));

	public static final RegistryObject<TileEntityType<DaySaverTileEntity>> day_saver = tile_entity_types.register(
			"day_saver", () -> Builder.create(DaySaverTileEntity::new, BlockInit.day_saver.get()).build(null));
	public static final RegistryObject<TileEntityType<NightSaverTileEntity>> night_saver = tile_entity_types.register(
			"night_saver", () -> Builder.create(NightSaverTileEntity::new, BlockInit.night_saver.get()).build(null));

	public static final RegistryObject<TileEntityType<SmallMCTE>> small_mcte = tile_entity_types.register("small_mcte",
			() -> Builder.create(SmallMCTE::new, BlockInit.small_mcb.get()).build(null));
	public static final RegistryObject<TileEntityType<MediumMCTE>> medium_mcte = tile_entity_types
			.register("medium_mcte", () -> Builder.create(MediumMCTE::new, BlockInit.medium_mcb.get()).build(null));
	public static final RegistryObject<TileEntityType<LargeMCTE>> large_mcte = tile_entity_types.register("large_mcte",
			() -> Builder.create(LargeMCTE::new, BlockInit.large_mcb.get()).build(null));
}