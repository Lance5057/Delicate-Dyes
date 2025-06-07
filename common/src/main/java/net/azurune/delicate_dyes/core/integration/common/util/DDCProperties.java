package net.azurune.delicate_dyes.core.integration.common.util;

import net.azurune.delicate_dyes.core.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class DDCProperties {
    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties DECORATED_POT = BlockBehaviour.Properties.copy(Blocks.DECORATED_POT);
        public static final BlockBehaviour.Properties ROCK_CANDY = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(1.0F, 1.5F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASS);
        public static final BlockBehaviour.Properties RADON_LAMP = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().lightLevel(state -> 15).strength(2F, 11.0F).sound(SoundType.GLASS);
        public static final BlockBehaviour.Properties BURLAP = BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.WOOL);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties ROCK_CANDY = new Item.Properties().food(FoodP.ROCK_CANDY);
    }

    public static class FoodP {
        public static final MobEffect ALEXSCAVES_SUGAR_RUSH = Services.PLATFORM.isModLoaded(CompatIds.ALEXSCAVES)
                ? BuiltInRegistries.MOB_EFFECT.get(new ResourceLocation(CompatIds.ALEXSCAVES, "sugar_rush")) : MobEffects.MOVEMENT_SPEED;

        public static final FoodProperties ROCK_CANDY = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F)
                .effect(new MobEffectInstance(ALEXSCAVES_SUGAR_RUSH, 200), 0.01F).build();
    }
}
