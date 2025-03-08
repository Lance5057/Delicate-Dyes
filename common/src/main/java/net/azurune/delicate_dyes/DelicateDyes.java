package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.registry.DDCreativeTabs;
import net.azurune.delicate_dyes.registry.DDItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelicateDyes {
    public static final String MOD_ID = "delicate_dyes";
    public static final String MOD_NAME = "Delicate Dyes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    
    public static void init() {
        DDBlocks.loadBlocks();
        DDItems.loadItems();
        DDCreativeTabs.loadCreativeTabs();
    }

    public static ResourceLocation modid(String id) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }

    //TODO: MISC - Implement around 1 misc feature for each dye so they are obtainable in a non-intrusive way
    //TODO: RECIPES - Special wool recipes, special bed recipes, special shulker box recipes
    //TODO: SHULKER BOXES - Implement custom dye shulker boxes
    //TODO: COMPAT - WITH AS MANY MODS AS POSSIBLEEEEEEEEEEEE
    //TODO: CONFIGURATION - Toggle for dyes if possible?, also some misc features should have toggles
}