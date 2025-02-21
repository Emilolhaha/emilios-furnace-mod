package net.emilolhaha.emiliosfurnacemod;

import net.emilolhaha.emiliosfurnacemod.recipes.CookingRecipeBoostedSmelting;
import net.emilolhaha.emiliosfurnacemod.screen.BoostedFurnaceScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class EmiliosFurnaceModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(CookingRecipeBoostedSmelting.BOOSTED_FURNACE_SCREEN_HANDLER, BoostedFurnaceScreen::new);
    }
}