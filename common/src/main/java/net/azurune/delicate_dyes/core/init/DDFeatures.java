package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.block.BlueberryBushBlock;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.RunicLib;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class DDFeatures {
    public static class ConfiguredFeatures {
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ROSE = createKey("patch_rose");
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PEACH_BELLFLOWER = createKey("patch_peach_bellflower");
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GOOB_BLOSSOM = createKey("patch_goob_blossom");

        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH = createKey("patch_blueberry_bush");

        public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, RunicLib.customid(DelicateDyes.MOD_ID, id));
        }

        public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
            // ROSE
            FeatureUtils.register(
                    context,
                    PATCH_ROSE,
                    Feature.FLOWER,
                    new RandomPatchConfiguration(
                            64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DDBlocks.ROSE.get())))
                    )
            );
            // BELLFLOWER
            FeatureUtils.register(
                    context,
                    PATCH_PEACH_BELLFLOWER,
                    Feature.FLOWER,
                    new RandomPatchConfiguration(
                            64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DDBlocks.PEACH_BELLFLOWER.get())))
                    )
            );
            // GOOB BLOSSOM
            FeatureUtils.register(
                    context,
                    PATCH_GOOB_BLOSSOM,
                    Feature.FLOWER,
                    new RandomPatchConfiguration(
                            64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DDBlocks.GOOB_BLOSSOM.get())))
                    )
            );
            // BLUEBERRY
            FeatureUtils.register(
                    context,
                    PATCH_BLUEBERRY_BUSH,
                    Feature.RANDOM_PATCH,
                    FeatureUtils.simplePatchConfiguration(
                            Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(
                                    BlockStateProvider.simple(DDBlocks.BLUEBERRY_BUSH.get().defaultBlockState().setValue(BlueberryBushBlock.AGE, 3))
                            ),
                            List.of(Blocks.GRASS_BLOCK)
                    )
            );
        }
    }

    public static class PlacedFeatures {
        public static final ResourceKey<PlacedFeature> PATCH_ROSE = createKey("patch_rose");
        public static final ResourceKey<PlacedFeature> PATCH_PEACH_BELLFLOWER = createKey("patch_peach_bellflower");
        public static final ResourceKey<PlacedFeature> PATCH_GOOB_BLOSSOM = createKey("patch_goob_blossom");

        public static final ResourceKey<PlacedFeature> PATCH_BLUEBERRY_BUSH = createKey("patch_blueberry_bush");

        public static ResourceKey<PlacedFeature> createKey(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, RunicLib.customid(DelicateDyes.MOD_ID, id));
        }

        public static void bootstrap(BootstrapContext<PlacedFeature> context) {
            HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);

            // ROSE
            PlacementUtils.register(
                    context,
                    PATCH_ROSE,
                    holdergetter.getOrThrow(ConfiguredFeatures.PATCH_ROSE),
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome()
            );
            // GOOB
            PlacementUtils.register(
                    context,
                    PATCH_GOOB_BLOSSOM,
                    holdergetter.getOrThrow(ConfiguredFeatures.PATCH_GOOB_BLOSSOM),
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome()
            );
            // BELLFLOWER
            PlacementUtils.register(
                    context,
                    PATCH_PEACH_BELLFLOWER,
                    holdergetter.getOrThrow(ConfiguredFeatures.PATCH_PEACH_BELLFLOWER),
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome()
            );
            // BLUEBERRY
            PlacementUtils.register(
                    context,
                    PATCH_BLUEBERRY_BUSH,
                    holdergetter.getOrThrow(ConfiguredFeatures.PATCH_BLUEBERRY_BUSH),
                    RarityFilter.onAverageOnceEvery(6),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                    BiomeFilter.biome()
            );
        }
    }
}
