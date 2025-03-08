package net.azurune.delicate_dyes.platform;

import net.azurune.delicate_dyes.DelicateDyes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.azurune.delicate_dyes.platform.services.RegistryHelper;

import java.util.function.Supplier;

public class FabricRegistryHelper implements RegistryHelper {
    @Override
    public Supplier<Block> registerBlock(String id, Supplier<Block> block) {
        var blockRegister = Registry.register(BuiltInRegistries.BLOCK, DelicateDyes.modid(id), block.get());
        Registry.register(BuiltInRegistries.ITEM, DelicateDyes.modid(id), new BlockItem(blockRegister, new Item.Properties()));
        return () -> blockRegister;
    }

    @Override
    public Supplier<Block> registerBlockWOItem(String id, Supplier<Block> block) {
        return () -> Registry.register(BuiltInRegistries.BLOCK, DelicateDyes.modid(id), block.get());
    }

    @Override
    public Supplier<Item> registerItem(String id, Supplier<Item> item) {
        return () -> Registry.register(BuiltInRegistries.ITEM, DelicateDyes.modid(id), item.get());
    }

    @Override
    public Supplier<EntityType<?>> registerEntityType(String id, Supplier<EntityType<?>> entityType) {
        return () -> Registry.register(BuiltInRegistries.ENTITY_TYPE, DelicateDyes.modid(id), entityType.get());
    }

    @Override
    public Supplier<SoundEvent> registerSoundEvent(String id) {
        return () -> Registry.register(BuiltInRegistries.SOUND_EVENT, DelicateDyes.modid(id), SoundEvent.createVariableRangeEvent(DelicateDyes.modid(id)));
    }

    @Override
    public Supplier<MobEffect> registerEffect(String id, Supplier<MobEffect> mobEffect) {
        return () -> Registry.register(BuiltInRegistries.MOB_EFFECT, DelicateDyes.modid(id), mobEffect.get());
    }

    @Override
    public Supplier<CreativeModeTab> registerCreativeModeTab(String id, Supplier<CreativeModeTab> tab) {
        return () -> Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DelicateDyes.modid(id), tab.get());
    }

    @Override
    public Supplier<SimpleParticleType> registerParticle(String id) {
        return null;
    }
}
