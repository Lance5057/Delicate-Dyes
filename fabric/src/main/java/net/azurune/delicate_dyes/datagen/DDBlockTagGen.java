package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.init.DDTags;
import net.azurune.delicate_dyes.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DDBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public DDBlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWool();
        appendWoolCarpets();
        appendTerracotta();
        appendCandles();
        appendCandleCakes();
        appendBeds();
        appendBanners();
        appendPickaxeMineable();
        appendAxeMineable();
        appendDelicateBeds();
        appendShulkerBoxes();
        appendSmallFlowers();
        appendFlowerPots();
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get())
                .add(DDBlocks.RED_ROSE.get())
                .add(DDBlocks.BLUE_ROSE.get())
                .add(DDBlocks.WHITE_ROSE.get())
        ;
    }

    public void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(DDBlocks.POTTED_ROSE.get())
                .add(DDBlocks.POTTED_RED_ROSE.get())
                .add(DDBlocks.POTTED_BLUE_ROSE.get())
                .add(DDBlocks.POTTED_WHITE_ROSE.get())
        ;
    }

    public void appendPickaxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DDBlocks.CORAL_TERRACOTTA.get())
                .add(DDBlocks.CORAL_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.CORAL_CONCRETE.get())
                //.add(DDBlocks.CORAL_SHULKER_BOX.get())

                .add(DDBlocks.CANARY_TERRACOTTA.get())
                .add(DDBlocks.CANARY_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.CANARY_CONCRETE.get())
                //.add(DDBlocks.CANARY_SHULKER_BOX.get())

                .add(DDBlocks.WASABI_TERRACOTTA.get())
                .add(DDBlocks.WASABI_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.WASABI_CONCRETE.get())
                //.add(DDBlocks.WASABI_SHULKER_BOX.get())

                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_CONCRETE.get())
                //.add(DDBlocks.SACRAMENTO_SHULKER_BOX.get())

                .add(DDBlocks.SKY_TERRACOTTA.get())
                .add(DDBlocks.SKY_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SKY_CONCRETE.get())
                //.add(DDBlocks.SKY_SHULKER_BOX.get())

                .add(DDBlocks.BLURPLE_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_CONCRETE.get())
                //.add(DDBlocks.BLURPLE_SHULKER_BOX.get())

                .add(DDBlocks.SANGRIA_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_CONCRETE.get())
                //.add(DDBlocks.SANGRIA_SHULKER_BOX.get())

                .add(DDBlocks.ROSE_TERRACOTTA.get())
                .add(DDBlocks.ROSE_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.ROSE_CONCRETE.get())
                //.add(DDBlocks.ROSE_SHULKER_BOX.get())
        ;
    }

    public void appendAxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .addTag(DDTags.Blocks.DELICATE_BEDS)

                .add(DDBlocks.CORAL_BANNER.get())
                .add(DDBlocks.CORAL_WALL_BANNER.get())

                .add(DDBlocks.CANARY_BANNER.get())
                .add(DDBlocks.CANARY_WALL_BANNER.get())

                .add(DDBlocks.WASABI_BANNER.get())
                .add(DDBlocks.WASABI_WALL_BANNER.get())

                .add(DDBlocks.SACRAMENTO_BANNER.get())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.get())

                .add(DDBlocks.SKY_BANNER.get())
                .add(DDBlocks.SKY_WALL_BANNER.get())

                .add(DDBlocks.BLURPLE_BANNER.get())
                .add(DDBlocks.BLURPLE_WALL_BANNER.get())

                .add(DDBlocks.SANGRIA_BANNER.get())
                .add(DDBlocks.SANGRIA_WALL_BANNER.get())

                .add(DDBlocks.ROSE_BANNER.get())
                .add(DDBlocks.ROSE_WALL_BANNER.get())
        ;
    }

    public void appendDelicateBeds() {
        getOrCreateTagBuilder(DDTags.Blocks.DELICATE_BEDS)
                .add(DDBlocks.CORAL_BED.get())
                .add(DDBlocks.CANARY_BED.get())
                .add(DDBlocks.WASABI_BED.get())
                .add(DDBlocks.SACRAMENTO_BED.get())
                .add(DDBlocks.SKY_BED.get())
                .add(DDBlocks.BLURPLE_BED.get())
                .add(DDBlocks.SANGRIA_BED.get())
                .add(DDBlocks.ROSE_BED.get())
        ;
    }

    public void appendShulkerBoxes() {
        getOrCreateTagBuilder(BlockTags.SHULKER_BOXES)
                //.add(DDBlocks.CORAL_SHULKER_BOX.get())
                //.add(DDBlocks.CANARY_SHULKER_BOX.get())
                //.add(DDBlocks.WASABI_SHULKER_BOX.get())
                //.add(DDBlocks.SACRAMENTO_SHULKER_BOX.get())
                //.add(DDBlocks.SKY_SHULKER_BOX.get())
                //.add(DDBlocks.BLURPLE_SHULKER_BOX.get())
                //.add(DDBlocks.SANGRIA_SHULKER_BOX.get())
                //.add(DDBlocks.ROSE_SHULKER_BOX.get())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(BlockTags.BEDS)
                .addTag(DDTags.Blocks.DELICATE_BEDS)
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.get())
                .add(DDBlocks.CANARY_WOOL.get())
                .add(DDBlocks.WASABI_WOOL.get())
                .add(DDBlocks.SACRAMENTO_WOOL.get())
                .add(DDBlocks.SKY_WOOL.get())
                .add(DDBlocks.BLURPLE_WOOL.get())
                .add(DDBlocks.SANGRIA_WOOL.get())
                .add(DDBlocks.ROSE_WOOL.get())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.get())
                .add(DDBlocks.CANARY_CARPET.get())
                .add(DDBlocks.WASABI_CARPET.get())
                .add(DDBlocks.SACRAMENTO_CARPET.get())
                .add(DDBlocks.SKY_CARPET.get())
                .add(DDBlocks.BLURPLE_CARPET.get())
                .add(DDBlocks.SANGRIA_CARPET.get())
                .add(DDBlocks.ROSE_CARPET.get())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(BlockTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.get())
                .add(DDBlocks.CANARY_TERRACOTTA.get())
                .add(DDBlocks.WASABI_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get())
                .add(DDBlocks.SKY_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_TERRACOTTA.get())
                .add(DDBlocks.ROSE_TERRACOTTA.get())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(BlockTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.get())
                .add(DDBlocks.CANARY_CANDLE.get())
                .add(DDBlocks.WASABI_CANDLE.get())
                .add(DDBlocks.SACRAMENTO_CANDLE.get())
                .add(DDBlocks.SKY_CANDLE.get())
                .add(DDBlocks.BLURPLE_CANDLE.get())
                .add(DDBlocks.SANGRIA_CANDLE.get())
                .add(DDBlocks.ROSE_CANDLE.get())
        ;
    }

    public void appendCandleCakes() {
        getOrCreateTagBuilder(BlockTags.CANDLE_CAKES)
                .add(DDBlocks.CORAL_CANDLE_CAKE.get())
                .add(DDBlocks.CANARY_CANDLE_CAKE.get())
                .add(DDBlocks.WASABI_CANDLE_CAKE.get())
                .add(DDBlocks.SACRAMENTO_CANDLE_CAKE.get())
                .add(DDBlocks.SKY_CANDLE_CAKE.get())
                .add(DDBlocks.BLURPLE_CANDLE_CAKE.get())
                .add(DDBlocks.SANGRIA_CANDLE_CAKE.get())
                .add(DDBlocks.ROSE_CANDLE_CAKE.get())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(BlockTags.BANNERS)
                .add(DDBlocks.CORAL_BANNER.get())
                .add(DDBlocks.CORAL_WALL_BANNER.get())

                .add(DDBlocks.CANARY_BANNER.get())
                .add(DDBlocks.CANARY_WALL_BANNER.get())

                .add(DDBlocks.WASABI_BANNER.get())
                .add(DDBlocks.WASABI_WALL_BANNER.get())

                .add(DDBlocks.SACRAMENTO_BANNER.get())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.get())

                .add(DDBlocks.SKY_BANNER.get())
                .add(DDBlocks.SKY_WALL_BANNER.get())

                .add(DDBlocks.BLURPLE_BANNER.get())
                .add(DDBlocks.BLURPLE_WALL_BANNER.get())

                .add(DDBlocks.SANGRIA_BANNER.get())
                .add(DDBlocks.SANGRIA_WALL_BANNER.get())

                .add(DDBlocks.ROSE_BANNER.get())
                .add(DDBlocks.ROSE_WALL_BANNER.get())
        ;
    }
}
