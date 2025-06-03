package net.azurune.delicate_dyes.core.integration.common.util;

import net.azurune.delicate_dyes.core.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.core.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.integration.clayworks.registry.CWBlocks;

public class IntegrationRegistries {

    public static void loadIntegration() {
        //APPLEDOG
        ADBlocks.loadADBlocks();
        ADItems.loadADItems();
        //CLAYWORKS
        CWBlocks.loadCWBlocks();
    }
}
