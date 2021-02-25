package net.hypixel.skyblock.items.crafting;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import net.hypixel.skyblock.enchantment.ModEnchantment;
import net.hypixel.skyblock.init.RecipeSerializerInit;
import net.hypixel.skyblock.util.ListUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.items.wrapper.RecipeWrapper;
import net.minecraftforge.registries.ForgeRegistryEntry;

/**
 * A {@link IEnchantmentRecipe} that handles craftable {@link ModEnchantment}
 * and {@link Enchantment}.
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public class EnchantmentRecipe implements IEnchantmentRecipe {
	/**
	 * {@link ForgeRegistryEntry} of {@link IRecipeSerializer} implementing
	 * {@link IRecipeSerializer} of {@link EnchantmentRecipe} for
	 * {@link EnchantmentRecipe}
	 */
	public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
			implements IRecipeSerializer<EnchantmentRecipe> {
		@Override
		public EnchantmentRecipe read(ResourceLocation recipeId, JsonObject json) {
			final String group = JSONUtils.getString(json, "group", "");
			final NonNullList<Ingredient> ingredients = ListUtil
					.readIngredients(JSONUtils.getJsonArray(json, "ingredients"));
			if (ingredients.isEmpty())
				throw new JsonParseException("No ingredients for recipe");
			else if (ingredients.size() > 9)
				throw new JsonParseException("Too many ingredients for recipe the max is " + 9);
			else
				return new EnchantmentRecipe(recipeId, group, ingredients,
						ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result")));
		}

		@Override
		public EnchantmentRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
			final NonNullList<Ingredient> ingredients = NonNullList.withSize(buffer.readVarInt(), Ingredient.EMPTY);
			for (int j = 0; j < ingredients.size(); ++j)
				ingredients.set(j, Ingredient.read(buffer));
			return new EnchantmentRecipe(recipeId, buffer.readString(0x7FFF), ingredients, buffer.readItemStack());
		}

		@Override
		public void write(PacketBuffer buffer, EnchantmentRecipe recipe) {
			buffer.writeString(recipe.group);
			buffer.writeVarInt(recipe.inputs.size());
			for (final Ingredient ingredient : recipe.inputs)
				ingredient.write(buffer);
			buffer.writeItemStack(recipe.output);
		}
	}

	/**
	 * {@link String} that is the name for the group that this is in.
	 */
	@Nonnull
	private final String group;

	/**
	 * {@link ResourceLocation} for the id.
	 */
	@Nonnull
	private final ResourceLocation id;

	/**
	 * A {@link NonNullList} of {@link Ingredient} for this
	 * {@link IEnchantedItemRecipe}.
	 */
	@Nonnull
	private final NonNullList<Ingredient> inputs;

	/**
	 * Output {@link ItemStack} for this {@link IEnchantedItemRecipe}
	 */
	@Nonnull
	private final ItemStack output;

	public EnchantmentRecipe(@Nonnull ResourceLocation id, @Nonnull String group,
			@Nonnull NonNullList<Ingredient> input, @Nonnull ItemStack output) {
		this.id = id;
		this.group = group;
		this.inputs = input;
		this.output = output;
	}

	@Override
	public boolean canFit(int width, int height) {
		return width * height <= this.inputs.size();
	}

	@Override
	public ItemStack getCraftingResult(RecipeWrapper inv) {
		return this.output;
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public NonNullList<Ingredient> getIngredients() {
		return this.inputs;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return this.output;
	}

	@Override
	public IRecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.enchantment_serializer.get();
	}

	@Override
	public boolean matches(RecipeWrapper inv, World worldIn) {
		return true;
	}
}