package net.hypixel.skyblock.items.crafting;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.crafting.EnchantedItemRecipe.Serializer;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link RecipeType} for this Mod.
 *
 * @author MrPineapple070
 * @version 10 October 2020
 * @since 10 October 2020
 */
public class RecipeSerializerInit {
	/**
	 * A {@link IRecipeType}
	 *
	 * @param <T> {@link IRecipe}
	 */
	private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T> {
		@Override
		public String toString() {
			return Registry.RECIPE_TYPE.getKey(this).toString();
		}
	}

	public static final DeferredRegister<IRecipeSerializer<?>> recipe_serializer = DeferredRegister
			.create(ForgeRegistries.RECIPE_SERIALIZERS, HypixelSkyBlockMod.MOD_ID);

	public static final RegistryObject<IRecipeSerializer<?>> enchanted_item_serializer = recipe_serializer
			.register("enchanted_item", Serializer::new);

	public static final IRecipeType<IEnchantedItemRecipe> enchanted_item_type = Registry.register(Registry.RECIPE_TYPE,
			IEnchantedItemRecipe.recipe_type_id, new RecipeType<IEnchantedItemRecipe>());
	public static final RegistryObject<IRecipeSerializer<?>> enchantment_serializer = recipe_serializer
			.register("enchantment", EnchantmentRecipe.Serializer::new);
	public static final IRecipeType<IEnchantmentRecipe> enchantment_type = Registry.register(Registry.RECIPE_TYPE,
			IEnchantmentRecipe.recipe_type_id, new RecipeType<IEnchantmentRecipe>());

	public static final RegistryObject<IRecipeSerializer<?>> pet_item_serializer = recipe_serializer
			.register("pet_item", PetItemRecipe.Serializer::new);
	public static final IRecipeType<IPetRecipe> pet_item_type = Registry.register(Registry.RECIPE_TYPE,
			IPetRecipe.recipe_type_id, new RecipeType<IPetRecipe>());
}