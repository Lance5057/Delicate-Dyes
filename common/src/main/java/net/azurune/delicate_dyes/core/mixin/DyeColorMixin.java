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

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(DyeColor.class)
public class DyeColorMixin {
    @Mutable @Shadow @Final private static DyeColor[] $VALUES;

    @Invoker("<init>")
    private static DyeColor delicateDyes$init(String dyeId, int ordinal, int id, String name, int entityColor, MapColor mapColor, int fireworkColor, int signColor) {
        throw new AssertionError();
    }

    @Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/world/item/DyeColor;$VALUES:[Lnet/minecraft/world/item/DyeColor;", shift = At.Shift.AFTER))
    private static void delicateDyes$addDyes(CallbackInfo ci) {
        ArrayList<DyeColor> dyes = new ArrayList<DyeColor>(Arrays.asList($VALUES));

        dyes.add(delicateDyes$init("CORAL", DDUtil.getDyeCount() + 1, DDUtil.getDyeCount() + 1, "coral", 0xff6565, MapColor.RAW_IRON, 0xff6565, 0xff6565));
        dyes.add(delicateDyes$init("CANARY", DDUtil.getDyeCount() + 2, DDUtil.getDyeCount() + 2, "canary", 0xf3e37c, MapColor.COLOR_YELLOW, 0xf3e37c, 0xf3e37c));
        dyes.add(delicateDyes$init("WASABI", DDUtil.getDyeCount() + 3, DDUtil.getDyeCount() + 3, "wasabi", 0x8ecc70, MapColor.TERRACOTTA_LIGHT_GREEN, 0x8ecc70, 0x8ecc70));
        dyes.add(delicateDyes$init("SACRAMENTO", DDUtil.getDyeCount() + 4, DDUtil.getDyeCount() + 4, "sacramento", 0x437a6a, MapColor.COLOR_CYAN, 0x437a6a, 0x437a6a));
        dyes.add(delicateDyes$init("SKY", DDUtil.getDyeCount() + 5, DDUtil.getDyeCount() + 5, "sky", 0x97ebf2, MapColor.COLOR_LIGHT_BLUE, 0x97ebf2, 0x97ebf2));
        dyes.add(delicateDyes$init("BLURPLE", DDUtil.getDyeCount() + 6, DDUtil.getDyeCount() + 6, "blurple", 0x614495, MapColor.TERRACOTTA_BLUE, 0x614495, 0x614495));
        dyes.add(delicateDyes$init("SANGRIA", DDUtil.getDyeCount() + 7, DDUtil.getDyeCount() + 7, "sangria", 0x821d5e, MapColor.TERRACOTTA_PURPLE, 0x821d5e, 0x821d5e));
        dyes.add(delicateDyes$init("ROSE", DDUtil.getDyeCount() + 8, DDUtil.getDyeCount() + 8, "rose", 0xbe2e59, MapColor.CRIMSON_HYPHAE, 0xbe2e59, 0xbe2e59));

        $VALUES = dyes.toArray(new DyeColor[0]);
    }
}
