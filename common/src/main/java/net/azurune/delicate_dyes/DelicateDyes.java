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
        DDRegistries.loadRegistries();

        IntegrationRegistries.loadIntegration();
    }

    public static ResourceLocation modid(String id) {
        return new ResourceLocation(MOD_ID, id);
    }

    //TODO: POI - Villagers move towards custom beds

    //TODO: clayworks decorated pots
    //TODO: clayworks bleached recipes (lazy asf i wont lie)

    //TODO (future)
    //TODO: Proper custom special dye recipes for wool/beds/shulker boxes/shulker dye mixing
}