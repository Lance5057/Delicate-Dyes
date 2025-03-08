package net.azurune.delicate_dyes.platform.services;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface RegistryHelper {
    Supplier<Block> registerBlock(String id, Supplier<Block> block);

    Supplier<Block> registerBlockWOItem(String id, Supplier<Block> block);

    Supplier<Item> registerItem(String id, Supplier<Item> item);

    Supplier<EntityType<?>> registerEntityType(String id, Supplier<EntityType<?>> entityType);

    Supplier<SoundEvent> registerSoundEvent(String id);

    Supplier<MobEffect> registerEffect(String id, Supplier<MobEffect> mobEffect);

    Supplier<CreativeModeTab> registerCreativeModeTab(String id, Supplier<CreativeModeTab> tab);

    Supplier<SimpleParticleType> registerParticle(String id);
}
