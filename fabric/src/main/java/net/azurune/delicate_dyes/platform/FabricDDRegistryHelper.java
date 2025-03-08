package net.azurune.delicate_dyes.platform;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.platform.services.DDRegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class FabricDDRegistryHelper implements DDRegistryHelper {

    @Override
    public Holder<Block> registerBlock(String id, Supplier<Block> block) {
        var blockRegister = Registry.registerForHolder(BuiltInRegistries.BLOCK, DelicateDyes.modid(id), block.get());
        Registry.register(BuiltInRegistries.ITEM, DelicateDyes.modid(id), new BlockItem(blockRegister.value(), new Item.Properties()));
        return blockRegister;
    }

    @Override
    public Holder<Block> registerBlockWOItem(String id, Supplier<Block> block) {
        return Registry.registerForHolder(BuiltInRegistries.BLOCK, DelicateDyes.modid(id), block.get());
    }

    @Override
    public Holder<Item> registerItem(String id, Supplier<Item> item) {
        return Registry.registerForHolder(BuiltInRegistries.ITEM, DelicateDyes.modid(id), item.get());
    }

    @Override
    public <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String id, Supplier<T> blockEntitySupplier) {
        return () -> Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, DelicateDyes.modid(id), blockEntitySupplier.get());
    }

    @Override
    public Holder<EntityType<?>> registerEntityType(String id, Supplier<EntityType<?>> entityType) {
        return Registry.registerForHolder(BuiltInRegistries.ENTITY_TYPE, DelicateDyes.modid(id), entityType.get());
    }

    @Override
    public Holder<SoundEvent> registerSoundEvent(String id) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, DelicateDyes.modid(id), SoundEvent.createVariableRangeEvent(DelicateDyes.modid(id)));
    }

    @Override
    public Holder<MobEffect> registerEffect(String id, Supplier<MobEffect> mobEffect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, DelicateDyes.modid(id), mobEffect.get());
    }

    @Override
    public Holder<CreativeModeTab> registerCreativeModeTab(String id, Supplier<CreativeModeTab> tab) {
        return Registry.registerForHolder(BuiltInRegistries.CREATIVE_MODE_TAB, DelicateDyes.modid(id), tab.get());
    }
}
