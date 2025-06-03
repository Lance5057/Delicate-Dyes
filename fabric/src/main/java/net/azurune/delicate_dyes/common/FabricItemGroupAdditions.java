package net.azurune.delicate_dyes.common;

import net.azurune.delicate_dyes.core.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.platform.Services;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class FabricItemGroupAdditions {
    public static final ResourceKey<CreativeModeTab> APPLEDOG = createKey("appledog:appledog");

    private static ResourceKey<CreativeModeTab> createKey(String id) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(id));
    }

    public static void modifyCreativeTabs() {
        if (Services.PLATFORM.isModLoaded(CompatIds.APPLEDOG)) {
            ItemGroupEvents.modifyEntriesEvent(APPLEDOG).register(entries -> {
                entries.accept(ADItems.CATBLUEBERRY.get());
            });
        }

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            //WOOL
            entries.addAfter(Blocks.RED_WOOL, DDBlocks.CORAL_WOOL.get());
            entries.addAfter(Blocks.YELLOW_WOOL, DDBlocks.CANARY_WOOL.get());
            entries.addAfter(DDBlocks.CANARY_WOOL.get(), DDBlocks.WASABI_WOOL.get());
            entries.addAfter(Blocks.GREEN_WOOL, DDBlocks.SACRAMENTO_WOOL.get());
            entries.addAfter(Blocks.CYAN_WOOL, DDBlocks.SKY_WOOL.get());
            entries.addAfter(Blocks.BLUE_WOOL, DDBlocks.BLURPLE_WOOL.get());
            entries.addAfter(Blocks.PURPLE_WOOL, DDBlocks.SANGRIA_WOOL.get());
            entries.addAfter(Blocks.PINK_WOOL, DDBlocks.ROSE_WOOL.get());

            //CARPET
            entries.addAfter(Blocks.RED_CARPET, DDBlocks.CORAL_CARPET.get());
            entries.addAfter(Blocks.YELLOW_CARPET, DDBlocks.CANARY_CARPET.get());
            entries.addAfter(DDBlocks.CANARY_CARPET.get(), DDBlocks.WASABI_CARPET.get());
            entries.addAfter(Blocks.GREEN_CARPET, DDBlocks.SACRAMENTO_CARPET.get());
            entries.addAfter(Blocks.CYAN_CARPET, DDBlocks.SKY_CARPET.get());
            entries.addAfter(Blocks.BLUE_CARPET, DDBlocks.BLURPLE_CARPET.get());
            entries.addAfter(Blocks.PURPLE_CARPET, DDBlocks.SANGRIA_CARPET.get());
            entries.addAfter(Blocks.PINK_CARPET, DDBlocks.ROSE_CARPET.get());

            //TERRACOTTA
            entries.addAfter(Blocks.RED_TERRACOTTA, DDBlocks.CORAL_TERRACOTTA.get());
            entries.addAfter(Blocks.YELLOW_TERRACOTTA, DDBlocks.CANARY_TERRACOTTA.get());
            entries.addAfter(DDBlocks.CANARY_TERRACOTTA.get(), DDBlocks.WASABI_TERRACOTTA.get());
            entries.addAfter(Blocks.GREEN_TERRACOTTA, DDBlocks.SACRAMENTO_TERRACOTTA.get());
            entries.addAfter(Blocks.CYAN_TERRACOTTA, DDBlocks.SKY_TERRACOTTA.get());
            entries.addAfter(Blocks.BLUE_TERRACOTTA, DDBlocks.BLURPLE_TERRACOTTA.get());
            entries.addAfter(Blocks.PURPLE_TERRACOTTA, DDBlocks.SANGRIA_TERRACOTTA.get());
            entries.addAfter(Blocks.PINK_TERRACOTTA, DDBlocks.ROSE_TERRACOTTA.get());

            //CONCRETE
            entries.addAfter(Blocks.RED_CONCRETE, DDBlocks.CORAL_CONCRETE.get());
            entries.addAfter(Blocks.YELLOW_CONCRETE, DDBlocks.CANARY_CONCRETE.get());
            entries.addAfter(DDBlocks.CANARY_CONCRETE.get(), DDBlocks.WASABI_CONCRETE.get());
            entries.addAfter(Blocks.GREEN_CONCRETE, DDBlocks.SACRAMENTO_CONCRETE.get());
            entries.addAfter(Blocks.CYAN_CONCRETE, DDBlocks.SKY_CONCRETE.get());
            entries.addAfter(Blocks.BLUE_CONCRETE, DDBlocks.BLURPLE_CONCRETE.get());
            entries.addAfter(Blocks.PURPLE_CONCRETE, DDBlocks.SANGRIA_CONCRETE.get());
            entries.addAfter(Blocks.PINK_CONCRETE, DDBlocks.ROSE_CONCRETE.get());

            //CONCRETE_POWDER
            entries.addAfter(Blocks.RED_CONCRETE_POWDER, DDBlocks.CORAL_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.YELLOW_CONCRETE_POWDER, DDBlocks.CANARY_CONCRETE_POWDER.get());
            entries.addAfter(DDBlocks.CANARY_CONCRETE_POWDER.get(), DDBlocks.WASABI_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.GREEN_CONCRETE_POWDER, DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.CYAN_CONCRETE_POWDER, DDBlocks.SKY_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.BLUE_CONCRETE_POWDER, DDBlocks.BLURPLE_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.PURPLE_CONCRETE_POWDER, DDBlocks.SANGRIA_CONCRETE_POWDER.get());
            entries.addAfter(Blocks.PINK_CONCRETE_POWDER, DDBlocks.ROSE_CONCRETE_POWDER.get());

            //GLAZED_TERRACOTTA
            entries.addAfter(Blocks.RED_GLAZED_TERRACOTTA, DDBlocks.CORAL_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.YELLOW_GLAZED_TERRACOTTA, DDBlocks.CANARY_GLAZED_TERRACOTTA.get());
            entries.addAfter(DDBlocks.CANARY_GLAZED_TERRACOTTA.get(), DDBlocks.WASABI_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.GREEN_GLAZED_TERRACOTTA, DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.CYAN_GLAZED_TERRACOTTA, DDBlocks.SKY_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.BLUE_GLAZED_TERRACOTTA, DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.PURPLE_GLAZED_TERRACOTTA, DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get());
            entries.addAfter(Blocks.PINK_GLAZED_TERRACOTTA, DDBlocks.ROSE_GLAZED_TERRACOTTA.get());

            //STAINED_GLASS
            entries.addAfter(Blocks.RED_STAINED_GLASS, DDBlocks.CORAL_STAINED_GLASS.get());
            entries.addAfter(Blocks.YELLOW_STAINED_GLASS, DDBlocks.CANARY_STAINED_GLASS.get());
            entries.addAfter(DDBlocks.CANARY_STAINED_GLASS.get(), DDBlocks.WASABI_STAINED_GLASS.get());
            entries.addAfter(Blocks.GREEN_STAINED_GLASS, DDBlocks.SACRAMENTO_STAINED_GLASS.get());
            entries.addAfter(Blocks.CYAN_STAINED_GLASS, DDBlocks.SKY_STAINED_GLASS.get());
            entries.addAfter(Blocks.BLUE_STAINED_GLASS, DDBlocks.BLURPLE_STAINED_GLASS.get());
            entries.addAfter(Blocks.PURPLE_STAINED_GLASS, DDBlocks.SANGRIA_STAINED_GLASS.get());
            entries.addAfter(Blocks.PINK_STAINED_GLASS, DDBlocks.ROSE_STAINED_GLASS.get());

            //STAINED_GLASS_PANE
            entries.addAfter(Blocks.RED_STAINED_GLASS_PANE, DDBlocks.CORAL_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.YELLOW_STAINED_GLASS_PANE, DDBlocks.CANARY_STAINED_GLASS_PANE.get());
            entries.addAfter(DDBlocks.CANARY_STAINED_GLASS_PANE.get(), DDBlocks.WASABI_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.GREEN_STAINED_GLASS_PANE, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.CYAN_STAINED_GLASS_PANE, DDBlocks.SKY_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.BLUE_STAINED_GLASS_PANE, DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.PURPLE_STAINED_GLASS_PANE, DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
            entries.addAfter(Blocks.PINK_STAINED_GLASS_PANE, DDBlocks.ROSE_STAINED_GLASS_PANE.get());

            //SHULKER_BOX
            entries.addAfter(Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            entries.addAfter(Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            entries.addAfter(DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            entries.addAfter(Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            entries.addAfter(Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            entries.addAfter(Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            entries.addAfter(Blocks.PURPLE_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            entries.addAfter(Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            entries.addAfter(Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            entries.addAfter(Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            entries.addAfter(DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            entries.addAfter(Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            entries.addAfter(Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            entries.addAfter(Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            entries.addAfter(Blocks.PURPLE_BED, DDBlocks.SANGRIA_BED.get());
            entries.addAfter(Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            entries.addAfter(Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            entries.addAfter(Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            entries.addAfter(DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            entries.addAfter(Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            entries.addAfter(Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            entries.addAfter(Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            entries.addAfter(Blocks.PURPLE_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            entries.addAfter(Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            entries.addAfter(Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            entries.addAfter(Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            entries.addAfter(DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            entries.addAfter(Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            entries.addAfter(Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            entries.addAfter(Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            entries.addAfter(Blocks.PURPLE_BANNER, DDBlocks.SANGRIA_BANNER.get());
            entries.addAfter(Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
            //SHULKER_BOX
            entries.addAfter(Blocks.RED_SHULKER_BOX, DDBlocks.CORAL_SHULKER_BOX.get());
            entries.addAfter(Blocks.YELLOW_SHULKER_BOX, DDBlocks.CANARY_SHULKER_BOX.get());
            entries.addAfter(DDBlocks.CANARY_SHULKER_BOX.get(), DDBlocks.WASABI_SHULKER_BOX.get());
            entries.addAfter(Blocks.GREEN_SHULKER_BOX, DDBlocks.SACRAMENTO_SHULKER_BOX.get());
            entries.addAfter(Blocks.CYAN_SHULKER_BOX, DDBlocks.SKY_SHULKER_BOX.get());
            entries.addAfter(Blocks.BLUE_SHULKER_BOX, DDBlocks.BLURPLE_SHULKER_BOX.get());
            entries.addAfter(Blocks.PURPLE_SHULKER_BOX, DDBlocks.SANGRIA_SHULKER_BOX.get());
            entries.addAfter(Blocks.PINK_SHULKER_BOX, DDBlocks.ROSE_SHULKER_BOX.get());

            //BED
            entries.addAfter(Blocks.RED_BED, DDBlocks.CORAL_BED.get());
            entries.addAfter(Blocks.YELLOW_BED, DDBlocks.CANARY_BED.get());
            entries.addAfter(DDBlocks.CANARY_BED.get(), DDBlocks.WASABI_BED.get());
            entries.addAfter(Blocks.GREEN_BED, DDBlocks.SACRAMENTO_BED.get());
            entries.addAfter(Blocks.CYAN_BED, DDBlocks.SKY_BED.get());
            entries.addAfter(Blocks.BLUE_BED, DDBlocks.BLURPLE_BED.get());
            entries.addAfter(Blocks.PURPLE_BED, DDBlocks.SANGRIA_BED.get());
            entries.addAfter(Blocks.PINK_BED, DDBlocks.ROSE_BED.get());

            //CANDLE
            entries.addAfter(Blocks.RED_CANDLE, DDBlocks.CORAL_CANDLE.get());
            entries.addAfter(Blocks.YELLOW_CANDLE, DDBlocks.CANARY_CANDLE.get());
            entries.addAfter(DDBlocks.CANARY_CANDLE.get(), DDBlocks.WASABI_CANDLE.get());
            entries.addAfter(Blocks.GREEN_CANDLE, DDBlocks.SACRAMENTO_CANDLE.get());
            entries.addAfter(Blocks.CYAN_CANDLE, DDBlocks.SKY_CANDLE.get());
            entries.addAfter(Blocks.BLUE_CANDLE, DDBlocks.BLURPLE_CANDLE.get());
            entries.addAfter(Blocks.PURPLE_CANDLE, DDBlocks.SANGRIA_CANDLE.get());
            entries.addAfter(Blocks.PINK_CANDLE, DDBlocks.ROSE_CANDLE.get());

            //BANNER
            entries.addAfter(Blocks.RED_BANNER, DDBlocks.CORAL_BANNER.get());
            entries.addAfter(Blocks.YELLOW_BANNER, DDBlocks.CANARY_BANNER.get());
            entries.addAfter(DDBlocks.CANARY_BANNER.get(), DDBlocks.WASABI_BANNER.get());
            entries.addAfter(Blocks.GREEN_BANNER, DDBlocks.SACRAMENTO_BANNER.get());
            entries.addAfter(Blocks.CYAN_BANNER, DDBlocks.SKY_BANNER.get());
            entries.addAfter(Blocks.BLUE_BANNER, DDBlocks.BLURPLE_BANNER.get());
            entries.addAfter(Blocks.PURPLE_BANNER, DDBlocks.SANGRIA_BANNER.get());
            entries.addAfter(Blocks.PINK_BANNER, DDBlocks.ROSE_BANNER.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            //DYE
            entries.addAfter(Items.RED_DYE, DDItems.CORAL_DYE.get());
            entries.addAfter(Items.YELLOW_DYE, DDItems.CANARY_DYE.get());
            entries.addAfter(DDItems.CANARY_DYE.get(), DDItems.WASABI_DYE.get());
            entries.addAfter(Items.GREEN_DYE, DDItems.SACRAMENTO_DYE.get());
            entries.addAfter(Items.CYAN_DYE, DDItems.SKY_DYE.get());
            entries.addAfter(Items.BLUE_DYE, DDItems.BLURPLE_DYE.get());
            entries.addAfter(Items.PURPLE_DYE, DDItems.SANGRIA_DYE.get());
            entries.addAfter(Items.PINK_DYE, DDItems.ROSE_DYE.get());
        });
    }
}
