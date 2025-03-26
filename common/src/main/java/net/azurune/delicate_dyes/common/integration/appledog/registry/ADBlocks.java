package net.azurune.delicate_dyes.common.integration.appledog.registry;

import net.azurune.delicate_dyes.common.integration.appledog.block.BlueberrycatBushBlock;
import net.azurune.delicate_dyes.common.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.common.util.DDProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ADBlocks {
    //MISC CONTENT
    public static final Supplier<Block> BLUEBERRYCAT_BUSH = register("blueberrycat_bush", () -> new BlueberrycatBushBlock(DDProperties.BlockP.BLUEBERRY_BUSH, CompatIds.APPLEDOG), false);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(CompatIds.APPLEDOG, id, block, hasItem);
    }

    public static void loadADBlocks() {
    }
}
