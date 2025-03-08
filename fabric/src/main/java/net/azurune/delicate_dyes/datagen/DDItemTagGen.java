package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.registry.DDItems;
import net.azurune.delicate_dyes.util.DDTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
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
        appendBeeFood();
        appendFoxFood();
        appendBlueberries();
    }

    public void appendBlueberries() {
        getOrCreateTagBuilder(DDTags.Items.BLUEBERRIES)
                .add(DDItems.BLUEBERRIES.value())
        ;
    }

    public void appendFoxFood() {
        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .add(DDItems.BLUEBERRIES.value())
                .add(DDItems.BLUEBERRY_PIE.value()) //its funny okay
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.value().asItem())
                .add(DDBlocks.RED_ROSE.value().asItem())
                .add(DDBlocks.BLUE_ROSE.value().asItem())
                .add(DDBlocks.WHITE_ROSE.value().asItem())
        ;
    }

    public void appendBeeFood() {
        getOrCreateTagBuilder(ItemTags.BEE_FOOD)
                .add(DDBlocks.ROSE.value().asItem())
                .add(DDBlocks.RED_ROSE.value().asItem())
                .add(DDBlocks.BLUE_ROSE.value().asItem())
                .add(DDBlocks.WHITE_ROSE.value().asItem())
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.value().asItem())
                .add(DDBlocks.CANARY_WOOL.value().asItem())
                .add(DDBlocks.WASABI_WOOL.value().asItem())
                .add(DDBlocks.SACRAMENTO_WOOL.value().asItem())
                .add(DDBlocks.SKY_WOOL.value().asItem())
                .add(DDBlocks.BLURPLE_WOOL.value().asItem())
                .add(DDBlocks.SANGRIA_WOOL.value().asItem())
                .add(DDBlocks.ROSE_WOOL.value().asItem())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.value().asItem())
                .add(DDBlocks.CANARY_CARPET.value().asItem())
                .add(DDBlocks.WASABI_CARPET.value().asItem())
                .add(DDBlocks.SACRAMENTO_CARPET.value().asItem())
                .add(DDBlocks.SKY_CARPET.value().asItem())
                .add(DDBlocks.BLURPLE_CARPET.value().asItem())
                .add(DDBlocks.SANGRIA_CARPET.value().asItem())
                .add(DDBlocks.ROSE_CARPET.value().asItem())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(ItemTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.value().asItem())
                .add(DDBlocks.CANARY_TERRACOTTA.value().asItem())
                .add(DDBlocks.WASABI_TERRACOTTA.value().asItem())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.value().asItem())
                .add(DDBlocks.SKY_TERRACOTTA.value().asItem())
                .add(DDBlocks.BLURPLE_TERRACOTTA.value().asItem())
                .add(DDBlocks.SANGRIA_TERRACOTTA.value().asItem())
                .add(DDBlocks.ROSE_TERRACOTTA.value().asItem())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(ItemTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.value().asItem())
                .add(DDBlocks.CANARY_CANDLE.value().asItem())
                .add(DDBlocks.WASABI_CANDLE.value().asItem())
                .add(DDBlocks.SACRAMENTO_CANDLE.value().asItem())
                .add(DDBlocks.SKY_CANDLE.value().asItem())
                .add(DDBlocks.BLURPLE_CANDLE.value().asItem())
                .add(DDBlocks.SANGRIA_CANDLE.value().asItem())
                .add(DDBlocks.ROSE_CANDLE.value().asItem())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(ItemTags.BEDS)
                .add(DDItems.CORAL_BED.value())
                .add(DDItems.CANARY_BED.value())
                .add(DDItems.WASABI_BED.value())
                .add(DDItems.SACRAMENTO_BED.value())
                .add(DDItems.SKY_BED.value())
                .add(DDItems.BLURPLE_BED.value())
                .add(DDItems.SANGRIA_BED.value())
                .add(DDItems.ROSE_BED.value())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(ItemTags.BANNERS)
                .add(DDItems.CORAL_BANNER.value())
                .add(DDItems.CANARY_BANNER.value())
                .add(DDItems.WASABI_BANNER.value())
                .add(DDItems.SACRAMENTO_BANNER.value())
                .add(DDItems.SKY_BANNER.value())
                .add(DDItems.BLURPLE_BANNER.value())
                .add(DDItems.SANGRIA_BANNER.value())
                .add(DDItems.ROSE_BANNER.value())
        ;
    }
}
