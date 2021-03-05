package net.hypixel.skyblock.items.init;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;

/**
 * Initialize and Register every {@link Item} for this mod.
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 July 2019
 */
public class MasterItemInit {
	public static void register(final IEventBus bus) {
		AccessoriesInit.accessories.register(bus);
		ArmorInit.armor.register(bus);
		BackpackInit.backpack.register(bus);
		BlockItemInit.blockItems.register(bus);
		ItemInit.items.register(bus);
		MinionBlockItemInit.minionItems.register(bus);
		PetItemInit.pets.register(bus);
		WeaponInit.weapon.register(bus);
	}
}