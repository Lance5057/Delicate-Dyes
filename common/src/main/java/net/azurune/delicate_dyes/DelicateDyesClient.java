package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.client.renderer.RenderType;

public class DelicateDyesClient {
    public static void init() {
        // CUTOUT
        Services.loadClient().registerBlockRenderType(DDBlocks.PEACH_BELLFLOWER.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(DDBlocks.POTTED_PEACH_BELLFLOWER.get(), RenderType.cutout());

        Services.loadClient().registerBlockRenderType(DDBlocks.ROSE.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(DDBlocks.POTTED_ROSE.get(), RenderType.cutout());
    }
}
