package net.azurune.delicate_dyes.core.integration.common.block;

import net.azurune.delicate_dyes.core.platform.Services;
import net.azurune.runiclib.common.publicized.PublicStairBlock;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.state.BlockState;

public class IntegrationStairBlock extends PublicStairBlock {
    private String modid;

    public IntegrationStairBlock(BlockState baseState, Properties properties, String modid) {
        super(baseState, properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }
}
