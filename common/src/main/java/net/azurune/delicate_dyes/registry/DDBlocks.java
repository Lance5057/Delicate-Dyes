package net.azurune.delicate_dyes.registry;

import net.azurune.delicate_dyes.block.DDCandleCakeBlock;
import net.azurune.delicate_dyes.platform.Services;
import net.azurune.delicate_dyes.util.DDDyeValues;
import net.azurune.delicate_dyes.util.DDProperties;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class DDBlocks {
    //CORAL
    public static final Supplier<Block> CORAL_WOOL = register("coral_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_CARPET = register("coral_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_STAINED_GLASS = register("coral_stained_glass", () -> new StainedGlassBlock(DDDyeValues.CORAL, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_STAINED_GLASS_PANE = register("coral_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.CORAL, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_TERRACOTTA = register("coral_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_GLAZED_TERRACOTTA = register("coral_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_CONCRETE = register("coral_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_CONCRETE_POWDER = register("coral_concrete_powder", () -> new ConcretePowderBlock(CORAL_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_CANDLE = register("coral_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_CANDLE_CAKE = registerWOItem("coral_candle_cake", () -> new DDCandleCakeBlock(CORAL_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_BANNER = registerWOItem("coral_banner", () -> new BannerBlock(DDDyeValues.CORAL, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_WALL_BANNER = registerWOItem("coral_wall_banner", () -> new WallBannerBlock(DDDyeValues.CORAL, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.CORAL.getMapColor())));
    public static final Supplier<Block> CORAL_BED = registerWOItem("coral_bed", () -> new BedBlock(DDDyeValues.CORAL, DDProperties.BlockP.BED.mapColor(DDDyeValues.CORAL.getMapColor())));
    //public static final Supplier<Block> CORAL_SHULKER_BOX = register("coral_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.CORAL, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.CORAL.getMapColor())));

    //CANARY
    public static final Supplier<Block> CANARY_WOOL = register("canary_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_CARPET = register("canary_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_STAINED_GLASS = register("canary_stained_glass", () -> new StainedGlassBlock(DDDyeValues.CANARY, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_STAINED_GLASS_PANE = register("canary_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.CANARY, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_TERRACOTTA = register("canary_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_GLAZED_TERRACOTTA = register("canary_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_CONCRETE = register("canary_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_CONCRETE_POWDER = register("canary_concrete_powder", () -> new ConcretePowderBlock(CANARY_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_CANDLE = register("canary_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_CANDLE_CAKE = registerWOItem("canary_candle_cake", () -> new DDCandleCakeBlock(CANARY_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_BANNER = registerWOItem("canary_banner", () -> new BannerBlock(DDDyeValues.CANARY, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_WALL_BANNER = registerWOItem("canary_wall_banner", () -> new WallBannerBlock(DDDyeValues.CANARY, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.CANARY.getMapColor())));
    public static final Supplier<Block> CANARY_BED = registerWOItem("canary_bed", () -> new BedBlock(DDDyeValues.CANARY, DDProperties.BlockP.BED.mapColor(DDDyeValues.CANARY.getMapColor())));
    //public static final Supplier<Block> CANARY_SHULKER_BOX = register("canary_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.CANARY, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.CANARY.getMapColor())));

    //WASABI
    public static final Supplier<Block> WASABI_WOOL = register("wasabi_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_CARPET = register("wasabi_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_STAINED_GLASS = register("wasabi_stained_glass", () -> new StainedGlassBlock(DDDyeValues.WASABI, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_STAINED_GLASS_PANE = register("wasabi_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.WASABI, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_TERRACOTTA = register("wasabi_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_GLAZED_TERRACOTTA = register("wasabi_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_CONCRETE = register("wasabi_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_CONCRETE_POWDER = register("wasabi_concrete_powder", () -> new ConcretePowderBlock(WASABI_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_CANDLE = register("wasabi_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_CANDLE_CAKE = registerWOItem("wasabi_candle_cake", () -> new DDCandleCakeBlock(WASABI_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_BANNER = registerWOItem("wasabi_banner", () -> new BannerBlock(DDDyeValues.WASABI, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_WALL_BANNER = registerWOItem("wasabi_wall_banner", () -> new WallBannerBlock(DDDyeValues.WASABI, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.WASABI.getMapColor())));
    public static final Supplier<Block> WASABI_BED = registerWOItem("wasabi_bed", () -> new BedBlock(DDDyeValues.WASABI, DDProperties.BlockP.BED.mapColor(DDDyeValues.WASABI.getMapColor())));
    //public static final Supplier<Block> WASABI_SHULKER_BOX = register("wasabi_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.WASABI, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.WASABI.getMapColor())));

    //SACRAMENTO
    public static final Supplier<Block> SACRAMENTO_WOOL = register("sacramento_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_CARPET = register("sacramento_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_STAINED_GLASS = register("sacramento_stained_glass", () -> new StainedGlassBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_STAINED_GLASS_PANE = register("sacramento_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_TERRACOTTA = register("sacramento_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_GLAZED_TERRACOTTA = register("sacramento_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_CONCRETE = register("sacramento_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_CONCRETE_POWDER = register("sacramento_concrete_powder", () -> new ConcretePowderBlock(SACRAMENTO_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_CANDLE = register("sacramento_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_CANDLE_CAKE = registerWOItem("sacramento_candle_cake", () -> new DDCandleCakeBlock(SACRAMENTO_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_BANNER = registerWOItem("sacramento_banner", () -> new BannerBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_WALL_BANNER = registerWOItem("sacramento_wall_banner", () -> new WallBannerBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    public static final Supplier<Block> SACRAMENTO_BED = registerWOItem("sacramento_bed", () -> new BedBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.BED.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));
    //public static final Supplier<Block> SACRAMENTO_SHULKER_BOX = register("sacramento_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.SACRAMENTO, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.SACRAMENTO.getMapColor())));

    //SKY
    public static final Supplier<Block> SKY_WOOL = register("sky_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_CARPET = register("sky_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_STAINED_GLASS = register("sky_stained_glass", () -> new StainedGlassBlock(DDDyeValues.SKY, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_STAINED_GLASS_PANE = register("sky_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.SKY, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_TERRACOTTA = register("sky_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_GLAZED_TERRACOTTA = register("sky_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_CONCRETE = register("sky_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_CONCRETE_POWDER = register("sky_concrete_powder", () -> new ConcretePowderBlock(SKY_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_CANDLE = register("sky_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_CANDLE_CAKE = registerWOItem("sky_candle_cake", () -> new DDCandleCakeBlock(SKY_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_BANNER = registerWOItem("sky_banner", () -> new BannerBlock(DDDyeValues.SKY, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_WALL_BANNER = registerWOItem("sky_wall_banner", () -> new WallBannerBlock(DDDyeValues.SKY, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.SKY.getMapColor())));
    public static final Supplier<Block> SKY_BED = registerWOItem("sky_bed", () -> new BedBlock(DDDyeValues.SKY, DDProperties.BlockP.BED.mapColor(DDDyeValues.SKY.getMapColor())));
    //public static final Supplier<Block> SKY_SHULKER_BOX = register("sky_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.SKY, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.SKY.getMapColor())));

    //BLURPLE
    public static final Supplier<Block> BLURPLE_WOOL = register("blurple_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_CARPET = register("blurple_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_STAINED_GLASS = register("blurple_stained_glass", () -> new StainedGlassBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_STAINED_GLASS_PANE = register("blurple_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_TERRACOTTA = register("blurple_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_GLAZED_TERRACOTTA = register("blurple_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_CONCRETE = register("blurple_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_CONCRETE_POWDER = register("blurple_concrete_powder", () -> new ConcretePowderBlock(BLURPLE_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_CANDLE = register("blurple_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_CANDLE_CAKE = registerWOItem("blurple_candle_cake", () -> new DDCandleCakeBlock(BLURPLE_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_BANNER = registerWOItem("blurple_banner", () -> new BannerBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_WALL_BANNER = registerWOItem("blurple_wall_banner", () -> new WallBannerBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    public static final Supplier<Block> BLURPLE_BED = registerWOItem("blurple_bed", () -> new BedBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.BED.mapColor(DDDyeValues.BLURPLE.getMapColor())));
    //public static final Supplier<Block> BLURPLE_SHULKER_BOX = register("blurple_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.BLURPLE, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.BLURPLE.getMapColor())));

    //SANGRIA
    public static final Supplier<Block> SANGRIA_WOOL = register("sangria_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_CARPET = register("sangria_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_STAINED_GLASS = register("sangria_stained_glass", () -> new StainedGlassBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_STAINED_GLASS_PANE = register("sangria_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_TERRACOTTA = register("sangria_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_GLAZED_TERRACOTTA = register("sangria_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_CONCRETE = register("sangria_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_CONCRETE_POWDER = register("sangria_concrete_powder", () -> new ConcretePowderBlock(SANGRIA_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_CANDLE = register("sangria_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_CANDLE_CAKE = registerWOItem("sangria_candle_cake", () -> new DDCandleCakeBlock(SANGRIA_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_BANNER = registerWOItem("sangria_banner", () -> new BannerBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_WALL_BANNER = registerWOItem("sangria_wall_banner", () -> new WallBannerBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    public static final Supplier<Block> SANGRIA_BED = registerWOItem("sangria_bed", () -> new BedBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.BED.mapColor(DDDyeValues.SANGRIA.getMapColor())));
    //public static final Supplier<Block> SANGRIA_SHULKER_BOX = register("sangria_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.SANGRIA, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.SANGRIA.getMapColor())));

    //ROSE
    public static final Supplier<Block> ROSE_WOOL = register("rose_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_CARPET = register("rose_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_STAINED_GLASS = register("rose_stained_glass", () -> new StainedGlassBlock(DDDyeValues.ROSE, DDProperties.BlockP.GLASS.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_STAINED_GLASS_PANE = register("rose_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValues.ROSE, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_TERRACOTTA = register("rose_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_GLAZED_TERRACOTTA = register("rose_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_CONCRETE = register("rose_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_CONCRETE_POWDER = register("rose_concrete_powder", () -> new ConcretePowderBlock(ROSE_CONCRETE.get(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_CANDLE = register("rose_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_CANDLE_CAKE = registerWOItem("rose_candle_cake", () -> new DDCandleCakeBlock(ROSE_CANDLE.get(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_BANNER = registerWOItem("rose_banner", () -> new BannerBlock(DDDyeValues.ROSE, DDProperties.BlockP.BANNER.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_WALL_BANNER = registerWOItem("rose_wall_banner", () -> new WallBannerBlock(DDDyeValues.ROSE, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValues.ROSE.getMapColor())));
    public static final Supplier<Block> ROSE_BED = registerWOItem("rose_bed", () -> new BedBlock(DDDyeValues.ROSE, DDProperties.BlockP.BED.mapColor(DDDyeValues.ROSE.getMapColor())));
    //public static final Supplier<Block> ROSE_SHULKER_BOX = register("rose_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValues.ROSE, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValues.ROSE.getMapColor())));

    //MISC CONTENT
    public static final Supplier<Block> ROSE = register("rose",  () -> new FlowerBlock(MobEffects.REGENERATION, 10, DDProperties.BlockP.ROSE));
    public static final Supplier<Block> POTTED_ROSE = registerWOItem("potted_rose",  () -> flowerPot(ROSE));

    public static final Supplier<Block> RED_ROSE = register("red_rose",  () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 20, DDProperties.BlockP.RED_ROSE));
    public static final Supplier<Block> POTTED_RED_ROSE = registerWOItem("potted_red_rose",  () -> flowerPot(RED_ROSE));

    public static final Supplier<Block> BLUE_ROSE = register("blue_rose",  () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 20, DDProperties.BlockP.BLUE_ROSE));
    public static final Supplier<Block> POTTED_BLUE_ROSE = registerWOItem("potted_blue_rose",  () -> flowerPot(BLUE_ROSE));

    public static final Supplier<Block> WHITE_ROSE = register("white_rose",  () -> new FlowerBlock(MobEffects.INVISIBILITY, 10, DDProperties.BlockP.WHITE_ROSE));
    public static final Supplier<Block> POTTED_WHITE_ROSE = registerWOItem("potted_white_rose",  () -> flowerPot(WHITE_ROSE));

    private static Supplier<Block> register(String id, Supplier<Block> block) {
        return Services.REGISTRY.registerBlock(id, block);
    }

    private static Supplier<Block> registerWOItem(String id, Supplier<Block> block) {
        return Services.REGISTRY.registerBlockWOItem(id, block);
    }

    private static FlowerPotBlock flowerPot(Supplier<Block> block, FeatureFlag... flags) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        if (flags.length > 0) {
            properties = properties.requiredFeatures(flags);
        }
        return new FlowerPotBlock(block.get(), properties);
    }

    public static void loadBlocks() {
    }
}
