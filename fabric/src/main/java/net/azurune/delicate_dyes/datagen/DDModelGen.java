package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Blocks;

public class DDModelGen extends FabricModelProvider {
    public DDModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        //CORAL
        generator.createFullAndCarpetBlocks(DDBlocks.CORAL_WOOL.value(), DDBlocks.CORAL_CARPET.value());
        generator.createGlassBlocks(DDBlocks.CORAL_STAINED_GLASS.value(), DDBlocks.CORAL_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.CORAL_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.CORAL_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.CORAL_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.CORAL_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.CORAL_CANDLE.value(), DDBlocks.CORAL_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CORAL_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.CORAL_BANNER.value())
                .createWithoutBlockItem(DDBlocks.CORAL_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CORAL_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.CORAL_BED.value());

        generator.createBedItem(DDBlocks.CORAL_BED.value(), DDBlocks.CORAL_WOOL.value());
        //generator.createShulkerBox(DDBlocks.CORAL_SHULKER_BOX.value());

        //CANARY
        generator.createFullAndCarpetBlocks(DDBlocks.CANARY_WOOL.value(), DDBlocks.CANARY_CARPET.value());
        generator.createGlassBlocks(DDBlocks.CANARY_STAINED_GLASS.value(), DDBlocks.CANARY_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.CANARY_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.CANARY_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.CANARY_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.CANARY_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.CANARY_CANDLE.value(), DDBlocks.CANARY_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CANARY_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.CANARY_BANNER.value())
                .createWithoutBlockItem(DDBlocks.CANARY_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CANARY_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.CANARY_BED.value());

        generator.createBedItem(DDBlocks.CANARY_BED.value(), DDBlocks.CANARY_WOOL.value());
        //generator.createShulkerBox(DDBlocks.CANARY_SHULKER_BOX.value());

        //WASABI
        generator.createFullAndCarpetBlocks(DDBlocks.WASABI_WOOL.value(), DDBlocks.WASABI_CARPET.value());
        generator.createGlassBlocks(DDBlocks.WASABI_STAINED_GLASS.value(), DDBlocks.WASABI_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.WASABI_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.WASABI_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.WASABI_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.WASABI_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.WASABI_CANDLE.value(), DDBlocks.WASABI_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.WASABI_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.WASABI_BANNER.value())
                .createWithoutBlockItem(DDBlocks.WASABI_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.WASABI_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.WASABI_BED.value());

        generator.createBedItem(DDBlocks.WASABI_BED.value(), DDBlocks.WASABI_WOOL.value());
        //generator.createShulkerBox(DDBlocks.WASABI_SHULKER_BOX.value());

        //SACRAMENTO
        generator.createFullAndCarpetBlocks(DDBlocks.SACRAMENTO_WOOL.value(), DDBlocks.SACRAMENTO_CARPET.value());
        generator.createGlassBlocks(DDBlocks.SACRAMENTO_STAINED_GLASS.value(), DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.SACRAMENTO_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SACRAMENTO_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SACRAMENTO_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.SACRAMENTO_CANDLE.value(), DDBlocks.SACRAMENTO_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SACRAMENTO_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SACRAMENTO_BANNER.value())
                .createWithoutBlockItem(DDBlocks.SACRAMENTO_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SACRAMENTO_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SACRAMENTO_BED.value());

        generator.createBedItem(DDBlocks.SACRAMENTO_BED.value(), DDBlocks.SACRAMENTO_WOOL.value());
        //generator.createShulkerBox(DDBlocks.SACRAMENTO_SHULKER_BOX.value());

        //SKY
        generator.createFullAndCarpetBlocks(DDBlocks.SKY_WOOL.value(), DDBlocks.SKY_CARPET.value());
        generator.createGlassBlocks(DDBlocks.SKY_STAINED_GLASS.value(), DDBlocks.SKY_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.SKY_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.SKY_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SKY_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SKY_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.SKY_CANDLE.value(), DDBlocks.SKY_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SKY_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SKY_BANNER.value())
                .createWithoutBlockItem(DDBlocks.SKY_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SKY_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SKY_BED.value());

        generator.createBedItem(DDBlocks.SKY_BED.value(), DDBlocks.SKY_WOOL.value());
        //generator.createShulkerBox(DDBlocks.SKY_SHULKER_BOX.value());

        //BLURPLE
        generator.createFullAndCarpetBlocks(DDBlocks.BLURPLE_WOOL.value(), DDBlocks.BLURPLE_CARPET.value());
        generator.createGlassBlocks(DDBlocks.BLURPLE_STAINED_GLASS.value(), DDBlocks.BLURPLE_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.BLURPLE_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.BLURPLE_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.BLURPLE_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.BLURPLE_CANDLE.value(), DDBlocks.BLURPLE_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.BLURPLE_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.BLURPLE_BANNER.value())
                .createWithoutBlockItem(DDBlocks.BLURPLE_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.BLURPLE_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.BLURPLE_BED.value());

        generator.createBedItem(DDBlocks.BLURPLE_BED.value(), DDBlocks.BLURPLE_WOOL.value());
        //generator.createShulkerBox(DDBlocks.BLURPLE_SHULKER_BOX.value());

        //SANGRIA
        generator.createFullAndCarpetBlocks(DDBlocks.SANGRIA_WOOL.value(), DDBlocks.SANGRIA_CARPET.value());
        generator.createGlassBlocks(DDBlocks.SANGRIA_STAINED_GLASS.value(), DDBlocks.SANGRIA_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.SANGRIA_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SANGRIA_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SANGRIA_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.SANGRIA_CANDLE.value(), DDBlocks.SANGRIA_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SANGRIA_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SANGRIA_BANNER.value())
                .createWithoutBlockItem(DDBlocks.SANGRIA_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SANGRIA_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SANGRIA_BED.value());

        generator.createBedItem(DDBlocks.SANGRIA_BED.value(), DDBlocks.SANGRIA_WOOL.value());
        //generator.createShulkerBox(DDBlocks.SANGRIA_SHULKER_BOX.value());

        //ROSE
        generator.createFullAndCarpetBlocks(DDBlocks.ROSE_WOOL.value(), DDBlocks.ROSE_CARPET.value());
        generator.createGlassBlocks(DDBlocks.ROSE_STAINED_GLASS.value(), DDBlocks.ROSE_STAINED_GLASS_PANE.value());
        generator.createTrivialCube(DDBlocks.ROSE_TERRACOTTA.value());
        generator.createHorizontallyRotatedBlock(DDBlocks.ROSE_GLAZED_TERRACOTTA.value(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.ROSE_CONCRETE.value());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.ROSE_CONCRETE_POWDER.value());
        generator.createCandleAndCandleCake(DDBlocks.ROSE_CANDLE.value(), DDBlocks.ROSE_CANDLE_CAKE.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.ROSE_BANNER.value()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.ROSE_BANNER.value())
                .createWithoutBlockItem(DDBlocks.ROSE_WALL_BANNER.value());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.ROSE_BED.value()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.ROSE_BED.value());

        generator.createBedItem(DDBlocks.ROSE_BED.value(), DDBlocks.ROSE_WOOL.value());
        //generator.createShulkerBox(DDBlocks.ROSE_SHULKER_BOX.value());

        //MISC CONTENT
        generator.createPlant(DDBlocks.ROSE.value(), DDBlocks.POTTED_ROSE.value(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.RED_ROSE.value(), DDBlocks.POTTED_RED_ROSE.value(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.BLUE_ROSE.value(), DDBlocks.POTTED_BLUE_ROSE.value(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.WHITE_ROSE.value(), DDBlocks.POTTED_WHITE_ROSE.value(), BlockModelGenerators.TintState.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(DDItems.CORAL_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.CANARY_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.WASABI_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SACRAMENTO_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SKY_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLURPLE_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SANGRIA_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.ROSE_DYE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLUEBERRIES.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLUEBERRY_PIE.value(), ModelTemplates.FLAT_ITEM);
    }
}
