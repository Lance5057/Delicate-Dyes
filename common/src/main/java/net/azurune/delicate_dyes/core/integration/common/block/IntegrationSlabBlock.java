package net.azurune.delicate_dyes.core.integration.common.block;

import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.SlabBlock;

public class IntegrationSlabBlock extends SlabBlock {
    private String modid;

    public IntegrationSlabBlock(Properties properties, String modid) {
        super(properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }
}
