package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DDBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public DDBlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendSmallFlowers();
        appendTallFlowers();
        appendFlowerPots();
        appendAxeMineable();
        appendSwordEfficient();
        appendBeeGrowables();
        appendFallDamageResetting();
    }

    public void appendAxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get())
                .add(DDBlocks.PEACH_BELLFLOWER.get())
        ;
    }

    public void appendTallFlowers() {
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(DDBlocks.GOOB_BLOSSOM.get())
        ;
    }

    public void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(DDBlocks.POTTED_ROSE.get())
                .add(DDBlocks.POTTED_PEACH_BELLFLOWER.get())
        ;
    }

    public void appendSwordEfficient() {
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendBeeGrowables() {
        getOrCreateTagBuilder(BlockTags.BEE_GROWABLES)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendFallDamageResetting() {
        getOrCreateTagBuilder(BlockTags.FALL_DAMAGE_RESETTING)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }
}
