package net.azurune.delicate_dyes;

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
    }

    public static ResourceLocation modid(String id) {
        return new ResourceLocation(MOD_ID, id);
    }

    //TODO: MISC - Implement around 1 misc feature for each dye so they are obtainable in a non-intrusive way
    //TODO: RECIPES - Special wool recipes, special bed recipes, special shulker box recipes
    //TODO: SHULKER BOXES - Implement custom dye shulker boxes
    //TODO: COMPAT - With as many mods as possible (proper todo soon)
}