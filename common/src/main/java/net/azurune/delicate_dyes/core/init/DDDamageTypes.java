package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;

public class DDDamageTypes {

    public static final ResourceKey<DamageType> BLUEBERRY_BUSH = register("blueberry_bush");

    public static DamageSource of(Level level, ResourceKey<DamageType> key) {
        return new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(key));
    }

    private static ResourceKey<DamageType> register(String id) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, RunicLib.customid(DelicateDyes.MOD_ID, id));
    }

    public static void loadDamageTypes() {
    }

    public static void bootstrap(BootstrapContext<DamageType> context) {
        context.register(BLUEBERRY_BUSH, new DamageType("blueberryBush", 0.1F, DamageEffects.POKING));
    }
}
