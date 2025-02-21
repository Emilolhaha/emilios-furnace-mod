package net.emilolhaha.emiliosfurnacemod.screen;

import net.emilolhaha.emiliosfurnacemod.recipes.CookingRecipeBoostedSmelting;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class BoostedFurnaceScreenHandler extends AbstractFurnaceScreenHandler {
    public BoostedFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(CookingRecipeBoostedSmelting.BOOSTED_FURNACE_SCREEN_HANDLER, CookingRecipeBoostedSmelting.BOOSTED_SMELTING_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public BoostedFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(CookingRecipeBoostedSmelting.BOOSTED_FURNACE_SCREEN_HANDLER, CookingRecipeBoostedSmelting.BOOSTED_SMELTING_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}