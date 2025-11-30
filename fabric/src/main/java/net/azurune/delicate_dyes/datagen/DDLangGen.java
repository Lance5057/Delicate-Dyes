package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class DDLangGen extends FabricLanguageProvider {
    public DDLangGen(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder build) {
        itemTranslation(provider, build);
        blockTranslation(provider, build);
    }

    private void itemTranslation(HolderLookup.Provider provider, TranslationBuilder build) {
        build.add(DDItems.CORAL_DYE.get(), "Coral Dye");
        build.add(DDItems.ROSE_DYE.get(), "Rose Dye");
    }

    private void blockTranslation(HolderLookup.Provider provider, TranslationBuilder build) {
        // SMALL FLOWERS
        build.add(DDBlocks.ROSE.get(), "Rose");
        build.add(DDBlocks.PEACH_BELLFLOWER.get(), "Peach Bellflower");
    }
}
