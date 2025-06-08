package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.integration.common.util.IntegrationRegistries;
import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDCreativeTabs;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelicateDyes {
    public static final String MOD_ID = "delicate_dyes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        DDBlocks.loadBlocks();
        DDItems.loadItems();
        DDCreativeTabs.loadCreativeTabs();

        IntegrationRegistries.loadIntegration();
    }

    public static ResourceLocation modid(String id) {
        return new ResourceLocation(MOD_ID, id);
    }

    //TODO: POI - Villagers move towards custom beds

    //TODO: clayworks decorated pots
    //TODO: mint recipe compat or smthing like that
    //TODO: arts n crafts bleach recipes + paintbrush stuff or smthing like that x2

    //TODO (future)
    //TODO: Proper custom special dye recipes for shulker boxes/shulker dye mixing
}