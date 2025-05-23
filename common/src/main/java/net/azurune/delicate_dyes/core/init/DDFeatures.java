package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DDFeatures {
    public static class ConfiguredFeatures {
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ROSE = createKey("patch_rose");

        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH = createKey("patch_blueberry_bush");

        public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, DelicateDyes.modid(id));
        }
    }

    public static class PlacedFeatures {
        public static final ResourceKey<PlacedFeature> PATCH_ROSE = createKey("patch_rose");

        public static final ResourceKey<PlacedFeature> PATCH_BLUEBERRY_BUSH = createKey("patch_blueberry_bush");

        public static ResourceKey<PlacedFeature> createKey(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, DelicateDyes.modid(id));
        }
    }
}
