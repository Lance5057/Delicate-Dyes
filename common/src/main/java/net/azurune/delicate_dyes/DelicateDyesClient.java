package net.azurune.delicate_dyes;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.client.renderer.RenderType;

public class DelicateDyesClient {
    public static void init() {
        //CUTOUT
        //Services.loadClient().registerBlockRenderType(DDBlocks.ROSE.get(), RenderType.cutout()); //example
    }
}
