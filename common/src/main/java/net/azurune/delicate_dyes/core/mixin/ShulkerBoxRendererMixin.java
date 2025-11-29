package net.azurune.delicate_dyes.core.mixin;

import net.azurune.runiclib.RunicLib;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(Sheets.class)
public class ShulkerBoxRendererMixin {
    @Mutable @Shadow @Final public static List<Material> SHULKER_TEXTURE_LOCATION;

    @Shadow @Final public static ResourceLocation SHULKER_SHEET;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void delicateDyes$clinit(CallbackInfo ci) {
        var loc = new ArrayList<>(SHULKER_TEXTURE_LOCATION);
        String shulker_path = "entity/shulker/shulker_";

        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "coral")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "canary")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "wasabi")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "sacramento")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "sky")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "blurple")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "sangria")));
        loc.add(new Material(SHULKER_SHEET, RunicLib.customid("minecraft", shulker_path + "rose")));

        SHULKER_TEXTURE_LOCATION = List.copyOf(loc);
    }

//    static {
//        SHULKER_TEXTURE_LOCATION = Stream.of(
//                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray",
//                        "cyan", "purple", "blue", "brown", "green", "red", "black",
//
//                "coral", "canary", "wasabi", "sacramento", "sky", "blurple", "sangria", "rose")
//                .map((color) -> new Material(SHULKER_SHEET, new ResourceLocation("entity/shulker/shulker_" + color))).collect(ImmutableList.toImmutableList());
//    }
}
