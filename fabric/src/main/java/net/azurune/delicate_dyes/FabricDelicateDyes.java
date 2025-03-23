package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.common.FabricItemGroupAdditions;
import net.azurune.delicate_dyes.core.init.DDFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class FabricDelicateDyes implements ModInitializer {
    
    @Override
    public void onInitialize() {
        DelicateDyes.init();
        FabricItemGroupAdditions.modifyCreativeTabs();
        addBiomeModifiers();
    }

    public void addBiomeModifiers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_BLUE_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_WHITE_ROSE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_BLUEBERRY_BUSH);
    }
}
