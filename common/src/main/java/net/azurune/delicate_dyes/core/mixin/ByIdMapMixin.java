package net.azurune.delicate_dyes.core.mixin;

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