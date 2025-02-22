package net.emilolhaha.emiliosfurnacemod.recipes;

import net.emilolhaha.emiliosfurnacemod.EmiliosFurnaceMod;
import net.emilolhaha.emiliosfurnacemod.block.custom.BoostedFurnaceBlock;
import net.emilolhaha.emiliosfurnacemod.block.entity.BoostedFurnaceBlockEntity;
import net.emilolhaha.emiliosfurnacemod.item.ModItemGroups;
import net.emilolhaha.emiliosfurnacemod.screen.BoostedFurnaceScreen;
import net.emilolhaha.emiliosfurnacemod.screen.BoostedFurnaceScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class CookingRecipeBoostedSmelting implements ModInitializer {
    public static final String MOD_ID = "emiliosfurnacemod";
    public static final Block BOOSTED_FURNACE_BLOCK;
    public static final BoostedFurnaceBlockEntity BOOSTED_FURNACE_BLOCK_ENTITY;
    public static final RecipeType<BoostedRecipe> BOOSTED_SMELTING_RECIPE_TYPE;
    public static final RecipeSerializer<BoostedRecipe> BOOSTED_SMELTING_RECIPE_SERIALIZER;
    public static final ScreenHandlerType<BoostedFurnaceScreenHandler> BOOSTED_FURNACE_SCREEN_HANDLER;

    static {
        // block
        BOOSTED_FURNACE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "boosted_furnace"), new BoostedFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)));
        // block item
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "boosted_furnace"), new BlockItem(BOOSTED_FURNACE_BLOCK, new Item.Settings()));
        // block entity
        BOOSTED_FURNACE_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "boosted_furnace"),
                BlockEntityType.Builder.create(BoostedFurnaceBlockEntity::new, BOOSTED_FURNACE_BLOCK_ENTITY).build(null));
        // recipe
        BOOSTED_SMELTING_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, "boosted_furnace"),
                new RecipeType<BoostedRecipe>() {

            @Override
            public String toString() {
                return "boosted_furnace";
            }
        });
        // serializer
        BOOSTED_SMELTING_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(EmiliosFurnaceMod.MOD_ID, "boosted_furnace"), new CookingRecipeSerializer<>(BoostedRecipe::new, 200));
        // screen handler
        BOOSTED_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MOD_ID, "test_furnace"), BoostedFurnaceScreenHandler::new);
    }


    @Override
    public void onInitialize() {
    }
}