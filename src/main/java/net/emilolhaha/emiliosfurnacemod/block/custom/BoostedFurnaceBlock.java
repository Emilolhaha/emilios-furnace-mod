package net.emilolhaha.emiliosfurnacemod.block.custom;

import net.emilolhaha.emiliosfurnacemod.block.entity.BoostedFurnaceBlockEntity;
import net.emilolhaha.emiliosfurnacemod.block.entity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
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