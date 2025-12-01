package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDDamageTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageType;

import java.util.concurrent.CompletableFuture;

public class DDDamageTagGen extends FabricTagProvider<DamageType> {
    public DDDamageTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future)
    {
        super(output, Registries.DAMAGE_TYPE, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.tag(DamageTypeTags.NO_KNOCKBACK)
                .add(DDDamageTypes.BLUEBERRY_BUSH);
    }
}
