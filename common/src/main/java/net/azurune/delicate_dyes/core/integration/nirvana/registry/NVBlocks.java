package net.azurune.delicate_dyes.core.integration.nirvana.registry;

import net.azurune.delicate_dyes.core.integration.common.block.IntegrationBlock;
import net.azurune.delicate_dyes.core.integration.common.block.IntegrationGlazedTerracottaBlock;
import net.azurune.delicate_dyes.core.integration.common.block.IntegrationRotatedPillarBlock;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.integration.common.util.DDCProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class NVBlocks {
    //CORAL
    public static final Supplier<Block> CORAL_HEMP_BURLAP = register("coral_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> CORAL_WOVEN_BURLAP = register("coral_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //CANARY
    public static final Supplier<Block> CANARY_HEMP_BURLAP = register("canary_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> CANARY_WOVEN_BURLAP = register("canary_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //WASABI
    public static final Supplier<Block> WASABI_HEMP_BURLAP = register("wasabi_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> WASABI_WOVEN_BURLAP = register("wasabi_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //SACRAMENTO
    public static final Supplier<Block> SACRAMENTO_HEMP_BURLAP = register("sacramento_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> SACRAMENTO_WOVEN_BURLAP = register("sacramento_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //SKY
    public static final Supplier<Block> SKY_HEMP_BURLAP = register("sky_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> SKY_WOVEN_BURLAP = register("sky_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //BLURPLE
    public static final Supplier<Block> BLURPLE_HEMP_BURLAP = register("blurple_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> BLURPLE_WOVEN_BURLAP = register("blurple_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //SANGRIA
    public static final Supplier<Block> SANGRIA_HEMP_BURLAP = register("sangria_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> SANGRIA_WOVEN_BURLAP = register("sangria_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    //ROSE
    public static final Supplier<Block> ROSE_HEMP_BURLAP = register("rose_hemp_burlap", () -> new IntegrationGlazedTerracottaBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);
    public static final Supplier<Block> ROSE_WOVEN_BURLAP = register("rose_woven_burlap", () -> new IntegrationRotatedPillarBlock(DDCProperties.BlockP.BURLAP, CompatIds.NIRVANA), true);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(CompatIds.NIRVANA, id, block, hasItem);
    }

    public static void loadNVBlocks() {
    }
}
