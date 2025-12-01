package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.client.renderer.RenderType;

public class DelicateDyesClient {

    public static void init() {
        //TRANSLUCENT
        Services.loadClient().registerBlockRenderType(DDBlocks.CORAL_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.CORAL_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.CANARY_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.CANARY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.WASABI_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.WASABI_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SACRAMENTO_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SKY_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SKY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.BLURPLE_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SANGRIA_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.ROSE_STAINED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(DDBlocks.ROSE_STAINED_GLASS_PANE.get(), RenderType.translucent());

        //CUTOUT
        Services.loadClient().registerBlockRenderType(DDBlocks.PEACH_BELLFLOWER.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(DDBlocks.POTTED_PEACH_BELLFLOWER.get(), RenderType.cutout());

        Services.loadClient().registerBlockRenderType(DDBlocks.ROSE.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(DDBlocks.POTTED_ROSE.get(), RenderType.cutout());

        Services.loadClient().registerBlockRenderType(DDBlocks.GOOB_BLOSSOM.get(), RenderType.cutout());

        Services.loadClient().registerBlockRenderType(DDBlocks.BLUEBERRY_BUSH.get(), RenderType.cutout());
    }
}
