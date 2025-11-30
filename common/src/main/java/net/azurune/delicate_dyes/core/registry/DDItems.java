package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import java.util.function.Supplier;

public class DDItems {
    //CORAL
    public static final Supplier<Item> CORAL_DYE = register("coral_dye", () -> new DyeItem(DDDyeValues.CORAL, DDProperties.ItemP.GENERIC));

    //CANARY
    public static final Supplier<Item> CANARY_DYE = register("canary_dye", () -> new DyeItem(DDDyeValues.CANARY, DDProperties.ItemP.GENERIC));

    //WASABI

    //SACRAMENTO

    //SKY

    //BLURPLE
    public static final Supplier<Item> BLURPLE_DYE = register("blurple_dye", () -> new DyeItem(DDDyeValues.BLURPLE, DDProperties.ItemP.GENERIC));

    //SANGRIA

    //ROSE
    public static final Supplier<Item> ROSE_DYE = register("rose_dye", () -> new DyeItem(DDDyeValues.ROSE, DDProperties.ItemP.GENERIC));

    //MISC
    public static final Supplier<Item> BLUEBERRIES = register("blueberries", () -> new ItemNameBlockItem(DDBlocks.BLUEBERRY_BUSH.get(), DDProperties.ItemP.BLUEBERRIES));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(DelicateDyes.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
