package net.azurune.delicate_dyes.core.integration.alexscaves.registry;

import net.azurune.delicate_dyes.core.integration.common.block.IntegrationBlock;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.integration.common.util.DDCProperties;
import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class AlexCBlocks {
    //CORAL
    public static final Supplier<Block> CORAL_ROCK_CANDY = register("rock_candy_coral", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> CORAL_RADON_LAMP = register("radon_lamp_coral", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //CANARY
    public static final Supplier<Block> CANARY_ROCK_CANDY = register("rock_candy_canary", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> CANARY_RADON_LAMP = register("radon_lamp_canary", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //WASABI
    public static final Supplier<Block> WASABI_ROCK_CANDY = register("rock_candy_wasabi", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> WASABI_RADON_LAMP = register("radon_lamp_wasabi", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //SACRAMENTO
    public static final Supplier<Block> SACRAMENTO_ROCK_CANDY = register("rock_candy_sacramento", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> SACRAMENTO_RADON_LAMP = register("radon_lamp_sacramento", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //SKY
    public static final Supplier<Block> SKY_ROCK_CANDY = register("rock_candy_sky", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> SKY_RADON_LAMP = register("radon_lamp_sky", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //BLURPLE
    public static final Supplier<Block> BLURPLE_ROCK_CANDY = register("rock_candy_blurple", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> BLURPLE_RADON_LAMP = register("radon_lamp_blurple", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //SANGRIA
    public static final Supplier<Block> SANGRIA_ROCK_CANDY = register("rock_candy_sangria", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> SANGRIA_RADON_LAMP = register("radon_lamp_sangria", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);

    //ROSE
    public static final Supplier<Block> ROSE_ROCK_CANDY = register("rock_candy_rose", () -> new IntegrationBlock(DDCProperties.BlockP.ROCK_CANDY, CompatIds.ALEXSCAVES), false);
    public static final Supplier<Block> ROSE_RADON_LAMP = register("radon_lamp_rose", () -> new IntegrationBlock(DDCProperties.BlockP.RADON_LAMP, CompatIds.ALEXSCAVES), true);
    
    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerIntegrationBlock(CompatIds.ALEXSCAVES, id, block, hasItem);
    }

    public static void loadAlexCBlocks() {
    }
}
