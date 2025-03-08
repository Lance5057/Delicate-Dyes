package net.azurune.delicate_dyes.mixin;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxBlock.class)
public class ShulkerBoxBlockMixin {

    @Inject(method = "getBlockByColor", at = @At("HEAD"), cancellable = true)
    private static void delicateDyes$getBlockByColor(DyeColor dyeColor, CallbackInfoReturnable<Block> cir) {
        if (dyeColor != null && dyeColor.getId() > 15) {
            Block block;
            switch (dyeColor.getId()) {
//                case 16 -> block = DDBlocks.CORAL_SHULKER_BOX.value();
//                case 17 -> block = DDBlocks.CANARY_SHULKER_BOX.value();
//                case 18 -> block = DDBlocks.WASABI_SHULKER_BOX.value();
//                case 19 -> block = DDBlocks.SACRAMENTO_SHULKER_BOX.value();
//                case 20 -> block = DDBlocks.SKY_SHULKER_BOX.value();
//                case 21 -> block = DDBlocks.BLURPLE_SHULKER_BOX.value();
//                case 22 -> block = DDBlocks.SANGRIA_SHULKER_BOX.value();
//                case 23 -> block = DDBlocks.ROSE_SHULKER_BOX.value();
//                default -> throw new MatchException(null, null);
            }
            //cir.setReturnValue(block);
        }
        cir.setReturnValue(Blocks.SHULKER_BOX);
    }
}
