package net.azurune.delicate_dyes.platform.services;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public interface DDRegistryHelper {
    Holder<Block> registerBlock(String id, Supplier<Block> block);

    Holder<Block> registerBlockWOItem(String id, Supplier<Block> block);

    Holder<Item> registerItem(String id, Supplier<Item> item);

    Holder<EntityType<?>> registerEntityType(String id, Supplier<EntityType<?>> entityType);

    Holder<SoundEvent> registerSoundEvent(String id);

    Holder<MobEffect> registerEffect(String id, Supplier<MobEffect> mobEffect);

    Holder<CreativeModeTab> registerCreativeModeTab(String id, Supplier<CreativeModeTab> tab);

    <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String id, Supplier<T> blockEntitySupplier);
}
