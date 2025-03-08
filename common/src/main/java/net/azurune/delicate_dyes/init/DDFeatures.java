package net.azurune.delicate_dyes.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DDFeatures {
    public static class ConfiguredFeatures {
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ROSE = createKey("patch_rose");
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_ROSE = createKey("patch_blue_rose");
        public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_ROSE = createKey("patch_white_rose");

        public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, DelicateDyes.modid(id));
        }
    }

    public static class PlacedFeatures {
        public static final ResourceKey<PlacedFeature> PATCH_ROSE = createKey("patch_rose");
        public static final ResourceKey<PlacedFeature> PATCH_BLUE_ROSE = createKey("patch_blue_rose");
        public static final ResourceKey<PlacedFeature> PATCH_WHITE_ROSE = createKey("patch_white_rose");

        public static ResourceKey<PlacedFeature> createKey(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, DelicateDyes.modid(id));
        }
    }
}
