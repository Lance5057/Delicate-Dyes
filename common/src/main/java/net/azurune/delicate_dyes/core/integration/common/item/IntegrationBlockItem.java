package net.azurune.delicate_dyes.core.integration.common.item;

import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class IntegrationBlockItem extends BlockItem {
    private String modid;

    public IntegrationBlockItem(Block block, Properties properties, String modid) {
        super(block, properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }
}
