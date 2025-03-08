package net.azurune.delicate_dyes.registry;

import net.azurune.delicate_dyes.platform.Services;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DDCreativeTabs {
    public static final Holder<CreativeModeTab> DELICATE_DYES = Services.REGISTRY.registerCreativeModeTab("delicate_dyes", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemgroup.delicate_dyes"))
            .icon(() -> new ItemStack(DDItems.ROSE_DYE.value()))
            .displayItems((displayParameters, entry) -> {
                //CORAL
                entry.accept(DDItems.CORAL_DYE.value());
                entry.accept(DDBlocks.CORAL_WOOL.value());
                entry.accept(DDBlocks.CORAL_CARPET.value());
                entry.accept(DDBlocks.CORAL_TERRACOTTA.value());
                entry.accept(DDBlocks.CORAL_CONCRETE.value());
                entry.accept(DDBlocks.CORAL_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.CORAL_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.CORAL_STAINED_GLASS.value());
                entry.accept(DDBlocks.CORAL_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.CORAL_SHULKER_BOX.value());
                entry.accept(DDItems.CORAL_BED.value());
                entry.accept(DDBlocks.CORAL_CANDLE.value());
                entry.accept(DDItems.CORAL_BANNER.value());

                //CANARY
                entry.accept(DDItems.CANARY_DYE.value());
                entry.accept(DDBlocks.CANARY_WOOL.value());
                entry.accept(DDBlocks.CANARY_CARPET.value());
                entry.accept(DDBlocks.CANARY_TERRACOTTA.value());
                entry.accept(DDBlocks.CANARY_CONCRETE.value());
                entry.accept(DDBlocks.CANARY_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.CANARY_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.CANARY_STAINED_GLASS.value());
                entry.accept(DDBlocks.CANARY_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.CANARY_SHULKER_BOX.value());
                entry.accept(DDItems.CANARY_BED.value());
                entry.accept(DDBlocks.CANARY_CANDLE.value());
                entry.accept(DDItems.CANARY_BANNER.value());

                //WASABI
                entry.accept(DDItems.WASABI_DYE.value());
                entry.accept(DDBlocks.WASABI_WOOL.value());
                entry.accept(DDBlocks.WASABI_CARPET.value());
                entry.accept(DDBlocks.WASABI_TERRACOTTA.value());
                entry.accept(DDBlocks.WASABI_CONCRETE.value());
                entry.accept(DDBlocks.WASABI_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.WASABI_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.WASABI_STAINED_GLASS.value());
                entry.accept(DDBlocks.WASABI_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.WASABI_SHULKER_BOX.value());
                entry.accept(DDItems.WASABI_BED.value());
                entry.accept(DDBlocks.WASABI_CANDLE.value());
                entry.accept(DDItems.WASABI_BANNER.value());

                //SACRAMENTO
                entry.accept(DDItems.SACRAMENTO_DYE.value());
                entry.accept(DDBlocks.SACRAMENTO_WOOL.value());
                entry.accept(DDBlocks.SACRAMENTO_CARPET.value());
                entry.accept(DDBlocks.SACRAMENTO_TERRACOTTA.value());
                entry.accept(DDBlocks.SACRAMENTO_CONCRETE.value());
                entry.accept(DDBlocks.SACRAMENTO_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.SACRAMENTO_STAINED_GLASS.value());
                entry.accept(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.SACRAMENTO_SHULKER_BOX.value());
                entry.accept(DDItems.SACRAMENTO_BED.value());
                entry.accept(DDBlocks.SACRAMENTO_CANDLE.value());
                entry.accept(DDItems.SACRAMENTO_BANNER.value());

                //SKY
                entry.accept(DDItems.SKY_DYE.value());
                entry.accept(DDBlocks.SKY_WOOL.value());
                entry.accept(DDBlocks.SKY_CARPET.value());
                entry.accept(DDBlocks.SKY_TERRACOTTA.value());
                entry.accept(DDBlocks.SKY_CONCRETE.value());
                entry.accept(DDBlocks.SKY_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.SKY_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.SKY_STAINED_GLASS.value());
                entry.accept(DDBlocks.SKY_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.SKY_SHULKER_BOX.value());
                entry.accept(DDItems.SKY_BED.value());
                entry.accept(DDBlocks.SKY_CANDLE.value());
                entry.accept(DDItems.SKY_BANNER.value());
                
                //BLURPLE
                entry.accept(DDItems.BLURPLE_DYE.value());
                entry.accept(DDBlocks.BLURPLE_WOOL.value());
                entry.accept(DDBlocks.BLURPLE_CARPET.value());
                entry.accept(DDBlocks.BLURPLE_TERRACOTTA.value());
                entry.accept(DDBlocks.BLURPLE_CONCRETE.value());
                entry.accept(DDBlocks.BLURPLE_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.BLURPLE_STAINED_GLASS.value());
                entry.accept(DDBlocks.BLURPLE_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.BLURPLE_SHULKER_BOX.value());
                entry.accept(DDItems.BLURPLE_BED.value());
                entry.accept(DDBlocks.BLURPLE_CANDLE.value());
                entry.accept(DDItems.BLURPLE_BANNER.value());

                //SANGRIA
                entry.accept(DDItems.SANGRIA_DYE.value());
                entry.accept(DDBlocks.SANGRIA_WOOL.value());
                entry.accept(DDBlocks.SANGRIA_CARPET.value());
                entry.accept(DDBlocks.SANGRIA_TERRACOTTA.value());
                entry.accept(DDBlocks.SANGRIA_CONCRETE.value());
                entry.accept(DDBlocks.SANGRIA_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.SANGRIA_STAINED_GLASS.value());
                entry.accept(DDBlocks.SANGRIA_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.SANGRIA_SHULKER_BOX.value());
                entry.accept(DDItems.SANGRIA_BED.value());
                entry.accept(DDBlocks.SANGRIA_CANDLE.value());
                entry.accept(DDItems.SANGRIA_BANNER.value());

                //ROSE
                entry.accept(DDItems.ROSE_DYE.value());
                entry.accept(DDBlocks.ROSE_WOOL.value());
                entry.accept(DDBlocks.ROSE_CARPET.value());
                entry.accept(DDBlocks.ROSE_TERRACOTTA.value());
                entry.accept(DDBlocks.ROSE_CONCRETE.value());
                entry.accept(DDBlocks.ROSE_CONCRETE_POWDER.value());
                entry.accept(DDBlocks.ROSE_GLAZED_TERRACOTTA.value());
                entry.accept(DDBlocks.ROSE_STAINED_GLASS.value());
                entry.accept(DDBlocks.ROSE_STAINED_GLASS_PANE.value());
                //entry.accept(DDBlocks.ROSE_SHULKER_BOX.value());
                entry.accept(DDItems.ROSE_BED.value());
                entry.accept(DDBlocks.ROSE_CANDLE.value());
                entry.accept(DDItems.ROSE_BANNER.value());

                //MISC CONTENT
                entry.accept(DDBlocks.ROSE.value());
                entry.accept(DDBlocks.RED_ROSE.value());
                entry.accept(DDBlocks.BLUE_ROSE.value());
                entry.accept(DDBlocks.WHITE_ROSE.value());

                entry.accept(DDItems.BLUEBERRIES.value());
                entry.accept(DDItems.BLUEBERRY_PIE.value());
            }
    ).build());

    public static void loadCreativeTabs() {
    }
}
