package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;

import java.util.function.Supplier;

public class DDBlocks {
    // CORAL

    // CANARY

    // WASABI

    // SACRAMENTO

    // SKY

    // BLURPLE

    // SANGRIA

    // ROSE

    // MISC
    public static final Supplier<Block> PEACH_BELLFLOWER = register("peach_bellflower", () -> new FlowerBlock(MobEffects.ABSORPTION, 15, DDProperties.BlockP.PEACH_BELLFLOWER), true);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(DelicateDyes.MOD_ID, id, block, hasItem);
    }

    public static void loadBlocks() {
        //DelicateDyes.LOGGER.info("reg blocks");
    }
}
