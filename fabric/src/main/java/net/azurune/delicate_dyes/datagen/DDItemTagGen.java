package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

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
        appendFoxFood();
        appendBlueberries();
    }

    public void appendBlueberries() {
        getOrCreateTagBuilder(DDTags.Items.BLUEBERRIES)
                .add(DDItems.BLUEBERRIES.get())
        ;
    }

    public void appendFoxFood() {
        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .add(DDItems.BLUEBERRIES.get())
                .add(DDItems.BLUEBERRY_PIE.get()) //its funny okay
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get().asItem())
                .add(DDBlocks.RED_ROSE.get().asItem())
                .add(DDBlocks.BLUE_ROSE.get().asItem())
                .add(DDBlocks.WHITE_ROSE.get().asItem())
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.get().asItem())
                .add(DDBlocks.CANARY_WOOL.get().asItem())
                .add(DDBlocks.WASABI_WOOL.get().asItem())
                .add(DDBlocks.SACRAMENTO_WOOL.get().asItem())
                .add(DDBlocks.SKY_WOOL.get().asItem())
                .add(DDBlocks.BLURPLE_WOOL.get().asItem())
                .add(DDBlocks.SANGRIA_WOOL.get().asItem())
                .add(DDBlocks.ROSE_WOOL.get().asItem())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.get().asItem())
                .add(DDBlocks.CANARY_CARPET.get().asItem())
                .add(DDBlocks.WASABI_CARPET.get().asItem())
                .add(DDBlocks.SACRAMENTO_CARPET.get().asItem())
                .add(DDBlocks.SKY_CARPET.get().asItem())
                .add(DDBlocks.BLURPLE_CARPET.get().asItem())
                .add(DDBlocks.SANGRIA_CARPET.get().asItem())
                .add(DDBlocks.ROSE_CARPET.get().asItem())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(ItemTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.get().asItem())
                .add(DDBlocks.CANARY_TERRACOTTA.get().asItem())
                .add(DDBlocks.WASABI_TERRACOTTA.get().asItem())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get().asItem())
                .add(DDBlocks.SKY_TERRACOTTA.get().asItem())
                .add(DDBlocks.BLURPLE_TERRACOTTA.get().asItem())
                .add(DDBlocks.SANGRIA_TERRACOTTA.get().asItem())
                .add(DDBlocks.ROSE_TERRACOTTA.get().asItem())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(ItemTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.get().asItem())
                .add(DDBlocks.CANARY_CANDLE.get().asItem())
                .add(DDBlocks.WASABI_CANDLE.get().asItem())
                .add(DDBlocks.SACRAMENTO_CANDLE.get().asItem())
                .add(DDBlocks.SKY_CANDLE.get().asItem())
                .add(DDBlocks.BLURPLE_CANDLE.get().asItem())
                .add(DDBlocks.SANGRIA_CANDLE.get().asItem())
                .add(DDBlocks.ROSE_CANDLE.get().asItem())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(ItemTags.BEDS)
                .add(DDItems.CORAL_BED.get())
                .add(DDItems.CANARY_BED.get())
                .add(DDItems.WASABI_BED.get())
                .add(DDItems.SACRAMENTO_BED.get())
                .add(DDItems.SKY_BED.get())
                .add(DDItems.BLURPLE_BED.get())
                .add(DDItems.SANGRIA_BED.get())
                .add(DDItems.ROSE_BED.get())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(ItemTags.BANNERS)
                .add(DDItems.CORAL_BANNER.get())
                .add(DDItems.CANARY_BANNER.get())
                .add(DDItems.WASABI_BANNER.get())
                .add(DDItems.SACRAMENTO_BANNER.get())
                .add(DDItems.SKY_BANNER.get())
                .add(DDItems.BLURPLE_BANNER.get())
                .add(DDItems.SANGRIA_BANNER.get())
                .add(DDItems.ROSE_BANNER.get())
        ;
    }
}
