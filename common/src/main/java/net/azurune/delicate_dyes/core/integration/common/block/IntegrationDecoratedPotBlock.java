package net.azurune.delicate_dyes.core.integration.common.block;

import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.DecoratedPotBlock;

public class IntegrationDecoratedPotBlock extends DecoratedPotBlock {
    private String modid;

    public IntegrationDecoratedPotBlock(Properties properties, String modid) {
        super(properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }
}
