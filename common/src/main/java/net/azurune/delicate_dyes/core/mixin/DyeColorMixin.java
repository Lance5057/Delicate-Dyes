package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.common.util.DDDyeValues;
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
    @SuppressWarnings("InvokerTarget")
    @Invoker("<init>")
    private static DyeColor delicateDyes$init(String dyeId, int ordinal, int id, String name, int entityColor, MapColor mapColor, int fireworkColor, int signColor) {
        throw new AssertionError();
    }

    @SuppressWarnings("ShadowTarget")
    @Shadow
    private static @Final
    @Mutable
    DyeColor[] $VALUES;

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/world/item/DyeColor;$VALUES:[Lnet/minecraft/world/item/DyeColor;", shift = At.Shift.AFTER))
    private static void delicateDyes$addDyes(CallbackInfo ci) {
        var dyes = new ArrayList<>(Arrays.asList($VALUES));
        var last = dyes.get(dyes.size() - 1);
        var i = 1;

        // Coral
        var ddye_coral = delicateDyes$init("DDYE_CORAL", last.ordinal() + i, last.ordinal() + i, "coral",
                 0xf97474, MapColor.RAW_IRON, 0xff6565, 0xff6565);
        dyes.add(ddye_coral);
        DDDyeValues.CORAL = ddye_coral;
        i++;

        // Canary
        var ddye_canary = delicateDyes$init("DDYE_CANARY", last.ordinal() + i, last.ordinal() + i, "canary",
                0xf6ee7d, MapColor.COLOR_YELLOW, 0xf3e37c, 0xf3e37c);
        dyes.add(ddye_canary);
        DDDyeValues.CANARY = ddye_canary;
        i++;

        // Wasabi
        var ddye_wasabi = delicateDyes$init("DDYE_WASABI", last.ordinal() + i, last.ordinal() + i, "wasabi",
                0xbddc79, MapColor.TERRACOTTA_LIGHT_GREEN, 0x8ecc70, 0x8ecc70);
        dyes.add(ddye_wasabi);
        DDDyeValues.WASABI = ddye_wasabi;
        i++;

        // Sacramento
        var ddye_sacramento = delicateDyes$init("DDYE_SACRAMENTO", last.ordinal() + i, last.ordinal() + i, "sacramento",
                0x287f66, MapColor.COLOR_CYAN, 0x437a6a, 0x437a6a);
        dyes.add(ddye_sacramento);
        DDDyeValues.SACRAMENTO = ddye_sacramento;
        i++;

        // Sky
        var ddye_sky = delicateDyes$init("DDYE_SKY", last.ordinal() + i, last.ordinal() + i, "sky",
                0x4bfbff, MapColor.COLOR_LIGHT_BLUE, 0x97ebf2, 0x97ebf2);
        dyes.add(ddye_sky);
        DDDyeValues.SKY = ddye_sky;
        i++;

        // Blurple
        var ddye_blurple = delicateDyes$init("DDYE_BLURPLE", last.ordinal() + i, last.ordinal() + i, "blurple",
                0x6130c8, MapColor.TERRACOTTA_BLUE, 0x614495, 0x614495);
        dyes.add(ddye_blurple);
        DDDyeValues.BLURPLE = ddye_blurple;
        i++;

        // Sangria
        var ddye_sangria = delicateDyes$init("DDYE_SANGRIA", last.ordinal() + i, last.ordinal() + i, "sangria",
                0x82125a, MapColor.TERRACOTTA_PURPLE, 0x821d5e, 0x821d5e);
        dyes.add(ddye_sangria);
        DDDyeValues.SANGRIA = ddye_sangria;
        i++;


        // Rose
        var ddye_rose = delicateDyes$init("DDYE_ROSE", last.ordinal() + i, last.ordinal() + i, "rose",
                0xc81b4f, MapColor.CRIMSON_HYPHAE, 0xbe2e59, 0xbe2e59);
        dyes.add(ddye_rose);
        DDDyeValues.ROSE = ddye_rose;
        i++;

        // Inject to array.
        $VALUES = dyes.toArray(new DyeColor[0]);
    }
}
