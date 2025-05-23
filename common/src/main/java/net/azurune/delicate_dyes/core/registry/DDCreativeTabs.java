package net.azurune.delicate_dyes.core.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.common.integration.common.util.CompatIds;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class DDCreativeTabs {
    public static final Supplier<CreativeModeTab> DELICATE_DYES = Services.REGISTRY.registerCreativeModeTab(DelicateDyes.MOD_ID, "delicate_dyes", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemgroup.delicate_dyes"))
            .icon(() -> new ItemStack(DDItems.ROSE_DYE.get()))
            .displayItems((displayParameters, entry) -> {
                        //CORAL
                        entry.accept(DDItems.CORAL_DYE.get());
                        entry.accept(DDBlocks.CORAL_WOOL.get());
                        entry.accept(DDBlocks.CORAL_CARPET.get());
                        entry.accept(DDBlocks.CORAL_TERRACOTTA.get());
                        entry.accept(DDBlocks.CORAL_CONCRETE.get());
                        entry.accept(DDBlocks.CORAL_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.CORAL_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.CORAL_STAINED_GLASS.get());
                        entry.accept(DDBlocks.CORAL_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.CORAL_SHULKER_BOX.get());
                        entry.accept(DDItems.CORAL_BED.get());
                        entry.accept(DDBlocks.CORAL_CANDLE.get());
                        entry.accept(DDItems.CORAL_BANNER.get());

                        //CANARY
                        entry.accept(DDItems.CANARY_DYE.get());
                        entry.accept(DDBlocks.CANARY_WOOL.get());
                        entry.accept(DDBlocks.CANARY_CARPET.get());
                        entry.accept(DDBlocks.CANARY_TERRACOTTA.get());
                        entry.accept(DDBlocks.CANARY_CONCRETE.get());
                        entry.accept(DDBlocks.CANARY_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.CANARY_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.CANARY_STAINED_GLASS.get());
                        entry.accept(DDBlocks.CANARY_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.CANARY_SHULKER_BOX.get());
                        entry.accept(DDItems.CANARY_BED.get());
                        entry.accept(DDBlocks.CANARY_CANDLE.get());
                        entry.accept(DDItems.CANARY_BANNER.get());

                        //WASABI
                        entry.accept(DDItems.WASABI_DYE.get());
                        entry.accept(DDBlocks.WASABI_WOOL.get());
                        entry.accept(DDBlocks.WASABI_CARPET.get());
                        entry.accept(DDBlocks.WASABI_TERRACOTTA.get());
                        entry.accept(DDBlocks.WASABI_CONCRETE.get());
                        entry.accept(DDBlocks.WASABI_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.WASABI_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.WASABI_STAINED_GLASS.get());
                        entry.accept(DDBlocks.WASABI_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.WASABI_SHULKER_BOX.get());
                        entry.accept(DDItems.WASABI_BED.get());
                        entry.accept(DDBlocks.WASABI_CANDLE.get());
                        entry.accept(DDItems.WASABI_BANNER.get());

                        //SACRAMENTO
                        entry.accept(DDItems.SACRAMENTO_DYE.get());
                        entry.accept(DDBlocks.SACRAMENTO_WOOL.get());
                        entry.accept(DDBlocks.SACRAMENTO_CARPET.get());
                        entry.accept(DDBlocks.SACRAMENTO_TERRACOTTA.get());
                        entry.accept(DDBlocks.SACRAMENTO_CONCRETE.get());
                        entry.accept(DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.SACRAMENTO_STAINED_GLASS.get());
                        entry.accept(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.SACRAMENTO_SHULKER_BOX.get());
                        entry.accept(DDItems.SACRAMENTO_BED.get());
                        entry.accept(DDBlocks.SACRAMENTO_CANDLE.get());
                        entry.accept(DDItems.SACRAMENTO_BANNER.get());

                        //SKY
                        entry.accept(DDItems.SKY_DYE.get());
                        entry.accept(DDBlocks.SKY_WOOL.get());
                        entry.accept(DDBlocks.SKY_CARPET.get());
                        entry.accept(DDBlocks.SKY_TERRACOTTA.get());
                        entry.accept(DDBlocks.SKY_CONCRETE.get());
                        entry.accept(DDBlocks.SKY_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.SKY_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.SKY_STAINED_GLASS.get());
                        entry.accept(DDBlocks.SKY_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.SKY_SHULKER_BOX.get());
                        entry.accept(DDItems.SKY_BED.get());
                        entry.accept(DDBlocks.SKY_CANDLE.get());
                        entry.accept(DDItems.SKY_BANNER.get());

                        //BLURPLE
                        entry.accept(DDItems.BLURPLE_DYE.get());
                        entry.accept(DDBlocks.BLURPLE_WOOL.get());
                        entry.accept(DDBlocks.BLURPLE_CARPET.get());
                        entry.accept(DDBlocks.BLURPLE_TERRACOTTA.get());
                        entry.accept(DDBlocks.BLURPLE_CONCRETE.get());
                        entry.accept(DDBlocks.BLURPLE_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.BLURPLE_STAINED_GLASS.get());
                        entry.accept(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.BLURPLE_SHULKER_BOX.get());
                        entry.accept(DDItems.BLURPLE_BED.get());
                        entry.accept(DDBlocks.BLURPLE_CANDLE.get());
                        entry.accept(DDItems.BLURPLE_BANNER.get());

                        //SANGRIA
                        entry.accept(DDItems.SANGRIA_DYE.get());
                        entry.accept(DDBlocks.SANGRIA_WOOL.get());
                        entry.accept(DDBlocks.SANGRIA_CARPET.get());
                        entry.accept(DDBlocks.SANGRIA_TERRACOTTA.get());
                        entry.accept(DDBlocks.SANGRIA_CONCRETE.get());
                        entry.accept(DDBlocks.SANGRIA_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.SANGRIA_STAINED_GLASS.get());
                        entry.accept(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.SANGRIA_SHULKER_BOX.get());
                        entry.accept(DDItems.SANGRIA_BED.get());
                        entry.accept(DDBlocks.SANGRIA_CANDLE.get());
                        entry.accept(DDItems.SANGRIA_BANNER.get());

                        //ROSE
                        entry.accept(DDItems.ROSE_DYE.get());
                        entry.accept(DDBlocks.ROSE_WOOL.get());
                        entry.accept(DDBlocks.ROSE_CARPET.get());
                        entry.accept(DDBlocks.ROSE_TERRACOTTA.get());
                        entry.accept(DDBlocks.ROSE_CONCRETE.get());
                        entry.accept(DDBlocks.ROSE_CONCRETE_POWDER.get());
                        entry.accept(DDBlocks.ROSE_GLAZED_TERRACOTTA.get());
                        entry.accept(DDBlocks.ROSE_STAINED_GLASS.get());
                        entry.accept(DDBlocks.ROSE_STAINED_GLASS_PANE.get());
                        entry.accept(DDBlocks.ROSE_SHULKER_BOX.get());
                        entry.accept(DDItems.ROSE_BED.get());
                        entry.accept(DDBlocks.ROSE_CANDLE.get());
                        entry.accept(DDItems.ROSE_BANNER.get());

                        //MISC CONTENT
                        entry.accept(DDBlocks.ROSE.get());

                        entry.accept(DDItems.BLUEBERRIES.get());
                    }
            ).build());

    public static final Supplier<CreativeModeTab> DELICATE_DYES_COMPAT = Services.REGISTRY.registerCreativeModeTab(DelicateDyes.MOD_ID, "delicate_dyes_compat", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemgroup.delicate_dyes_compat"))
            .icon(() -> new ItemStack(DDItems.BLUEBERRIES.get()))
            .displayItems((displayParameters, entry) -> {
                //APPLEDOG
                if (Services.PLATFORM.isModLoaded(CompatIds.APPLEDOG)) {
                    entry.accept(ADItems.CATBLUEBERRY.get());
                }
                    }
            ).build());

    public static void loadCreativeTabs() {
    }
}
