package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.common.util.IntegrationIds;
import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class DDItemTagGen extends FabricTagProvider.ItemTagProvider {
    public DDItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWool();
        appendWoolCarpets();
        appendTerracotta();
        appendCandles();
        appendBeds();
        appendBanners();
        appendSmallFlowers();
        appendShulkerBoxes();
        appendTallFlowers();
        appendDyes();
        appendGlassBlocks();
        appendGlassPanes();
    }

    public void appendShulkerBoxes() {
        getOrCreateTagBuilder(DDTags.Items.SHULKER_BOXES)
                .add(DDBlocks.CORAL_SHULKER_BOX.get().asItem())
                .add(DDBlocks.UMBER_SHULKER_BOX.get().asItem())
                .add(DDBlocks.CANARY_SHULKER_BOX.get().asItem())
                .add(DDBlocks.WASABI_SHULKER_BOX.get().asItem())
                .add(DDBlocks.SACRAMENTO_SHULKER_BOX.get().asItem())
                .add(DDBlocks.SKY_SHULKER_BOX.get().asItem())
                .add(DDBlocks.BLURPLE_SHULKER_BOX.get().asItem())
                .add(DDBlocks.LAVENDER_SHULKER_BOX.get().asItem())
                .add(DDBlocks.SANGRIA_SHULKER_BOX.get().asItem())
                .add(DDBlocks.ROSE_SHULKER_BOX.get().asItem())
//why are vanilla shulkers here
                .add(Items.RED_SHULKER_BOX)
                .add(Items.ORANGE_SHULKER_BOX)
                .add(Items.YELLOW_SHULKER_BOX)
                .add(Items.LIME_SHULKER_BOX)
                .add(Items.GREEN_SHULKER_BOX)
                .add(Items.CYAN_SHULKER_BOX)
                .add(Items.LIGHT_BLUE_SHULKER_BOX)
                .add(Items.BLUE_SHULKER_BOX)
                .add(Items.PURPLE_SHULKER_BOX)
                .add(Items.MAGENTA_SHULKER_BOX)
                .add(Items.PINK_SHULKER_BOX)
                .add(Items.BROWN_SHULKER_BOX)
                .add(Items.WHITE_SHULKER_BOX)
                .add(Items.LIGHT_GRAY_SHULKER_BOX)
                .add(Items.GRAY_SHULKER_BOX)
                .add(Items.BLACK_SHULKER_BOX)
        ;
    }

    public void appendDyes() {
        getOrCreateTagBuilder(DDTags.Items.DYES)
                .add(DDItems.CORAL_DYE.get())
                .add(DDItems.UMBER_DYE.get())
                .add(DDItems.CANARY_DYE.get())
                .add(DDItems.WASABI_DYE.get())
                .add(DDItems.SACRAMENTO_DYE.get())
                .add(DDItems.SKY_DYE.get())
                .add(DDItems.BLURPLE_DYE.get())
                .add(DDItems.LAVENDER_DYE.get())
                .add(DDItems.SANGRIA_DYE.get())
                .add(DDItems.ROSE_DYE.get())
        ;
    }

    public void appendGlassBlocks() {
        getOrCreateTagBuilder(DDTags.Items.GLASS_BLOCKS)
                .add(DDBlocks.CORAL_STAINED_GLASS.get().asItem())
                .add(DDBlocks.UMBER_STAINED_GLASS.get().asItem())
                .add(DDBlocks.CANARY_STAINED_GLASS.get().asItem())
                .add(DDBlocks.WASABI_STAINED_GLASS.get().asItem())
                .add(DDBlocks.SACRAMENTO_STAINED_GLASS.get().asItem())
                .add(DDBlocks.SKY_STAINED_GLASS.get().asItem())
                .add(DDBlocks.BLURPLE_STAINED_GLASS.get().asItem())
                .add(DDBlocks.LAVENDER_STAINED_GLASS.get().asItem())
                .add(DDBlocks.SANGRIA_STAINED_GLASS.get().asItem())
                .add(DDBlocks.ROSE_STAINED_GLASS.get().asItem())
        ;
    }

    public void appendGlassPanes() {
        getOrCreateTagBuilder(DDTags.Items.GLASS_PANES)
                .add(DDBlocks.CORAL_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.UMBER_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.CANARY_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.WASABI_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.SKY_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.LAVENDER_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get().asItem())
                .add(DDBlocks.ROSE_STAINED_GLASS_PANE.get().asItem())
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get().asItem())
                .add(DDBlocks.PEACH_BELLFLOWER.get().asItem())
        ;
    }

    public void appendTallFlowers() {
        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(DDBlocks.GOOB_BLOSSOM.get().asItem())
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.get().asItem())
                .add(DDBlocks.UMBER_WOOL.get().asItem())
                .add(DDBlocks.CANARY_WOOL.get().asItem())
                .add(DDBlocks.WASABI_WOOL.get().asItem())
                .add(DDBlocks.SACRAMENTO_WOOL.get().asItem())
                .add(DDBlocks.SKY_WOOL.get().asItem())
                .add(DDBlocks.BLURPLE_WOOL.get().asItem())
                .add(DDBlocks.LAVENDER_WOOL.get().asItem())
                .add(DDBlocks.SANGRIA_WOOL.get().asItem())
                .add(DDBlocks.ROSE_WOOL.get().asItem())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.get().asItem())
                .add(DDBlocks.UMBER_CARPET.get().asItem())
                .add(DDBlocks.CANARY_CARPET.get().asItem())
                .add(DDBlocks.WASABI_CARPET.get().asItem())
                .add(DDBlocks.SACRAMENTO_CARPET.get().asItem())
                .add(DDBlocks.SKY_CARPET.get().asItem())
                .add(DDBlocks.BLURPLE_CARPET.get().asItem())
                .add(DDBlocks.LAVENDER_CARPET.get().asItem())
                .add(DDBlocks.SANGRIA_CARPET.get().asItem())
                .add(DDBlocks.ROSE_CARPET.get().asItem())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(ItemTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.get().asItem())
                .add(DDBlocks.UMBER_TERRACOTTA.get().asItem())
                .add(DDBlocks.CANARY_TERRACOTTA.get().asItem())
                .add(DDBlocks.WASABI_TERRACOTTA.get().asItem())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get().asItem())
                .add(DDBlocks.SKY_TERRACOTTA.get().asItem())
                .add(DDBlocks.BLURPLE_TERRACOTTA.get().asItem())
                .add(DDBlocks.LAVENDER_TERRACOTTA.get().asItem())
                .add(DDBlocks.SANGRIA_TERRACOTTA.get().asItem())
                .add(DDBlocks.ROSE_TERRACOTTA.get().asItem())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(ItemTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.get().asItem())
                .add(DDBlocks.UMBER_CANDLE.get().asItem())
                .add(DDBlocks.CANARY_CANDLE.get().asItem())
                .add(DDBlocks.WASABI_CANDLE.get().asItem())
                .add(DDBlocks.SACRAMENTO_CANDLE.get().asItem())
                .add(DDBlocks.SKY_CANDLE.get().asItem())
                .add(DDBlocks.BLURPLE_CANDLE.get().asItem())
                .add(DDBlocks.LAVENDER_CANDLE.get().asItem())
                .add(DDBlocks.SANGRIA_CANDLE.get().asItem())
                .add(DDBlocks.ROSE_CANDLE.get().asItem())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(ItemTags.BEDS)
                .add(DDItems.CORAL_BED.get())
                .add(DDItems.UMBER_BED.get())
                .add(DDItems.CANARY_BED.get())
                .add(DDItems.WASABI_BED.get())
                .add(DDItems.SACRAMENTO_BED.get())
                .add(DDItems.SKY_BED.get())
                .add(DDItems.BLURPLE_BED.get())
                .add(DDItems.LAVENDER_BED.get())
                .add(DDItems.SANGRIA_BED.get())
                .add(DDItems.ROSE_BED.get())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(ItemTags.BANNERS)
                .add(DDItems.CORAL_BANNER.get())
                .add(DDItems.UMBER_BANNER.get())
                .add(DDItems.CANARY_BANNER.get())
                .add(DDItems.WASABI_BANNER.get())
                .add(DDItems.SACRAMENTO_BANNER.get())
                .add(DDItems.SKY_BANNER.get())
                .add(DDItems.BLURPLE_BANNER.get())
                .add(DDItems.LAVENDER_BANNER.get())
                .add(DDItems.SANGRIA_BANNER.get())
                .add(DDItems.ROSE_BANNER.get())
        ;
    }
}
