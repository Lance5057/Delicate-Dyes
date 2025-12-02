package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
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
        crafting(output);
        smelting(output);
        blasting(output);
    }

    private void crafting(RecipeOutput output) {
        //CORAL
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

        //CANARY
        RecipeHelper.modBasedOneToTwo(output, DDItems.CANARY_DYE.get(), DDBlocks.GOOB_BLOSSOM.get(), "canary_dye");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.CANARY_DYE.get(), 2)
                .requires(Items.YELLOW_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_yellow_dye", VanillaRecipeProvider.has(Items.YELLOW_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("canary_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "canary_dye_from_bits"));

        //WASABI
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.WASABI_DYE.get(), 2)
                .requires(Items.LIME_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_lime_dye", VanillaRecipeProvider.has(Items.LIME_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("wasabi_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "wasabi_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.WASABI_DYE.get(), 3)
                .requires(Items.GREEN_DYE).requires(Items.WHITE_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_green_dye", VanillaRecipeProvider.has(Items.GREEN_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("wasabi_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "wasabi_dye_from_bits_2"));

        //SACRAMENTO
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SACRAMENTO_DYE.get(), 1)
                .requires(Items.GLOW_INK_SAC)
                .unlockedBy("has_glow_ink_sac", VanillaRecipeProvider.has(Items.GLOW_INK_SAC))
                .group("sacramento_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sacramento_dye_from_glow_ink_sac"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SACRAMENTO_DYE.get(), 2)
                .requires(Items.GREEN_DYE).requires(Items.CYAN_DYE)
                .unlockedBy("has_green_dye", VanillaRecipeProvider.has(Items.GREEN_DYE))
                .unlockedBy("has_cyan_dye", VanillaRecipeProvider.has(Items.CYAN_DYE))
                .group("sacramento_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sacramento_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SACRAMENTO_DYE.get(), 3)
                .requires(Items.BLUE_DYE).requires(Items.GREEN_DYE).requires(Items.GREEN_DYE)
                .unlockedBy("has_green_dye", VanillaRecipeProvider.has(Items.GREEN_DYE))
                .unlockedBy("has_blue_dye", VanillaRecipeProvider.has(Items.BLUE_DYE))
                .group("sacramento_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sacramento_dye_from_bits_2"));

        //SKY
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SKY_DYE.get(), 2)
                .requires(Items.LIGHT_BLUE_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_light_blue_dye", VanillaRecipeProvider.has(Items.LIGHT_BLUE_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("sky_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sky_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SKY_DYE.get(), 3)
                .requires(Items.BLUE_DYE).requires(Items.WHITE_DYE).requires(Items.WHITE_DYE)
                .unlockedBy("has_blue_dye", VanillaRecipeProvider.has(Items.BLUE_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .group("sky_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sky_dye_from_bits_2"));

        //BLURPLE
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

        //SANGRIA
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SANGRIA_DYE.get(), 1)
                .requires(Items.SWEET_BERRIES)
                .unlockedBy("has_sweet_berries", VanillaRecipeProvider.has(Items.SWEET_BERRIES))
                .group("sangria_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sangria_dye_from_sweet_berries"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SANGRIA_DYE.get(), 2)
                .requires(Items.MAGENTA_DYE).requires(Items.BLACK_DYE)
                .unlockedBy("has_magenta_dye", VanillaRecipeProvider.has(Items.MAGENTA_DYE))
                .unlockedBy("has_black_dye", VanillaRecipeProvider.has(Items.BLACK_DYE))
                .group("sangria_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sangria_dye_from_bits_1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SANGRIA_DYE.get(), 3)
                .requires(Items.PINK_DYE).requires(Items.PURPLE_DYE).requires(Items.BLACK_DYE)
                .unlockedBy("has_purple_dye", VanillaRecipeProvider.has(Items.PURPLE_DYE))
                .unlockedBy("has_pink_dye", VanillaRecipeProvider.has(Items.PINK_DYE))
                .unlockedBy("has_black_dye", VanillaRecipeProvider.has(Items.BLACK_DYE))
                .group("sangria_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sangria_dye_from_bits_3"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SANGRIA_DYE.get(), 4)
                .requires(Items.RED_DYE).requires(Items.WHITE_DYE).requires(Items.PURPLE_DYE).requires(Items.BLACK_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .unlockedBy("has_purple_dye", VanillaRecipeProvider.has(Items.PURPLE_DYE))
                .unlockedBy("has_black_dye", VanillaRecipeProvider.has(Items.BLACK_DYE))
                .group("sangria_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sangria_dye_from_bits_4"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DDItems.SANGRIA_DYE.get(), 5)
                .requires(Items.RED_DYE).requires(Items.RED_DYE).requires(Items.WHITE_DYE)
                .requires(Items.BLACK_DYE).requires(Items.BLUE_DYE)
                .unlockedBy("has_red_dye", VanillaRecipeProvider.has(Items.RED_DYE))
                .unlockedBy("has_blue_dye", VanillaRecipeProvider.has(Items.BLUE_DYE))
                .unlockedBy("has_white_dye", VanillaRecipeProvider.has(Items.WHITE_DYE))
                .unlockedBy("has_black_dye", VanillaRecipeProvider.has(Items.BLACK_DYE))
                .group("sangria_dye")
                .save(output, RunicLib.customid(DelicateDyes.MOD_ID, "sangria_dye_from_bits_5"));

        //ROSE
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

        //CORAL
        carpet(output, DDBlocks.CORAL_CARPET.get(), DDBlocks.CORAL_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.CORAL_STAINED_GLASS.get(), DDItems.CORAL_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.CORAL_STAINED_GLASS_PANE.get(), DDBlocks.CORAL_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.CORAL_STAINED_GLASS_PANE.get(), DDItems.CORAL_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.CORAL_TERRACOTTA.get(), DDItems.CORAL_DYE.get());
        concretePowder(output, DDBlocks.CORAL_CONCRETE_POWDER.get(), DDItems.CORAL_DYE.get());
        candle(output, DDBlocks.CORAL_CANDLE.get(), DDItems.CORAL_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.CORAL_WOOL.get(), DDItems.CORAL_DYE.get(), "coral_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.CORAL_BED.get(), DDItems.CORAL_DYE.get(), "coral_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.CORAL_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.CORAL_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_coral_terracotta", has(DDBlocks.CORAL_TERRACOTTA.get())).save(output);

        banner(output, DDItems.CORAL_BANNER.get(), DDBlocks.CORAL_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.CORAL_BED.get(), DDBlocks.CORAL_WOOL.get().asItem());

        //CANARY
        carpet(output, DDBlocks.CANARY_CARPET.get(), DDBlocks.CANARY_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.CANARY_STAINED_GLASS.get(), DDItems.CANARY_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.CANARY_STAINED_GLASS_PANE.get(), DDBlocks.CANARY_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.CANARY_STAINED_GLASS_PANE.get(), DDItems.CANARY_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.CANARY_TERRACOTTA.get(), DDItems.CANARY_DYE.get());
        concretePowder(output, DDBlocks.CANARY_CONCRETE_POWDER.get(), DDItems.CANARY_DYE.get());
        candle(output, DDBlocks.CANARY_CANDLE.get(), DDItems.CANARY_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.CANARY_WOOL.get(), DDItems.CANARY_DYE.get(), "canary_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.CANARY_BED.get(), DDItems.CANARY_DYE.get(), "canary_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.CANARY_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.CANARY_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_canary_terracotta", has(DDBlocks.CANARY_TERRACOTTA.get())).save(output);

        banner(output, DDItems.CANARY_BANNER.get(), DDBlocks.CANARY_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.CANARY_BED.get(), DDBlocks.CANARY_WOOL.get().asItem());

        //WASABI
        carpet(output, DDBlocks.WASABI_CARPET.get(), DDBlocks.WASABI_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.WASABI_STAINED_GLASS.get(), DDItems.WASABI_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.WASABI_STAINED_GLASS_PANE.get(), DDBlocks.WASABI_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.WASABI_STAINED_GLASS_PANE.get(), DDItems.WASABI_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.WASABI_TERRACOTTA.get(), DDItems.WASABI_DYE.get());
        concretePowder(output, DDBlocks.WASABI_CONCRETE_POWDER.get(), DDItems.WASABI_DYE.get());
        candle(output, DDBlocks.WASABI_CANDLE.get(), DDItems.WASABI_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.WASABI_WOOL.get(), DDItems.WASABI_DYE.get(), "wasabi_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.WASABI_BED.get(), DDItems.WASABI_DYE.get(), "wasabi_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.WASABI_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.WASABI_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_wasabi_terracotta", has(DDBlocks.WASABI_TERRACOTTA.get())).save(output);

        banner(output, DDItems.WASABI_BANNER.get(), DDBlocks.WASABI_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.WASABI_BED.get(), DDBlocks.WASABI_WOOL.get().asItem());

        //SACRAMENTO
        carpet(output, DDBlocks.SACRAMENTO_CARPET.get(), DDBlocks.SACRAMENTO_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.SACRAMENTO_STAINED_GLASS.get(), DDItems.SACRAMENTO_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), DDBlocks.SACRAMENTO_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), DDItems.SACRAMENTO_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SACRAMENTO_TERRACOTTA.get(), DDItems.SACRAMENTO_DYE.get());
        concretePowder(output, DDBlocks.SACRAMENTO_CONCRETE_POWDER.get(), DDItems.SACRAMENTO_DYE.get());
        candle(output, DDBlocks.SACRAMENTO_CANDLE.get(), DDItems.SACRAMENTO_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.SACRAMENTO_WOOL.get(), DDItems.SACRAMENTO_DYE.get(), "sacramento_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.SACRAMENTO_BED.get(), DDItems.SACRAMENTO_DYE.get(), "sacramento_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SACRAMENTO_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_sacramento_terracotta", has(DDBlocks.SACRAMENTO_TERRACOTTA.get())).save(output);

        banner(output, DDItems.SACRAMENTO_BANNER.get(), DDBlocks.SACRAMENTO_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.SACRAMENTO_BED.get(), DDBlocks.SACRAMENTO_WOOL.get().asItem());

        //SKY
        carpet(output, DDBlocks.SKY_CARPET.get(), DDBlocks.SKY_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.SKY_STAINED_GLASS.get(), DDItems.SKY_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SKY_STAINED_GLASS_PANE.get(), DDBlocks.SKY_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SKY_STAINED_GLASS_PANE.get(), DDItems.SKY_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SKY_TERRACOTTA.get(), DDItems.SKY_DYE.get());
        concretePowder(output, DDBlocks.SKY_CONCRETE_POWDER.get(), DDItems.SKY_DYE.get());
        candle(output, DDBlocks.SKY_CANDLE.get(), DDItems.SKY_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.SKY_WOOL.get(), DDItems.SKY_DYE.get(), "sky_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.SKY_BED.get(), DDItems.SKY_DYE.get(), "sky_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SKY_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.SKY_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_sky_terracotta", has(DDBlocks.SKY_TERRACOTTA.get())).save(output);

        banner(output, DDItems.SKY_BANNER.get(), DDBlocks.SKY_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.SKY_BED.get(), DDBlocks.SKY_WOOL.get().asItem());

        //BLURPLE
        carpet(output, DDBlocks.BLURPLE_CARPET.get(), DDBlocks.BLURPLE_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.BLURPLE_STAINED_GLASS.get(), DDItems.BLURPLE_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), DDBlocks.BLURPLE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), DDItems.BLURPLE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.BLURPLE_TERRACOTTA.get(), DDItems.BLURPLE_DYE.get());
        concretePowder(output, DDBlocks.BLURPLE_CONCRETE_POWDER.get(), DDItems.BLURPLE_DYE.get());
        candle(output, DDBlocks.BLURPLE_CANDLE.get(), DDItems.BLURPLE_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.BLURPLE_WOOL.get(), DDItems.BLURPLE_DYE.get(), "blurple_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.BLURPLE_BED.get(), DDItems.BLURPLE_DYE.get(), "blurple_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.BLURPLE_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_blurple_terracotta", has(DDBlocks.BLURPLE_TERRACOTTA.get())).save(output);

        banner(output, DDItems.BLURPLE_BANNER.get(), DDBlocks.BLURPLE_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.BLURPLE_BED.get(), DDBlocks.BLURPLE_WOOL.get().asItem());

        //SANGRIA
        carpet(output, DDBlocks.SANGRIA_CARPET.get(), DDBlocks.SANGRIA_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.SANGRIA_STAINED_GLASS.get(), DDItems.SANGRIA_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), DDBlocks.SANGRIA_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), DDItems.SANGRIA_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.SANGRIA_TERRACOTTA.get(), DDItems.SANGRIA_DYE.get());
        concretePowder(output, DDBlocks.SANGRIA_CONCRETE_POWDER.get(), DDItems.SANGRIA_DYE.get());
        candle(output, DDBlocks.SANGRIA_CANDLE.get(), DDItems.SANGRIA_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.SANGRIA_WOOL.get(), DDItems.SANGRIA_DYE.get(), "sangria_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.SANGRIA_BED.get(), DDItems.SANGRIA_DYE.get(), "sangria_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.SANGRIA_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_sangria_terracotta", has(DDBlocks.SANGRIA_TERRACOTTA.get())).save(output);

        banner(output, DDItems.SANGRIA_BANNER.get(), DDBlocks.SANGRIA_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.SANGRIA_BED.get(), DDBlocks.SANGRIA_WOOL.get().asItem());

        //ROSE
        carpet(output, DDBlocks.ROSE_CARPET.get(), DDBlocks.ROSE_WOOL.get());
        stainedGlassFromGlassAndDye(output, DDBlocks.ROSE_STAINED_GLASS.get(), DDItems.ROSE_DYE.get());
        stainedGlassPaneFromStainedGlass(output, DDBlocks.ROSE_STAINED_GLASS_PANE.get(), DDBlocks.ROSE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(output, DDBlocks.ROSE_STAINED_GLASS_PANE.get(), DDItems.ROSE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(output, DDBlocks.ROSE_TERRACOTTA.get(), DDItems.ROSE_DYE.get());
        concretePowder(output, DDBlocks.ROSE_CONCRETE_POWDER.get(), DDItems.ROSE_DYE.get());
        candle(output, DDBlocks.ROSE_CANDLE.get(), DDItems.ROSE_DYE.get());
        RecipeHelper.woolFromTag(output, DDBlocks.ROSE_WOOL.get(), DDItems.ROSE_DYE.get(), "rose_wool");
        RecipeHelper.bedFromTag(output, DDBlocks.ROSE_BED.get(), DDItems.ROSE_DYE.get(), "rose_bed");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DDBlocks.ROSE_TERRACOTTA.get()), RecipeCategory.DECORATIONS, DDBlocks.ROSE_GLAZED_TERRACOTTA.get().asItem(),
                0.1F, 200).unlockedBy("has_rose_terracotta", has(DDBlocks.ROSE_TERRACOTTA.get())).save(output);

        banner(output, DDItems.ROSE_BANNER.get(), DDBlocks.ROSE_WOOL.get().asItem());
        bedFromPlanksAndWool(output, DDItems.ROSE_BED.get(), DDBlocks.ROSE_WOOL.get().asItem());

        //actually stupid behaviour because no special recipe type
        RecipeHelper.woolFromTag(output, Blocks.WHITE_WOOL, Items.WHITE_DYE, "white_wool");
        RecipeHelper.bedFromTag(output, Blocks.WHITE_BED, Items.WHITE_DYE, "white_bed");

        RecipeHelper.woolFromTag(output, Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE, "light_gray_wool");
        RecipeHelper.bedFromTag(output, Blocks.LIGHT_GRAY_BED, Items.LIGHT_GRAY_DYE, "light_gray_bed");

        RecipeHelper.woolFromTag(output, Blocks.GRAY_WOOL, Items.GRAY_DYE, "gray_wool");
        RecipeHelper.bedFromTag(output, Blocks.GRAY_BED, Items.GRAY_DYE, "gray_bed");

        RecipeHelper.woolFromTag(output, Blocks.BLACK_WOOL, Items.BLACK_DYE, "black_wool");
        RecipeHelper.bedFromTag(output, Blocks.BLACK_BED, Items.BLACK_DYE, "black_bed");

        RecipeHelper.woolFromTag(output, Blocks.BROWN_WOOL, Items.BROWN_DYE, "brown_wool");
        RecipeHelper.bedFromTag(output, Blocks.BROWN_BED, Items.BROWN_DYE, "brown_bed");

        RecipeHelper.woolFromTag(output, Blocks.RED_WOOL, Items.RED_DYE, "red_wool");
        RecipeHelper.bedFromTag(output, Blocks.RED_BED, Items.RED_DYE, "red_bed");

        RecipeHelper.woolFromTag(output, Blocks.ORANGE_WOOL, Items.ORANGE_DYE, "orange_wool");
        RecipeHelper.bedFromTag(output, Blocks.ORANGE_BED, Items.ORANGE_DYE, "orange_bed");

        RecipeHelper.woolFromTag(output, Blocks.YELLOW_WOOL, Items.YELLOW_DYE, "yellow_wool");
        RecipeHelper.bedFromTag(output, Blocks.YELLOW_BED, Items.YELLOW_DYE, "yellow_bed");

        RecipeHelper.woolFromTag(output, Blocks.LIME_WOOL, Items.LIME_DYE, "lime_wool");
        RecipeHelper.bedFromTag(output, Blocks.LIME_BED, Items.LIME_DYE, "lime_bed");

        RecipeHelper.woolFromTag(output, Blocks.GREEN_WOOL, Items.GREEN_DYE, "green_wool");
        RecipeHelper.bedFromTag(output, Blocks.GREEN_BED, Items.GREEN_DYE, "green_bed");

        RecipeHelper.woolFromTag(output, Blocks.CYAN_WOOL, Items.CYAN_DYE, "cyan_wool");
        RecipeHelper.bedFromTag(output, Blocks.CYAN_BED, Items.CYAN_DYE, "cyan_bed");

        RecipeHelper.woolFromTag(output, Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE, "light_blue_wool");
        RecipeHelper.bedFromTag(output, Blocks.LIGHT_BLUE_BED, Items.LIGHT_BLUE_DYE, "light_blue_bed");

        RecipeHelper.woolFromTag(output, Blocks.BLUE_WOOL, Items.BLUE_DYE, "blue_wool");
        RecipeHelper.bedFromTag(output, Blocks.BLUE_BED, Items.BLUE_DYE, "blue_bed");

        RecipeHelper.woolFromTag(output, Blocks.PURPLE_WOOL, Items.PURPLE_DYE, "purple_wool");
        RecipeHelper.bedFromTag(output, Blocks.PURPLE_BED, Items.PURPLE_DYE, "purple_bed");

        RecipeHelper.woolFromTag(output, Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE, "magenta_wool");
        RecipeHelper.bedFromTag(output, Blocks.MAGENTA_BED, Items.MAGENTA_DYE, "magenta_bed");

        RecipeHelper.woolFromTag(output, Blocks.PINK_WOOL, Items.PINK_DYE, "pink_wool");
        RecipeHelper.bedFromTag(output, Blocks.PINK_BED, Items.PINK_DYE, "pink_bed");

        RecipeHelper.shulkerFromTag(output, DDBlocks.CORAL_SHULKER_BOX.get(), DDItems.CORAL_DYE.get(), "coral_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.CANARY_SHULKER_BOX.get(), DDItems.CANARY_DYE.get(), "canary_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.WASABI_SHULKER_BOX.get(), DDItems.WASABI_DYE.get(), "wasabi_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.SACRAMENTO_SHULKER_BOX.get(), DDItems.SACRAMENTO_DYE.get(), "sacramento_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.SKY_SHULKER_BOX.get(), DDItems.SKY_DYE.get(), "sky_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.BLURPLE_SHULKER_BOX.get(), DDItems.BLURPLE_DYE.get(), "blurple_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.SANGRIA_SHULKER_BOX.get(), DDItems.SANGRIA_DYE.get(), "sangria_shulker_box");
        RecipeHelper.shulkerFromTag(output, DDBlocks.ROSE_SHULKER_BOX.get(), DDItems.ROSE_DYE.get(), "rose_shulker_box");
    }

    private void smelting(RecipeOutput output) {
    }

    private void blasting(RecipeOutput output) {
    }
}
