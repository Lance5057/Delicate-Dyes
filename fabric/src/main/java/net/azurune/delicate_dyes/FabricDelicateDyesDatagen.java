package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.init.DDFeatures;
import net.azurune.delicate_dyes.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class FabricDelicateDyesDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(DDLangGen::new);
        pack.addProvider(DDBlockTagGen::new);
        pack.addProvider(DDItemTagGen::new);
        pack.addProvider(DDRecipeGen::new);
        pack.addProvider(DDLootTableGen::new);
        pack.addProvider(DDModelGen::new);
        pack.addProvider(DDWorldGen::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder)
    {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, DDFeatures.ConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, DDFeatures.PlacedFeatures::bootstrap);
    }
}
