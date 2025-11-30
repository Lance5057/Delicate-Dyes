package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public class DDRecipeGen extends FabricRecipeProvider {
    public DDRecipeGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput output) {
        crafting(output);
        smelting(output);
        blasting(output);
    }

    private void crafting(RecipeOutput output) {
        // CORAL
        RecipeHelper.modBasedOneToTwo(output, DDItems.CORAL_DYE.get(), DDBlocks.PEACH_BELLFLOWER.get(), "coral_dye", 1);
        // ROSE
        RecipeHelper.modBasedOneToTwo(output, DDItems.ROSE_DYE.get(), DDBlocks.ROSE.get(), "rose_dye", 1);
    }

    private void smelting(RecipeOutput output) {
    }

    private void blasting(RecipeOutput output) {
    }
}
