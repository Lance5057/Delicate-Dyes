package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.common.util.DDUtil;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MapColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DyeColor.class)
public class DyeColorMixin {
    @Mutable @Shadow @Final private static DyeColor[] $VALUES;

    @Invoker("<init>")
    private static DyeColor delicateDyes$init(String dyeId, int ordinal, int id, String name, int entityColor, MapColor mapColor, int fireworkColor, int signColor) {
        throw new AssertionError();
    }

    @Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/world/item/DyeColor;$VALUES:[Lnet/minecraft/world/item/DyeColor;", shift = At.Shift.AFTER))
    private static void delicateDyes$addDyes(CallbackInfo ci) {
        int length = $VALUES.length;
        int getDyeCount = DDUtil.getDyeCount();

        DyeColor[] addDye = new DyeColor[length + 7];
        System.arraycopy($VALUES, 0, addDye, 0, length);

        addDye[length + 1] = delicateDyes$init("CORAL", getDyeCount + 1, getDyeCount + 1, "coral",
                0xff6565, MapColor.RAW_IRON, 0xff6565, 0xff6565);

        addDye[length + 2] = delicateDyes$init("CANARY", getDyeCount + 2, getDyeCount + 2, "canary",
                0xfff669, MapColor.COLOR_YELLOW, 0xf3e37c, 0xf3e37c);

        addDye[length + 3] = delicateDyes$init("WASABI", getDyeCount + 3, getDyeCount + 3, "wasabi",
                0xbcff66, MapColor.TERRACOTTA_LIGHT_GREEN, 0x8ecc70, 0x8ecc70);

        addDye[length + 4] = delicateDyes$init("SACRAMENTO", getDyeCount + 4, getDyeCount + 4, "sacramento",
                0x437a6a, MapColor.COLOR_CYAN, 0x437a6a, 0x437a6a);

        addDye[length + 5] = delicateDyes$init("SKY", getDyeCount + 5, getDyeCount + 5, "sky",
                0x81fcff, MapColor.COLOR_LIGHT_BLUE, 0x97ebf2, 0x97ebf2);

        addDye[length + 6] = delicateDyes$init("BLURPLE", getDyeCount + 6, getDyeCount + 6, "blurple",
                0x6640ab, MapColor.TERRACOTTA_BLUE, 0x614495, 0x614495);

        addDye[length + 7] = delicateDyes$init("SANGRIA", getDyeCount + 7, getDyeCount + 7, "sangria",
                0x821d5e, MapColor.TERRACOTTA_PURPLE, 0x821d5e, 0x821d5e);

        addDye[length + 8] = delicateDyes$init("ROSE", getDyeCount + 8, getDyeCount + 8, "rose",
                0xcd2b5c, MapColor.CRIMSON_HYPHAE, 0xbe2e59, 0xbe2e59);

        $VALUES = addDye;
    }
}
