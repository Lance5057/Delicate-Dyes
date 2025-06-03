package net.azurune.delicate_dyes.core.integration.appledog.registry;

import net.azurune.delicate_dyes.core.integration.appledog.item.BlueberrycatItem;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ADItems {
    //MISC CONTENT
    public static final Supplier<Item> CATBLUEBERRY = register("catblueberry", () -> new BlueberrycatItem(ADBlocks.BLUEBERRYCAT_BUSH.get(), DDProperties.ItemP.BLUEBERRIES, CompatIds.APPLEDOG));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(CompatIds.APPLEDOG, id, item);
    }

    public static void loadADItems() {
    }
}
