package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.common.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.common.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class DDModelGen extends FabricModelProvider {
    public DDModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        //CORAL
        generator.createFullAndCarpetBlocks(DDBlocks.CORAL_WOOL.get(), DDBlocks.CORAL_CARPET.get());
        generator.createGlassBlocks(DDBlocks.CORAL_STAINED_GLASS.get(), DDBlocks.CORAL_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.CORAL_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.CORAL_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.CORAL_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.CORAL_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.CORAL_CANDLE.get(), DDBlocks.CORAL_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CORAL_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.CORAL_BANNER.get())
                .createWithoutBlockItem(DDBlocks.CORAL_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CORAL_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.CORAL_BED.get());

        generator.createBedItem(DDBlocks.CORAL_BED.get(), DDBlocks.CORAL_WOOL.get());
        generator.createShulkerBox(DDBlocks.CORAL_SHULKER_BOX.get());

        //CANARY
        generator.createFullAndCarpetBlocks(DDBlocks.CANARY_WOOL.get(), DDBlocks.CANARY_CARPET.get());
        generator.createGlassBlocks(DDBlocks.CANARY_STAINED_GLASS.get(), DDBlocks.CANARY_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.CANARY_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.CANARY_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.CANARY_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.CANARY_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.CANARY_CANDLE.get(), DDBlocks.CANARY_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CANARY_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.CANARY_BANNER.get())
                .createWithoutBlockItem(DDBlocks.CANARY_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.CANARY_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.CANARY_BED.get());

        generator.createBedItem(DDBlocks.CANARY_BED.get(), DDBlocks.CANARY_WOOL.get());
        generator.createShulkerBox(DDBlocks.CANARY_SHULKER_BOX.get());

        //WASABI
        generator.createFullAndCarpetBlocks(DDBlocks.WASABI_WOOL.get(), DDBlocks.WASABI_CARPET.get());
        generator.createGlassBlocks(DDBlocks.WASABI_STAINED_GLASS.get(), DDBlocks.WASABI_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.WASABI_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.WASABI_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.WASABI_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.WASABI_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.WASABI_CANDLE.get(), DDBlocks.WASABI_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.WASABI_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.WASABI_BANNER.get())
                .createWithoutBlockItem(DDBlocks.WASABI_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.WASABI_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.WASABI_BED.get());

        generator.createBedItem(DDBlocks.WASABI_BED.get(), DDBlocks.WASABI_WOOL.get());
        generator.createShulkerBox(DDBlocks.WASABI_SHULKER_BOX.get());

        //SACRAMENTO
        generator.createFullAndCarpetBlocks(DDBlocks.SACRAMENTO_WOOL.get(), DDBlocks.SACRAMENTO_CARPET.get());
        generator.createGlassBlocks(DDBlocks.SACRAMENTO_STAINED_GLASS.get(), DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.SACRAMENTO_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SACRAMENTO_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.SACRAMENTO_CANDLE.get(), DDBlocks.SACRAMENTO_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SACRAMENTO_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SACRAMENTO_BANNER.get())
                .createWithoutBlockItem(DDBlocks.SACRAMENTO_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SACRAMENTO_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SACRAMENTO_BED.get());

        generator.createBedItem(DDBlocks.SACRAMENTO_BED.get(), DDBlocks.SACRAMENTO_WOOL.get());
        generator.createShulkerBox(DDBlocks.SACRAMENTO_SHULKER_BOX.get());

        //SKY
        generator.createFullAndCarpetBlocks(DDBlocks.SKY_WOOL.get(), DDBlocks.SKY_CARPET.get());
        generator.createGlassBlocks(DDBlocks.SKY_STAINED_GLASS.get(), DDBlocks.SKY_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.SKY_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.SKY_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SKY_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SKY_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.SKY_CANDLE.get(), DDBlocks.SKY_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SKY_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SKY_BANNER.get())
                .createWithoutBlockItem(DDBlocks.SKY_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SKY_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SKY_BED.get());

        generator.createBedItem(DDBlocks.SKY_BED.get(), DDBlocks.SKY_WOOL.get());
        generator.createShulkerBox(DDBlocks.SKY_SHULKER_BOX.get());

        //BLURPLE
        generator.createFullAndCarpetBlocks(DDBlocks.BLURPLE_WOOL.get(), DDBlocks.BLURPLE_CARPET.get());
        generator.createGlassBlocks(DDBlocks.BLURPLE_STAINED_GLASS.get(), DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.BLURPLE_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.BLURPLE_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.BLURPLE_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.BLURPLE_CANDLE.get(), DDBlocks.BLURPLE_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.BLURPLE_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.BLURPLE_BANNER.get())
                .createWithoutBlockItem(DDBlocks.BLURPLE_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.BLURPLE_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.BLURPLE_BED.get());

        generator.createBedItem(DDBlocks.BLURPLE_BED.get(), DDBlocks.BLURPLE_WOOL.get());
        generator.createShulkerBox(DDBlocks.BLURPLE_SHULKER_BOX.get());

        //SANGRIA
        generator.createFullAndCarpetBlocks(DDBlocks.SANGRIA_WOOL.get(), DDBlocks.SANGRIA_CARPET.get());
        generator.createGlassBlocks(DDBlocks.SANGRIA_STAINED_GLASS.get(), DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.SANGRIA_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.SANGRIA_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.SANGRIA_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.SANGRIA_CANDLE.get(), DDBlocks.SANGRIA_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SANGRIA_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.SANGRIA_BANNER.get())
                .createWithoutBlockItem(DDBlocks.SANGRIA_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.SANGRIA_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.SANGRIA_BED.get());

        generator.createBedItem(DDBlocks.SANGRIA_BED.get(), DDBlocks.SANGRIA_WOOL.get());
        generator.createShulkerBox(DDBlocks.SANGRIA_SHULKER_BOX.get());

        //ROSE
        generator.createFullAndCarpetBlocks(DDBlocks.ROSE_WOOL.get(), DDBlocks.ROSE_CARPET.get());
        generator.createGlassBlocks(DDBlocks.ROSE_STAINED_GLASS.get(), DDBlocks.ROSE_STAINED_GLASS_PANE.get());
        generator.createTrivialCube(DDBlocks.ROSE_TERRACOTTA.get());
        generator.createHorizontallyRotatedBlock(DDBlocks.ROSE_GLAZED_TERRACOTTA.get(), TexturedModel.GLAZED_TERRACOTTA);
        generator.createTrivialCube(DDBlocks.ROSE_CONCRETE.get());
        generator.createColoredBlockWithRandomRotations(TexturedModel.CUBE, DDBlocks.ROSE_CONCRETE_POWDER.get());
        generator.createCandleAndCandleCake(DDBlocks.ROSE_CANDLE.get(), DDBlocks.ROSE_CANDLE_CAKE.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.ROSE_BANNER.get()), Blocks.OAK_PLANKS)
                .createWithCustomBlockItemModel(ModelTemplates.BANNER_INVENTORY, DDBlocks.ROSE_BANNER.get())
                .createWithoutBlockItem(DDBlocks.ROSE_WALL_BANNER.get());

        generator.blockEntityModels(ModelLocationUtils.getModelLocation(DDBlocks.ROSE_BED.get()), Blocks.OAK_PLANKS)
                .createWithoutBlockItem(DDBlocks.ROSE_BED.get());

        generator.createBedItem(DDBlocks.ROSE_BED.get(), DDBlocks.ROSE_WOOL.get());
        generator.createShulkerBox(DDBlocks.ROSE_SHULKER_BOX.get());

        //MISC CONTENT
        generator.createPlant(DDBlocks.ROSE.get(), DDBlocks.POTTED_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.RED_ROSE.get(), DDBlocks.POTTED_RED_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.BLUE_ROSE.get(), DDBlocks.POTTED_BLUE_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.WHITE_ROSE.get(), DDBlocks.POTTED_WHITE_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);

        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(DDBlocks.BLUEBERRY_BUSH.get())
                .with(PropertyDispatch.property(BlockStateProperties.AGE_3).generate((integer) -> Variant.variant()
                        .with(VariantProperties.MODEL, generator.createSuffixedVariant(DDBlocks.BLUEBERRY_BUSH.get(), "_stage" + integer,
                                ModelTemplates.CROSS, TextureMapping::cross)))));

        //COMPAT
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(ADBlocks.BLUEBERRYCAT_BUSH.get())
                .with(PropertyDispatch.property(BlockStateProperties.AGE_3).generate((integer) -> Variant.variant()
                        .with(VariantProperties.MODEL, generator.createSuffixedVariant(ADBlocks.BLUEBERRYCAT_BUSH.get(), "_stage" + integer,
                                ModelTemplates.CROSS, TextureMapping::cross)))));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(DDItems.CORAL_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.CANARY_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.WASABI_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SACRAMENTO_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SKY_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLURPLE_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.SANGRIA_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.ROSE_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLUEBERRIES.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLUEBERRY_PIE.get(), ModelTemplates.FLAT_ITEM);

        //COMPAT
        generator.generateFlatItem(ADItems.CATBLUEBERRY.get(), ModelTemplates.FLAT_ITEM);
    }
}
