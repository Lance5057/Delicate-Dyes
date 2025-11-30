package net.azurune.delicate_dyes.datagen;

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
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class DDModelGen extends FabricModelProvider {
    public DDModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        // SINGLE FLOWERS
        generator.createPlant(DDBlocks.ROSE.get(), DDBlocks.POTTED_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.PEACH_BELLFLOWER.get(), DDBlocks.POTTED_PEACH_BELLFLOWER.get(), BlockModelGenerators.TintState.NOT_TINTED);
        // DOUBLE FLOWERS
        generator.createDoublePlant(DDBlocks.GOOB_BLOSSOM.get(), BlockModelGenerators.TintState.NOT_TINTED);
        // BLUEBERRIES
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(DDBlocks.BLUEBERRY_BUSH.get())
                .with(PropertyDispatch.property(BlockStateProperties.AGE_3).generate((integer) -> Variant.variant()
                        .with(VariantProperties.MODEL, generator.createSuffixedVariant(DDBlocks.BLUEBERRY_BUSH.get(), "_stage" + integer,
                                ModelTemplates.CROSS, TextureMapping::cross))
                        )
                )
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        // DYE
        generator.generateFlatItem(DDItems.CORAL_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.CANARY_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.BLURPLE_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.ROSE_DYE.get(), ModelTemplates.FLAT_ITEM);
        // MISC
        generator.generateFlatItem(DDItems.BLUEBERRIES.get(), ModelTemplates.FLAT_ITEM);
    }
}
