package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class DDRegistries {
    public static void loadRegistries() {
        registerFlammables();
        registerCompostables();
    }

    public static void registerFlammables() {
        RLRegistryHelper.createFlammable(DDBlocks.CORAL_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.CORAL_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.CANARY_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.CANARY_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.WASABI_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.WASABI_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.SACRAMENTO_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.SACRAMENTO_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.SKY_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.SKY_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.BLURPLE_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.BLURPLE_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.SANGRIA_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.SANGRIA_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.ROSE_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.ROSE_CARPET.get(), 60, 20);
    }

    public static void registerCompostables() {
        COMPOSTABLES.put(DDItems.BLUEBERRIES.get(), 0.3F);

        COMPOSTABLES.put(DDBlocks.ROSE.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.RED_ROSE.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.BLUE_ROSE.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.WHITE_ROSE.get(), 0.65F);

        COMPOSTABLES.put(DDItems.BLUEBERRY_PIE.get(), 1.0F);
    }
}
