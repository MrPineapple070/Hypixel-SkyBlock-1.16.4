package net.hypixel.skyblock.potion;

import net.hypixel.skyblock.items.init.ItemInit;
import net.hypixel.skyblock.potion.BrewingRecipeRegistrar.Registar;
import net.hypixel.skyblock.util.DelayedConsumer;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraftforge.eventbus.api.IEventBus;

public class BrewingRecipeRegistrar extends DelayedConsumer<Registar> {
	private static final BrewingRecipeRegistrar INSTANCE = new BrewingRecipeRegistrar();

	public static void init(IEventBus bus) {
		registerPotion(PotionInit.absorption_00.get(), Items.COCOA_BEANS, Potions.AWKWARD);
		registerPotion(PotionInit.absorption_01.get(), Items.REDSTONE, PotionInit.absorption_00.get());
		registerPotion(PotionInit.absorption_02.get(), ItemInit.enchanted_redstone.get(),
				PotionInit.absorption_01.get());
		registerPotion(PotionInit.absorption_03.get(), ItemInit.enchanted_redstone_block.get(),
				PotionInit.absorption_02.get());
	}

	private static void registerPotion(Potion potion, Item ingredient, Potion base) {
		INSTANCE.consumeWhenReady(reg -> {
			reg.register(base, ingredient, potion);
		});
	}

	public static void onKeyReady(Registar r) {
		INSTANCE.keyReady(r);
	}

	@FunctionalInterface
	public static interface Registar {
		void register(Potion input, Item item, Potion output);
	}
}