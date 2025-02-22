package net.emilolhaha.emiliosfurnacemod.block.custom;

import net.emilolhaha.emiliosfurnacemod.block.entity.BoostedFurnaceBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BoostedFurnaceBlock extends AbstractFurnaceBlock {
    public BoostedFurnaceBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
    BlockEntity blockEntity = world.getBlockEntity(pos);
    if (blockEntity instanceof BoostedFurnaceBlockEntity) {
        player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
        player.incrementStat(Stats.INTERACT_WITH_FURNACE);
    }}

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}