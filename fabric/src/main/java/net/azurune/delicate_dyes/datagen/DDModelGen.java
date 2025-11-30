package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class DDModelGen extends FabricModelProvider {
    public DDModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        // SINGLE FLOWERS
        generator.createPlant(DDBlocks.ROSE.get(), DDBlocks.POTTED_ROSE.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(DDBlocks.PEACH_BELLFLOWER.get(), DDBlocks.POTTED_PEACH_BELLFLOWER.get(), BlockModelGenerators.TintState.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(DDItems.CORAL_DYE.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(DDItems.ROSE_DYE.get(), ModelTemplates.FLAT_ITEM);
    }
}
