package net.hypixel.skyblock.inventory.container.init;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.inventory.container.AbstractBackpackContainer.GreaterBC;
import net.hypixel.skyblock.inventory.container.AbstractBackpackContainer.JumboBC;
import net.hypixel.skyblock.inventory.container.AbstractBackpackContainer.LargeBC;
import net.hypixel.skyblock.inventory.container.AbstractBackpackContainer.MediumBC;
import net.hypixel.skyblock.inventory.container.AbstractBackpackContainer.SmallBC;
import net.hypixel.skyblock.inventory.container.minion.MinionChestContainer.LargeMCC;
import net.hypixel.skyblock.inventory.container.minion.MinionChestContainer.MediumMCC;
import net.hypixel.skyblock.inventory.container.minion.MinionChestContainer.SmallMCC;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link ContainerType} for this mod.
 *
 * @author MrPineapple070
 * @version 5 June 2020
 */
public class ModContainerTypes {
	public static final DeferredRegister<ContainerType<?>> container_types = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<ContainerType<SmallBC>> small_backpack = container_types
			.register("small_backpack", () -> IForgeContainerType.create(SmallBC::new));
	public static final RegistryObject<ContainerType<MediumBC>> medium_backpack = container_types
			.register("medium_backpack", () -> IForgeContainerType.create(MediumBC::new));
	public static final RegistryObject<ContainerType<LargeBC>> large_backpack = container_types
			.register("large_backpack", () -> IForgeContainerType.create(LargeBC::new));
	public static final RegistryObject<ContainerType<GreaterBC>> greater_backpack = container_types
			.register("greater_backpack", () -> IForgeContainerType.create(GreaterBC::new));
	public static final RegistryObject<ContainerType<JumboBC>> jumbo_backpack = container_types
			.register("jumbo_backpack", () -> IForgeContainerType.create(JumboBC::new));

	public static final RegistryObject<ContainerType<SmallMCC>> small_mcc = container_types.register("small_mcc",
			() -> IForgeContainerType.create(SmallMCC::new));
	public static final RegistryObject<ContainerType<MediumMCC>> medium_mcc = container_types.register("medium_mcc",
			() -> IForgeContainerType.create(MediumMCC::new));
	public static final RegistryObject<ContainerType<LargeMCC>> large_mcc = container_types.register("large_mcc",
			() -> IForgeContainerType.create(LargeMCC::new));
}