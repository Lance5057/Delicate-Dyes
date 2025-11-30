package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FabricDelicateDyesDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(DDLangGen::new);
        pack.addProvider(DDBlockTagGen::new);
        pack.addProvider(DDItemTagGen::new);
        //pack.addProvider(DDRecipeGen::new);
        pack.addProvider(DDLootTableGen::new);
        //pack.addProvider(DDModelGen::new);
    }
}
