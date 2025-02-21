package net.emilolhaha.emiliosfurnacemod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class IdeaGeneratorItem extends Item {
    public IdeaGeneratorItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            outputRandomSentence(user);
            user.getItemCooldownManager().set(this, 20);
        }

        return super.use(world, user, hand);
    }

    private void outputRandomSentence(PlayerEntity player) {
        player.sendMessage(Text.literal("" + getRandomSentence()));
    }

    private int getRandomSentence() {
        return Random.createLocal().nextInt(10);
    }
    private static String[] IDEAS = {
            "Go do something with your life",
            "Just.. idk go sleep or smt",
            "Why are you asking me? Ask chatgpt or sum idfk",
            "Let me sleep",
            "Ugh",
            "Ooh i know smt! You don't!"

    };
}