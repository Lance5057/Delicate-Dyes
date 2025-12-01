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
    // CORAL
    public static final Supplier<Item> CORAL_DYE = register("coral_dye", () -> new DyeItem(DDDyeValues.CORAL, DDProperties.ItemP.GENERIC));
    // CANARY
    public static final Supplier<Item> CANARY_DYE = register("canary_dye", () -> new DyeItem(DDDyeValues.CANARY, DDProperties.ItemP.GENERIC));
    // WASABI
    public static final Supplier<Item> WASABI_DYE = register("wasabi_dye", () -> new DyeItem(DDDyeValues.WASABI, DDProperties.ItemP.GENERIC));
    // SACRAMENTO
    public static final Supplier<Item> SACRAMENTO_DYE = register("sacramento_dye", () -> new DyeItem(DDDyeValues.SACRAMENTO, DDProperties.ItemP.GENERIC));
    // SKY
    public static final Supplier<Item> SKY_DYE = register("sky_dye", () -> new DyeItem(DDDyeValues.SKY, DDProperties.ItemP.GENERIC));
    // BLURPLE
    public static final Supplier<Item> BLURPLE_DYE = register("blurple_dye", () -> new DyeItem(DDDyeValues.BLURPLE, DDProperties.ItemP.GENERIC));
    // SANGRIA
    public static final Supplier<Item> SANGRIA_DYE = register("sangria_dye", () -> new DyeItem(DDDyeValues.SANGRIA, DDProperties.ItemP.GENERIC));
	// ROSE
    public static final Supplier<Item> ROSE_DYE = register("rose_dye", () -> new DyeItem(DDDyeValues.ROSE, DDProperties.ItemP.GENERIC));

    // MISC
    public static final Supplier<Item> BLUEBERRIES = register("blueberries", () -> new ItemNameBlockItem(DDBlocks.BLUEBERRY_BUSH.get(), DDProperties.ItemP.BLUEBERRIES));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(DelicateDyes.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
