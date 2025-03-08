package net.azurune.delicate_dyes.registry;

import net.azurune.delicate_dyes.platform.Services;
import net.azurune.delicate_dyes.util.DDDyeValue;
import net.azurune.delicate_dyes.util.DDProperties;
import net.minecraft.core.Holder;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.BedItem;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class DDItems {
    //CORAL
    public static final Holder<Item> CORAL_DYE = register("coral_dye", () -> new DyeItem(DDDyeValue.CORAL, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> CORAL_BANNER = register("coral_banner", () -> new BannerItem(DDBlocks.CORAL_BANNER.value(), DDBlocks.CORAL_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> CORAL_BED = register("coral_bed", () -> new BedItem(DDBlocks.CORAL_BED.value(), DDProperties.ItemP.GENERIC_1));

    //CANARY
    public static final Holder<Item> CANARY_DYE = register("canary_dye", () -> new DyeItem(DDDyeValue.CANARY, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> CANARY_BANNER = register("canary_banner", () -> new BannerItem(DDBlocks.CANARY_BANNER.value(), DDBlocks.CANARY_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> CANARY_BED = register("canary_bed", () -> new BedItem(DDBlocks.CANARY_BED.value(), DDProperties.ItemP.GENERIC_1));

    //WASABI
    public static final Holder<Item> WASABI_DYE = register("wasabi_dye", () -> new DyeItem(DDDyeValue.WASABI, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> WASABI_BANNER = register("wasabi_banner", () -> new BannerItem(DDBlocks.WASABI_BANNER.value(), DDBlocks.WASABI_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> WASABI_BED = register("wasabi_bed", () -> new BedItem(DDBlocks.WASABI_BED.value(), DDProperties.ItemP.GENERIC_1));

    //SACRAMENTO
    public static final Holder<Item> SACRAMENTO_DYE = register("sacramento_dye", () -> new DyeItem(DDDyeValue.SACRAMENTO, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> SACRAMENTO_BANNER = register("sacramento_banner", () -> new BannerItem(DDBlocks.SACRAMENTO_BANNER.value(), DDBlocks.SACRAMENTO_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> SACRAMENTO_BED = register("sacramento_bed", () -> new BedItem(DDBlocks.SACRAMENTO_BED.value(), DDProperties.ItemP.GENERIC_1));

    //SKY
    public static final Holder<Item> SKY_DYE = register("sky_dye", () -> new DyeItem(DDDyeValue.SKY, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> SKY_BANNER = register("sky_banner", () -> new BannerItem(DDBlocks.SKY_BANNER.value(), DDBlocks.SKY_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> SKY_BED = register("sky_bed", () -> new BedItem(DDBlocks.SKY_BED.value(), DDProperties.ItemP.GENERIC_1));

    //BLURPLE
    public static final Holder<Item> BLURPLE_DYE = register("blurple_dye", () -> new DyeItem(DDDyeValue.BLURPLE, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> BLURPLE_BANNER = register("blurple_banner", () -> new BannerItem(DDBlocks.BLURPLE_BANNER.value(), DDBlocks.BLURPLE_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> BLURPLE_BED = register("blurple_bed", () -> new BedItem(DDBlocks.BLURPLE_BED.value(), DDProperties.ItemP.GENERIC_1));

    //SANGRIA
    public static final Holder<Item> SANGRIA_DYE = register("sangria_dye", () -> new DyeItem(DDDyeValue.SANGRIA, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> SANGRIA_BANNER = register("sangria_banner", () -> new BannerItem(DDBlocks.SANGRIA_BANNER.value(), DDBlocks.SANGRIA_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> SANGRIA_BED = register("sangria_bed", () -> new BedItem(DDBlocks.SANGRIA_BED.value(), DDProperties.ItemP.GENERIC_1));

    //ROSE
    public static final Holder<Item> ROSE_DYE = register("rose_dye", () -> new DyeItem(DDDyeValue.ROSE, DDProperties.ItemP.GENERIC));
    public static final Holder<Item> ROSE_BANNER = register("rose_banner", () -> new BannerItem(DDBlocks.ROSE_BANNER.value(), DDBlocks.ROSE_WALL_BANNER.value(), DDProperties.ItemP.GENERIC_16));
    public static final Holder<Item> ROSE_BED = register("rose_bed", () -> new BedItem(DDBlocks.ROSE_BED.value(), DDProperties.ItemP.GENERIC_1));

    //MISC CONTENT
    public static final Holder<Item> BLUEBERRIES = register("blueberries", () -> new Item(DDProperties.ItemP.BLUEBERRIES));
    public static final Holder<Item> BLUEBERRY_PIE = register("blueberry_pie", () -> new Item(DDProperties.ItemP.BLUEBERRY_PIE));

    private static Holder<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(id, item);
    }

    public static void loadItems() {
    }
}
