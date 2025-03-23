package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.common.FabricItemGroupAdditions;
import net.fabricmc.api.ModInitializer;

public class FabricDelicateDyes implements ModInitializer {
    
    @Override
    public void onInitialize() {
        DelicateDyes.init();
        FabricItemGroupAdditions.modifyCreativeTabs();
    }
}
