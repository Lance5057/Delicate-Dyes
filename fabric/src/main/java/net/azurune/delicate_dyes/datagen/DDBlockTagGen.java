package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.util.DDTags;
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
        appendConcretePowder();
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
                .add(DDBlocks.ROSE.value())
                .add(DDBlocks.RED_ROSE.value())
                .add(DDBlocks.BLUE_ROSE.value())
                .add(DDBlocks.WHITE_ROSE.value())
        ;
    }

    public void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(DDBlocks.POTTED_ROSE.value())
                .add(DDBlocks.POTTED_RED_ROSE.value())
                .add(DDBlocks.POTTED_BLUE_ROSE.value())
                .add(DDBlocks.POTTED_WHITE_ROSE.value())
        ;
    }

    public void appendPickaxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DDBlocks.CORAL_TERRACOTTA.value())
                .add(DDBlocks.CORAL_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.CORAL_CONCRETE.value())
                //.add(DDBlocks.CORAL_SHULKER_BOX.value())

                .add(DDBlocks.CANARY_TERRACOTTA.value())
                .add(DDBlocks.CANARY_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.CANARY_CONCRETE.value())
                //.add(DDBlocks.CANARY_SHULKER_BOX.value())

                .add(DDBlocks.WASABI_TERRACOTTA.value())
                .add(DDBlocks.WASABI_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.WASABI_CONCRETE.value())
                //.add(DDBlocks.WASABI_SHULKER_BOX.value())

                .add(DDBlocks.SACRAMENTO_TERRACOTTA.value())
                .add(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.SACRAMENTO_CONCRETE.value())
                //.add(DDBlocks.SACRAMENTO_SHULKER_BOX.value())

                .add(DDBlocks.SKY_TERRACOTTA.value())
                .add(DDBlocks.SKY_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.SKY_CONCRETE.value())
                //.add(DDBlocks.SKY_SHULKER_BOX.value())

                .add(DDBlocks.BLURPLE_TERRACOTTA.value())
                .add(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.BLURPLE_CONCRETE.value())
                //.add(DDBlocks.BLURPLE_SHULKER_BOX.value())

                .add(DDBlocks.SANGRIA_TERRACOTTA.value())
                .add(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.SANGRIA_CONCRETE.value())
                //.add(DDBlocks.SANGRIA_SHULKER_BOX.value())

                .add(DDBlocks.ROSE_TERRACOTTA.value())
                .add(DDBlocks.ROSE_GLAZED_TERRACOTTA.value())
                .add(DDBlocks.ROSE_CONCRETE.value())
                //.add(DDBlocks.ROSE_SHULKER_BOX.value())
        ;
    }

    public void appendAxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .addTag(DDTags.Blocks.DELICATE_BEDS)

                .add(DDBlocks.CORAL_BANNER.value())
                .add(DDBlocks.CORAL_WALL_BANNER.value())

                .add(DDBlocks.CANARY_BANNER.value())
                .add(DDBlocks.CANARY_WALL_BANNER.value())

                .add(DDBlocks.WASABI_BANNER.value())
                .add(DDBlocks.WASABI_WALL_BANNER.value())

                .add(DDBlocks.SACRAMENTO_BANNER.value())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.value())

                .add(DDBlocks.SKY_BANNER.value())
                .add(DDBlocks.SKY_WALL_BANNER.value())

                .add(DDBlocks.BLURPLE_BANNER.value())
                .add(DDBlocks.BLURPLE_WALL_BANNER.value())

                .add(DDBlocks.SANGRIA_BANNER.value())
                .add(DDBlocks.SANGRIA_WALL_BANNER.value())

                .add(DDBlocks.ROSE_BANNER.value())
                .add(DDBlocks.ROSE_WALL_BANNER.value())
        ;
    }

    public void appendDelicateBeds() {
        getOrCreateTagBuilder(DDTags.Blocks.DELICATE_BEDS)
                .add(DDBlocks.CORAL_BED.value())
                .add(DDBlocks.CANARY_BED.value())
                .add(DDBlocks.WASABI_BED.value())
                .add(DDBlocks.SACRAMENTO_BED.value())
                .add(DDBlocks.SKY_BED.value())
                .add(DDBlocks.BLURPLE_BED.value())
                .add(DDBlocks.SANGRIA_BED.value())
                .add(DDBlocks.ROSE_BED.value())
        ;
    }

    public void appendShulkerBoxes() {
        getOrCreateTagBuilder(BlockTags.SHULKER_BOXES)
                //.add(DDBlocks.CORAL_SHULKER_BOX.value())
                //.add(DDBlocks.CANARY_SHULKER_BOX.value())
                //.add(DDBlocks.WASABI_SHULKER_BOX.value())
                //.add(DDBlocks.SACRAMENTO_SHULKER_BOX.value())
                //.add(DDBlocks.SKY_SHULKER_BOX.value())
                //.add(DDBlocks.BLURPLE_SHULKER_BOX.value())
                //.add(DDBlocks.SANGRIA_SHULKER_BOX.value())
                //.add(DDBlocks.ROSE_SHULKER_BOX.value())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(BlockTags.BEDS)
                .addTag(DDTags.Blocks.DELICATE_BEDS)
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.value())
                .add(DDBlocks.CANARY_WOOL.value())
                .add(DDBlocks.WASABI_WOOL.value())
                .add(DDBlocks.SACRAMENTO_WOOL.value())
                .add(DDBlocks.SKY_WOOL.value())
                .add(DDBlocks.BLURPLE_WOOL.value())
                .add(DDBlocks.SANGRIA_WOOL.value())
                .add(DDBlocks.ROSE_WOOL.value())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.value())
                .add(DDBlocks.CANARY_CARPET.value())
                .add(DDBlocks.WASABI_CARPET.value())
                .add(DDBlocks.SACRAMENTO_CARPET.value())
                .add(DDBlocks.SKY_CARPET.value())
                .add(DDBlocks.BLURPLE_CARPET.value())
                .add(DDBlocks.SANGRIA_CARPET.value())
                .add(DDBlocks.ROSE_CARPET.value())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(BlockTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.value())
                .add(DDBlocks.CANARY_TERRACOTTA.value())
                .add(DDBlocks.WASABI_TERRACOTTA.value())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.value())
                .add(DDBlocks.SKY_TERRACOTTA.value())
                .add(DDBlocks.BLURPLE_TERRACOTTA.value())
                .add(DDBlocks.SANGRIA_TERRACOTTA.value())
                .add(DDBlocks.ROSE_TERRACOTTA.value())
        ;
    }

    public void appendConcretePowder() {
        getOrCreateTagBuilder(BlockTags.CONCRETE_POWDER)
                .add(DDBlocks.CORAL_CONCRETE_POWDER.value())
                .add(DDBlocks.CANARY_CONCRETE_POWDER.value())
                .add(DDBlocks.WASABI_CONCRETE_POWDER.value())
                .add(DDBlocks.SACRAMENTO_CONCRETE_POWDER.value())
                .add(DDBlocks.SKY_CONCRETE_POWDER.value())
                .add(DDBlocks.BLURPLE_CONCRETE_POWDER.value())
                .add(DDBlocks.SANGRIA_CONCRETE_POWDER.value())
                .add(DDBlocks.ROSE_CONCRETE_POWDER.value())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(BlockTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.value())
                .add(DDBlocks.CANARY_CANDLE.value())
                .add(DDBlocks.WASABI_CANDLE.value())
                .add(DDBlocks.SACRAMENTO_CANDLE.value())
                .add(DDBlocks.SKY_CANDLE.value())
                .add(DDBlocks.BLURPLE_CANDLE.value())
                .add(DDBlocks.SANGRIA_CANDLE.value())
                .add(DDBlocks.ROSE_CANDLE.value())
        ;
    }

    public void appendCandleCakes() {
        getOrCreateTagBuilder(BlockTags.CANDLE_CAKES)
                .add(DDBlocks.CORAL_CANDLE_CAKE.value())
                .add(DDBlocks.CANARY_CANDLE_CAKE.value())
                .add(DDBlocks.WASABI_CANDLE_CAKE.value())
                .add(DDBlocks.SACRAMENTO_CANDLE_CAKE.value())
                .add(DDBlocks.SKY_CANDLE_CAKE.value())
                .add(DDBlocks.BLURPLE_CANDLE_CAKE.value())
                .add(DDBlocks.SANGRIA_CANDLE_CAKE.value())
                .add(DDBlocks.ROSE_CANDLE_CAKE.value())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(BlockTags.BANNERS)
                .add(DDBlocks.CORAL_BANNER.value())
                .add(DDBlocks.CORAL_WALL_BANNER.value())

                .add(DDBlocks.CANARY_BANNER.value())
                .add(DDBlocks.CANARY_WALL_BANNER.value())

                .add(DDBlocks.WASABI_BANNER.value())
                .add(DDBlocks.WASABI_WALL_BANNER.value())

                .add(DDBlocks.SACRAMENTO_BANNER.value())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.value())

                .add(DDBlocks.SKY_BANNER.value())
                .add(DDBlocks.SKY_WALL_BANNER.value())

                .add(DDBlocks.BLURPLE_BANNER.value())
                .add(DDBlocks.BLURPLE_WALL_BANNER.value())

                .add(DDBlocks.SANGRIA_BANNER.value())
                .add(DDBlocks.SANGRIA_WALL_BANNER.value())

                .add(DDBlocks.ROSE_BANNER.value())
                .add(DDBlocks.ROSE_WALL_BANNER.value())
        ;
    }
}
