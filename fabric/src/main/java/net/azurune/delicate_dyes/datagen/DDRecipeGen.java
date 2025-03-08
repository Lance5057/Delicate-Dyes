package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.registry.DDItems;
import net.azurune.delicate_dyes.util.DDTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class DDRecipeGen extends FabricRecipeProvider {
    public DDRecipeGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput output) {
        //CORAL
        carpet(output, DDBlocks.CORAL_CARPET.value(), DDBlocks.CORAL_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.CORAL_STAINED_GLASS.value(), DDItems.CORAL_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.CORAL_STAINED_GLASS_PANE.value(), DDBlocks.CORAL_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.CORAL_STAINED_GLASS_PANE.value(), DDItems.CORAL_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.CORAL_TERRACOTTA.value(), DDItems.CORAL_DYE.value());
        concretePowder(output, DDBlocks.CORAL_CONCRETE_POWDER.value(), DDItems.CORAL_DYE.value());
        candle(output, DDBlocks.CORAL_CANDLE.value(), DDItems.CORAL_DYE.value());
        woolFromTag(output, DDBlocks.CORAL_WOOL.value(), DDItems.CORAL_DYE.value(), "coral_wool");
        bedFromTag(output, DDBlocks.CORAL_BED.value(), DDItems.CORAL_DYE.value(), "coral_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.CORAL_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.CORAL_GLAZED_TERRACOTTA.value().asItem(),
                        0.1F, 200).unlockedBy("has_coral_terracotta", has(DDBlocks.CORAL_TERRACOTTA.value())).save(output);

        banner(output, DDItems.CORAL_BANNER.value(), DDBlocks.CORAL_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.CORAL_BED.value(), DDBlocks.CORAL_WOOL.value().asItem());

        //CANARY
        carpet(output, DDBlocks.CANARY_CARPET.value(), DDBlocks.CANARY_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.CANARY_STAINED_GLASS.value(), DDItems.CANARY_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.CANARY_STAINED_GLASS_PANE.value(), DDBlocks.CANARY_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.CANARY_STAINED_GLASS_PANE.value(), DDItems.CANARY_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.CANARY_TERRACOTTA.value(), DDItems.CANARY_DYE.value());
        concretePowder(output, DDBlocks.CANARY_CONCRETE_POWDER.value(), DDItems.CANARY_DYE.value());
        candle(output, DDBlocks.CANARY_CANDLE.value(), DDItems.CANARY_DYE.value());
        woolFromTag(output, DDBlocks.CANARY_WOOL.value(), DDItems.CANARY_DYE.value(), "canary_wool");
        bedFromTag(output, DDBlocks.CANARY_BED.value(), DDItems.CANARY_DYE.value(), "canary_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.CANARY_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.CANARY_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_canary_terracotta", has(DDBlocks.CANARY_TERRACOTTA.value())).save(output);

        banner(output, DDItems.CANARY_BANNER.value(), DDBlocks.CANARY_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.CANARY_BED.value(), DDBlocks.CANARY_WOOL.value().asItem());

        //WASABI
        carpet(output, DDBlocks.WASABI_CARPET.value(), DDBlocks.WASABI_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.WASABI_STAINED_GLASS.value(), DDItems.WASABI_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.WASABI_STAINED_GLASS_PANE.value(), DDBlocks.WASABI_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.WASABI_STAINED_GLASS_PANE.value(), DDItems.WASABI_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.WASABI_TERRACOTTA.value(), DDItems.WASABI_DYE.value());
        concretePowder(output, DDBlocks.WASABI_CONCRETE_POWDER.value(), DDItems.WASABI_DYE.value());
        candle(output, DDBlocks.WASABI_CANDLE.value(), DDItems.WASABI_DYE.value());
        woolFromTag(output, DDBlocks.WASABI_WOOL.value(), DDItems.WASABI_DYE.value(), "wasabi_wool");
        bedFromTag(output, DDBlocks.WASABI_BED.value(), DDItems.WASABI_DYE.value(), "wasabi_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.WASABI_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.WASABI_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_wasabi_terracotta", has(DDBlocks.WASABI_TERRACOTTA.value())).save(output);

        banner(output, DDItems.WASABI_BANNER.value(), DDBlocks.WASABI_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.WASABI_BED.value(), DDBlocks.WASABI_WOOL.value().asItem());

        //SACRAMENTO
        carpet(output, DDBlocks.SACRAMENTO_CARPET.value(), DDBlocks.SACRAMENTO_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.SACRAMENTO_STAINED_GLASS.value(), DDItems.SACRAMENTO_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value(), DDBlocks.SACRAMENTO_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value(), DDItems.SACRAMENTO_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SACRAMENTO_TERRACOTTA.value(), DDItems.SACRAMENTO_DYE.value());
        concretePowder(output, DDBlocks.SACRAMENTO_CONCRETE_POWDER.value(), DDItems.SACRAMENTO_DYE.value());
        candle(output, DDBlocks.SACRAMENTO_CANDLE.value(), DDItems.SACRAMENTO_DYE.value());
        woolFromTag(output, DDBlocks.SACRAMENTO_WOOL.value(), DDItems.SACRAMENTO_DYE.value(), "sacramento_wool");
        bedFromTag(output, DDBlocks.SACRAMENTO_BED.value(), DDItems.SACRAMENTO_DYE.value(), "sacramento_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SACRAMENTO_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_sacramento_terracotta", has(DDBlocks.SACRAMENTO_TERRACOTTA.value())).save(output);

        banner(output, DDItems.SACRAMENTO_BANNER.value(), DDBlocks.SACRAMENTO_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.SACRAMENTO_BED.value(), DDBlocks.SACRAMENTO_WOOL.value().asItem());

        //SKY
        carpet(output, DDBlocks.SKY_CARPET.value(), DDBlocks.SKY_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.SKY_STAINED_GLASS.value(), DDItems.SKY_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SKY_STAINED_GLASS_PANE.value(), DDBlocks.SKY_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SKY_STAINED_GLASS_PANE.value(), DDItems.SKY_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SKY_TERRACOTTA.value(), DDItems.SKY_DYE.value());
        concretePowder(output, DDBlocks.SKY_CONCRETE_POWDER.value(), DDItems.SKY_DYE.value());
        candle(output, DDBlocks.SKY_CANDLE.value(), DDItems.SKY_DYE.value());
        woolFromTag(output, DDBlocks.SKY_WOOL.value(), DDItems.SKY_DYE.value(), "sky_wool");
        bedFromTag(output, DDBlocks.SKY_BED.value(), DDItems.SKY_DYE.value(), "sky_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SKY_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.SKY_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_sky_terracotta", has(DDBlocks.SKY_TERRACOTTA.value())).save(output);

        banner(output, DDItems.SKY_BANNER.value(), DDBlocks.SKY_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.SKY_BED.value(), DDBlocks.SKY_WOOL.value().asItem());

        //BLURPLE
        carpet(output, DDBlocks.BLURPLE_CARPET.value(), DDBlocks.BLURPLE_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.BLURPLE_STAINED_GLASS.value(), DDItems.BLURPLE_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.BLURPLE_STAINED_GLASS_PANE.value(), DDBlocks.BLURPLE_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.BLURPLE_STAINED_GLASS_PANE.value(), DDItems.BLURPLE_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.BLURPLE_TERRACOTTA.value(), DDItems.BLURPLE_DYE.value());
        concretePowder(output, DDBlocks.BLURPLE_CONCRETE_POWDER.value(), DDItems.BLURPLE_DYE.value());
        candle(output, DDBlocks.BLURPLE_CANDLE.value(), DDItems.BLURPLE_DYE.value());
        woolFromTag(output, DDBlocks.BLURPLE_WOOL.value(), DDItems.BLURPLE_DYE.value(), "blurple_wool");
        bedFromTag(output, DDBlocks.BLURPLE_BED.value(), DDItems.BLURPLE_DYE.value(), "blurple_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.BLURPLE_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.BLURPLE_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_blurple_terracotta", has(DDBlocks.BLURPLE_TERRACOTTA.value())).save(output);

        banner(output, DDItems.BLURPLE_BANNER.value(), DDBlocks.BLURPLE_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.BLURPLE_BED.value(), DDBlocks.BLURPLE_WOOL.value().asItem());

        //SANGRIA
        carpet(output, DDBlocks.SANGRIA_CARPET.value(), DDBlocks.SANGRIA_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.SANGRIA_STAINED_GLASS.value(), DDItems.SANGRIA_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SANGRIA_STAINED_GLASS_PANE.value(), DDBlocks.SANGRIA_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SANGRIA_STAINED_GLASS_PANE.value(), DDItems.SANGRIA_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SANGRIA_TERRACOTTA.value(), DDItems.SANGRIA_DYE.value());
        concretePowder(output, DDBlocks.SANGRIA_CONCRETE_POWDER.value(), DDItems.SANGRIA_DYE.value());
        candle(output, DDBlocks.SANGRIA_CANDLE.value(), DDItems.SANGRIA_DYE.value());
        woolFromTag(output, DDBlocks.SANGRIA_WOOL.value(), DDItems.SANGRIA_DYE.value(), "sangria_wool");
        bedFromTag(output, DDBlocks.SANGRIA_BED.value(), DDItems.SANGRIA_DYE.value(), "sangria_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SANGRIA_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.SANGRIA_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_sangria_terracotta", has(DDBlocks.SANGRIA_TERRACOTTA.value())).save(output);

        banner(output, DDItems.SANGRIA_BANNER.value(), DDBlocks.SANGRIA_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.SANGRIA_BED.value(), DDBlocks.SANGRIA_WOOL.value().asItem());

        //ROSE
        carpet(output, DDBlocks.ROSE_CARPET.value(), DDBlocks.ROSE_WOOL.value());
        stainedGlassFromGlassAndDye(output, DDBlocks.ROSE_STAINED_GLASS.value(), DDItems.ROSE_DYE.value());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.ROSE_STAINED_GLASS_PANE.value(), DDBlocks.ROSE_STAINED_GLASS.value());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.ROSE_STAINED_GLASS_PANE.value(), DDItems.ROSE_DYE.value());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.ROSE_TERRACOTTA.value(), DDItems.ROSE_DYE.value());
        concretePowder(output, DDBlocks.ROSE_CONCRETE_POWDER.value(), DDItems.ROSE_DYE.value());
        candle(output, DDBlocks.ROSE_CANDLE.value(), DDItems.ROSE_DYE.value());
        woolFromTag(output, DDBlocks.ROSE_WOOL.value(), DDItems.ROSE_DYE.value(), "rose_wool");
        bedFromTag(output, DDBlocks.ROSE_BED.value(), DDItems.ROSE_DYE.value(), "rose_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.ROSE_TERRACOTTA.value()), RecipeCategory.DECORATIONS, DDBlocks.ROSE_GLAZED_TERRACOTTA.value().asItem(),
                0.1F, 200).unlockedBy("has_rose_terracotta", has(DDBlocks.ROSE_TERRACOTTA.value())).save(output);

        banner(output, DDItems.ROSE_BANNER.value(), DDBlocks.ROSE_WOOL.value().asItem());
        bedFromPlanksAndWool(output, DDItems.ROSE_BED.value(), DDBlocks.ROSE_WOOL.value().asItem());

        //VANILLA ADDITIONS
        woolFromTag(output, Blocks.WHITE_WOOL, Items.WHITE_DYE, "white_wool");
        bedFromTag(output, Blocks.WHITE_BED, Items.WHITE_DYE, "white_bed");

        woolFromTag(output, Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE, "light_gray_wool");
        bedFromTag(output, Blocks.LIGHT_GRAY_BED, Items.LIGHT_GRAY_DYE, "light_gray_bed");

        woolFromTag(output, Blocks.GRAY_WOOL, Items.GRAY_DYE, "gray_wool");
        bedFromTag(output, Blocks.GRAY_BED, Items.GRAY_DYE, "gray_bed");

        woolFromTag(output, Blocks.BLACK_WOOL, Items.BLACK_DYE, "black_wool");
        bedFromTag(output, Blocks.BLACK_BED, Items.BLACK_DYE, "black_bed");

        woolFromTag(output, Blocks.BROWN_WOOL, Items.BROWN_DYE, "brown_wool");
        bedFromTag(output, Blocks.BROWN_BED, Items.BROWN_DYE, "brown_bed");

        woolFromTag(output, Blocks.RED_WOOL, Items.RED_DYE, "red_wool");
        bedFromTag(output, Blocks.RED_BED, Items.RED_DYE, "red_bed");

        woolFromTag(output, Blocks.ORANGE_WOOL, Items.ORANGE_DYE, "orange_wool");
        bedFromTag(output, Blocks.ORANGE_BED, Items.ORANGE_DYE, "orange_bed");

        woolFromTag(output, Blocks.YELLOW_WOOL, Items.YELLOW_DYE, "yellow_wool");
        bedFromTag(output, Blocks.YELLOW_BED, Items.YELLOW_DYE, "yellow_bed");

        woolFromTag(output, Blocks.LIME_WOOL, Items.LIME_DYE, "lime_wool");
        bedFromTag(output, Blocks.LIME_BED, Items.LIME_DYE, "lime_bed");

        woolFromTag(output, Blocks.GREEN_WOOL, Items.GREEN_DYE, "green_wool");
        bedFromTag(output, Blocks.GREEN_BED, Items.GREEN_DYE, "green_bed");

        woolFromTag(output, Blocks.CYAN_WOOL, Items.CYAN_DYE, "cyan_wool");
        bedFromTag(output, Blocks.CYAN_BED, Items.CYAN_DYE, "cyan_bed");

        woolFromTag(output, Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE, "light_blue_wool");
        bedFromTag(output, Blocks.LIGHT_BLUE_BED, Items.LIGHT_BLUE_DYE, "light_blue_bed");

        woolFromTag(output, Blocks.BLUE_WOOL, Items.BLUE_DYE, "blue_wool");
        bedFromTag(output, Blocks.BLUE_BED, Items.BLUE_DYE, "blue_bed");

        woolFromTag(output, Blocks.PURPLE_WOOL, Items.PURPLE_DYE, "purple_wool");
        bedFromTag(output, Blocks.PURPLE_BED, Items.PURPLE_DYE, "purple_bed");

        woolFromTag(output, Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE, "magenta_wool");
        bedFromTag(output, Blocks.MAGENTA_BED, Items.MAGENTA_DYE, "magenta_bed");

        woolFromTag(output, Blocks.PINK_WOOL, Items.PINK_DYE, "pink_wool");
        bedFromTag(output, Blocks.PINK_BED, Items.PINK_DYE, "pink_bed");

        //MISC CONTENT
        oneToOneConversionRecipe(output, DDItems.ROSE_DYE.value(), DDBlocks.ROSE.value(), "rose_dye");
        oneToOneConversionRecipe(output, Items.RED_DYE, DDBlocks.RED_ROSE.value(), "red_dye");
        oneToOneConversionRecipe(output, DDItems.SKY_DYE.value(), DDBlocks.BLUE_ROSE.value(), "sky_dye");
        oneToOneConversionRecipe(output, Items.WHITE_DYE, DDBlocks.WHITE_ROSE.value(), "white_dye");

        oneToOneConversionRecipe(output, DDItems.BLURPLE_DYE.value(), DDItems.BLUEBERRIES.value(), "blurple_dye");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, DDItems.BLUEBERRY_PIE.value())
                .requires(DDTags.Items.BLUEBERRIES).requires(DDTags.Items.BLUEBERRIES).requires(Items.SUGAR).requires(Items.EGG)
                .unlockedBy("has_blueberries", VanillaRecipeProvider.has(DDTags.Items.BLUEBERRIES)).save(output);
    }

    //crappy work around for special recipes
    public static void woolFromTag(RecipeOutput recipeOutput, ItemLike dyedWool, ItemLike dye, String fileName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, dyedWool)
                .requires(dye).requires(ItemTags.WOOL)
                .group("wool").unlockedBy(RecipeProvider.getHasName(dye), RecipeProvider.has(dye)).save(recipeOutput, fileName + "_from_dye");
    }

    public static void bedFromTag(RecipeOutput recipeOutput, ItemLike dyedBed, ItemLike dye, String fileName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, dyedBed)
                .requires(dye).requires(ItemTags.BEDS)
                .group("bed").unlockedBy(RecipeProvider.getHasName(dye), RecipeProvider.has(dye)).save(recipeOutput, fileName + "_from_dye");
    }
}
