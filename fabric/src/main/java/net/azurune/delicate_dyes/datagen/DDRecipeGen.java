package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDTags;
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

    }

    //crappy work around for special recipes
    public static void woolFromTag(RecipeOutput recipeOutput, ItemLike dyedWool, ItemLike dye, String id) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, dyedWool)
                .requires(dye).requires(ItemTags.WOOL)
                .group("wool").unlockedBy(RecipeProvider.getHasName(dye), RecipeProvider.has(dye)).save(recipeOutput, id + "_from_dye");
    }

    public static void bedFromTag(RecipeOutput recipeOutput, ItemLike dyedBed, ItemLike dye, String id) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, dyedBed)
                .requires(dye).requires(ItemTags.BEDS)
                .group("bed").unlockedBy(RecipeProvider.getHasName(dye), RecipeProvider.has(dye)).save(recipeOutput, id + "_from_dye");
    }

    public static void shulkerFromTag(RecipeOutput recipeOutput, ItemLike dyedShulker, ItemLike dye, String id) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dyedShulker)
                .requires(dye).requires(DDTags.Items.SHULKER_BOXES)
                .group("shulker").unlockedBy(RecipeProvider.getHasName(dye), RecipeProvider.has(dye)).save(recipeOutput, id + "_from_dye");
    }

    public static void oneToTwoConversionRecipe(RecipeOutput finishedRecipeConsumer, ItemLike result, ItemLike ingredient, String group) {
        oneToTwoConversionRecipe(finishedRecipeConsumer, result, ingredient, group, 2);
    }

    public static void oneToTwoConversionRecipe(RecipeOutput finishedRecipeConsumer, ItemLike result, ItemLike ingredient, String group, int resultCount) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, resultCount).requires(ingredient).group(group).unlockedBy(getHasName(ingredient), has(ingredient)).save(finishedRecipeConsumer, getConversionRecipeName(result, ingredient));
    }
}
