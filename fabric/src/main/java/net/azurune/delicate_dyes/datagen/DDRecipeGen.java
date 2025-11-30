package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.CORAL_DYE.get(), 3)
                .requires(Items.RED_DYE).requires(Items.ORANGE_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_orange_dye", VanillaRecipeProvider.has(Items.ORANGE_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("coral_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "coral_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.CORAL_DYE.get(), 4)
                .requires(Items.RED_DYE) .requires(Items.RED_DYE).requires(Items.YELLOW_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_yellow_dye", VanillaRecipeProvider.has(Items.YELLOW_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("coral_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "coral_dye_from_bits_2"));

        // CANARY
        RecipeHelper.modBasedOneToTwo(output, DDItems.CANARY_DYE.get(), DDBlocks.GOOB_BLOSSOM.get(), "canary_dye");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.CANARY_DYE.get(), 2)
                .requires(Items.YELLOW_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_yellow_dye", VanillaRecipeProvider.has(Items.YELLOW_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("canary_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "canary_dye_from_bits"));
        // BLURPLE
        RecipeHelper.modBasedOneToTwo(output, DDItems.BLURPLE_DYE.get(), DDItems.BLUEBERRIES.get(), "blurple_dye", 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.BLURPLE_DYE.get(), 2)
                .requires(Items.BLUE_DYE).requires(Items.PURPLE_DYE)
                .unlockedBy("has_blue_dye", VanillaRecipeProvider.has(Items.BLUE_DYE))
                .unlockedBy("has_purple_dye", VanillaRecipeProvider.has(Items.PURPLE_DYE))
                .group("blurple_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "blurple_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.BLURPLE_DYE.get(), 3)
                .requires(Items.BLUE_DYE).requires(Items.BLUE_DYE).requires(Items.RED_DYE)
                .unlockedBy("has_blue_dye", VanillaRecipeProvider.has(Items.BLUE_DYE))
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .group("blurple_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "blurple_dye_from_bits_2"));
        // ROSE
        RecipeHelper.modBasedOneToTwo(output, DDItems.ROSE_DYE.get(), DDBlocks.ROSE.get(), "rose_dye", 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.ROSE_DYE.get(), 2)
                .requires(Items.RED_DYE).requires(Items.PINK_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_pink_dye", VanillaRecipeProvider.has(Items.PINK_DYE))
                .group("rose_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "rose_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.ROSE_DYE.get(), 3)
                .requires(Items.RED_DYE).requires(Items.RED_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("rose_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "rose_dye_from_bits_2"));
    }

    private void smelting(RecipeOutput output) {
    }

    private void blasting(RecipeOutput output) {
    }
}
