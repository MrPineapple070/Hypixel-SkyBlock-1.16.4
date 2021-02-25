package net.hypixel.skyblock.items.crafting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import it.unimi.dsi.fastutil.ints.IntList;
import net.hypixel.skyblock.init.RecipeSerializerInit;
import net.hypixel.skyblock.items.enchanted_items.EnchantedItem;
import net.hypixel.skyblock.util.ListUtil;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.RecipeMatcher;
import net.minecraftforge.registries.ForgeRegistryEntry;

/**
 * A {@link IEnchantedItemRecipe} that handles recipe {@link EnchantedItem}.
 *
 * @author MrPineapple070
 * @version 10 October 2020
 * @since 10 October 2020
 */
public class EnchantedItemRecipe implements IEnchantedItemRecipe {
	/**
	 * {@link ForgeRegistryEntry} of {@link IRecipeSerializer} implementing
	 * {@link IRecipeSerializer} of {@link EnchantmentRecipe} for
	 * {@link EnchantedItemRecipe}
	 */
	public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
			implements IRecipeSerializer<EnchantedItemRecipe> {
		@Override
		public EnchantedItemRecipe read(ResourceLocation recipeId, JsonObject json) {
			final String group = JSONUtils.getString(json, "group", "");
			final NonNullList<Ingredient> ingredients = ListUtil
					.readIngredients(JSONUtils.getJsonArray(json, "ingredients"));
			if (ingredients.isEmpty())
				throw new JsonParseException("No ingredients for recipe");
			else if (ingredients.size() > 9)
				throw new JsonParseException("Too many ingredients for recipe the max is " + 9);
			else
				return new EnchantedItemRecipe(recipeId, group, ingredients,
						ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result")));
		}

		@Override
		public EnchantedItemRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
			final NonNullList<Ingredient> ingredients = NonNullList.withSize(buffer.readVarInt(), Ingredient.EMPTY);
			for (int j = 0; j < ingredients.size(); ++j)
				ingredients.set(j, Ingredient.read(buffer));
			return new EnchantedItemRecipe(recipeId, buffer.readString(0x7FFF), ingredients, buffer.readItemStack());
		}

		@Override
		public void write(PacketBuffer buffer, EnchantedItemRecipe recipe) {
			buffer.writeString(recipe.group);
			buffer.writeVarInt(recipe.inputs.size());
			for (final Ingredient ingredient : recipe.inputs)
				ingredient.write(buffer);
			buffer.writeItemStack(recipe.output);
		}
	}

	/**
	 * Group name that this is in.
	 */
	@Nonnull
	private final String group;

	/**
	 * {@link ResourceLocation} for the id.
	 */
	@Nonnull
	private final ResourceLocation id;

	/**
	 * Input {@link Ingredient} for this {@link IEnchantedItemRecipe}.
	 */
	@Nonnull
	private final NonNullList<Ingredient> inputs;

	/**
	 * Determine if this is simple
	 */
	private final boolean isSimple;

	/**
	 * Output {@link ItemStack} for this {@link IEnchantedItemRecipe}
	 */
	@Nonnull
	private final ItemStack output;

	public EnchantedItemRecipe(@Nonnull ResourceLocation id, @Nonnull String group,
			@Nonnull NonNullList<Ingredient> inputs, @Nonnull ItemStack output) {
		this.id = Objects.requireNonNull(id, "ID ResourceLocation cannot be null");
		this.group = group;
		this.inputs = inputs;
		this.output = output;
		this.isSimple = this.inputs.stream().allMatch(Ingredient::isSimple);
	}

	@Override
	public boolean canFit(int width, int height) {
		return width * height <= this.inputs.size();
	}

	@Override
	public ItemStack getCraftingResult(CraftingInventory inv) {
		return this.output.copy();
	}

	@Override
	public String getGroup() {
		return this.group;
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
		return RecipeSerializerInit.enchanted_item_serializer.get();
	}

	@Override
	public boolean matches(CraftingInventory inv, World worldIn) {
		final RecipeItemHelper recipeitemhelper = new RecipeItemHelper();
		final List<ItemStack> inputs = new ArrayList<>();
		int size = 0;
		for (int j = 0; j < inv.getSizeInventory(); ++j) {
			final ItemStack itemstack = inv.getStackInSlot(j);
			if (!itemstack.isEmpty()) {
				++size;
				if (this.isSimple)
					recipeitemhelper.func_221264_a(itemstack, 1);
				else
					inputs.add(itemstack);
			}
		}
		return size == this.inputs.size() && (this.isSimple ? recipeitemhelper.canCraft(this, (IntList) null)
				: RecipeMatcher.findMatches(inputs, this.inputs) != null);
	}
}