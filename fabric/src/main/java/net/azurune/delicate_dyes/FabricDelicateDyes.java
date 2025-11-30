package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.azurune.runiclib.RunicLib;
import net.azurune.runiclib.core.platform.services.RLPlatformHelper;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.fabricmc.api.ModInitializer;

public class FabricDelicateDyes implements ModInitializer {
    
    @Override
    public void onInitialize() {
        DelicateDyes.init();
        DDRegistries.loadRegistries();
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
