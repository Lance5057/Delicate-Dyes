package net.azurune.delicate_dyes.common.integration.common.util;

import net.azurune.delicate_dyes.common.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.common.integration.appledog.registry.ADItems;

public class IntegrationRegistries {

    public static void loadIntegration() {
        //APPLEDOG
        ADBlocks.loadADBlocks();
        ADItems.loadADItems();
    }
}
