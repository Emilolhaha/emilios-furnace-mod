package net.emilolhaha.emiliosfurnacemod.item;

import net.emilolhaha.emiliosfurnacemod.EmiliosFurnaceMod;
import net.emilolhaha.emiliosfurnacemod.item.custom.IdeaGeneratorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HYPER_CATALYST = registerItem("hyper_catalyst", new Item(new FabricItemSettings()));
    public static final Item HYPERCOAL = registerItem("hypercoal", new Item(new FabricItemSettings()));
    public static final Item IDEA_GENERATOR = registerItem("idea_generatorr",
            new IdeaGeneratorItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmiliosFurnaceMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        EmiliosFurnaceMod.LOGGER.info("Registering Mod Items for " + EmiliosFurnaceMod.MOD_ID);

    }
}