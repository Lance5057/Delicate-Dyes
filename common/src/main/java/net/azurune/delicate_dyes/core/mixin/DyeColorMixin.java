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

        // CORAL
        var DD_CORAL = delicateDyes$init("DD_CORAL", last.ordinal() + i, last.ordinal() + i, "coral",
                0xf97474, MapColor.RAW_IRON, 0xff6565, 0xff6565);
        dyes.add(DD_CORAL);
        i++;

        $VALUES = dyes.toArray(new DyeColor[0]);
    }
}
