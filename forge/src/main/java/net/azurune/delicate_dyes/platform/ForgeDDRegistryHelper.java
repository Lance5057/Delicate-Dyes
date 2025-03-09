package net.azurune.delicate_dyes.platform;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.platform.services.DDRegistryHelper;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ForgeDDRegistryHelper implements DDRegistryHelper {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(Registries.BLOCK, DelicateDyes.MOD_ID);
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(Registries.ITEM, DelicateDyes.MOD_ID);
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(Registries.MOB_EFFECT, DelicateDyes.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(Registries.ENTITY_TYPE, DelicateDyes.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(Registries.SOUND_EVENT, DelicateDyes.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DelicateDyes.MOD_ID);

    @Override
    public Supplier<Block> registerBlock(String id, Supplier<Block> block) {
        var blockRegister = BLOCK.register(id, block);
        ITEM.register(id, () -> new BlockItem(blockRegister.get(), new Item.Properties()));
        return blockRegister;
    }

    @Override
    public Supplier<Block> registerBlockWOItem(String id, Supplier<Block> block) {
        return BLOCK.register(id, block);
    }

    @Override
    public Supplier<Item> registerItem(String id, Supplier<Item> item) {
        return ITEM.register(id, item);
    }

    @Override
    public Supplier<EntityType<?>> registerEntityType(String id, Supplier<EntityType<?>> entityType) {
        return ENTITY_TYPE.register(id, entityType);
    }

    @Override
    public Supplier<SoundEvent> registerSoundEvent(String id) {
        return SOUND_EVENT.register(id, () -> SoundEvent.createVariableRangeEvent(DelicateDyes.modid(id)));
    }

    @Override
    public Supplier<MobEffect> registerEffect(String id, Supplier<MobEffect> mobEffect) {
        return MOB_EFFECT.register(id, mobEffect);
    }

    @Override
    public Supplier<CreativeModeTab> registerCreativeModeTab(String id, Supplier<CreativeModeTab> tab) {
        return CREATIVE_MODE_TAB.register(id, tab);
    }

    @Override
    public Supplier<SimpleParticleType> registerParticle(String id) {
        return null;
    }
}
