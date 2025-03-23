package net.azurune.delicate_dyes.core.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;
import java.util.stream.Stream;

@Mixin(Sheets.class)
public class ShulkerBoxRendererMixin {
    @Mutable @Shadow @Final public static List<Material> SHULKER_TEXTURE_LOCATION;

    @Shadow @Final public static ResourceLocation SHULKER_SHEET;

    static { //TODO: open up for compat with other mods
        SHULKER_TEXTURE_LOCATION = Stream.of(
                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray",
                        "cyan", "purple", "blue", "brown", "green", "red", "black",

                "coral", "canary", "wasabi", "sacramento", "sky", "blurple", "sangria", "rose")
                .map((color) -> new Material(SHULKER_SHEET, new ResourceLocation("entity/shulker/shulker_" + color))).collect(ImmutableList.toImmutableList());
    }
}
