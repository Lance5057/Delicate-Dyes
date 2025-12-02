package net.azurune.delicate_dyes.common;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class NeoForgeItemGroupAdditions {

    public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            //WOOL
            putBlockAfter(event, Blocks.RED_WOOL, DDBlocks.CORAL_WOOL.get());
            putBlockAfter(event, DDBlocks.CORAL_WOOL.get(), DDBlocks.UMBER_WOOL.get());
            putBlockAfter(event, Blocks.YELLOW_WOOL, DDBlocks.CANARY_WOOL.get());
            putBlockAfter(event, DDBlocks.CANARY_WOOL.get(), DDBlocks.WASABI_WOOL.get());
            putBlockAfter(event, Blocks.GREEN_WOOL, DDBlocks.SACRAMENTO_WOOL.get());
            putBlockAfter(event, Blocks.CYAN_WOOL, DDBlocks.SKY_WOOL.get());
            putBlockAfter(event, Blocks.BLUE_WOOL, DDBlocks.BLURPLE_WOOL.get());
            putBlockAfter(event, Blocks.PURPLE_WOOL, DDBlocks.LAVENDER_WOOL.get());
            putBlockAfter(event, Blocks.MAGENTA_WOOL, DDBlocks.SANGRIA_WOOL.get());
            putBlockAfter(event, Blocks.PINK_WOOL, DDBlocks.ROSE_WOOL.get());

            //CARPET
            putBlockAfter(event, Blocks.RED_CARPET, DDBlocks.CORAL_CARPET.get());
            putBlockAfter(event, DDBlocks.CORAL_CARPET.get(), DDBlocks.UMBER_CARPET.get());
            putBlockAfter(event, Blocks.YELLOW_CARPET, DDBlocks.CANARY_CARPET.get());
            putBlockAfter(event, DDBlocks.CANARY_CARPET.get(), DDBlocks.WASABI_CARPET.get());
            putBlockAfter(event, Blocks.GREEN_CARPET, DDBlocks.SACRAMENTO_CARPET.get());
            putBlockAfter(event, Blocks.CYAN_CARPET, DDBlocks.SKY_CARPET.get());
            putBlockAfter(event, Blocks.BLUE_CARPET, DDBlocks.BLURPLE_CARPET.get());
            putBlockAfter(event, Blocks.PURPLE_CARPET, DDBlocks.LAVENDER_CARPET.get());
            putBlockAfter(event, Blocks.MAGENTA_CARPET, DDBlocks.SANGRIA_CARPET.get());
            putBlockAfter(event, Blocks.PINK_CARPET, DDBlocks.ROSE_CARPET.get());

            //TERRACOTTA
            putBlockAfter(event, Blocks.RED_TERRACOTTA, DDBlocks.CORAL_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CORAL_TERRACOTTA.get(), DDBlocks.UMBER_TERRACOTTA.get());
            putBlockAfter(event, Blocks.YELLOW_TERRACOTTA, DDBlocks.CANARY_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CANARY_TERRACOTTA.get(), DDBlocks.WASABI_TERRACOTTA.get());
            putBlockAfter(event, Blocks.GREEN_TERRACOTTA, DDBlocks.SACRAMENTO_TERRACOTTA.get());
            putBlockAfter(event, Blocks.CYAN_TERRACOTTA, DDBlocks.SKY_TERRACOTTA.get());
            putBlockAfter(event, Blocks.BLUE_TERRACOTTA, DDBlocks.BLURPLE_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PURPLE_TERRACOTTA, DDBlocks.LAVENDER_TERRACOTTA.get());
            putBlockAfter(event, Blocks.MAGENTA_TERRACOTTA, DDBlocks.SANGRIA_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PINK_TERRACOTTA, DDBlocks.ROSE_TERRACOTTA.get());

            //CONCRETE
            putBlockAfter(event, Blocks.RED_CONCRETE, DDBlocks.CORAL_CONCRETE.get());
            putBlockAfter(event, DDBlocks.CORAL_CONCRETE.get(), DDBlocks.UMBER_CONCRETE.get());
            putBlockAfter(event, Blocks.YELLOW_CONCRETE, DDBlocks.CANARY_CONCRETE.get());
            putBlockAfter(event, DDBlocks.CANARY_CONCRETE.get(), DDBlocks.WASABI_CONCRETE.get());
            putBlockAfter(event, Blocks.GREEN_CONCRETE, DDBlocks.SACRAMENTO_CONCRETE.get());
            putBlockAfter(event, Blocks.CYAN_CONCRETE, DDBlocks.SKY_CONCRETE.get());
            putBlockAfter(event, Blocks.BLUE_CONCRETE, DDBlocks.BLURPLE_CONCRETE.get());
            putBlockAfter(event, Blocks.PURPLE_CONCRETE, DDBlocks.LAVENDER_CONCRETE.get());
            putBlockAfter(event, Blocks.MAGENTA_CONCRETE, DDBlocks.SANGRIA_CONCRETE.get());
            putBlockAfter(event, Blocks.PINK_CONCRETE, DDBlocks.ROSE_CONCRETE.get());

            //CONCRETE POWDER
            putBlockAfter(event, Blocks.RED_CONCRETE_POWDER, DDBlocks.CORAL_CONCRETE_POWDER.get());
            putBlockAfter(event, DDBlocks.CORAL_CONCRETE_POWDER.get(), DDBlocks.UMBER_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.YELLOW_CONCRETE_POWDER, DDBlocks.CANARY_CONCRETE_POWDER.get());
            putBlockAfter(event, DDBlocks.CANARY_CONCRETE_POWDER.get(), DDBlocks.WASABI_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.GREEN_CONCRETE_POWDER, DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.CYAN_CONCRETE_POWDER, DDBlocks.SKY_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.BLUE_CONCRETE_POWDER, DDBlocks.BLURPLE_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.PURPLE_CONCRETE_POWDER, DDBlocks.LAVENDER_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.MAGENTA_CONCRETE_POWDER, DDBlocks.SANGRIA_CONCRETE_POWDER.get());
            putBlockAfter(event, Blocks.PINK_CONCRETE_POWDER, DDBlocks.ROSE_CONCRETE_POWDER.get());

            //GLAZED TERRACOTTA
            putBlockAfter(event, Blocks.RED_TERRACOTTA, DDBlocks.CORAL_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CORAL_TERRACOTTA.get(), DDBlocks.UMBER_TERRACOTTA.get());
            putBlockAfter(event, Blocks.YELLOW_TERRACOTTA, DDBlocks.CANARY_TERRACOTTA.get());
            putBlockAfter(event, DDBlocks.CANARY_TERRACOTTA.get(), DDBlocks.WASABI_TERRACOTTA.get());
            putBlockAfter(event, Blocks.GREEN_TERRACOTTA, DDBlocks.SACRAMENTO_TERRACOTTA.get());
            putBlockAfter(event, Blocks.CYAN_TERRACOTTA, DDBlocks.SKY_TERRACOTTA.get());
            putBlockAfter(event, Blocks.BLUE_TERRACOTTA, DDBlocks.BLURPLE_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PURPLE_TERRACOTTA, DDBlocks.LAVENDER_TERRACOTTA.get());
            putBlockAfter(event, Blocks.MAGENTA_TERRACOTTA, DDBlocks.SANGRIA_TERRACOTTA.get());
            putBlockAfter(event, Blocks.PINK_TERRACOTTA, DDBlocks.ROSE_TERRACOTTA.get());

            //STAINED GLASS
            putBlockAfter(event, Blocks.RED_STAINED_GLASS, DDBlocks.CORAL_STAINED_GLASS.get());
            putBlockAfter(event, DDBlocks.CORAL_STAINED_GLASS.get(), DDBlocks.UMBER_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.YELLOW_STAINED_GLASS, DDBlocks.CANARY_STAINED_GLASS.get());
            putBlockAfter(event, DDBlocks.CANARY_STAINED_GLASS.get(), DDBlocks.WASABI_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.GREEN_STAINED_GLASS, DDBlocks.SACRAMENTO_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.CYAN_STAINED_GLASS, DDBlocks.SKY_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.BLUE_STAINED_GLASS, DDBlocks.BLURPLE_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.PURPLE_STAINED_GLASS, DDBlocks.LAVENDER_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.MAGENTA_STAINED_GLASS, DDBlocks.SANGRIA_STAINED_GLASS.get());
            putBlockAfter(event, Blocks.PINK_STAINED_GLASS, DDBlocks.ROSE_STAINED_GLASS.get());

            //STAINED GLASS PANE
            putBlockAfter(event, Blocks.RED_STAINED_GLASS_PANE, DDBlocks.CORAL_STAINED_GLASS_PANE.get());
            putBlockAfter(event, DDBlocks.CORAL_STAINED_GLASS_PANE.get(), DDBlocks.UMBER_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.YELLOW_STAINED_GLASS_PANE, DDBlocks.CANARY_STAINED_GLASS_PANE.get());
            putBlockAfter(event, DDBlocks.CANARY_STAINED_GLASS_PANE.get(), DDBlocks.WASABI_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.GREEN_STAINED_GLASS_PANE, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.CYAN_STAINED_GLASS_PANE, DDBlocks.SKY_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.BLUE_STAINED_GLASS_PANE, DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.PURPLE_STAINED_GLASS_PANE, DDBlocks.LAVENDER_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.MAGENTA_STAINED_GLASS_PANE, DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
            putBlockAfter(event, Blocks.PINK_STAINED_GLASS_PANE, DDBlocks.ROSE_STAINED_GLASS_PANE.get());

            //SHULKER BOX
            putBlockAfter(event, Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CORAL_SHULKER_BOX.get(), DDBlocks.UMBER_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PURPLE_SHULKER_BOX, DDBlocks.LAVENDER_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.MAGENTA_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            putBlockAfter(event, Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            putBlockAfter(event, DDBlocks.CORAL_BED.get(), DDBlocks.UMBER_BED.get());
            putBlockAfter(event, Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            putBlockAfter(event, DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            putBlockAfter(event, Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            putBlockAfter(event, Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            putBlockAfter(event, Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            putBlockAfter(event, Blocks.PURPLE_BED, DDBlocks.LAVENDER_BED.get());
            putBlockAfter(event, Blocks.MAGENTA_BED, DDBlocks.SANGRIA_BED.get());
            putBlockAfter(event, Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            putBlockAfter(event, Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            putBlockAfter(event, DDBlocks.CORAL_CANDLE.get(), DDBlocks.UMBER_CANDLE.get());
            putBlockAfter(event, Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            putBlockAfter(event, DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            putBlockAfter(event, Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            putBlockAfter(event, Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            putBlockAfter(event, Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            putBlockAfter(event, Blocks.PURPLE_CANDLE, DDBlocks.LAVENDER_CANDLE.get());
            putBlockAfter(event, Blocks.MAGENTA_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            putBlockAfter(event, Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            putBlockAfter(event, Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            putBlockAfter(event, DDBlocks.CORAL_BANNER.get(), DDBlocks.UMBER_BANNER.get());
            putBlockAfter(event, Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            putBlockAfter(event, DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            putBlockAfter(event, Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            putBlockAfter(event, Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            putBlockAfter(event, Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            putBlockAfter(event, Blocks.PURPLE_BANNER, DDBlocks.LAVENDER_BANNER.get());
            putBlockAfter(event, Blocks.MAGENTA_BANNER, DDBlocks.SANGRIA_BANNER.get());
            putBlockAfter(event, Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            //SHULKER BOX
            putBlockAfter(event, Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CORAL_SHULKER_BOX.get(), DDBlocks.UMBER_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            putBlockAfter(event, DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PURPLE_SHULKER_BOX, DDBlocks.LAVENDER_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.MAGENTA_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            putBlockAfter(event, Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            putBlockAfter(event, Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            putBlockAfter(event, DDBlocks.CORAL_BED.get(), DDBlocks.UMBER_BED.get());
            putBlockAfter(event, Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            putBlockAfter(event, DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            putBlockAfter(event, Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            putBlockAfter(event, Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            putBlockAfter(event, Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            putBlockAfter(event, Blocks.PURPLE_BED, DDBlocks.LAVENDER_BED.get());
            putBlockAfter(event, Blocks.MAGENTA_BED, DDBlocks.SANGRIA_BED.get());
            putBlockAfter(event, Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            putBlockAfter(event, Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            putBlockAfter(event, DDBlocks.CORAL_CANDLE.get(), DDBlocks.UMBER_CANDLE.get());
            putBlockAfter(event, Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            putBlockAfter(event, DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            putBlockAfter(event, Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            putBlockAfter(event, Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            putBlockAfter(event, Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            putBlockAfter(event, Blocks.PURPLE_CANDLE, DDBlocks.LAVENDER_CANDLE.get());
            putBlockAfter(event, Blocks.MAGENTA_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            putBlockAfter(event, Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            putBlockAfter(event, Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            putBlockAfter(event, DDBlocks.CORAL_BANNER.get(), DDBlocks.UMBER_BANNER.get());
            putBlockAfter(event, Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            putBlockAfter(event, DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            putBlockAfter(event, Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            putBlockAfter(event, Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            putBlockAfter(event, Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            putBlockAfter(event, Blocks.PURPLE_BANNER, DDBlocks.LAVENDER_BANNER.get());
            putBlockAfter(event, Blocks.MAGENTA_BANNER, DDBlocks.SANGRIA_BANNER.get());
            putBlockAfter(event, Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //DYE
            putItemAfter(event, Items.RED_DYE, DDItems.CORAL_DYE.get());
            putItemAfter(event, DDItems.CORAL_DYE.get(), DDItems.UMBER_DYE.get());
            putItemAfter(event, Items.YELLOW_DYE, DDItems.CANARY_DYE.get());
            putItemAfter(event, DDItems.CANARY_DYE.get(), DDItems.WASABI_DYE.get());
            putItemAfter(event, Items.GREEN_DYE, DDItems.SACRAMENTO_DYE.get());
            putItemAfter(event, Items.CYAN_DYE, DDItems.SKY_DYE.get());
            putItemAfter(event, Items.BLUE_DYE, DDItems.BLURPLE_DYE.get());
            putItemAfter(event, Items.PURPLE_DYE, DDItems.LAVENDER_DYE.get());
            putItemAfter(event, Items.MAGENTA_DYE, DDItems.SANGRIA_DYE.get());
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
