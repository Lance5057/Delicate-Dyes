package net.azurune.delicate_dyes.core.integration.common.util;

import net.azurune.delicate_dyes.core.integration.alexscaves.registry.AlexCBlocks;
import net.azurune.delicate_dyes.core.integration.alexscaves.registry.AlexCItems;
import net.azurune.delicate_dyes.core.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.core.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.integration.clayworks.registry.CWBlocks;
import net.azurune.delicate_dyes.core.integration.nirvana.registry.NVBlocks;

public class IntegrationRegistries {

    public static void loadIntegration() {
        //ALEXSCAVES
        AlexCBlocks.loadAlexCBlocks();
        AlexCItems.loadAlexCItems();
        //APPLEDOG
        ADBlocks.loadADBlocks();
        ADItems.loadADItems();
        //CLAYWORKS
        CWBlocks.loadCWBlocks();
        //NIRVANA
        NVBlocks.loadNVBlocks();
    }
}
