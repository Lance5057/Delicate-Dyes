package net.azurune.delicate_dyes.core.integration.common.item;

import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;

public class IntegrationItem extends Item {
    private String modid;

    public IntegrationItem(Properties properties, String modid) {
        super(properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }
}
