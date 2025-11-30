package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class DDLootTableGen extends FabricBlockLootTableProvider {
    public DDLootTableGen(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // FLOWERS
        dropSelf(DDBlocks.ROSE.get());
        dropPottedContents(DDBlocks.POTTED_ROSE.get());

        dropSelf(DDBlocks.PEACH_BELLFLOWER.get());
        dropPottedContents(DDBlocks.POTTED_PEACH_BELLFLOWER.get());
    }
}
