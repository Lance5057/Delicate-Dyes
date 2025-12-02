package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.core.init.DDLootTables;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.RunicLib;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Shearable;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(Sheep.class)
public abstract class SheepMixin extends Animal implements Shearable
{
    protected SheepMixin(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Shadow @Final
    private static EntityDataAccessor<Byte> DATA_WOOL_ID;
    @Shadow @Final private static Map<DyeColor, ItemLike> ITEM_BY_DYE;

    @Inject(method = "getDefaultLootTable", at = @At("HEAD"), cancellable = true)
    private void delicateDyes$getDefaultLootTable(CallbackInfoReturnable<ResourceKey<LootTable>> cir) {
        if (!this.isSheared() && (getColor().getId() >= DDDyeValues.CORAL.getId() || getColor().getId() <= DDDyeValues.ROSE.getId())) {
            if (this.getColor() == DDDyeValues.CORAL) {
                cir.setReturnValue(DDLootTables.SHEEP_CORAL);
            }
            if (this.getColor() == DDDyeValues.CANARY) {
                cir.setReturnValue(DDLootTables.SHEEP_CANARY);
            }
            if (this.getColor() == DDDyeValues.WASABI) {
                cir.setReturnValue(DDLootTables.SHEEP_WASABI);
            }
            if (this.getColor() == DDDyeValues.SACRAMENTO) {
                cir.setReturnValue(DDLootTables.SHEEP_SACRAMENTO);
            }
            if (this.getColor() == DDDyeValues.SKY) {
                cir.setReturnValue(DDLootTables.SHEEP_SKY);
            }
            if (this.getColor() == DDDyeValues.BLURPLE) {
                cir.setReturnValue(DDLootTables.SHEEP_BLURPLE);
            }
            if (this.getColor() == DDDyeValues.SANGRIA) {
                cir.setReturnValue(DDLootTables.SHEEP_SANGRIA);
            }
            if (this.getColor() == DDDyeValues.ROSE) {
                cir.setReturnValue(DDLootTables.SHEEP_ROSE);
            }
        }
    }

    static {
        ITEM_BY_DYE.put(DDDyeValues.CORAL, DDBlocks.CORAL_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.CANARY, DDBlocks.CANARY_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.WASABI, DDBlocks.WASABI_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.SACRAMENTO, DDBlocks.SACRAMENTO_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.SKY, DDBlocks.SKY_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.BLURPLE, DDBlocks.BLURPLE_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.SANGRIA, DDBlocks.SANGRIA_WOOL.get());
        ITEM_BY_DYE.put(DDDyeValues.ROSE, DDBlocks.ROSE_WOOL.get());
    }

    @Inject(method = "getRandomSheepColor", at = @At("HEAD"), cancellable = true)
    private static void delicateDyes$getRandomSheepColor(RandomSource random, CallbackInfoReturnable<DyeColor> cir) {
        if (random.nextInt(777) == 0) {
            cir.setReturnValue(DDDyeValues.ROSE);
        }
    }

    //    /**
//     * @reason Allowing >16 unique dye colors (128)
//     * @author ADudeCalledLeo
//     */
    @Overwrite
    public DyeColor getColor() {
        byte b = entityData.get(DATA_WOOL_ID);
        return DyeColor.byId(b & 0x7F);
    }

    //    /**
//     * @reason Allowing >16 unique dye colors (128)
//     * @author ADudeCalledLeo
//     */
    @Overwrite
    public void setColor(DyeColor color) {
        byte b = entityData.get(DATA_WOOL_ID);
        entityData.set(DATA_WOOL_ID, (byte) ((b & 0x80) | color.getId() % 0x7F));
    }

    //    /**
//     * @reason Allowing >16 unique dye colors (128)
//     * @author ADudeCalledLeo
//     */
    @Overwrite
    public boolean isSheared() {
        return (entityData.get(DATA_WOOL_ID) & 0x80) != 0;
    }

    //    /**
//     * @reason Allowing >16 unique dye colors (128)
//     * @author ADudeCalledLeo
//     */
    @Overwrite
    public void setSheared(boolean sheared) {
        byte b = entityData.get(DATA_WOOL_ID);
        entityData.set(DATA_WOOL_ID, (byte) ((b & 0x7F) | (sheared ? 0x80 : 0)));
    }
}
