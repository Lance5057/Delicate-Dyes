package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class DDItems {
    //CORAL
    public static final Supplier<Item> CORAL_DYE = register("coral_dye", () -> new DyeItem(DDDyeValues.CORAL, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> CORAL_BANNER = register("coral_banner", () -> new BannerItem(DDBlocks.CORAL_BANNER.get(), DDBlocks.CORAL_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> CORAL_BED = register("coral_bed", () -> new BedItem(DDBlocks.CORAL_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> CORAL_SHULKER_BOX = register("coral_shulker_box", () -> new BedItem(DDBlocks.CORAL_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    //UMBER
    public static final Supplier<Item> UMBER_DYE = register("umber_dye", () -> new DyeItem(DDDyeValues.UMBER, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> UMBER_BANNER = register("umber_banner", () -> new BannerItem(DDBlocks.UMBER_BANNER.get(), DDBlocks.UMBER_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> UMBER_BED = register("umber_bed", () -> new BedItem(DDBlocks.UMBER_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> UMBER_SHULKER_BOX = register("umber_shulker_box", () -> new BedItem(DDBlocks.UMBER_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    //CANARY
    public static final Supplier<Item> CANARY_DYE = register("canary_dye", () -> new DyeItem(DDDyeValues.CANARY, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> CANARY_BANNER = register("canary_banner", () -> new BannerItem(DDBlocks.CANARY_BANNER.get(), DDBlocks.CANARY_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> CANARY_BED = register("canary_bed", () -> new BedItem(DDBlocks.CANARY_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> CANARY_SHULKER_BOX = register("canary_shulker_box", () -> new BedItem(DDBlocks.CANARY_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));
    
    //WASABI
    public static final Supplier<Item> WASABI_DYE = register("wasabi_dye", () -> new DyeItem(DDDyeValues.WASABI, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> WASABI_BANNER = register("wasabi_banner", () -> new BannerItem(DDBlocks.WASABI_BANNER.get(), DDBlocks.WASABI_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> WASABI_BED = register("wasabi_bed", () -> new BedItem(DDBlocks.WASABI_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> WASABI_SHULKER_BOX = register("wasabi_shulker_box", () -> new BedItem(DDBlocks.WASABI_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));
    
    //SACRAMENTO
    public static final Supplier<Item> SACRAMENTO_DYE = register("sacramento_dye", () -> new DyeItem(DDDyeValues.SACRAMENTO, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> SACRAMENTO_BANNER = register("sacramento_banner", () -> new BannerItem(DDBlocks.SACRAMENTO_BANNER.get(), DDBlocks.SACRAMENTO_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> SACRAMENTO_BED = register("sacramento_bed", () -> new BedItem(DDBlocks.SACRAMENTO_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> SACRAMENTO_SHULKER_BOX = register("sacramento_shulker_box", () -> new BedItem(DDBlocks.SACRAMENTO_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));
    
    //SKY
    public static final Supplier<Item> SKY_DYE = register("sky_dye", () -> new DyeItem(DDDyeValues.SKY, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> SKY_BANNER = register("sky_banner", () -> new BannerItem(DDBlocks.SKY_BANNER.get(), DDBlocks.SKY_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> SKY_BED = register("sky_bed", () -> new BedItem(DDBlocks.SKY_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> SKY_SHULKER_BOX = register("sky_shulker_box", () -> new BedItem(DDBlocks.SKY_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));
    
    //BLURPLE
    public static final Supplier<Item> BLURPLE_DYE = register("blurple_dye", () -> new DyeItem(DDDyeValues.BLURPLE, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> BLURPLE_BANNER = register("blurple_banner", () -> new BannerItem(DDBlocks.BLURPLE_BANNER.get(), DDBlocks.BLURPLE_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> BLURPLE_BED = register("blurple_bed", () -> new BedItem(DDBlocks.BLURPLE_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> BLURPLE_SHULKER_BOX = register("blurple_shulker_box", () -> new BedItem(DDBlocks.BLURPLE_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    //LAVENDER
    public static final Supplier<Item> LAVENDER_DYE = register("lavender_dye", () -> new DyeItem(DDDyeValues.LAVENDER, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> LAVENDER_BANNER = register("lavender_banner", () -> new BannerItem(DDBlocks.LAVENDER_BANNER.get(), DDBlocks.LAVENDER_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> LAVENDER_BED = register("lavender_bed", () -> new BedItem(DDBlocks.LAVENDER_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> LAVENDER_SHULKER_BOX = register("lavender_shulker_box", () -> new BedItem(DDBlocks.LAVENDER_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    //SANGRIA
    public static final Supplier<Item> SANGRIA_DYE = register("sangria_dye", () -> new DyeItem(DDDyeValues.SANGRIA, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> SANGRIA_BANNER = register("sangria_banner", () -> new BannerItem(DDBlocks.SANGRIA_BANNER.get(), DDBlocks.SANGRIA_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> SANGRIA_BED = register("sangria_bed", () -> new BedItem(DDBlocks.SANGRIA_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> SANGRIA_SHULKER_BOX = register("sangria_shulker_box", () -> new BedItem(DDBlocks.SANGRIA_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    //ROSE
    public static final Supplier<Item> ROSE_DYE = register("rose_dye", () -> new DyeItem(DDDyeValues.ROSE, DDProperties.ItemP.GENERIC));
    public static final Supplier<Item> ROSE_BANNER = register("rose_banner", () -> new BannerItem(DDBlocks.ROSE_BANNER.get(), DDBlocks.ROSE_WALL_BANNER.get(), DDProperties.ItemP.GENERIC_16));
    public static final Supplier<Item> ROSE_BED = register("rose_bed", () -> new BedItem(DDBlocks.ROSE_BED.get(), DDProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> ROSE_SHULKER_BOX = register("rose_shulker_box", () -> new BedItem(DDBlocks.ROSE_SHULKER_BOX.get(), DDProperties.ItemP.GENERIC_1));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return RLServices.REGISTRY.registerItem(DelicateDyes.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
