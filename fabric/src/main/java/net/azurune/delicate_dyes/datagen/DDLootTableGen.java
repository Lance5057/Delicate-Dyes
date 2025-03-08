package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BedPart;

import java.util.concurrent.CompletableFuture;

public class DDLootTableGen extends FabricBlockLootTableProvider {
    public DDLootTableGen(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //CORAL
        dropSelf(DDBlocks.CORAL_WOOL.value());
        dropSelf(DDBlocks.CORAL_CARPET.value());
        dropWhenSilkTouch(DDBlocks.CORAL_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.CORAL_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.CORAL_TERRACOTTA.value());
        dropSelf(DDBlocks.CORAL_GLAZED_TERRACOTTA.value());
        add(DDBlocks.CORAL_CANDLE.value(), createCandleDrops(DDBlocks.CORAL_CANDLE.value()));
        dropSelf(DDBlocks.CORAL_CONCRETE.value());
        dropSelf(DDBlocks.CORAL_CONCRETE_POWDER.value());
        add(DDBlocks.CORAL_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.CORAL_CANDLE.value()));
        add(DDBlocks.CORAL_BANNER.value(), createBannerDrop(DDBlocks.CORAL_BANNER.value()));
        add(DDBlocks.CORAL_WALL_BANNER.value(), createBannerDrop(DDBlocks.CORAL_WALL_BANNER.value()));
        add(DDBlocks.CORAL_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.CORAL_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.CORAL_SHULKER_BOX.value()));

        //CANARY
        dropSelf(DDBlocks.CANARY_WOOL.value());
        dropSelf(DDBlocks.CANARY_CARPET.value());
        dropWhenSilkTouch(DDBlocks.CANARY_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.CANARY_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.CANARY_TERRACOTTA.value());
        dropSelf(DDBlocks.CANARY_GLAZED_TERRACOTTA.value());
        add(DDBlocks.CANARY_CANDLE.value(), createCandleDrops(DDBlocks.CANARY_CANDLE.value()));
        dropSelf(DDBlocks.CANARY_CONCRETE.value());
        dropSelf(DDBlocks.CANARY_CONCRETE_POWDER.value());
        add(DDBlocks.CANARY_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.CANARY_CANDLE.value()));
        add(DDBlocks.CANARY_BANNER.value(), createBannerDrop(DDBlocks.CANARY_BANNER.value()));
        add(DDBlocks.CANARY_WALL_BANNER.value(), createBannerDrop(DDBlocks.CANARY_WALL_BANNER.value()));
        add(DDBlocks.CANARY_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.CANARY_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.CANARY_SHULKER_BOX.value()));

        //WASABI
        dropSelf(DDBlocks.WASABI_WOOL.value());
        dropSelf(DDBlocks.WASABI_CARPET.value());
        dropWhenSilkTouch(DDBlocks.WASABI_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.WASABI_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.WASABI_TERRACOTTA.value());
        dropSelf(DDBlocks.WASABI_GLAZED_TERRACOTTA.value());
        add(DDBlocks.WASABI_CANDLE.value(), createCandleDrops(DDBlocks.WASABI_CANDLE.value()));
        dropSelf(DDBlocks.WASABI_CONCRETE.value());
        dropSelf(DDBlocks.WASABI_CONCRETE_POWDER.value());
        add(DDBlocks.WASABI_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.WASABI_CANDLE.value()));
        add(DDBlocks.WASABI_BANNER.value(), createBannerDrop(DDBlocks.WASABI_BANNER.value()));
        add(DDBlocks.WASABI_WALL_BANNER.value(), createBannerDrop(DDBlocks.WASABI_WALL_BANNER.value()));
        add(DDBlocks.WASABI_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.WASABI_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.WASABI_SHULKER_BOX.value()));

        //SACRAMENTO
        dropSelf(DDBlocks.SACRAMENTO_WOOL.value());
        dropSelf(DDBlocks.SACRAMENTO_CARPET.value());
        dropWhenSilkTouch(DDBlocks.SACRAMENTO_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.SACRAMENTO_TERRACOTTA.value());
        dropSelf(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.value());
        add(DDBlocks.SACRAMENTO_CANDLE.value(), createCandleDrops(DDBlocks.SACRAMENTO_CANDLE.value()));
        dropSelf(DDBlocks.SACRAMENTO_CONCRETE.value());
        dropSelf(DDBlocks.SACRAMENTO_CONCRETE_POWDER.value());
        add(DDBlocks.SACRAMENTO_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.SACRAMENTO_CANDLE.value()));
        add(DDBlocks.SACRAMENTO_BANNER.value(), createBannerDrop(DDBlocks.SACRAMENTO_BANNER.value()));
        add(DDBlocks.SACRAMENTO_WALL_BANNER.value(), createBannerDrop(DDBlocks.SACRAMENTO_WALL_BANNER.value()));
        add(DDBlocks.SACRAMENTO_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SACRAMENTO_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.SACRAMENTO_SHULKER_BOX.value()));

        //SKY
        dropSelf(DDBlocks.SKY_WOOL.value());
        dropSelf(DDBlocks.SKY_CARPET.value());
        dropWhenSilkTouch(DDBlocks.SKY_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.SKY_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.SKY_TERRACOTTA.value());
        dropSelf(DDBlocks.SKY_GLAZED_TERRACOTTA.value());
        add(DDBlocks.SKY_CANDLE.value(), createCandleDrops(DDBlocks.SKY_CANDLE.value()));
        dropSelf(DDBlocks.SKY_CONCRETE.value());
        dropSelf(DDBlocks.SKY_CONCRETE_POWDER.value());
        add(DDBlocks.SKY_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.SKY_CANDLE.value()));
        add(DDBlocks.SKY_BANNER.value(), createBannerDrop(DDBlocks.SKY_BANNER.value()));
        add(DDBlocks.SKY_WALL_BANNER.value(), createBannerDrop(DDBlocks.SKY_WALL_BANNER.value()));
        add(DDBlocks.SKY_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SKY_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.SKY_SHULKER_BOX.value()));

        //BLURPLE
        dropSelf(DDBlocks.BLURPLE_WOOL.value());
        dropSelf(DDBlocks.BLURPLE_CARPET.value());
        dropWhenSilkTouch(DDBlocks.BLURPLE_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.BLURPLE_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.BLURPLE_TERRACOTTA.value());
        dropSelf(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.value());
        add(DDBlocks.BLURPLE_CANDLE.value(), createCandleDrops(DDBlocks.BLURPLE_CANDLE.value()));
        dropSelf(DDBlocks.BLURPLE_CONCRETE.value());
        dropSelf(DDBlocks.BLURPLE_CONCRETE_POWDER.value());
        add(DDBlocks.BLURPLE_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.BLURPLE_CANDLE.value()));
        add(DDBlocks.BLURPLE_BANNER.value(), createBannerDrop(DDBlocks.BLURPLE_BANNER.value()));
        add(DDBlocks.BLURPLE_WALL_BANNER.value(), createBannerDrop(DDBlocks.BLURPLE_WALL_BANNER.value()));
        add(DDBlocks.BLURPLE_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.BLURPLE_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.BLURPLE_SHULKER_BOX.value()));

        //SANGRIA
        dropSelf(DDBlocks.SANGRIA_WOOL.value());
        dropSelf(DDBlocks.SANGRIA_CARPET.value());
        dropWhenSilkTouch(DDBlocks.SANGRIA_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.SANGRIA_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.SANGRIA_TERRACOTTA.value());
        dropSelf(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.value());
        add(DDBlocks.SANGRIA_CANDLE.value(), createCandleDrops(DDBlocks.SANGRIA_CANDLE.value()));
        dropSelf(DDBlocks.SANGRIA_CONCRETE.value());
        dropSelf(DDBlocks.SANGRIA_CONCRETE_POWDER.value());
        add(DDBlocks.SANGRIA_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.SANGRIA_CANDLE.value()));
        add(DDBlocks.SANGRIA_BANNER.value(), createBannerDrop(DDBlocks.SANGRIA_BANNER.value()));
        add(DDBlocks.SANGRIA_WALL_BANNER.value(), createBannerDrop(DDBlocks.SANGRIA_WALL_BANNER.value()));
        add(DDBlocks.SANGRIA_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SANGRIA_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.SANGRIA_SHULKER_BOX.value()));

        //ROSE
        dropSelf(DDBlocks.ROSE_WOOL.value());
        dropSelf(DDBlocks.ROSE_CARPET.value());
        dropWhenSilkTouch(DDBlocks.ROSE_STAINED_GLASS.value());
        dropWhenSilkTouch(DDBlocks.ROSE_STAINED_GLASS_PANE.value());
        dropSelf(DDBlocks.ROSE_TERRACOTTA.value());
        dropSelf(DDBlocks.ROSE_GLAZED_TERRACOTTA.value());
        add(DDBlocks.ROSE_CANDLE.value(), createCandleDrops(DDBlocks.ROSE_CANDLE.value()));
        dropSelf(DDBlocks.ROSE_CONCRETE.value());
        dropSelf(DDBlocks.ROSE_CONCRETE_POWDER.value());
        add(DDBlocks.ROSE_CANDLE_CAKE.value(), createCandleCakeDrops(DDBlocks.ROSE_CANDLE.value()));
        add(DDBlocks.ROSE_BANNER.value(), createBannerDrop(DDBlocks.ROSE_BANNER.value()));
        add(DDBlocks.ROSE_WALL_BANNER.value(), createBannerDrop(DDBlocks.ROSE_WALL_BANNER.value()));
        add(DDBlocks.ROSE_BED.value(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.ROSE_SHULKER_BOX.value(), createShulkerBoxDrop(DDBlocks.ROSE_SHULKER_BOX.value()));

        //MISC CONTENT
        dropSelf(DDBlocks.ROSE.value());
        dropSelf(DDBlocks.RED_ROSE.value());
        dropSelf(DDBlocks.BLUE_ROSE.value());
        dropSelf(DDBlocks.WHITE_ROSE.value());
        dropPottedContents(DDBlocks.POTTED_ROSE.value());
        dropPottedContents(DDBlocks.POTTED_RED_ROSE.value());
        dropPottedContents(DDBlocks.POTTED_BLUE_ROSE.value());
        dropPottedContents(DDBlocks.POTTED_WHITE_ROSE.value());
    }
}
