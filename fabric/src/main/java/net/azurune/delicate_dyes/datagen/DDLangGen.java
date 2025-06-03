package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.common.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.common.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DDLangGen extends FabricLanguageProvider {
    public DDLangGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder build) {
        //MISC
        build.add("itemgroup.delicate_dyes", "Delicate Dyes");
        build.add("itemgroup.delicate_dyes_compat", "Delicate Dyes Compatibility");

        //BLOCKS
        build.add(DDBlocks.ROSE.get(), "Rose");
        build.add(DDBlocks.BLUEBERRY_BUSH.get(), "Blueberry Bush");
        build.add(DDBlocks.PEACH_BELLFLOWER.get(), "Peach Bellflower");
        build.add(DDBlocks.GOOB_BLOSSOM.get(), "Goob Blossom");

        //ITEMS
        build.add(DDItems.BLUEBERRIES.get(), "Blueberries");

        //DYED BLOCKS
        build.add(DDBlocks.CORAL_WOOL.get(), "Coral Wool");
        build.add(DDBlocks.CORAL_CARPET.get(), "Coral Carpet");
        build.add(DDBlocks.CORAL_STAINED_GLASS.get(), "Coral Stained Glass");
        build.add(DDBlocks.CORAL_STAINED_GLASS_PANE.get(), "Coral Stained Glass Pane");
        build.add(DDBlocks.CORAL_TERRACOTTA.get(), "Coral Terracotta");
        build.add(DDBlocks.CORAL_GLAZED_TERRACOTTA.get(), "Coral Glazed Terracotta");
        build.add(DDBlocks.CORAL_CONCRETE.get(), "Coral Concrete");
        build.add(DDBlocks.CORAL_CONCRETE_POWDER.get(), "Coral Concrete Powder");
        build.add(DDBlocks.CORAL_CANDLE.get(), "Coral Candle");
        build.add(DDBlocks.CORAL_CANDLE_CAKE.get(), "Coral Candle Cake");
        build.add(DDBlocks.CORAL_SHULKER_BOX.get(), "Coral Shulker Box");

        build.add(DDBlocks.CANARY_WOOL.get(), "Canary Wool");
        build.add(DDBlocks.CANARY_CARPET.get(), "Canary Carpet");
        build.add(DDBlocks.CANARY_STAINED_GLASS.get(), "Canary Stained Glass");
        build.add(DDBlocks.CANARY_STAINED_GLASS_PANE.get(), "Canary Stained Glass Pane");
        build.add(DDBlocks.CANARY_TERRACOTTA.get(), "Canary Terracotta");
        build.add(DDBlocks.CANARY_GLAZED_TERRACOTTA.get(), "Canary Glazed Terracotta");
        build.add(DDBlocks.CANARY_CONCRETE.get(), "Canary Concrete");
        build.add(DDBlocks.CANARY_CONCRETE_POWDER.get(), "Canary Concrete Powder");
        build.add(DDBlocks.CANARY_CANDLE.get(), "Canary Candle");
        build.add(DDBlocks.CANARY_CANDLE_CAKE.get(), "Canary Candle Cake");
        build.add(DDBlocks.CANARY_SHULKER_BOX.get(), "Canary Shulker Box");

        build.add(DDBlocks.WASABI_WOOL.get(), "Wasabi Wool");
        build.add(DDBlocks.WASABI_CARPET.get(), "Wasabi Carpet");
        build.add(DDBlocks.WASABI_STAINED_GLASS.get(), "Wasabi Stained Glass");
        build.add(DDBlocks.WASABI_STAINED_GLASS_PANE.get(), "Wasabi Stained Glass Pane");
        build.add(DDBlocks.WASABI_TERRACOTTA.get(), "Wasabi Terracotta");
        build.add(DDBlocks.WASABI_GLAZED_TERRACOTTA.get(), "Wasabi Glazed Terracotta");
        build.add(DDBlocks.WASABI_CONCRETE.get(), "Wasabi Concrete");
        build.add(DDBlocks.WASABI_CONCRETE_POWDER.get(), "Wasabi Concrete Powder");
        build.add(DDBlocks.WASABI_CANDLE.get(), "Wasabi Candle");
        build.add(DDBlocks.WASABI_CANDLE_CAKE.get(), "Wasabi Candle Cake");
        build.add(DDBlocks.WASABI_SHULKER_BOX.get(), "Wasabi Shulker Box");

        build.add(DDBlocks.SACRAMENTO_WOOL.get(), "Sacramento Wool");
        build.add(DDBlocks.SACRAMENTO_CARPET.get(), "Sacramento Carpet");
        build.add(DDBlocks.SACRAMENTO_STAINED_GLASS.get(), "Sacramento Stained Glass");
        build.add(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), "Sacramento Stained Glass Pane");
        build.add(DDBlocks.SACRAMENTO_TERRACOTTA.get(), "Sacramento Terracotta");
        build.add(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get(), "Sacramento Glazed Terracotta");
        build.add(DDBlocks.SACRAMENTO_CONCRETE.get(), "Sacramento Concrete");
        build.add(DDBlocks.SACRAMENTO_CONCRETE_POWDER.get(), "Sacramento Concrete Powder");
        build.add(DDBlocks.SACRAMENTO_CANDLE.get(), "Sacramento Candle");
        build.add(DDBlocks.SACRAMENTO_CANDLE_CAKE.get(), "Sacramento Candle Cake");
        build.add(DDBlocks.SACRAMENTO_SHULKER_BOX.get(), "Sacramento Shulker Box");

        build.add(DDBlocks.SKY_WOOL.get(), "Sky Wool");
        build.add(DDBlocks.SKY_CARPET.get(), "Sky Carpet");
        build.add(DDBlocks.SKY_STAINED_GLASS.get(), "Sky Stained Glass");
        build.add(DDBlocks.SKY_STAINED_GLASS_PANE.get(), "Sky Stained Glass Pane");
        build.add(DDBlocks.SKY_TERRACOTTA.get(), "Sky Terracotta");
        build.add(DDBlocks.SKY_GLAZED_TERRACOTTA.get(), "Sky Glazed Terracotta");
        build.add(DDBlocks.SKY_CONCRETE.get(), "Sky Concrete");
        build.add(DDBlocks.SKY_CONCRETE_POWDER.get(), "Sky Concrete Powder");
        build.add(DDBlocks.SKY_CANDLE.get(), "Sky Candle");
        build.add(DDBlocks.SKY_CANDLE_CAKE.get(), "Sky Candle Cake");
        build.add(DDBlocks.SKY_SHULKER_BOX.get(), "Sky Shulker Box");

        build.add(DDBlocks.BLURPLE_WOOL.get(), "Blurple Wool");
        build.add(DDBlocks.BLURPLE_CARPET.get(), "Blurple Carpet");
        build.add(DDBlocks.BLURPLE_STAINED_GLASS.get(), "Blurple Stained Glass");
        build.add(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), "Blurple Stained Glass Pane");
        build.add(DDBlocks.BLURPLE_TERRACOTTA.get(), "Blurple Terracotta");
        build.add(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get(), "Blurple Glazed Terracotta");
        build.add(DDBlocks.BLURPLE_CONCRETE.get(), "Blurple Concrete");
        build.add(DDBlocks.BLURPLE_CONCRETE_POWDER.get(), "Blurple Concrete Powder");
        build.add(DDBlocks.BLURPLE_CANDLE.get(), "Blurple Candle");
        build.add(DDBlocks.BLURPLE_CANDLE_CAKE.get(), "Blurple Candle Cake");
        build.add(DDBlocks.BLURPLE_SHULKER_BOX.get(), "Blurple Shulker Box");

        build.add(DDBlocks.SANGRIA_WOOL.get(), "Sangria Wool");
        build.add(DDBlocks.SANGRIA_CARPET.get(), "Sangria Carpet");
        build.add(DDBlocks.SANGRIA_STAINED_GLASS.get(), "Sangria Stained Glass");
        build.add(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), "Sangria Stained Glass Pane");
        build.add(DDBlocks.SANGRIA_TERRACOTTA.get(), "Sangria Terracotta");
        build.add(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get(), "Sangria Glazed Terracotta");
        build.add(DDBlocks.SANGRIA_CONCRETE.get(), "Sangria Concrete");
        build.add(DDBlocks.SANGRIA_CONCRETE_POWDER.get(), "Sangria Concrete Powder");
        build.add(DDBlocks.SANGRIA_CANDLE.get(), "Sangria Candle");
        build.add(DDBlocks.SANGRIA_CANDLE_CAKE.get(), "Sangria Candle Cake");
        build.add(DDBlocks.SANGRIA_SHULKER_BOX.get(), "Sangria Shulker Box");

        build.add(DDBlocks.ROSE_WOOL.get(), "Rose Wool");
        build.add(DDBlocks.ROSE_CARPET.get(), "Rose Carpet");
        build.add(DDBlocks.ROSE_STAINED_GLASS.get(), "Rose Stained Glass");
        build.add(DDBlocks.ROSE_STAINED_GLASS_PANE.get(), "Rose Stained Glass Pane");
        build.add(DDBlocks.ROSE_TERRACOTTA.get(), "Rose Terracotta");
        build.add(DDBlocks.ROSE_GLAZED_TERRACOTTA.get(), "Rose Glazed Terracotta");
        build.add(DDBlocks.ROSE_CONCRETE.get(), "Rose Concrete");
        build.add(DDBlocks.ROSE_CONCRETE_POWDER.get(), "Rose Concrete Powder");
        build.add(DDBlocks.ROSE_CANDLE.get(), "Rose Candle");
        build.add(DDBlocks.ROSE_CANDLE_CAKE.get(), "Rose Candle Cake");
        build.add(DDBlocks.ROSE_SHULKER_BOX.get(), "Rose Shulker Box");

        //DYED ITEMS
        build.add(DDItems.CORAL_DYE.get(), "Coral Dye");
        build.add(DDItems.CANARY_DYE.get(), "Canary Dye");
        build.add(DDItems.WASABI_DYE.get(), "Wasabi Dye");
        build.add(DDItems.SACRAMENTO_DYE.get(), "Sacramento Dye");
        build.add(DDItems.SKY_DYE.get(), "Sky Dye");
        build.add(DDItems.BLURPLE_DYE.get(), "Blurple Dye");
        build.add(DDItems.SANGRIA_DYE.get(), "Sangria Dye");
        build.add(DDItems.ROSE_DYE.get(), "Rose Dye");

        build.add(DDItems.CORAL_BED.get(), "Coral Bed");
        build.add(DDItems.CANARY_BED.get(), "Canary Bed");
        build.add(DDItems.WASABI_BED.get(), "Wasabi Bed");
        build.add(DDItems.SACRAMENTO_BED.get(), "Sacramento Bed");
        build.add(DDItems.SKY_BED.get(), "Sky Bed");
        build.add(DDItems.BLURPLE_BED.get(), "Blurple Bed");
        build.add(DDItems.SANGRIA_BED.get(), "Sangria Bed");
        build.add(DDItems.ROSE_BED.get(), "Rose Bed");

        build.add(DDItems.CORAL_BANNER.get(), "Coral Banner");
        build.add(DDItems.CANARY_BANNER.get(), "Canary Banner");
        build.add(DDItems.WASABI_BANNER.get(), "Wasabi Banner");
        build.add(DDItems.SACRAMENTO_BANNER.get(), "Sacramento Banner");
        build.add(DDItems.SKY_BANNER.get(), "Sky Banner");
        build.add(DDItems.BLURPLE_BANNER.get(), "Blurple Banner");
        build.add(DDItems.SANGRIA_BANNER.get(), "Sangria Banner");
        build.add(DDItems.ROSE_BANNER.get(), "Rose Banner");

        //COMPAT
        //========================================================================================
        //APPLEDOG

        //BLOCKS
        build.add(ADBlocks.BLUEBERRYCAT_BUSH.get(), "Blueberrycat Bush");

        //ITEMS
        build.add(ADItems.CATBLUEBERRY.get(), "Catblueberry");
        //========================================================================================

        //YAPPING TOOLTIPS COMPAT //TODO ADD

        //COLOR
        build.add("color.minecraft.coral", "Coral");
        build.add("color.minecraft.canary", "Canary");
        build.add("color.minecraft.wasabi", "Wasabi");
        build.add("color.minecraft.sacramento", "Sacramento");
        build.add("color.minecraft.sky", "Sky");
        build.add("color.minecraft.blurple", "Blurple");
        build.add("color.minecraft.sangria", "Sangria");
        build.add("color.minecraft.rose", "Rose");

        //FIREWORK STARS
        build.add("item.minecraft.firework_star.coral", "Coral");
        build.add("item.minecraft.firework_star.canary", "Canary");
        build.add("item.minecraft.firework_star.wasabi", "Wasabi");
        build.add("item.minecraft.firework_star.sacramento", "Sacramento");
        build.add("item.minecraft.firework_star.sky", "Sky");
        build.add("item.minecraft.firework_star.blurple", "Blurple");
        build.add("item.minecraft.firework_star.sangria", "Sangria");
        build.add("item.minecraft.firework_star.rose", "Rose");

        //BANNER PATTERNS
        build.add("block.minecraft.banner.base.coral", "Fully Coral Field");
        build.add("block.minecraft.banner.border.coral", "Coral Bordure");
        build.add("block.minecraft.banner.bricks.coral", "Coral Field Masoned");
        build.add("block.minecraft.banner.circle.coral", "Coral Roundel");
        build.add("block.minecraft.banner.creeper.coral", "Coral Creeper Charge");
        build.add("block.minecraft.banner.cross.coral", "Coral Saltire");
        build.add("block.minecraft.banner.curly_border.coral", "Coral Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.coral", "Coral Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.coral", "Coral Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.coral", "Coral Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.coral", "Coral Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.coral", "Coral Flower Charge");
        build.add("block.minecraft.banner.globe.coral", "Coral Globe");
        build.add("block.minecraft.banner.gradient_up.coral", "Coral Base Gradient");
        build.add("block.minecraft.banner.gradient.coral", "Coral Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.coral", "Coral Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.coral", "Coral Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.coral", "Coral Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.coral", "Coral Per Pale");
        build.add("block.minecraft.banner.mojang.coral", "Coral Thing");
        build.add("block.minecraft.banner.piglin.coral", "Coral Snout");
        build.add("block.minecraft.banner.rhombus.coral", "Coral Lozenge");
        build.add("block.minecraft.banner.skull.coral", "Coral Skull Charge");
        build.add("block.minecraft.banner.small_stripes.coral", "Coral Paly");
        build.add("block.minecraft.banner.square_bottom_left.coral", "Coral Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.coral", "Coral Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.coral", "Coral Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.coral", "Coral Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.coral", "Coral Cross");
        build.add("block.minecraft.banner.stripe_bottom.coral", "Coral Base");
        build.add("block.minecraft.banner.stripe_center.coral", "Coral Pale");
        build.add("block.minecraft.banner.stripe_downleft.coral", "Coral Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.coral", "Coral Bend");
        build.add("block.minecraft.banner.stripe_left.coral", "Coral Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.coral", "Coral Fess");
        build.add("block.minecraft.banner.stripe_right.coral", "Coral Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.coral", "Coral Chief");
        build.add("block.minecraft.banner.triangle_bottom.coral", "Coral Chevron");
        build.add("block.minecraft.banner.triangle_top.coral", "Coral Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.coral", "Coral Base Indented");
        build.add("block.minecraft.banner.triangles_top.coral", "Coral Chief Indented");

        build.add("block.minecraft.banner.base.canary", "Fully Canary Field");
        build.add("block.minecraft.banner.border.canary", "Canary Bordure");
        build.add("block.minecraft.banner.bricks.canary", "Canary Field Masoned");
        build.add("block.minecraft.banner.circle.canary", "Canary Roundel");
        build.add("block.minecraft.banner.creeper.canary", "Canary Creeper Charge");
        build.add("block.minecraft.banner.cross.canary", "Canary Saltire");
        build.add("block.minecraft.banner.curly_border.canary", "Canary Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.canary", "Canary Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.canary", "Canary Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.canary", "Canary Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.canary", "Canary Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.canary", "Canary Flower Charge");
        build.add("block.minecraft.banner.globe.canary", "Canary Globe");
        build.add("block.minecraft.banner.gradient_up.canary", "Canary Base Gradient");
        build.add("block.minecraft.banner.gradient.canary", "Canary Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.canary", "Canary Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.canary", "Canary Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.canary", "Canary Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.canary", "Canary Per Pale");
        build.add("block.minecraft.banner.mojang.canary", "Canary Thing");
        build.add("block.minecraft.banner.piglin.canary", "Canary Snout");
        build.add("block.minecraft.banner.rhombus.canary", "Canary Lozenge");
        build.add("block.minecraft.banner.skull.canary", "Canary Skull Charge");
        build.add("block.minecraft.banner.small_stripes.canary", "Canary Paly");
        build.add("block.minecraft.banner.square_bottom_left.canary", "Canary Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.canary", "Canary Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.canary", "Canary Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.canary", "Canary Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.canary", "Canary Cross");
        build.add("block.minecraft.banner.stripe_bottom.canary", "Canary Base");
        build.add("block.minecraft.banner.stripe_center.canary", "Canary Pale");
        build.add("block.minecraft.banner.stripe_downleft.canary", "Canary Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.canary", "Canary Bend");
        build.add("block.minecraft.banner.stripe_left.canary", "Canary Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.canary", "Canary Fess");
        build.add("block.minecraft.banner.stripe_right.canary", "Canary Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.canary", "Canary Chief");
        build.add("block.minecraft.banner.triangle_bottom.canary", "Canary Chevron");
        build.add("block.minecraft.banner.triangle_top.canary", "Canary Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.canary", "Canary Base Indented");
        build.add("block.minecraft.banner.triangles_top.canary", "Canary Chief Indented");

        build.add("block.minecraft.banner.base.wasabi", "Fully Wasabi Field");
        build.add("block.minecraft.banner.border.wasabi", "Wasabi Bordure");
        build.add("block.minecraft.banner.bricks.wasabi", "Wasabi Field Masoned");
        build.add("block.minecraft.banner.circle.wasabi", "Wasabi Roundel");
        build.add("block.minecraft.banner.creeper.wasabi", "Wasabi Creeper Charge");
        build.add("block.minecraft.banner.cross.wasabi", "Wasabi Saltire");
        build.add("block.minecraft.banner.curly_border.wasabi", "Wasabi Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.wasabi", "Wasabi Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.wasabi", "Wasabi Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.wasabi", "Wasabi Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.wasabi", "Wasabi Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.wasabi", "Wasabi Flower Charge");
        build.add("block.minecraft.banner.globe.wasabi", "Wasabi Globe");
        build.add("block.minecraft.banner.gradient_up.wasabi", "Wasabi Base Gradient");
        build.add("block.minecraft.banner.gradient.wasabi", "Wasabi Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.wasabi", "Wasabi Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.wasabi", "Wasabi Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.wasabi", "Wasabi Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.wasabi", "Wasabi Per Pale");
        build.add("block.minecraft.banner.mojang.wasabi", "Wasabi Thing");
        build.add("block.minecraft.banner.piglin.wasabi", "Wasabi Snout");
        build.add("block.minecraft.banner.rhombus.wasabi", "Wasabi Lozenge");
        build.add("block.minecraft.banner.skull.wasabi", "Wasabi Skull Charge");
        build.add("block.minecraft.banner.small_stripes.wasabi", "Wasabi Paly");
        build.add("block.minecraft.banner.square_bottom_left.wasabi", "Wasabi Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.wasabi", "Wasabi Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.wasabi", "Wasabi Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.wasabi", "Wasabi Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.wasabi", "Wasabi Cross");
        build.add("block.minecraft.banner.stripe_bottom.wasabi", "Wasabi Base");
        build.add("block.minecraft.banner.stripe_center.wasabi", "Wasabi Pale");
        build.add("block.minecraft.banner.stripe_downleft.wasabi", "Wasabi Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.wasabi", "Wasabi Bend");
        build.add("block.minecraft.banner.stripe_left.wasabi", "Wasabi Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.wasabi", "Wasabi Fess");
        build.add("block.minecraft.banner.stripe_right.wasabi", "Wasabi Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.wasabi", "Wasabi Chief");
        build.add("block.minecraft.banner.triangle_bottom.wasabi", "Wasabi Chevron");
        build.add("block.minecraft.banner.triangle_top.wasabi", "Wasabi Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.wasabi", "Wasabi Base Indented");
        build.add("block.minecraft.banner.triangles_top.wasabi", "Wasabi Chief Indented");

        build.add("block.minecraft.banner.base.sacramento", "Fully Sacramento Field");
        build.add("block.minecraft.banner.border.sacramento", "Sacramento Bordure");
        build.add("block.minecraft.banner.bricks.sacramento", "Sacramento Field Masoned");
        build.add("block.minecraft.banner.circle.sacramento", "Sacramento Roundel");
        build.add("block.minecraft.banner.creeper.sacramento", "Sacramento Creeper Charge");
        build.add("block.minecraft.banner.cross.sacramento", "Sacramento Saltire");
        build.add("block.minecraft.banner.curly_border.sacramento", "Sacramento Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.sacramento", "Sacramento Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.sacramento", "Sacramento Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.sacramento", "Sacramento Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.sacramento", "Sacramento Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.sacramento", "Sacramento Flower Charge");
        build.add("block.minecraft.banner.globe.sacramento", "Sacramento Globe");
        build.add("block.minecraft.banner.gradient_up.sacramento", "Sacramento Base Gradient");
        build.add("block.minecraft.banner.gradient.sacramento", "Sacramento Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.sacramento", "Sacramento Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.sacramento", "Sacramento Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.sacramento", "Sacramento Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.sacramento", "Sacramento Per Pale");
        build.add("block.minecraft.banner.mojang.sacramento", "Sacramento Thing");
        build.add("block.minecraft.banner.piglin.sacramento", "Sacramento Snout");
        build.add("block.minecraft.banner.rhombus.sacramento", "Sacramento Lozenge");
        build.add("block.minecraft.banner.skull.sacramento", "Sacramento Skull Charge");
        build.add("block.minecraft.banner.small_stripes.sacramento", "Sacramento Paly");
        build.add("block.minecraft.banner.square_bottom_left.sacramento", "Sacramento Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.sacramento", "Sacramento Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.sacramento", "Sacramento Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.sacramento", "Sacramento Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.sacramento", "Sacramento Cross");
        build.add("block.minecraft.banner.stripe_bottom.sacramento", "Sacramento Base");
        build.add("block.minecraft.banner.stripe_center.sacramento", "Sacramento Pale");
        build.add("block.minecraft.banner.stripe_downleft.sacramento", "Sacramento Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.sacramento", "Sacramento Bend");
        build.add("block.minecraft.banner.stripe_left.sacramento", "Sacramento Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.sacramento", "Sacramento Fess");
        build.add("block.minecraft.banner.stripe_right.sacramento", "Sacramento Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.sacramento", "Sacramento Chief");
        build.add("block.minecraft.banner.triangle_bottom.sacramento", "Sacramento Chevron");
        build.add("block.minecraft.banner.triangle_top.sacramento", "Sacramento Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.sacramento", "Sacramento Base Indented");
        build.add("block.minecraft.banner.triangles_top.sacramento", "Sacramento Chief Indented");

        build.add("block.minecraft.banner.base.sky", "Fully Sky Field");
        build.add("block.minecraft.banner.border.sky", "Sky Bordure");
        build.add("block.minecraft.banner.bricks.sky", "Sky Field Masoned");
        build.add("block.minecraft.banner.circle.sky", "Sky Roundel");
        build.add("block.minecraft.banner.creeper.sky", "Sky Creeper Charge");
        build.add("block.minecraft.banner.cross.sky", "Sky Saltire");
        build.add("block.minecraft.banner.curly_border.sky", "Sky Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.sky", "Sky Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.sky", "Sky Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.sky", "Sky Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.sky", "Sky Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.sky", "Sky Flower Charge");
        build.add("block.minecraft.banner.globe.sky", "Sky Globe");
        build.add("block.minecraft.banner.gradient_up.sky", "Sky Base Gradient");
        build.add("block.minecraft.banner.gradient.sky", "Sky Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.sky", "Sky Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.sky", "Sky Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.sky", "Sky Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.sky", "Sky Per Pale");
        build.add("block.minecraft.banner.mojang.sky", "Sky Thing");
        build.add("block.minecraft.banner.piglin.sky", "Sky Snout");
        build.add("block.minecraft.banner.rhombus.sky", "Sky Lozenge");
        build.add("block.minecraft.banner.skull.sky", "Sky Skull Charge");
        build.add("block.minecraft.banner.small_stripes.sky", "Sky Paly");
        build.add("block.minecraft.banner.square_bottom_left.sky", "Sky Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.sky", "Sky Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.sky", "Sky Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.sky", "Sky Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.sky", "Sky Cross");
        build.add("block.minecraft.banner.stripe_bottom.sky", "Sky Base");
        build.add("block.minecraft.banner.stripe_center.sky", "Sky Pale");
        build.add("block.minecraft.banner.stripe_downleft.sky", "Sky Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.sky", "Sky Bend");
        build.add("block.minecraft.banner.stripe_left.sky", "Sky Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.sky", "Sky Fess");
        build.add("block.minecraft.banner.stripe_right.sky", "Sky Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.sky", "Sky Chief");
        build.add("block.minecraft.banner.triangle_bottom.sky", "Sky Chevron");
        build.add("block.minecraft.banner.triangle_top.sky", "Sky Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.sky", "Sky Base Indented");
        build.add("block.minecraft.banner.triangles_top.sky", "Sky Chief Indented");

        build.add("block.minecraft.banner.base.blurple", "Fully Blurple Field");
        build.add("block.minecraft.banner.border.blurple", "Blurple Bordure");
        build.add("block.minecraft.banner.bricks.blurple", "Blurple Field Masoned");
        build.add("block.minecraft.banner.circle.blurple", "Blurple Roundel");
        build.add("block.minecraft.banner.creeper.blurple", "Blurple Creeper Charge");
        build.add("block.minecraft.banner.cross.blurple", "Blurple Saltire");
        build.add("block.minecraft.banner.curly_border.blurple", "Blurple Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.blurple", "Blurple Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.blurple", "Blurple Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.blurple", "Blurple Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.blurple", "Blurple Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.blurple", "Blurple Flower Charge");
        build.add("block.minecraft.banner.globe.blurple", "Blurple Globe");
        build.add("block.minecraft.banner.gradient_up.blurple", "Blurple Base Gradient");
        build.add("block.minecraft.banner.gradient.blurple", "Blurple Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.blurple", "Blurple Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.blurple", "Blurple Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.blurple", "Blurple Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.blurple", "Blurple Per Pale");
        build.add("block.minecraft.banner.mojang.blurple", "Blurple Thing");
        build.add("block.minecraft.banner.piglin.blurple", "Blurple Snout");
        build.add("block.minecraft.banner.rhombus.blurple", "Blurple Lozenge");
        build.add("block.minecraft.banner.skull.blurple", "Blurple Skull Charge");
        build.add("block.minecraft.banner.small_stripes.blurple", "Blurple Paly");
        build.add("block.minecraft.banner.square_bottom_left.blurple", "Blurple Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.blurple", "Blurple Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.blurple", "Blurple Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.blurple", "Blurple Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.blurple", "Blurple Cross");
        build.add("block.minecraft.banner.stripe_bottom.blurple", "Blurple Base");
        build.add("block.minecraft.banner.stripe_center.blurple", "Blurple Pale");
        build.add("block.minecraft.banner.stripe_downleft.blurple", "Blurple Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.blurple", "Blurple Bend");
        build.add("block.minecraft.banner.stripe_left.blurple", "Blurple Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.blurple", "Blurple Fess");
        build.add("block.minecraft.banner.stripe_right.blurple", "Blurple Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.blurple", "Blurple Chief");
        build.add("block.minecraft.banner.triangle_bottom.blurple", "Blurple Chevron");
        build.add("block.minecraft.banner.triangle_top.blurple", "Blurple Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.blurple", "Blurple Base Indented");
        build.add("block.minecraft.banner.triangles_top.blurple", "Blurple Chief Indented");

        build.add("block.minecraft.banner.base.sangria", "Fully Sangria Field");
        build.add("block.minecraft.banner.border.sangria", "Sangria Bordure");
        build.add("block.minecraft.banner.bricks.sangria", "Sangria Field Masoned");
        build.add("block.minecraft.banner.circle.sangria", "Sangria Roundel");
        build.add("block.minecraft.banner.creeper.sangria", "Sangria Creeper Charge");
        build.add("block.minecraft.banner.cross.sangria", "Sangria Saltire");
        build.add("block.minecraft.banner.curly_border.sangria", "Sangria Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.sangria", "Sangria Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.sangria", "Sangria Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.sangria", "Sangria Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.sangria", "Sangria Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.sangria", "Sangria Flower Charge");
        build.add("block.minecraft.banner.globe.sangria", "Sangria Globe");
        build.add("block.minecraft.banner.gradient_up.sangria", "Sangria Base Gradient");
        build.add("block.minecraft.banner.gradient.sangria", "Sangria Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.sangria", "Sangria Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.sangria", "Sangria Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.sangria", "Sangria Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.sangria", "Sangria Per Pale");
        build.add("block.minecraft.banner.mojang.sangria", "Sangria Thing");
        build.add("block.minecraft.banner.piglin.sangria", "Sangria Snout");
        build.add("block.minecraft.banner.rhombus.sangria", "Sangria Lozenge");
        build.add("block.minecraft.banner.skull.sangria", "Sangria Skull Charge");
        build.add("block.minecraft.banner.small_stripes.sangria", "Sangria Paly");
        build.add("block.minecraft.banner.square_bottom_left.sangria", "Sangria Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.sangria", "Sangria Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.sangria", "Sangria Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.sangria", "Sangria Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.sangria", "Sangria Cross");
        build.add("block.minecraft.banner.stripe_bottom.sangria", "Sangria Base");
        build.add("block.minecraft.banner.stripe_center.sangria", "Sangria Pale");
        build.add("block.minecraft.banner.stripe_downleft.sangria", "Sangria Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.sangria", "Sangria Bend");
        build.add("block.minecraft.banner.stripe_left.sangria", "Sangria Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.sangria", "Sangria Fess");
        build.add("block.minecraft.banner.stripe_right.sangria", "Sangria Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.sangria", "Sangria Chief");
        build.add("block.minecraft.banner.triangle_bottom.sangria", "Sangria Chevron");
        build.add("block.minecraft.banner.triangle_top.sangria", "Sangria Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.sangria", "Sangria Base Indented");
        build.add("block.minecraft.banner.triangles_top.sangria", "Sangria Chief Indented");

        build.add("block.minecraft.banner.base.rose", "Fully Rose Field");
        build.add("block.minecraft.banner.border.rose", "Rose Bordure");
        build.add("block.minecraft.banner.bricks.rose", "Rose Field Masoned");
        build.add("block.minecraft.banner.circle.rose", "Rose Roundel");
        build.add("block.minecraft.banner.creeper.rose", "Rose Creeper Charge");
        build.add("block.minecraft.banner.cross.rose", "Rose Saltire");
        build.add("block.minecraft.banner.curly_border.rose", "Rose Bordure Indented");
        build.add("block.minecraft.banner.diagonal_left.rose", "Rose Per Bend Sinister");
        build.add("block.minecraft.banner.diagonal_right.rose", "Rose Per Bend");
        build.add("block.minecraft.banner.diagonal_up_left.rose", "Rose Per Bend Inverted");
        build.add("block.minecraft.banner.diagonal_up_right.rose", "Rose Per Bend Sinister Inverted");
        build.add("block.minecraft.banner.flower.rose", "Rose Flower Charge");
        build.add("block.minecraft.banner.globe.rose", "Rose Globe");
        build.add("block.minecraft.banner.gradient_up.rose", "Rose Base Gradient");
        build.add("block.minecraft.banner.gradient.rose", "Rose Gradient");
        build.add("block.minecraft.banner.half_horizontal_bottom.rose", "Rose Per Fess Inverted");
        build.add("block.minecraft.banner.half_horizontal.rose", "Rose Per Fess");
        build.add("block.minecraft.banner.half_vertical_right.rose", "Rose Per Pale Inverted");
        build.add("block.minecraft.banner.half_vertical.rose", "Rose Per Pale");
        build.add("block.minecraft.banner.mojang.rose", "Rose Thing");
        build.add("block.minecraft.banner.piglin.rose", "Rose Snout");
        build.add("block.minecraft.banner.rhombus.rose", "Rose Lozenge");
        build.add("block.minecraft.banner.skull.rose", "Rose Skull Charge");
        build.add("block.minecraft.banner.small_stripes.rose", "Rose Paly");
        build.add("block.minecraft.banner.square_bottom_left.rose", "Rose Base Dexter Canton");
        build.add("block.minecraft.banner.square_bottom_right.rose", "Rose Base Sinister Canton");
        build.add("block.minecraft.banner.square_top_left.rose", "Rose Chief Dexter Canton");
        build.add("block.minecraft.banner.square_top_right.rose", "Rose Chief Sinister Canton");
        build.add("block.minecraft.banner.straight_cross.rose", "Rose Cross");
        build.add("block.minecraft.banner.stripe_bottom.rose", "Rose Base");
        build.add("block.minecraft.banner.stripe_center.rose", "Rose Pale");
        build.add("block.minecraft.banner.stripe_downleft.rose", "Rose Bend Sinister");
        build.add("block.minecraft.banner.stripe_downright.rose", "Rose Bend");
        build.add("block.minecraft.banner.stripe_left.rose", "Rose Pale Dexter");
        build.add("block.minecraft.banner.stripe_middle.rose", "Rose Fess");
        build.add("block.minecraft.banner.stripe_right.rose", "Rose Pale Sinister");
        build.add("block.minecraft.banner.stripe_top.rose", "Rose Chief");
        build.add("block.minecraft.banner.triangle_bottom.rose", "Rose Chevron");
        build.add("block.minecraft.banner.triangle_top.rose", "Rose Inverted Chevron");
        build.add("block.minecraft.banner.triangles_bottom.rose", "Rose Base Indented");
        build.add("block.minecraft.banner.triangles_top.rose", "Rose Chief Indented");
    }
}
