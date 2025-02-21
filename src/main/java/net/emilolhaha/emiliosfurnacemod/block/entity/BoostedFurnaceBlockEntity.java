package net.emilolhaha.emiliosfurnacemod.block.entity;

import net.emilolhaha.emiliosfurnacemod.recipes.CookingRecipeBoostedSmelting;
import net.emilolhaha.emiliosfurnacemod.screen.BoostedFurnaceScreenHandler;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class BoostedFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public BoostedFurnaceBlockEntity() {
        super(CookingRecipeBoostedSmelting.BOOSTED_FURNACE_BLOCK_ENTITY, CookingRecipeBoostedSmelting.BOOSTED_SMELTING_RECIPE_TYPE);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.boosted_furnace");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new BoostedFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}