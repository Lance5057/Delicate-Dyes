package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.common.FabricItemGroupAdditions;
import net.azurune.delicate_dyes.common.integration.util.IntegrationDatagenUtil;
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
        IntegrationDatagenUtil.registerDatagenItems();
    }

    public void addBiomeModifiers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_ROSE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, DDFeatures.PlacedFeatures.PATCH_BLUEBERRY_BUSH);
    }

    public static boolean isDatagen() {
        try {
            Class.forName("net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint");
            return System.getProperty("fabric-api.datagen") != null;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
