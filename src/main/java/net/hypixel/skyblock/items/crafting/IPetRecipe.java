package net.hypixel.skyblock.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.enchanted_items.EnchantedItem;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.items.wrapper.RecipeWrapper;

/**
 * An {@link IRecipe} of {@link RecipeWrapper} that handles the custom recipe
 * for {@link EnchantedItem}.
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public interface IPetRecipe extends IRecipe<RecipeWrapper> {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link IRecipe}.
	 */
	ResourceLocation recipe_type_id = new ResourceLocation(HypixelSkyBlockMod.MOD_ID, "pet_item");

	@Override
	default boolean canFit(int width, int height) {
		return false;
	}

	@Override
	NonNullList<Ingredient> getIngredients();

	@Nonnull
	@Override
	default IRecipeType<?> getType() {
		return Registry.RECIPE_TYPE.getOrDefault(recipe_type_id);
	}
}