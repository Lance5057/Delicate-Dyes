package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BedPart;

public class DDLootTableGen extends FabricBlockLootTableProvider {
    public DDLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //CORAL
        dropSelf(DDBlocks.CORAL_WOOL.get());
        dropSelf(DDBlocks.CORAL_CARPET.get());
        dropWhenSilkTouch(DDBlocks.CORAL_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.CORAL_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.CORAL_TERRACOTTA.get());
        dropSelf(DDBlocks.CORAL_GLAZED_TERRACOTTA.get());
        add(DDBlocks.CORAL_CANDLE.get(), createCandleDrops(DDBlocks.CORAL_CANDLE.get()));
        dropSelf(DDBlocks.CORAL_CONCRETE.get());
        dropSelf(DDBlocks.CORAL_CONCRETE_POWDER.get());
        add(DDBlocks.CORAL_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.CORAL_CANDLE.get()));
        add(DDBlocks.CORAL_BANNER.get(), createBannerDrop(DDBlocks.CORAL_BANNER.get()));
        add(DDBlocks.CORAL_WALL_BANNER.get(), createBannerDrop(DDBlocks.CORAL_WALL_BANNER.get()));
        add(DDBlocks.CORAL_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.CORAL_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.CORAL_SHULKER_BOX.get()));

        //CANARY
        dropSelf(DDBlocks.CANARY_WOOL.get());
        dropSelf(DDBlocks.CANARY_CARPET.get());
        dropWhenSilkTouch(DDBlocks.CANARY_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.CANARY_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.CANARY_TERRACOTTA.get());
        dropSelf(DDBlocks.CANARY_GLAZED_TERRACOTTA.get());
        add(DDBlocks.CANARY_CANDLE.get(), createCandleDrops(DDBlocks.CANARY_CANDLE.get()));
        dropSelf(DDBlocks.CANARY_CONCRETE.get());
        dropSelf(DDBlocks.CANARY_CONCRETE_POWDER.get());
        add(DDBlocks.CANARY_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.CANARY_CANDLE.get()));
        add(DDBlocks.CANARY_BANNER.get(), createBannerDrop(DDBlocks.CANARY_BANNER.get()));
        add(DDBlocks.CANARY_WALL_BANNER.get(), createBannerDrop(DDBlocks.CANARY_WALL_BANNER.get()));
        add(DDBlocks.CANARY_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.CANARY_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.CANARY_SHULKER_BOX.get()));

        //WASABI
        dropSelf(DDBlocks.WASABI_WOOL.get());
        dropSelf(DDBlocks.WASABI_CARPET.get());
        dropWhenSilkTouch(DDBlocks.WASABI_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.WASABI_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.WASABI_TERRACOTTA.get());
        dropSelf(DDBlocks.WASABI_GLAZED_TERRACOTTA.get());
        add(DDBlocks.WASABI_CANDLE.get(), createCandleDrops(DDBlocks.WASABI_CANDLE.get()));
        dropSelf(DDBlocks.WASABI_CONCRETE.get());
        dropSelf(DDBlocks.WASABI_CONCRETE_POWDER.get());
        add(DDBlocks.WASABI_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.WASABI_CANDLE.get()));
        add(DDBlocks.WASABI_BANNER.get(), createBannerDrop(DDBlocks.WASABI_BANNER.get()));
        add(DDBlocks.WASABI_WALL_BANNER.get(), createBannerDrop(DDBlocks.WASABI_WALL_BANNER.get()));
        add(DDBlocks.WASABI_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.WASABI_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.WASABI_SHULKER_BOX.get()));

        //SACRAMENTO
        dropSelf(DDBlocks.SACRAMENTO_WOOL.get());
        dropSelf(DDBlocks.SACRAMENTO_CARPET.get());
        dropWhenSilkTouch(DDBlocks.SACRAMENTO_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.SACRAMENTO_TERRACOTTA.get());
        dropSelf(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get());
        add(DDBlocks.SACRAMENTO_CANDLE.get(), createCandleDrops(DDBlocks.SACRAMENTO_CANDLE.get()));
        dropSelf(DDBlocks.SACRAMENTO_CONCRETE.get());
        dropSelf(DDBlocks.SACRAMENTO_CONCRETE_POWDER.get());
        add(DDBlocks.SACRAMENTO_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.SACRAMENTO_CANDLE.get()));
        add(DDBlocks.SACRAMENTO_BANNER.get(), createBannerDrop(DDBlocks.SACRAMENTO_BANNER.get()));
        add(DDBlocks.SACRAMENTO_WALL_BANNER.get(), createBannerDrop(DDBlocks.SACRAMENTO_WALL_BANNER.get()));
        add(DDBlocks.SACRAMENTO_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SACRAMENTO_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.SACRAMENTO_SHULKER_BOX.get()));

        //SKY
        dropSelf(DDBlocks.SKY_WOOL.get());
        dropSelf(DDBlocks.SKY_CARPET.get());
        dropWhenSilkTouch(DDBlocks.SKY_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.SKY_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.SKY_TERRACOTTA.get());
        dropSelf(DDBlocks.SKY_GLAZED_TERRACOTTA.get());
        add(DDBlocks.SKY_CANDLE.get(), createCandleDrops(DDBlocks.SKY_CANDLE.get()));
        dropSelf(DDBlocks.SKY_CONCRETE.get());
        dropSelf(DDBlocks.SKY_CONCRETE_POWDER.get());
        add(DDBlocks.SKY_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.SKY_CANDLE.get()));
        add(DDBlocks.SKY_BANNER.get(), createBannerDrop(DDBlocks.SKY_BANNER.get()));
        add(DDBlocks.SKY_WALL_BANNER.get(), createBannerDrop(DDBlocks.SKY_WALL_BANNER.get()));
        add(DDBlocks.SKY_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SKY_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.SKY_SHULKER_BOX.get()));

        //BLURPLE
        dropSelf(DDBlocks.BLURPLE_WOOL.get());
        dropSelf(DDBlocks.BLURPLE_CARPET.get());
        dropWhenSilkTouch(DDBlocks.BLURPLE_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.BLURPLE_TERRACOTTA.get());
        dropSelf(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get());
        add(DDBlocks.BLURPLE_CANDLE.get(), createCandleDrops(DDBlocks.BLURPLE_CANDLE.get()));
        dropSelf(DDBlocks.BLURPLE_CONCRETE.get());
        dropSelf(DDBlocks.BLURPLE_CONCRETE_POWDER.get());
        add(DDBlocks.BLURPLE_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.BLURPLE_CANDLE.get()));
        add(DDBlocks.BLURPLE_BANNER.get(), createBannerDrop(DDBlocks.BLURPLE_BANNER.get()));
        add(DDBlocks.BLURPLE_WALL_BANNER.get(), createBannerDrop(DDBlocks.BLURPLE_WALL_BANNER.get()));
        add(DDBlocks.BLURPLE_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.BLURPLE_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.BLURPLE_SHULKER_BOX.get()));

        //SANGRIA
        dropSelf(DDBlocks.SANGRIA_WOOL.get());
        dropSelf(DDBlocks.SANGRIA_CARPET.get());
        dropWhenSilkTouch(DDBlocks.SANGRIA_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.SANGRIA_TERRACOTTA.get());
        dropSelf(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get());
        add(DDBlocks.SANGRIA_CANDLE.get(), createCandleDrops(DDBlocks.SANGRIA_CANDLE.get()));
        dropSelf(DDBlocks.SANGRIA_CONCRETE.get());
        dropSelf(DDBlocks.SANGRIA_CONCRETE_POWDER.get());
        add(DDBlocks.SANGRIA_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.SANGRIA_CANDLE.get()));
        add(DDBlocks.SANGRIA_BANNER.get(), createBannerDrop(DDBlocks.SANGRIA_BANNER.get()));
        add(DDBlocks.SANGRIA_WALL_BANNER.get(), createBannerDrop(DDBlocks.SANGRIA_WALL_BANNER.get()));
        add(DDBlocks.SANGRIA_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.SANGRIA_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.SANGRIA_SHULKER_BOX.get()));

        //ROSE
        dropSelf(DDBlocks.ROSE_WOOL.get());
        dropSelf(DDBlocks.ROSE_CARPET.get());
        dropWhenSilkTouch(DDBlocks.ROSE_STAINED_GLASS.get());
        dropWhenSilkTouch(DDBlocks.ROSE_STAINED_GLASS_PANE.get());
        dropSelf(DDBlocks.ROSE_TERRACOTTA.get());
        dropSelf(DDBlocks.ROSE_GLAZED_TERRACOTTA.get());
        add(DDBlocks.ROSE_CANDLE.get(), createCandleDrops(DDBlocks.ROSE_CANDLE.get()));
        dropSelf(DDBlocks.ROSE_CONCRETE.get());
        dropSelf(DDBlocks.ROSE_CONCRETE_POWDER.get());
        add(DDBlocks.ROSE_CANDLE_CAKE.get(), createCandleCakeDrops(DDBlocks.ROSE_CANDLE.get()));
        add(DDBlocks.ROSE_BANNER.get(), createBannerDrop(DDBlocks.ROSE_BANNER.get()));
        add(DDBlocks.ROSE_WALL_BANNER.get(), createBannerDrop(DDBlocks.ROSE_WALL_BANNER.get()));
        add(DDBlocks.ROSE_BED.get(), (Block b) -> createSinglePropConditionTable(b, BedBlock.PART, BedPart.HEAD));
        //add(DDBlocks.ROSE_SHULKER_BOX.get(), createShulkerBoxDrop(DDBlocks.ROSE_SHULKER_BOX.get()));

        //MISC CONTENT
        dropSelf(DDBlocks.ROSE.get());
        dropSelf(DDBlocks.RED_ROSE.get());
        dropSelf(DDBlocks.BLUE_ROSE.get());
        dropSelf(DDBlocks.WHITE_ROSE.get());
        dropPottedContents(DDBlocks.POTTED_ROSE.get());
        dropPottedContents(DDBlocks.POTTED_RED_ROSE.get());
        dropPottedContents(DDBlocks.POTTED_BLUE_ROSE.get());
        dropPottedContents(DDBlocks.POTTED_WHITE_ROSE.get());
    }
}
