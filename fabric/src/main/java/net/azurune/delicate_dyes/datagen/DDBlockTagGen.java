package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
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
        appendSmallFlowers();
        appendFlowerPots();
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get())
                .add(DDBlocks.PEACH_BELLFLOWER.get())
        ;
    }

    public void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(DDBlocks.POTTED_ROSE.get())
                .add(DDBlocks.POTTED_PEACH_BELLFLOWER.get())
        ;
    }
}
