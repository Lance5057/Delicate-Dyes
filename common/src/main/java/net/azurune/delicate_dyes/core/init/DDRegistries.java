package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.core.dispenser.ShulkerBoxDispenseBehavior;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class DDRegistries {
    public static void loadRegistries() {
        registerFlammables();
        registerCompostables();
        registerCauldronBehavior();
        registerDispenserBehavior();
    }

    public static void registerFlammables() {
        RLRegistryHelper.createFlammable(DDBlocks.CORAL_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.CORAL_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.UMBER_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.UMBER_CARPET.get(), 60, 20);

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

        RLRegistryHelper.createFlammable(DDBlocks.LAVENDER_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.LAVENDER_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.SANGRIA_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.SANGRIA_CARPET.get(), 60, 20);

        RLRegistryHelper.createFlammable(DDBlocks.ROSE_WOOL.get(), 30, 60);
        RLRegistryHelper.createFlammable(DDBlocks.ROSE_CARPET.get(), 60, 20);
    }

    public static void registerCompostables() {
        COMPOSTABLES.put(DDBlocks.ROSE.get().asItem(), 0.65F);
        COMPOSTABLES.put(DDBlocks.GOOB_BLOSSOM.get().asItem(), 0.65F);
        COMPOSTABLES.put(DDBlocks.PEACH_BELLFLOWER.get().asItem(), 0.65F);
    }

    public static void registerCauldronBehavior() {
        CauldronInteraction.WATER.map().put(DDItems.CORAL_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.UMBER_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.CANARY_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.WASABI_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.SACRAMENTO_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.SKY_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.BLURPLE_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.LAVENDER_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.SANGRIA_BANNER.get(), CauldronInteraction.BANNER);
        CauldronInteraction.WATER.map().put(DDItems.ROSE_BANNER.get(), CauldronInteraction.BANNER);

        CauldronInteraction.WATER.map().put(DDBlocks.CORAL_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.UMBER_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.CANARY_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.WASABI_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.SACRAMENTO_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.SKY_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.BLURPLE_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.LAVENDER_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.SANGRIA_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
        CauldronInteraction.WATER.map().put(DDBlocks.ROSE_SHULKER_BOX.get().asItem(), CauldronInteraction.SHULKER_BOX);
    }

    public static void registerDispenserBehavior() {
        DispenserBlock.registerBehavior(DDBlocks.CORAL_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.UMBER_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.CANARY_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.WASABI_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.SACRAMENTO_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.SKY_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.BLURPLE_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.LAVENDER_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.SANGRIA_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
        DispenserBlock.registerBehavior(DDBlocks.ROSE_SHULKER_BOX.get().asItem(), new ShulkerBoxDispenseBehavior());
    }
}
