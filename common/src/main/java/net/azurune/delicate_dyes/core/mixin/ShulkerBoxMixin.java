package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxBlock.class)
public abstract class ShulkerBoxMixin {
    @Inject(method = "getColoredItemStack", at = @At("HEAD"), cancellable = true)
    private static void ddye$changeForModdedBoxes(DyeColor color, CallbackInfoReturnable<ItemStack> cir) {
        if (color != null) {
            if (color == DDDyeValues.CORAL) cir.setReturnValue(new ItemStack(DDBlocks.CORAL_SHULKER_BOX.get()));
            else if (color == DDDyeValues.UMBER) cir.setReturnValue(new ItemStack(DDBlocks.UMBER_SHULKER_BOX.get()));
            else if (color == DDDyeValues.CANARY) cir.setReturnValue(new ItemStack(DDBlocks.CANARY_SHULKER_BOX.get()));
            else if (color == DDDyeValues.WASABI) cir.setReturnValue(new ItemStack(DDBlocks.WASABI_SHULKER_BOX.get()));
            else if (color == DDDyeValues.SACRAMENTO) cir.setReturnValue(new ItemStack(DDBlocks.SACRAMENTO_SHULKER_BOX.get()));
            else if (color == DDDyeValues.SKY) cir.setReturnValue(new ItemStack(DDBlocks.SKY_SHULKER_BOX.get()));
            else if (color == DDDyeValues.BLURPLE) cir.setReturnValue(new ItemStack(DDBlocks.BLURPLE_SHULKER_BOX.get()));
            else if (color == DDDyeValues.LAVENDER) cir.setReturnValue(new ItemStack(DDBlocks.LAVENDER_SHULKER_BOX.get()));
            else if (color == DDDyeValues.SANGRIA) cir.setReturnValue(new ItemStack(DDBlocks.SANGRIA_SHULKER_BOX.get()));
            else if (color == DDDyeValues.ROSE) cir.setReturnValue(new ItemStack(DDBlocks.ROSE_SHULKER_BOX.get()));
        }
    }

    @Inject(method = "getBlockByColor", at = @At("HEAD"), cancellable = true)
    private static void delicateDyes$getBlockByColor(DyeColor dyeColor, CallbackInfoReturnable<Block> cir) {
        if (dyeColor != null) {
            // NOTE: THIS CODE SHOULD NEVER BE REACHED - LEFT HERE TO PREVENT A MATCHEXCEPTION!
            if (dyeColor == DDDyeValues.CORAL) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.UMBER) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.CANARY) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.WASABI) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.SACRAMENTO) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.SKY) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.BLURPLE) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.LAVENDER) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.SANGRIA) cir.setReturnValue(Blocks.SHULKER_BOX);
            else if (dyeColor == DDDyeValues.ROSE) cir.setReturnValue(Blocks.SHULKER_BOX);
        }
    }
}
