package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.init.DDFeatures;
import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class FabricDelicateDyes implements ModInitializer {
    
    @Override
    public void onInitialize() {
        DelicateDyes.init();
        DDRegistries.loadRegistries();

        addBiomeModifiers();
    }

    public void addBiomeModifiers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_SAVANNA), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_PEACH_BELLFLOWER);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SWAMP), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_GOOB_BLOSSOM);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_BLUEBERRY_BUSH);
    }
}
