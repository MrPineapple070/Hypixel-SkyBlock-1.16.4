package net.hypixel.skyblock.entity;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.entity.npc.Andrew;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.Builder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> entities = DeferredRegister.create(ForgeRegistries.ENTITIES,
			HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<EntityType<Andrew>> Andrew = entities.register("andrew",
			() -> Builder.<Andrew>create(Andrew::new, EntityClassification.MISC).size(.6f, 1.95f).build("andrew"));
}