package net.azurune.delicate_dyes;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class FabricDelicateDyesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        DelicateDyesClient.init();
    }
}
