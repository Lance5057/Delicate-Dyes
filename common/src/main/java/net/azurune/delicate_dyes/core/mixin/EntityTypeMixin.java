package net.azurune.delicate_dyes.core.mixin;

import com.google.common.collect.ImmutableSet;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.NodeEvaluator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityType.class)
public class EntityTypeMixin {
    @Shadow @Final private ImmutableSet<Block> immuneTo;

    @Inject(method = "isBlockDangerous", at = @At("HEAD"), cancellable = true)
    private void delicateDyes$blockDangerousInject(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (!this.immuneTo.contains(state.getBlock()) && !NodeEvaluator.isBurningBlock(state)) {
            //if (state.is(DDBlocks.BLUEBERRY_BUSH.get())) cir.setReturnValue(true);
        }
    }
}
