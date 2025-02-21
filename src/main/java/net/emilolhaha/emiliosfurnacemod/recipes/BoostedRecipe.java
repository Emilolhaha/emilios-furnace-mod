package net.emilolhaha.emiliosfurnacemod.recipes;

import net.emilolhaha.emiliosfurnacemod.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.util.Identifier;

public class BoostedRecipe extends AbstractCookingRecipe {
    public BoostedRecipe(Identifier id, String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(CookingRecipeBoostedSmelting.BOOSTED_SMELTING_RECIPE_TYPE, id, group, input, output, experience, cookTime);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.HYPERCOAL);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CookingRecipeBoostedSmelting.BOOSTED_SMELTING_RECIPE_SERIALIZER;
    }
}
