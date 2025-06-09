package net.azurune.delicate_dyes.core.platform.services;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface DDRegistryHelper {
    <T extends Block> Supplier<T> registerIntegrationBlock(String modid, String id, Supplier<T> supplier, boolean hasItem);
}
