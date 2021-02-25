package net.hypixel.skyblock.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.enchanted_items.EnchantedItem;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

/**
 * An {@link ICraftingRecipe} that handles the custom recipe for
 * {@link EnchantedItem}.
 *
 * @author MrPineapple070
 * @version 10 October 2020
 * @since 10 October 2020
 */
public interface IEnchantedItemRecipe extends ICraftingRecipe {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link IRecipe}.
	 */
	ResourceLocation recipe_type_id = new ResourceLocation(HypixelSkyBlockMod.MOD_ID, "enchanted_item");

	@Override
	default boolean canFit(int width, int height) {
		return width * height < 10;
	}

	@Override
	NonNullList<Ingredient> getIngredients();

	@Nonnull
	@Override
	default IRecipeType<?> getType() {
		return Registry.RECIPE_TYPE.getOrDefault(recipe_type_id);
	}
}