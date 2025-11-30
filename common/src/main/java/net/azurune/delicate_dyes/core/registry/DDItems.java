package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class DDItems {
    // CORAL
    public static final Supplier<Item> CORAL_DYE = register("coral_dye", () -> new DyeItem(DyeColor.WHITE, DDProperties.ItemP.GENERIC));
    // CANARY

    // WASABI

    // SACRAMENTO

    // SKY

    // BLURPLE

    // SANGRIA

    // ROSE

    // MISC

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(DelicateDyes.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
