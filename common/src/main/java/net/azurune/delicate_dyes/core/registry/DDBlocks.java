package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.block.BlueberryBushBlock;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.TallFlowerBlock;

import java.util.function.Supplier;

public class DDBlocks {
    //CORAL

    //CANARY

    //WASABI

    //SACRAMENTO

    //SKY

    //BLURPLE

    //SANGRIA

    //ROSE

    //MISC
    public static final Supplier<Block> PEACH_BELLFLOWER = register("peach_bellflower", () -> new FlowerBlock(MobEffects.ABSORPTION, 15, DDProperties.BlockP.PEACH_BELLFLOWER), true);
    public static final Supplier<Block> POTTED_PEACH_BELLFLOWER = register("potted_peach_bellflower", () -> new FlowerPotBlock(PEACH_BELLFLOWER.get(), DDProperties.BlockP.FLOWER_POT), false);

    public static final Supplier<Block> GOOB_BLOSSOM = register("goob_blossom", () -> new TallFlowerBlock(DDProperties.BlockP.GOOB_BLOSSOM), true);

    public static final Supplier<Block> BLUEBERRY_BUSH = register("blueberry_bush", () -> new BlueberryBushBlock(DDProperties.BlockP.BLUEBERRY_BUSH), false);

    public static final Supplier<Block> ROSE = register("rose", () -> new FlowerBlock(MobEffects.REGENERATION, 10, DDProperties.BlockP.ROSE), true);
    public static final Supplier<Block> POTTED_ROSE = register("potted_rose", () -> new FlowerPotBlock(ROSE.get(), DDProperties.BlockP.FLOWER_POT), false);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(DelicateDyes.MOD_ID, id, block, hasItem);
    }

    public static void loadBlocks() {
    }
}
