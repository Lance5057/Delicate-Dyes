package net.azurune.delicate_dyes.core.mixin;

import net.minecraft.world.level.block.BannerBlock;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.WallBannerBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void delicateDyes$isValid(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        final BlockEntityType<?> entityType = ((BlockEntityType<?>) (Object) this);

        if (entityType == BlockEntityType.BANNER && state.getBlock() instanceof BannerBlock || state.getBlock() instanceof WallBannerBlock) {
            cir.setReturnValue(true);
        }

        if (entityType == BlockEntityType.BED && state.getBlock() instanceof BedBlock) {
            cir.setReturnValue(true);
        }

//        if (entityType == BlockEntityType.SHULKER_BOX && state.getBlock() instanceof DDShulkerBoxBlock) {
//            cir.setReturnValue(true);
//        }
    }
}
