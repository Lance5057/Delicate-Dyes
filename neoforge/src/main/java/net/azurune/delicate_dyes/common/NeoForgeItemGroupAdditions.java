package net.azurune.delicate_dyes.common;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.core.platform.Services;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class NeoForgeItemGroupAdditions {
//    public static final ResourceKey<CreativeModeTab> APPLEDOG = createKey("appledog:appledog");
//    public static final ResourceKey<CreativeModeTab> TOXIC_CAVES = createKey("alexscaves:toxic_caves");
//    public static final ResourceKey<CreativeModeTab> CANDY_CAVITY = createKey("alexscaves:candy_cavity");

    private static ResourceKey<CreativeModeTab> createKey(String id) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, RunicLib.customid(DelicateDyes.MOD_ID, id));
    }
    
    public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {
//        if (Services.PLATFORM.isModLoaded(CompatIds.APPLEDOG)) {
//            if (event.getTabKey() == APPLEDOG) {
//                event.accept(ADItems.CATBLUEBERRY.get());
//            }
//        }

        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            //WOOL
            putBlockAfter(event, Blocks.RED_WOOL, DDBlocks.CORAL_WOOL.get());
            putBlockAfter(event, Blocks.YELLOW_WOOL, DDBlocks.CANARY_WOOL.get());
            putBlockAfter(event, DDBlocks.CANARY_WOOL.get(), DDBlocks.WASABI_WOOL.get());
            putBlockAfter(event, Blocks.GREEN_WOOL, DDBlocks.SACRAMENTO_WOOL.get());
            putBlockAfter(event, Blocks.CYAN_WOOL, DDBlocks.SKY_WOOL.get());
            putBlockAfter(event, Blocks.BLUE_WOOL, DDBlocks.BLURPLE_WOOL.get());
            putBlockAfter(event, Blocks.PURPLE_WOOL, DDBlocks.SANGRIA_WOOL.get());
            putBlockAfter(event, Blocks.PINK_WOOL, DDBlocks.ROSE_WOOL.get());

            //CARPET
            putBlockAfter(event, Blocks.RED_CARPET, DDBlocks.CORAL_CARPET.get());
            putBlockAfter(event, Blocks.YELLOW_CARPET, DDBlocks.CANARY_CARPET.get());
            putBlockAfter(event, DDBlocks.CANARY_CARPET.get(), DDBlocks.WASABI_CARPET.get());
            putBlockAfter(event, Blocks.GREEN_CARPET, DDBlocks.SACRAMENTO_CARPET.get());
            putBlockAfter(event, Blocks.CYAN_CARPET, DDBlocks.SKY_CARPET.get());
            putBlockAfter(event, Blocks.BLUE_CARPET, DDBlocks.BLURPLE_CARPET.get());
            putBlockAfter(event, Blocks.PURPLE_CARPET, DDBlocks.SANGRIA_CARPET.get());
            putBlockAfter(event, Blocks.PINK_CARPET, DDBlocks.ROSE_CARPET.get());

            //TERRACOTTA
            putBlockAfter(event, Blocks.RED_TERRACOTTA, DDBlocks.CORAL_TERRACOTTA.get());
            putBlockAfter(event, Blocks.YELLOW_TERRACOTTA, DDBlocks.CANARY_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CANARY_TERRACOTTA.get(), DDBlocks.WASABI_TERRACOTTA.get());
            putBlockAfter(event, Blocks.GREEN_TERRACOTTA, DDBlocks.SACRAMENTO_TERRACOTTA.get());
            putBlockAfter(event, Blocks.CYAN_TERRACOTTA, DDBlocks.SKY_TERRACOTTA.get());
            putBlockAfter(event, Blocks.BLUE_TERRACOTTA, DDBlocks.BLURPLE_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PURPLE_TERRACOTTA, DDBlocks.SANGRIA_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PINK_TERRACOTTA, DDBlocks.ROSE_TERRACOTTA.get());

            //CONCRETE
            putBlockAfter(event, Blocks.RED_CONCRETE, DDBlocks.CORAL_CONCRETE.get());
            putBlockAfter(event, Blocks.YELLOW_CONCRETE, DDBlocks.CANARY_CONCRETE.get());
            putBlockAfter(event, DDBlocks.CANARY_CONCRETE.get(), DDBlocks.WASABI_CONCRETE.get());
            putBlockAfter(event, Blocks.GREEN_CONCRETE, DDBlocks.SACRAMENTO_CONCRETE.get());
            putBlockAfter(event, Blocks.CYAN_CONCRETE, DDBlocks.SKY_CONCRETE.get());
            putBlockAfter(event, Blocks.BLUE_CONCRETE, DDBlocks.BLURPLE_CONCRETE.get());
            putBlockAfter(event, Blocks.PURPLE_CONCRETE, DDBlocks.SANGRIA_CONCRETE.get());
            putBlockAfter(event, Blocks.PINK_CONCRETE, DDBlocks.ROSE_CONCRETE.get());

            //CONCRETE_POWDER
            putBlockAfter(event, Blocks.RED_CONCRETE_POWDER, DDBlocks.CORAL_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.YELLOW_CONCRETE_POWDER, DDBlocks.CANARY_CONCRETE_POWDER.get());
            putBlockAfter(event, DDBlocks.CANARY_CONCRETE_POWDER.get(), DDBlocks.WASABI_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.GREEN_CONCRETE_POWDER, DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.CYAN_CONCRETE_POWDER, DDBlocks.SKY_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.BLUE_CONCRETE_POWDER, DDBlocks.BLURPLE_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.PURPLE_CONCRETE_POWDER, DDBlocks.SANGRIA_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.PINK_CONCRETE_POWDER, DDBlocks.ROSE_CONCRETE_POWDER.get());

            //GLAZED_TERRACOTTA
            putBlockAfter(event, Blocks.RED_GLAZED_TERRACOTTA, DDBlocks.CORAL_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.YELLOW_GLAZED_TERRACOTTA, DDBlocks.CANARY_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CANARY_GLAZED_TERRACOTTA.get(), DDBlocks.WASABI_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.GREEN_GLAZED_TERRACOTTA, DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.CYAN_GLAZED_TERRACOTTA, DDBlocks.SKY_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.BLUE_GLAZED_TERRACOTTA, DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PURPLE_GLAZED_TERRACOTTA, DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PINK_GLAZED_TERRACOTTA, DDBlocks.ROSE_GLAZED_TERRACOTTA.get());

            //STAINED_GLASS
            putBlockAfter(event, Blocks.RED_STAINED_GLASS, DDBlocks.CORAL_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.YELLOW_STAINED_GLASS, DDBlocks.CANARY_STAINED_GLASS.get());
            putBlockAfter(event, DDBlocks.CANARY_STAINED_GLASS.get(), DDBlocks.WASABI_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.GREEN_STAINED_GLASS, DDBlocks.SACRAMENTO_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.CYAN_STAINED_GLASS, DDBlocks.SKY_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.BLUE_STAINED_GLASS, DDBlocks.BLURPLE_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.PURPLE_STAINED_GLASS, DDBlocks.SANGRIA_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.PINK_STAINED_GLASS, DDBlocks.ROSE_STAINED_GLASS.get());

            //STAINED_GLASS_PANE
            putBlockAfter(event, Blocks.RED_STAINED_GLASS_PANE, DDBlocks.CORAL_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.YELLOW_STAINED_GLASS_PANE, DDBlocks.CANARY_STAINED_GLASS_PANE.get());
            putBlockAfter(event, DDBlocks.CANARY_STAINED_GLASS_PANE.get(), DDBlocks.WASABI_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.GREEN_STAINED_GLASS_PANE, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.CYAN_STAINED_GLASS_PANE, DDBlocks.SKY_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.BLUE_STAINED_GLASS_PANE, DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.PURPLE_STAINED_GLASS_PANE, DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.PINK_STAINED_GLASS_PANE, DDBlocks.ROSE_STAINED_GLASS_PANE.get());

            //SHULKER_BOX
            putBlockAfter(event, Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PURPLE_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            putBlockAfter(event, Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            putBlockAfter(event, Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            putBlockAfter(event, DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            putBlockAfter(event, Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            putBlockAfter(event, Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            putBlockAfter(event, Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            putBlockAfter(event, Blocks.PURPLE_BED, DDBlocks.SANGRIA_BED.get());
            putBlockAfter(event, Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            putBlockAfter(event, Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            putBlockAfter(event, Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            putBlockAfter(event, DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            putBlockAfter(event, Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            putBlockAfter(event, Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            putBlockAfter(event, Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            putBlockAfter(event, Blocks.PURPLE_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            putBlockAfter(event, Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            putBlockAfter(event, Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            putBlockAfter(event, Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            putBlockAfter(event, DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            putBlockAfter(event, Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            putBlockAfter(event, Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            putBlockAfter(event, Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            putBlockAfter(event, Blocks.PURPLE_BANNER, DDBlocks.SANGRIA_BANNER.get());
            putBlockAfter(event, Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            //SHULKER_BOX
            putBlockAfter(event, Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PURPLE_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            putBlockAfter(event, Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            putBlockAfter(event, Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            putBlockAfter(event, DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            putBlockAfter(event, Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            putBlockAfter(event, Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            putBlockAfter(event, Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            putBlockAfter(event, Blocks.PURPLE_BED, DDBlocks.SANGRIA_BED.get());
            putBlockAfter(event, Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            putBlockAfter(event, Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            putBlockAfter(event, Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            putBlockAfter(event, DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            putBlockAfter(event, Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            putBlockAfter(event, Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            putBlockAfter(event, Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            putBlockAfter(event, Blocks.PURPLE_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            putBlockAfter(event, Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            putBlockAfter(event, Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            putBlockAfter(event, Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            putBlockAfter(event, DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            putBlockAfter(event, Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            putBlockAfter(event, Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            putBlockAfter(event, Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            putBlockAfter(event, Blocks.PURPLE_BANNER, DDBlocks.SANGRIA_BANNER.get());
            putBlockAfter(event, Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //DYE
            putItemAfter(event, Items.RED_DYE, DDItems.CORAL_DYE.get());
            putItemAfter(event, Items.YELLOW_DYE, DDItems.CANARY_DYE.get());
            putItemAfter(event, DDItems.CANARY_DYE.get(), DDItems.WASABI_DYE.get());
            putItemAfter(event, Items.GREEN_DYE, DDItems.SACRAMENTO_DYE.get());
            putItemAfter(event, Items.CYAN_DYE, DDItems.SKY_DYE.get());
            putItemAfter(event, Items.BLUE_DYE, DDItems.BLURPLE_DYE.get());
            putItemAfter(event, Items.PURPLE_DYE, DDItems.SANGRIA_DYE.get());
            putItemAfter(event, Items.PINK_DYE, DDItems.ROSE_DYE.get());
        }
    }

    private static void putItemAfter(BuildCreativeModeTabContentsEvent event, Item itemBefore, Item itemAfter) {
        event.insertAfter(itemBefore.getDefaultInstance(),
                itemAfter.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void putBlockAfter(BuildCreativeModeTabContentsEvent event, Block blockBefore, Block blockAfter) {
        event.insertAfter(blockBefore.asItem().getDefaultInstance(),
                blockAfter.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
