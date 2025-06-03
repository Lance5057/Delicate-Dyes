package net.azurune.delicate_dyes.common.integration.util;

import net.azurune.delicate_dyes.FabricDelicateDyes;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.Item;

public class IntegrationDatagenUtil {
    private static void registerDatagenOnlyItem(String modid, String id) {
        if (FabricDelicateDyes.isDatagen()) {
            Services.REGISTRY.registerItem(modid, id, () -> new Item(new Item.Properties()));
        }
    }

    public static void registerDatagenItems() {
        registerDatagenOnlyItem(CompatIds.APPLEDOG, "dogapple");
    }
}
