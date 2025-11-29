package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDCreativeTabs;
import net.azurune.delicate_dyes.core.registry.DDItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelicateDyes {
    public static final String MOD_ID = "delicate_dyes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        DDItems.loadItems();
        DDBlocks.loadBlocks();
        DDCreativeTabs.loadCreativeTabs();

        //IntegrationRegistries.loadIntegration();
    }

    //TODO: POI - Villagers move towards custom beds
    //TODO: Proper custom special dye recipes for shulker boxes/shulker dye mixing

    //TODO: clayworks decorated pots
    //TODO: arts n crafts bleach recipes + paintbrush stuff or smthing like that x2
}