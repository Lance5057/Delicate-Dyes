package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.client.renderer.RenderType;

public class DelicateDyesClient {

    public static void init() {
        //TRANSLUCENT
        RLServices.loadClient().registerBlockRenderType(DDBlocks.CORAL_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.CORAL_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.UMBER_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.UMBER_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.CANARY_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.CANARY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.WASABI_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.WASABI_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SACRAMENTO_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SKY_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SKY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.BLURPLE_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.LAVENDER_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.LAVENDER_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SANGRIA_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.ROSE_STAINED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.ROSE_STAINED_GLASS_PANE.get(), RenderType.translucent());

        //CUTOUT
        RLServices.loadClient().registerBlockRenderType(DDBlocks.PEACH_BELLFLOWER.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.POTTED_PEACH_BELLFLOWER.get(), RenderType.cutout());

        RLServices.loadClient().registerBlockRenderType(DDBlocks.ROSE.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(DDBlocks.POTTED_ROSE.get(), RenderType.cutout());

        RLServices.loadClient().registerBlockRenderType(DDBlocks.GOOB_BLOSSOM.get(), RenderType.cutout());
    }
}
