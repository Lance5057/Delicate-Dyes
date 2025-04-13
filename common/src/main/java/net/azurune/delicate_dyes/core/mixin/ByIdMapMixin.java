package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.common.util.DDUtil;
import net.minecraft.util.ByIdMap;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

//@Mixin(ByIdMap.class)
//public class ByIdMapMixin {
//
//    @Inject(method = "continuous", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/ByIdMap;createSortedArray(Ljava/util/function/ToIntFunction;[Ljava/lang/Object;)[Ljava/lang/Object;"), cancellable = true)
//    private static <T> void delicateDyes$createMap(ToIntFunction<T> valueToIdFunction, T[] values, ByIdMap.OutOfBoundsStrategy outOfBoundsHandling, CallbackInfoReturnable<IntFunction<T>> cir) {
//        if (values instanceof DyeColor[]) {
//            cir.setReturnValue(DDUtil.createIdToValueFunctionButBetterLmao(valueToIdFunction, values, outOfBoundsHandling));
//        }
//    }
//}