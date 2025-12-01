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
        blockTranslations(provider, build);
        itemTranslations(provider, build);
        miscTranslations(provider, build);
    }

    private void blockTranslations(HolderLookup.Provider provider, TranslationBuilder build) {
        //NATURE
        build.add(DDBlocks.ROSE.get(), "Rose");
        build.add(DDBlocks.PEACH_BELLFLOWER.get(), "Peach Bellflower");
        build.add(DDBlocks.GOOB_BLOSSOM.get(), "Goob Blossom");
        build.add(DDBlocks.BLUEBERRY_BUSH.get(), "Blueberry Bush");
    }

    private void itemTranslations(HolderLookup.Provider provider, TranslationBuilder build) {
        //DYE
        build.add(DDItems.CORAL_DYE.get(), "Coral Dye");
        build.add(DDItems.CANARY_DYE.get(), "Canary Dye");
        build.add(DDItems.WASABI_DYE.get(), "Wasabi Dye");
        build.add(DDItems.SACRAMENTO_DYE.get(), "Sacramento Dye");
        build.add(DDItems.SKY_DYE.get(), "Sky Dye");
        build.add(DDItems.BLURPLE_DYE.get(), "Blurple Dye");
        build.add(DDItems.SANGRIA_DYE.get(), "Sangria Dye");
        build.add(DDItems.ROSE_DYE.get(), "Rose Dye");

        //MISC
        build.add(DDItems.BLUEBERRIES.get(), "Blueberries");
    }

    private void miscTranslations(HolderLookup.Provider provider, TranslationBuilder build) {
        // DEATHS
        build.add("death.attack.blueberryBush", "%1$s was poked to death by a blueberry bush");
        build.add("death.attack.blueberryBush.player", "%1$s was poked to death by a blueberry bush while trying to escape %2$s");
    }
}
