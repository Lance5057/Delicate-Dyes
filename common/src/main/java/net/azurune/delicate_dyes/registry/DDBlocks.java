package net.azurune.delicate_dyes.registry;

import net.azurune.delicate_dyes.block.DDCandleCakeBlock;
import net.azurune.delicate_dyes.block.DDShulkerBoxBlock;
import net.azurune.delicate_dyes.platform.Services;
import net.azurune.delicate_dyes.util.DDDyeValue;
import net.azurune.delicate_dyes.util.DDProperties;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class DDBlocks {
    //CORAL
    public static final Holder<Block> CORAL_WOOL = register("coral_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_CARPET = register("coral_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_STAINED_GLASS = register("coral_stained_glass", () -> new StainedGlassBlock(DDDyeValue.CORAL, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_STAINED_GLASS_PANE = register("coral_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.CORAL, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_TERRACOTTA = register("coral_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_GLAZED_TERRACOTTA = register("coral_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_CONCRETE = register("coral_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_CONCRETE_POWDER = register("coral_concrete_powder", () -> new ConcretePowderBlock(CORAL_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_CANDLE = register("coral_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_CANDLE_CAKE = registerWOItem("coral_candle_cake", () -> new DDCandleCakeBlock(CORAL_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_BANNER = registerWOItem("coral_banner", () -> new BannerBlock(DDDyeValue.CORAL, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_WALL_BANNER = registerWOItem("coral_wall_banner", () -> new WallBannerBlock(DDDyeValue.CORAL, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.CORAL.getMapColor())));
    public static final Holder<Block> CORAL_BED = registerWOItem("coral_bed", () -> new BedBlock(DDDyeValue.CORAL, DDProperties.BlockP.BED.mapColor(DDDyeValue.CORAL.getMapColor())));
    //public static final Holder<Block> CORAL_SHULKER_BOX = register("coral_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.CORAL, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.CORAL.getMapColor())));

    //CANARY
    public static final Holder<Block> CANARY_WOOL = register("canary_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_CARPET = register("canary_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_STAINED_GLASS = register("canary_stained_glass", () -> new StainedGlassBlock(DDDyeValue.CANARY, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_STAINED_GLASS_PANE = register("canary_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.CANARY, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_TERRACOTTA = register("canary_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_GLAZED_TERRACOTTA = register("canary_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_CONCRETE = register("canary_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_CONCRETE_POWDER = register("canary_concrete_powder", () -> new ConcretePowderBlock(CANARY_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_CANDLE = register("canary_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_CANDLE_CAKE = registerWOItem("canary_candle_cake", () -> new DDCandleCakeBlock(CANARY_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_BANNER = registerWOItem("canary_banner", () -> new BannerBlock(DDDyeValue.CANARY, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_WALL_BANNER = registerWOItem("canary_wall_banner", () -> new WallBannerBlock(DDDyeValue.CANARY, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.CANARY.getMapColor())));
    public static final Holder<Block> CANARY_BED = registerWOItem("canary_bed", () -> new BedBlock(DDDyeValue.CANARY, DDProperties.BlockP.BED.mapColor(DDDyeValue.CANARY.getMapColor())));
    //public static final Holder<Block> CANARY_SHULKER_BOX = register("canary_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.CANARY, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.CANARY.getMapColor())));

    //WASABI
    public static final Holder<Block> WASABI_WOOL = register("wasabi_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_CARPET = register("wasabi_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_STAINED_GLASS = register("wasabi_stained_glass", () -> new StainedGlassBlock(DDDyeValue.WASABI, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_STAINED_GLASS_PANE = register("wasabi_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.WASABI, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_TERRACOTTA = register("wasabi_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_GLAZED_TERRACOTTA = register("wasabi_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_CONCRETE = register("wasabi_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_CONCRETE_POWDER = register("wasabi_concrete_powder", () -> new ConcretePowderBlock(WASABI_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_CANDLE = register("wasabi_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_CANDLE_CAKE = registerWOItem("wasabi_candle_cake", () -> new DDCandleCakeBlock(WASABI_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_BANNER = registerWOItem("wasabi_banner", () -> new BannerBlock(DDDyeValue.WASABI, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_WALL_BANNER = registerWOItem("wasabi_wall_banner", () -> new WallBannerBlock(DDDyeValue.WASABI, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.WASABI.getMapColor())));
    public static final Holder<Block> WASABI_BED = registerWOItem("wasabi_bed", () -> new BedBlock(DDDyeValue.WASABI, DDProperties.BlockP.BED.mapColor(DDDyeValue.WASABI.getMapColor())));
    //public static final Holder<Block> WASABI_SHULKER_BOX = register("wasabi_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.WASABI, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.WASABI.getMapColor())));

    //SACRAMENTO
    public static final Holder<Block> SACRAMENTO_WOOL = register("sacramento_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_CARPET = register("sacramento_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_STAINED_GLASS = register("sacramento_stained_glass", () -> new StainedGlassBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_STAINED_GLASS_PANE = register("sacramento_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_TERRACOTTA = register("sacramento_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_GLAZED_TERRACOTTA = register("sacramento_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_CONCRETE = register("sacramento_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_CONCRETE_POWDER = register("sacramento_concrete_powder", () -> new ConcretePowderBlock(SACRAMENTO_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_CANDLE = register("sacramento_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_CANDLE_CAKE = registerWOItem("sacramento_candle_cake", () -> new DDCandleCakeBlock(SACRAMENTO_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_BANNER = registerWOItem("sacramento_banner", () -> new BannerBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_WALL_BANNER = registerWOItem("sacramento_wall_banner", () -> new WallBannerBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    public static final Holder<Block> SACRAMENTO_BED = registerWOItem("sacramento_bed", () -> new BedBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.BED.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));
    //public static final Holder<Block> SACRAMENTO_SHULKER_BOX = register("sacramento_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.SACRAMENTO, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.SACRAMENTO.getMapColor())));

    //SKY
    public static final Holder<Block> SKY_WOOL = register("sky_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_CARPET = register("sky_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_STAINED_GLASS = register("sky_stained_glass", () -> new StainedGlassBlock(DDDyeValue.SKY, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_STAINED_GLASS_PANE = register("sky_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.SKY, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_TERRACOTTA = register("sky_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_GLAZED_TERRACOTTA = register("sky_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_CONCRETE = register("sky_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_CONCRETE_POWDER = register("sky_concrete_powder", () -> new ConcretePowderBlock(SKY_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_CANDLE = register("sky_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_CANDLE_CAKE = registerWOItem("sky_candle_cake", () -> new DDCandleCakeBlock(SKY_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_BANNER = registerWOItem("sky_banner", () -> new BannerBlock(DDDyeValue.SKY, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_WALL_BANNER = registerWOItem("sky_wall_banner", () -> new WallBannerBlock(DDDyeValue.SKY, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.SKY.getMapColor())));
    public static final Holder<Block> SKY_BED = registerWOItem("sky_bed", () -> new BedBlock(DDDyeValue.SKY, DDProperties.BlockP.BED.mapColor(DDDyeValue.SKY.getMapColor())));
    //public static final Holder<Block> SKY_SHULKER_BOX = register("sky_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.SKY, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.SKY.getMapColor())));

    //BLURPLE
    public static final Holder<Block> BLURPLE_WOOL = register("blurple_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_CARPET = register("blurple_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_STAINED_GLASS = register("blurple_stained_glass", () -> new StainedGlassBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_STAINED_GLASS_PANE = register("blurple_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_TERRACOTTA = register("blurple_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_GLAZED_TERRACOTTA = register("blurple_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_CONCRETE = register("blurple_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_CONCRETE_POWDER = register("blurple_concrete_powder", () -> new ConcretePowderBlock(BLURPLE_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_CANDLE = register("blurple_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_CANDLE_CAKE = registerWOItem("blurple_candle_cake", () -> new DDCandleCakeBlock(BLURPLE_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_BANNER = registerWOItem("blurple_banner", () -> new BannerBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_WALL_BANNER = registerWOItem("blurple_wall_banner", () -> new WallBannerBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    public static final Holder<Block> BLURPLE_BED = registerWOItem("blurple_bed", () -> new BedBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.BED.mapColor(DDDyeValue.BLURPLE.getMapColor())));
    //public static final Holder<Block> BLURPLE_SHULKER_BOX = register("blurple_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.BLURPLE, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.BLURPLE.getMapColor())));

    //SANGRIA
    public static final Holder<Block> SANGRIA_WOOL = register("sangria_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_CARPET = register("sangria_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_STAINED_GLASS = register("sangria_stained_glass", () -> new StainedGlassBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_STAINED_GLASS_PANE = register("sangria_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_TERRACOTTA = register("sangria_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_GLAZED_TERRACOTTA = register("sangria_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_CONCRETE = register("sangria_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_CONCRETE_POWDER = register("sangria_concrete_powder", () -> new ConcretePowderBlock(SANGRIA_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_CANDLE = register("sangria_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_CANDLE_CAKE = registerWOItem("sangria_candle_cake", () -> new DDCandleCakeBlock(SANGRIA_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_BANNER = registerWOItem("sangria_banner", () -> new BannerBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_WALL_BANNER = registerWOItem("sangria_wall_banner", () -> new WallBannerBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    public static final Holder<Block> SANGRIA_BED = registerWOItem("sangria_bed", () -> new BedBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.BED.mapColor(DDDyeValue.SANGRIA.getMapColor())));
    //public static final Holder<Block> SANGRIA_SHULKER_BOX = register("sangria_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.SANGRIA, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.SANGRIA.getMapColor())));

    //ROSE
    public static final Holder<Block> ROSE_WOOL = register("rose_wool", () -> new Block(DDProperties.BlockP.WOOL.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_CARPET = register("rose_carpet", () -> new CarpetBlock(DDProperties.BlockP.CARPET.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_STAINED_GLASS = register("rose_stained_glass", () -> new StainedGlassBlock(DDDyeValue.ROSE, DDProperties.BlockP.GLASS.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_STAINED_GLASS_PANE = register("rose_stained_glass_pane", () -> new StainedGlassPaneBlock(DDDyeValue.ROSE, DDProperties.BlockP.GLASS_PANE.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_TERRACOTTA = register("rose_terracotta", () -> new Block(DDProperties.BlockP.TERRACOTTA.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_GLAZED_TERRACOTTA = register("rose_glazed_terracotta", () -> new GlazedTerracottaBlock(DDProperties.BlockP.GLAZED_TERRACOTTA.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_CONCRETE = register("rose_concrete", () -> new Block(DDProperties.BlockP.CONCRETE.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_CONCRETE_POWDER = register("rose_concrete_powder", () -> new ConcretePowderBlock(ROSE_CONCRETE.value(), DDProperties.BlockP.CONCRETE_POWDER.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_CANDLE = register("rose_candle", () -> new CandleBlock(DDProperties.BlockP.CANDLE.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_CANDLE_CAKE = registerWOItem("rose_candle_cake", () -> new DDCandleCakeBlock(ROSE_CANDLE.value(), DDProperties.BlockP.CANDLE_CAKE.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_BANNER = registerWOItem("rose_banner", () -> new BannerBlock(DDDyeValue.ROSE, DDProperties.BlockP.BANNER.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_WALL_BANNER = registerWOItem("rose_wall_banner", () -> new WallBannerBlock(DDDyeValue.ROSE, DDProperties.BlockP.WALL_BANNER.mapColor(DDDyeValue.ROSE.getMapColor())));
    public static final Holder<Block> ROSE_BED = registerWOItem("rose_bed", () -> new BedBlock(DDDyeValue.ROSE, DDProperties.BlockP.BED.mapColor(DDDyeValue.ROSE.getMapColor())));
    //public static final Holder<Block> ROSE_SHULKER_BOX = register("rose_shulker_box", () -> new DDShulkerBoxBlock(DDDyeValue.ROSE, DDProperties.BlockP.SHULKER_BOX.mapColor(DDDyeValue.ROSE.getMapColor())));

    //MISC CONTENT
    public static final Holder<Block> ROSE = register("rose",  () -> new FlowerBlock(MobEffects.REGENERATION, 10, DDProperties.BlockP.ROSE));
    public static final Holder<Block> POTTED_ROSE = registerWOItem("potted_rose",  () -> flowerPot(ROSE));

    public static final Holder<Block> RED_ROSE = register("red_rose",  () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 20, DDProperties.BlockP.RED_ROSE));
    public static final Holder<Block> POTTED_RED_ROSE = registerWOItem("potted_red_rose",  () -> flowerPot(RED_ROSE));

    public static final Holder<Block> BLUE_ROSE = register("blue_rose",  () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 20, DDProperties.BlockP.BLUE_ROSE));
    public static final Holder<Block> POTTED_BLUE_ROSE = registerWOItem("potted_blue_rose",  () -> flowerPot(BLUE_ROSE));

    public static final Holder<Block> WHITE_ROSE = register("white_rose",  () -> new FlowerBlock(MobEffects.INVISIBILITY, 10, DDProperties.BlockP.WHITE_ROSE));
    public static final Holder<Block> POTTED_WHITE_ROSE = registerWOItem("potted_white_rose",  () -> flowerPot(WHITE_ROSE));

    private static Holder<Block> register(String id, Supplier<Block> block) {
        return Services.REGISTRY.registerBlock(id, block);
    }

    private static Holder<Block> registerWOItem(String id, Supplier<Block> block) {
        return Services.REGISTRY.registerBlockWOItem(id, block);
    }

    private static FlowerPotBlock flowerPot(Holder<Block> block, FeatureFlag... flags) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        if (flags.length > 0) {
            properties = properties.requiredFeatures(flags);
        }

        return new FlowerPotBlock(block.value(), properties);
    }

    public static void loadBlocks() {
    }
}
