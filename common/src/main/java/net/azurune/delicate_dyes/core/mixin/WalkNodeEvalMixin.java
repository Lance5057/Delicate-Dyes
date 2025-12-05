package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WalkNodeEvaluator.class)
public class WalkNodeEvalMixin {
    @Inject(method = "getPathTypeFromState", at = @At("HEAD"), cancellable = true)
    private static void delicateDyes$blueberryPathIntercept(BlockGetter level, BlockPos pos, CallbackInfoReturnable<PathType> cir) {
        BlockState blockstate = level.getBlockState(pos);
        if (blockstate.is(DDBlocks.BLUEBERRY_BUSH.get())) {
            cir.setReturnValue(PathType.DAMAGE_OTHER);
        }
    }
}
