package net.azurune.delicate_dyes.core.platform;

import net.azurune.delicate_dyes.core.integration.common.item.IntegrationBlockItem;
import net.azurune.delicate_dyes.core.platform.services.DDRegistryHelper;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class FabricDDRegistryHelper implements DDRegistryHelper {

    @Override
    public <T extends Block> Supplier<T> registerIntegrationBlock(String modid, String id, Supplier<T> supplier, boolean hasItem) {
        T register = Registry.register(BuiltInRegistries.BLOCK, RunicLib.customid(modid, id), supplier.get());
        if (hasItem) {
            Registry.register(BuiltInRegistries.ITEM, RunicLib.customid(modid, id), new IntegrationBlockItem(register, new Item.Properties(), modid));
        }
        return () -> register;
    }
}
