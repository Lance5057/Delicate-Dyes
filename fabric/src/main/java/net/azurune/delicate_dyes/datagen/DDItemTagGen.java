package net.azurune.delicate_dyes.datagen;

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
        appendSmallFlowers();
        appendTallFlowers();
        appendFoxFood();
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

    public void appendFoxFood() {
        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .add(DDItems.BLUEBERRIES.get())
        ;
    }
}
