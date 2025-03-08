package net.azurune.delicate_dyes.mixin;
import net.azurune.delicate_dyes.registry.DDBlocks;
import net.azurune.delicate_dyes.util.DDDyeValues;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Shearable;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(Sheep.class)
public abstract class SheepMixin extends Animal implements Shearable {
    @Shadow @Final private static EntityDataAccessor<Byte> DATA_WOOL_ID;
    @Shadow @Final private static Map<DyeColor, ItemLike> ITEM_BY_DYE;

    private SheepMixin() {
        super(EntityType.SHEEP, null);
        throw new AssertionError();
    }
//TODO
//    @Inject(method = "getDefaultLootTable", at = @At("HEAD"), cancellable = true)
//    private void delicateDyes$getDefaultLootTable(CallbackInfoReturnable<ResourceKey<LootTable>> cir) {
//        ResourceKey key;
//        if (!this.isSheared() && getColor().getId() > DDUtil.getDyeCount()) {
//            switch (this.getColor().getId()) {
//                case 16 -> key = DDLootTables.CORAL_SHEEP_ENTITY;
//                case 17 -> key = DDLootTables.CANARY_SHEEP_ENTITY;
//                case 18 -> key = DDLootTables.WASABI_SHEEP_ENTITY;
//                case 19 -> key = DDLootTables.SACRAMENTO_SHEEP_ENTITY;
//                case 20 -> key = DDLootTables.SKY_SHEEP_ENTITY;
//                case 21 -> key = DDLootTables.BLURPLE_SHEEP_ENTITY;
//                case 22 -> key = DDLootTables.SANGRIA_SHEEP_ENTITY;
//                case 23 -> key = DDLootTables.ROSE_SHEEP_ENTITY;
//                default -> throw new MatchException(null, null);
//            }
//            cir.setReturnValue(key);
//        }
//    }

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
