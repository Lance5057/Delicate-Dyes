//package net.azurune.delicate_dyes.core.mixin;
//
//import net.azurune.delicate_dyes.common.util.DDDyeValues;
//import net.azurune.delicate_dyes.core.registry.DDBlocks;
//import net.minecraft.world.item.DyeColor;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.ShulkerBoxBlock;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(ShulkerBoxBlock.class)
//public class ShulkerBoxBlockMixin {
//
//    @Inject(method = "getBlockByColor", at = @At("TAIL"), cancellable = true)
//    private static void delicateDyes$getBlockByColor(DyeColor dyeColor, CallbackInfoReturnable<Block> cir) {
//        if (dyeColor == DDDyeValues.CORAL) {
//            cir.setReturnValue(DDBlocks.CORAL_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.CANARY) {
//            cir.setReturnValue(DDBlocks.CANARY_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.WASABI) {
//            cir.setReturnValue(DDBlocks.WASABI_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.SACRAMENTO) {
//            cir.setReturnValue(DDBlocks.SACRAMENTO_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.SKY) {
//            cir.setReturnValue(DDBlocks.SKY_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.BLURPLE) {
//            cir.setReturnValue(DDBlocks.BLURPLE_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.SANGRIA) {
//            cir.setReturnValue(DDBlocks.SANGRIA_SHULKER_BOX.get());
//        }
//        if (dyeColor == DDDyeValues.ROSE) {
//            cir.setReturnValue(DDBlocks.ROSE_SHULKER_BOX.get());
//        }
//    }
//}
