package net.azurune.delicate_dyes.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import org.jetbrains.annotations.Nullable;

public class DDShulkerBoxBlock extends ShulkerBoxBlock {
    public DDShulkerBoxBlock(@Nullable DyeColor color, Properties properties) {
        super(color, properties);
    }
}
