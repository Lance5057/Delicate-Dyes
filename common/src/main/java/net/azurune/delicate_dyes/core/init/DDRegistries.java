package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.core.cauldron.CauldronInteraction;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class DDRegistries {
    public static void loadRegistries() {
        registerFlammables();
        registerCompostables();
        registerCauldronBehavior();
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
        COMPOSTABLES.put(DDBlocks.GOOB_BLOSSOM.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.PEACH_BELLFLOWER.get(), 0.65F);
    }

    public static void registerCauldronBehavior() {
        CauldronInteraction.WATER.put(DDItems.CORAL_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.CANARY_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.WASABI_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.SACRAMENTO_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.SKY_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.BLURPLE_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.SANGRIA_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.put(DDItems.ROSE_BANNER.get(), CauldronInteraction.BANNER);

        CauldronInteraction.WATER.put(DDBlocks.CORAL_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.CANARY_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.WASABI_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.SACRAMENTO_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.SKY_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.BLURPLE_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.SANGRIA_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.put(DDBlocks.ROSE_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
    }
}
