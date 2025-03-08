package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class FabricDelicateDyesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //TRANSLUCENT
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.CORAL_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.CORAL_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.CANARY_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.CANARY_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.WASABI_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.WASABI_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SACRAMENTO_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SKY_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SKY_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.BLURPLE_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.BLURPLE_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SANGRIA_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SANGRIA_STAINED_GLASS_PANE.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ROSE_STAINED_GLASS.value(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ROSE_STAINED_GLASS_PANE.value(), RenderType.translucent());

        //CUTOUT
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.RED_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.BLUE_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.WHITE_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.POTTED_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.POTTED_RED_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.POTTED_BLUE_ROSE.value(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.POTTED_WHITE_ROSE.value(), RenderType.cutout());
    }
}
