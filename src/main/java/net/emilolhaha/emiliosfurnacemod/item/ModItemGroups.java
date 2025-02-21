package net.emilolhaha.emiliosfurnacemod.item;

import net.emilolhaha.emiliosfurnacemod.EmiliosFurnaceMod;
import net.emilolhaha.emiliosfurnacemod.block.ModBlocks;
import net.emilolhaha.emiliosfurnacemod.recipes.CookingRecipeBoostedSmelting;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EMILIOGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EmiliosFurnaceMod.MOD_ID, "emiliogroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.emiliogroup"))
                    .icon(() -> new ItemStack(ModItems.HYPER_CATALYST)).entries((displayContext, entries) -> {
                        // items
                        entries.add(ModItems.HYPER_CATALYST);
                        entries.add(ModItems.HYPERCOAL);
                        entries.add(ModItems.IDEA_GENERATOR);
                        // blocks
                        entries.add(ModBlocks.ENERGIZER);
                        entries.add(ModBlocks.BOOSTED_FURNACE);
                        entries.add(CookingRecipeBoostedSmelting.BOOSTED_FURNACE_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        EmiliosFurnaceMod.LOGGER.info("Registering Item Groups for" + EmiliosFurnaceMod.MOD_ID);
    }
}