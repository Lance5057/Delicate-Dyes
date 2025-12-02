package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MapColor;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Arrays;

@Debug(export = true)
@Mixin(DyeColor.class)
public abstract class DyeColorMixin {
    @Invoker("<init>")
    private static DyeColor delicateDyes$init(String dyeId, int ordinal, int id, String name, int entityColor, MapColor mapColor, int fireworkColor, int signColor) {
        throw new AssertionError();
    }

    @Mutable
    @Shadow
    @Final
    private static DyeColor[] $VALUES;

    @Inject(method = "<clinit>", at = @At(
            value = "FIELD",
            target = "Lnet/minecraft/world/item/DyeColor;$VALUES:[Lnet/minecraft/world/item/DyeColor;",
            shift = At.Shift.AFTER)
    )
    private static void delicateDyes$addDyes(CallbackInfo ci) {
        var dyes = new ArrayList<>(Arrays.asList($VALUES));
        var last = dyes.get(dyes.size() - 1);
        int i = 1;

        //CORAL
        var DD_CORAL = delicateDyes$init("DD_CORAL", last.ordinal() + i, last.ordinal() + i, "coral",
                0xf97474, MapColor.RAW_IRON, 0xff6565, 0xff6565);
        dyes.add(DD_CORAL);
        i++;

        //CANARY
        var DD_CANARY = delicateDyes$init("DD_CANARY", last.ordinal() + i, last.ordinal() + i, "canary",
                0xf0e76c, MapColor.COLOR_YELLOW, 0xf3e37c, 0xf3e37c);
        dyes.add(DD_CANARY);
        i++;

        //WASABI
        var DD_WASABI = delicateDyes$init("DD_WASABI", last.ordinal() + i, last.ordinal() + i, "wasabi",
                0x99c351, MapColor.TERRACOTTA_LIGHT_GREEN, 0x8ecc70, 0x8ecc70);
        dyes.add(DD_WASABI);
        i++;

        //SACRAMENTO
        var DD_SACRAMENTO = delicateDyes$init("DD_SACRAMENTO", last.ordinal() + i, last.ordinal() + i, "sacramento",
                0x287f66, MapColor.COLOR_CYAN, 0x437a6a, 0x437a6a);
        dyes.add(DD_SACRAMENTO);
        i++;

        //SKY
        var DD_SKY = delicateDyes$init("DD_SKY", last.ordinal() + i, last.ordinal() + i, "sky",
                0x4bfbff, MapColor.COLOR_LIGHT_BLUE, 0x97ebf2, 0x97ebf2);
        dyes.add(DD_SKY);
        i++;

        //BLURPLE
        var DD_BLURPLE = delicateDyes$init("DD_BLURPLE", last.ordinal() + i, last.ordinal() + i, "blurple",
                0x6130c8, MapColor.TERRACOTTA_BLUE, 0x614495, 0x614495);
        dyes.add(DD_BLURPLE);
        i++;

        //SANGRIA
        var DD_SANGRIA = delicateDyes$init("DD_SANGRIA", last.ordinal() + i, last.ordinal() + i, "sangria",
                0x82125a, MapColor.TERRACOTTA_PURPLE, 0x821d5e, 0x821d5e);
        dyes.add(DD_SANGRIA);
        i++;


        //ROSE
        var DD_ROSE = delicateDyes$init("DD_ROSE", last.ordinal() + i, last.ordinal() + i, "rose",
                0xc81b4f, MapColor.CRIMSON_HYPHAE, 0xbe2e59, 0xbe2e59);
        dyes.add(DD_ROSE);
        i++;

        $VALUES = dyes.toArray(new DyeColor[0]);
    }
}
