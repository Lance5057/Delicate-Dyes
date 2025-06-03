package net.azurune.delicate_dyes.core.integration.clayworks.registry;

import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.delicate_dyes.core.integration.common.block.*;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.integration.common.util.DDCProperties;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class CWBlocks {
    //TERRACOTTA STAIRS
    public static final Supplier<Block> CORAL_TERRACOTTA_STAIRS = register("coral_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.CORAL_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_STAIRS = register("canary_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.CANARY_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_STAIRS = register("wasabi_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.WASABI_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_STAIRS = register("sacramento_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.SACRAMENTO_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_STAIRS = register("sky_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.SKY_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_STAIRS = register("blurple_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.BLURPLE_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_STAIRS = register("sangria_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.SANGRIA_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_STAIRS = register("rose_terracotta_stairs", () -> new IntegrationStairBlock(DDBlocks.ROSE_TERRACOTTA.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA SLABS
    public static final Supplier<Block> CORAL_TERRACOTTA_SLAB = register("coral_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_SLAB = register("canary_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_SLAB = register("wasabi_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_SLAB = register("sacramento_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_SLAB = register("sky_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_SLAB = register("blurple_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_SLAB = register("sangria_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_SLAB = register("rose_terracotta_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA WALLS
    public static final Supplier<Block> CORAL_TERRACOTTA_WALL = register("coral_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_WALL = register("canary_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_WALL = register("wasabi_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_WALL = register("sacramento_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_WALL = register("sky_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_WALL = register("blurple_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_WALL = register("sangria_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_WALL = register("rose_terracotta_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA BRICKS
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICKS = register("coral_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_BRICKS = register("canary_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_BRICKS = register("wasabi_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_BRICKS = register("sacramento_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_BRICKS = register("sky_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_BRICKS = register("blurple_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_BRICKS = register("sangria_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICKS = register("rose_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA BRICK STAIRS
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICK_STAIRS = register("coral_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.CORAL_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_BRICK_STAIRS = register("canary_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.CANARY_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_BRICK_STAIRS = register("wasabi_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.WASABI_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_BRICK_STAIRS = register("sacramento_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.SACRAMENTO_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_BRICK_STAIRS = register("sky_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.SKY_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_BRICK_STAIRS = register("blurple_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.BLURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_BRICK_STAIRS = register("sangria_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.SANGRIA_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICK_STAIRS = register("rose_terracotta_brick_stairs", () -> new IntegrationStairBlock(CWBlocks.ROSE_TERRACOTTA_BRICKS.get().defaultBlockState(), DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA BRICK SLABS
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICK_SLAB = register("coral_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_BRICK_SLAB = register("canary_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_BRICK_SLAB = register("wasabi_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_BRICK_SLAB = register("sacramento_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_BRICK_SLAB = register("sky_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_BRICK_SLAB = register("blurple_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_BRICK_SLAB = register("sangria_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICK_SLAB = register("rose_terracotta_brick_slab", () -> new IntegrationSlabBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //TERRACOTTA BRICK WALLS
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICK_WALL = register("coral_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_TERRACOTTA_BRICK_WALL = register("canary_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_TERRACOTTA_BRICK_WALL = register("wasabi_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA_BRICK_WALL = register("sacramento_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_TERRACOTTA_BRICK_WALL = register("sky_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_TERRACOTTA_BRICK_WALL = register("blurple_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_TERRACOTTA_BRICK_WALL = register("sangria_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICK_WALL = register("rose_terracotta_brick_wall", () -> new IntegrationWallBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //CHISELED TERRACOTTA BRICKS
    public static final Supplier<Block> CHISELED_CORAL_TERRACOTTA_BRICKS = register("chiseled_coral_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_CANARY_TERRACOTTA_BRICKS = register("chiseled_canary_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_WASABI_TERRACOTTA_BRICKS = register("chiseled_wasabi_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_SACRAMENTO_TERRACOTTA_BRICKS = register("chiseled_sacramento_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_SKY_TERRACOTTA_BRICKS = register("chiseled_sky_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_BLURPLE_TERRACOTTA_BRICKS = register("chiseled_blurple_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_SANGRIA_TERRACOTTA_BRICKS = register("chiseled_sangria_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CHISELED_ROSE_TERRACOTTA_BRICKS = register("chiseled_rose_terracotta_bricks", () -> new IntegrationBlock(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    //DECORATED POT
    public static final Supplier<Block> CORAL_DECORATED_POT = register("coral_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.CORAL.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> CANARY_DECORATED_POT = register("canary_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.CANARY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> WASABI_DECORATED_POT = register("wasabi_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.WASABI.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SACRAMENTO_DECORATED_POT = register("sacramento_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.SACRAMENTO.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SKY_DECORATED_POT = register("sky_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.SKY.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> BLURPLE_DECORATED_POT = register("blurple_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.BLURPLE.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> SANGRIA_DECORATED_POT = register("sangria_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.SANGRIA.getMapColor()), CompatIds.CLAYWORKS), true);
    public static final Supplier<Block> ROSE_DECORATED_POT = register("rose_decorated_pot", () -> new IntegrationDecoratedPotBlock(DDCProperties.BlockP.DECORATED_POT.mapColor(DDDyeValues.ROSE.getMapColor()), CompatIds.CLAYWORKS), true);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(CompatIds.CLAYWORKS, id, block, hasItem);
    }

    public static void loadCWBlocks() {
    }
}
