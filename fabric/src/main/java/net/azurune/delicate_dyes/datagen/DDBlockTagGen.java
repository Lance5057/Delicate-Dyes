package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.integration.alexscaves.registry.AlexCBlocks;
import net.azurune.delicate_dyes.core.integration.clayworks.registry.CWBlocks;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DDBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public DDBlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWool();
        appendWoolCarpets();
        appendTerracotta();
        appendCandles();
        appendCandleCakes();
        appendBeds();
        appendBanners();
        appendPickaxeMineable();
        appendAxeMineable();
        appendDelicateBeds();
        appendShulkerBoxes();
        appendSmallFlowers();
        appendFlowerPots();
        appendSwordEfficient();
        appendBeeGrowables();
        appendFallDamageResetting();
        appendTallFlowers();
        appendWalls();
        appendPresents();
        appendMineableShear();
        appendTrappedPresents();
        appendLightableByGunpowder();
        appendAwnings();
        appendFlags();
        appendCandleHolders();
        appendCShulkerBoxes();
    }

    public void appendSwordEfficient() {
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendBeeGrowables() {
        getOrCreateTagBuilder(BlockTags.BEE_GROWABLES)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendFallDamageResetting() {
        getOrCreateTagBuilder(BlockTags.FALL_DAMAGE_RESETTING)
                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendTallFlowers() {
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(DDBlocks.GOOB_BLOSSOM.get())
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get())
                .add(DDBlocks.PEACH_BELLFLOWER.get())
        ;
    }

    public void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(DDBlocks.POTTED_ROSE.get())
                .add(DDBlocks.POTTED_PEACH_BELLFLOWER.get())
        ;
    }

    public void appendWalls() {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(CWBlocks.CORAL_TERRACOTTA_WALL.get())
                .add(CWBlocks.CORAL_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.CANARY_TERRACOTTA_WALL.get())
                .add(CWBlocks.CANARY_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.WASABI_TERRACOTTA_WALL.get())
                .add(CWBlocks.WASABI_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.SACRAMENTO_TERRACOTTA_WALL.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.SKY_TERRACOTTA_WALL.get())
                .add(CWBlocks.SKY_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.BLURPLE_TERRACOTTA_WALL.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.SANGRIA_TERRACOTTA_WALL.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_BRICK_WALL.get())

                .add(CWBlocks.ROSE_TERRACOTTA_WALL.get())
                .add(CWBlocks.ROSE_TERRACOTTA_BRICK_WALL.get())
        ;
    }

    public void appendPickaxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DDBlocks.CORAL_TERRACOTTA.get())
                .add(DDBlocks.CORAL_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.CORAL_CONCRETE.get())
                .add(DDBlocks.CORAL_SHULKER_BOX.get())
                .add(DDBlocks.CANARY_TERRACOTTA.get())
                .add(DDBlocks.CANARY_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.CANARY_CONCRETE.get())
                .add(DDBlocks.CANARY_SHULKER_BOX.get())
                .add(DDBlocks.WASABI_TERRACOTTA.get())
                .add(DDBlocks.WASABI_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.WASABI_CONCRETE.get())
                .add(DDBlocks.WASABI_SHULKER_BOX.get())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_CONCRETE.get())
                .add(DDBlocks.SACRAMENTO_SHULKER_BOX.get())
                .add(DDBlocks.SKY_TERRACOTTA.get())
                .add(DDBlocks.SKY_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SKY_CONCRETE.get())
                .add(DDBlocks.SKY_SHULKER_BOX.get())
                .add(DDBlocks.BLURPLE_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_CONCRETE.get())
                .add(DDBlocks.BLURPLE_SHULKER_BOX.get())
                .add(DDBlocks.SANGRIA_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_CONCRETE.get())
                .add(DDBlocks.SANGRIA_SHULKER_BOX.get())
                .add(DDBlocks.ROSE_TERRACOTTA.get())
                .add(DDBlocks.ROSE_GLAZED_TERRACOTTA.get())
                .add(DDBlocks.ROSE_CONCRETE.get())
                .add(DDBlocks.ROSE_SHULKER_BOX.get())
                //INTEGRATION
                .add(CWBlocks.CORAL_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.CORAL_TERRACOTTA_SLAB.get())
                .add(CWBlocks.CORAL_TERRACOTTA_WALL.get())
                .add(CWBlocks.CORAL_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.CORAL_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.CORAL_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.CORAL_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_CORAL_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.CANARY_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.CANARY_TERRACOTTA_SLAB.get())
                .add(CWBlocks.CANARY_TERRACOTTA_WALL.get())
                .add(CWBlocks.CANARY_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.CANARY_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.CANARY_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.CANARY_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_CANARY_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.WASABI_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.WASABI_TERRACOTTA_SLAB.get())
                .add(CWBlocks.WASABI_TERRACOTTA_WALL.get())
                .add(CWBlocks.WASABI_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.WASABI_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.WASABI_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.WASABI_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_WASABI_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_SLAB.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_WALL.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.SACRAMENTO_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_SACRAMENTO_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SKY_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.SKY_TERRACOTTA_SLAB.get())
                .add(CWBlocks.SKY_TERRACOTTA_WALL.get())
                .add(CWBlocks.SKY_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SKY_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.SKY_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.SKY_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_SKY_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_SLAB.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_WALL.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.BLURPLE_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_BLURPLE_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_SLAB.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_WALL.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.SANGRIA_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_SANGRIA_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.ROSE_TERRACOTTA_STAIRS.get())
                .add(CWBlocks.ROSE_TERRACOTTA_SLAB.get())
                .add(CWBlocks.ROSE_TERRACOTTA_WALL.get())
                .add(CWBlocks.ROSE_TERRACOTTA_BRICKS.get())
                .add(CWBlocks.ROSE_TERRACOTTA_BRICK_STAIRS.get())
                .add(CWBlocks.ROSE_TERRACOTTA_BRICK_SLAB.get())
                .add(CWBlocks.ROSE_TERRACOTTA_BRICK_WALL.get())
                .add(CWBlocks.CHISELED_ROSE_TERRACOTTA_BRICKS.get())
                .add(AlexCBlocks.CORAL_ROCK_CANDY.get())
                .add(AlexCBlocks.CANARY_ROCK_CANDY.get())
                .add(AlexCBlocks.WASABI_ROCK_CANDY.get())
                .add(AlexCBlocks.SACRAMENTO_ROCK_CANDY.get())
                .add(AlexCBlocks.SKY_ROCK_CANDY.get())
                .add(AlexCBlocks.BLURPLE_ROCK_CANDY.get())
                .add(AlexCBlocks.SANGRIA_ROCK_CANDY.get())
                .add(AlexCBlocks.ROSE_ROCK_CANDY.get())
                .add(AlexCBlocks.CORAL_RADON_LAMP.get())
                .add(AlexCBlocks.CANARY_RADON_LAMP.get())
                .add(AlexCBlocks.WASABI_RADON_LAMP.get())
                .add(AlexCBlocks.SACRAMENTO_RADON_LAMP.get())
                .add(AlexCBlocks.SKY_RADON_LAMP.get())
                .add(AlexCBlocks.BLURPLE_RADON_LAMP.get())
                .add(AlexCBlocks.SANGRIA_RADON_LAMP.get())
                .add(AlexCBlocks.ROSE_RADON_LAMP.get())
        ;
    }

    public void appendAxeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .addTag(DDTags.Blocks.DELICATE_BEDS)

                .add(DDBlocks.CORAL_BANNER.get())
                .add(DDBlocks.CORAL_WALL_BANNER.get())

                .add(DDBlocks.CANARY_BANNER.get())
                .add(DDBlocks.CANARY_WALL_BANNER.get())

                .add(DDBlocks.WASABI_BANNER.get())
                .add(DDBlocks.WASABI_WALL_BANNER.get())

                .add(DDBlocks.SACRAMENTO_BANNER.get())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.get())

                .add(DDBlocks.SKY_BANNER.get())
                .add(DDBlocks.SKY_WALL_BANNER.get())

                .add(DDBlocks.BLURPLE_BANNER.get())
                .add(DDBlocks.BLURPLE_WALL_BANNER.get())

                .add(DDBlocks.SANGRIA_BANNER.get())
                .add(DDBlocks.SANGRIA_WALL_BANNER.get())

                .add(DDBlocks.ROSE_BANNER.get())
                .add(DDBlocks.ROSE_WALL_BANNER.get())

                .add(DDBlocks.BLUEBERRY_BUSH.get())
        ;
    }

    public void appendDelicateBeds() {
        getOrCreateTagBuilder(DDTags.Blocks.DELICATE_BEDS)
                .add(DDBlocks.CORAL_BED.get())
                .add(DDBlocks.CANARY_BED.get())
                .add(DDBlocks.WASABI_BED.get())
                .add(DDBlocks.SACRAMENTO_BED.get())
                .add(DDBlocks.SKY_BED.get())
                .add(DDBlocks.BLURPLE_BED.get())
                .add(DDBlocks.SANGRIA_BED.get())
                .add(DDBlocks.ROSE_BED.get())
        ;
    }

    public void appendShulkerBoxes() {
        getOrCreateTagBuilder(BlockTags.SHULKER_BOXES)
                .add(DDBlocks.CORAL_SHULKER_BOX.get())
                .add(DDBlocks.CANARY_SHULKER_BOX.get())
                .add(DDBlocks.WASABI_SHULKER_BOX.get())
                .add(DDBlocks.SACRAMENTO_SHULKER_BOX.get())
                .add(DDBlocks.SKY_SHULKER_BOX.get())
                .add(DDBlocks.BLURPLE_SHULKER_BOX.get())
                .add(DDBlocks.SANGRIA_SHULKER_BOX.get())
                .add(DDBlocks.ROSE_SHULKER_BOX.get())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(BlockTags.BEDS)
                .addTag(DDTags.Blocks.DELICATE_BEDS)
        ;
    }

    public void appendCShulkerBoxes() {
        getOrCreateTagBuilder(DDTags.Blocks.SHULKER_BOXES)
                .add(DDBlocks.CORAL_SHULKER_BOX.get())
                .add(DDBlocks.CANARY_SHULKER_BOX.get())
                .add(DDBlocks.WASABI_SHULKER_BOX.get())
                .add(DDBlocks.SACRAMENTO_SHULKER_BOX.get())
                .add(DDBlocks.SKY_SHULKER_BOX.get())
                .add(DDBlocks.BLURPLE_SHULKER_BOX.get())
                .add(DDBlocks.SANGRIA_SHULKER_BOX.get())
                .add(DDBlocks.ROSE_SHULKER_BOX.get())
        ;
    }

    public void appendCandleHolders() {
        getOrCreateTagBuilder(DDTags.Blocks.CANDLE_HOLDERS)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "candle_holder_rose"))
        ;
    }

    public void appendFlags() {
        getOrCreateTagBuilder(DDTags.Blocks.FLAGS)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "flag_rose"))
        ;
    }

    public void appendAwnings() {
        getOrCreateTagBuilder(DDTags.Blocks.AWNINGS)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_rose"))
        ;
    }

    public void appendPresents() {
        getOrCreateTagBuilder(DDTags.Blocks.PRESENTS)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_rose"))
        ;
    }

    public void appendLightableByGunpowder() {
        getOrCreateTagBuilder(DDTags.Blocks.LIGHTABLE_BY_GUNPOWDER)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_rose"))
        ;
    }

    public void appendTrappedPresents() {
        getOrCreateTagBuilder(DDTags.Blocks.TRAPPED_PRESENTS)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_rose"))
        ;
    }

    public void appendMineableShear() {
        getOrCreateTagBuilder(DDTags.Blocks.MINEABLE_SHEAR)
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "present_rose"))

                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "trapped_present_rose"))

                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_coral"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_canary"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_wasabi"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sacramento"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sky"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_blurple"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_sangria"))
                .addOptional(RunicLib.customid(CompatIds.SUPPLEMENTARIES, "awning_rose"))
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(DDBlocks.CORAL_WOOL.get())
                .add(DDBlocks.CANARY_WOOL.get())
                .add(DDBlocks.WASABI_WOOL.get())
                .add(DDBlocks.SACRAMENTO_WOOL.get())
                .add(DDBlocks.SKY_WOOL.get())
                .add(DDBlocks.BLURPLE_WOOL.get())
                .add(DDBlocks.SANGRIA_WOOL.get())
                .add(DDBlocks.ROSE_WOOL.get())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                .add(DDBlocks.CORAL_CARPET.get())
                .add(DDBlocks.CANARY_CARPET.get())
                .add(DDBlocks.WASABI_CARPET.get())
                .add(DDBlocks.SACRAMENTO_CARPET.get())
                .add(DDBlocks.SKY_CARPET.get())
                .add(DDBlocks.BLURPLE_CARPET.get())
                .add(DDBlocks.SANGRIA_CARPET.get())
                .add(DDBlocks.ROSE_CARPET.get())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(BlockTags.TERRACOTTA)
                .add(DDBlocks.CORAL_TERRACOTTA.get())
                .add(DDBlocks.CANARY_TERRACOTTA.get())
                .add(DDBlocks.WASABI_TERRACOTTA.get())
                .add(DDBlocks.SACRAMENTO_TERRACOTTA.get())
                .add(DDBlocks.SKY_TERRACOTTA.get())
                .add(DDBlocks.BLURPLE_TERRACOTTA.get())
                .add(DDBlocks.SANGRIA_TERRACOTTA.get())
                .add(DDBlocks.ROSE_TERRACOTTA.get())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(BlockTags.CANDLES)
                .add(DDBlocks.CORAL_CANDLE.get())
                .add(DDBlocks.CANARY_CANDLE.get())
                .add(DDBlocks.WASABI_CANDLE.get())
                .add(DDBlocks.SACRAMENTO_CANDLE.get())
                .add(DDBlocks.SKY_CANDLE.get())
                .add(DDBlocks.BLURPLE_CANDLE.get())
                .add(DDBlocks.SANGRIA_CANDLE.get())
                .add(DDBlocks.ROSE_CANDLE.get())
        ;
    }

    public void appendCandleCakes() {
        getOrCreateTagBuilder(BlockTags.CANDLE_CAKES)
                .add(DDBlocks.CORAL_CANDLE_CAKE.get())
                .add(DDBlocks.CANARY_CANDLE_CAKE.get())
                .add(DDBlocks.WASABI_CANDLE_CAKE.get())
                .add(DDBlocks.SACRAMENTO_CANDLE_CAKE.get())
                .add(DDBlocks.SKY_CANDLE_CAKE.get())
                .add(DDBlocks.BLURPLE_CANDLE_CAKE.get())
                .add(DDBlocks.SANGRIA_CANDLE_CAKE.get())
                .add(DDBlocks.ROSE_CANDLE_CAKE.get())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(BlockTags.BANNERS)
                .add(DDBlocks.CORAL_BANNER.get())
                .add(DDBlocks.CORAL_WALL_BANNER.get())

                .add(DDBlocks.CANARY_BANNER.get())
                .add(DDBlocks.CANARY_WALL_BANNER.get())

                .add(DDBlocks.WASABI_BANNER.get())
                .add(DDBlocks.WASABI_WALL_BANNER.get())

                .add(DDBlocks.SACRAMENTO_BANNER.get())
                .add(DDBlocks.SACRAMENTO_WALL_BANNER.get())

                .add(DDBlocks.SKY_BANNER.get())
                .add(DDBlocks.SKY_WALL_BANNER.get())

                .add(DDBlocks.BLURPLE_BANNER.get())
                .add(DDBlocks.BLURPLE_WALL_BANNER.get())

                .add(DDBlocks.SANGRIA_BANNER.get())
                .add(DDBlocks.SANGRIA_WALL_BANNER.get())

                .add(DDBlocks.ROSE_BANNER.get())
                .add(DDBlocks.ROSE_WALL_BANNER.get())
        ;
    }
}
