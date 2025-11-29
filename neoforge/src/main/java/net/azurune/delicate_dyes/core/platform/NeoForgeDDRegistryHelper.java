package net.azurune.delicate_dyes.core.platform;

import net.azurune.delicate_dyes.core.integration.common.item.IntegrationBlockItem;
import net.azurune.delicate_dyes.core.platform.services.DDRegistryHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NeoForgeDDRegistryHelper implements DDRegistryHelper {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    @Override
    public <T extends Block> Supplier<T> registerIntegrationBlock(String modid, String id, Supplier<T> supplier, boolean hasItem) {
        DeferredRegister<Block> blockDeferredRegister = DeferredRegister.create(Registries.BLOCK, modid);
        DeferredRegister<Item> itemDeferredRegister = DeferredRegister.create(Registries.ITEM, modid);

        var blockRegister = blockDeferredRegister.register(id, supplier);
        if (hasItem) {
            itemDeferredRegister.register(id, () -> new IntegrationBlockItem(blockRegister.get(), new Item.Properties(), modid));
        }

        blockDeferredRegister.register(modEventBus);
        itemDeferredRegister.register(modEventBus);
        return blockRegister;
    }
}
