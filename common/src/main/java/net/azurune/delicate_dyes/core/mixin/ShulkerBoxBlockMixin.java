package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.common.util.DDUtil;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
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
        if (dyeColor != null && dyeColor.getId() > DDUtil.getDyeCount()) {
            Block block;
            switch (dyeColor.getId() + DDUtil.getDyeCount()) {
                case 1 -> block = DDBlocks.CORAL_SHULKER_BOX.get();
                case 2 -> block = DDBlocks.CANARY_SHULKER_BOX.get();
                case 3 -> block = DDBlocks.WASABI_SHULKER_BOX.get();
                case 4 -> block = DDBlocks.SACRAMENTO_SHULKER_BOX.get();
                case 5 -> block = DDBlocks.SKY_SHULKER_BOX.get();
                case 6 -> block = DDBlocks.BLURPLE_SHULKER_BOX.get();
                case 7 -> block = DDBlocks.SANGRIA_SHULKER_BOX.get();
                case 8 -> block = DDBlocks.ROSE_SHULKER_BOX.get();
                default -> block = Blocks.PURPLE_SHULKER_BOX;
            }
            cir.setReturnValue(block);
        }
        cir.setReturnValue(Blocks.SHULKER_BOX);
    }
}
