package net.azurune.delicate_dyes.common.integration.util;

import net.azurune.delicate_dyes.FabricDelicateDyes;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class IntegrationDatagenUtil {
    private static void registerDatagenOnlyItem(String modid, String id, Supplier<Item> item) {
        if (FabricDelicateDyes.isDatagen()) {
            Services.REGISTRY.registerItem(modid, id, item);
        }
    }

    public static void registerDatagenItems() {
        //registerDatagenOnlyItem(ELS_AND_LS_DYES_MOD_ID, "wintergreen_planks"); example
    }
}
