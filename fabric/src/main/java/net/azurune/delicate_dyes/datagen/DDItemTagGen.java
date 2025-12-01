package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.common.util.IntegrationIds;
import net.azurune.delicate_dyes.core.init.DDTags;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class DDItemTagGen extends FabricTagProvider.ItemTagProvider {
    public DDItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWool();
        appendWoolCarpets();
        appendTerracotta();
        appendCandles();
        appendBeds();
        appendBanners();
        appendSmallFlowers();
        appendFoxFood();
        appendShulkerBoxes();
        appendTallFlowers();
        appendRockCandies();
        appendRadonLamps();
        appendDyes();
        appendPresents();
        appendTrappedPresents();
        appendAwnings();
        appendFlags();
        appendCandleHolders();
        appendGlassBlocks();
        appendGlassPanes();
    }

    public void appendShulkerBoxes() {
        getOrCreateTagBuilder(DDTags.Items.SHULKER_BOXES)
                //.add(DDBlocks.CORAL_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.CANARY_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.WASABI_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.SACRAMENTO_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.SKY_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.BLURPLE_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.SANGRIA_SHULKER_BOX.get().asItem())
                //.add(DDBlocks.ROSE_SHULKER_BOX.get().asItem())

                .add(Items.RED_SHULKER_BOX)
                .add(Items.ORANGE_SHULKER_BOX)
                .add(Items.YELLOW_SHULKER_BOX)
                .add(Items.LIME_SHULKER_BOX)
                .add(Items.GREEN_SHULKER_BOX)
                .add(Items.CYAN_SHULKER_BOX)
                .add(Items.LIGHT_BLUE_SHULKER_BOX)
                .add(Items.BLUE_SHULKER_BOX)
                .add(Items.PURPLE_SHULKER_BOX)
                .add(Items.MAGENTA_SHULKER_BOX)
                .add(Items.PINK_SHULKER_BOX)
                .add(Items.BROWN_SHULKER_BOX)
                .add(Items.WHITE_SHULKER_BOX)
                .add(Items.LIGHT_GRAY_SHULKER_BOX)
                .add(Items.GRAY_SHULKER_BOX)
                .add(Items.BLACK_SHULKER_BOX)
        ;
    }

    public void appendDyes() {
        getOrCreateTagBuilder(DDTags.Items.DYES)
                .add(DDItems.CORAL_DYE.get())
                .add(DDItems.CANARY_DYE.get())
                .add(DDItems.WASABI_DYE.get())
                .add(DDItems.SACRAMENTO_DYE.get())
                .add(DDItems.SKY_DYE.get())
                .add(DDItems.BLURPLE_DYE.get())
                .add(DDItems.SANGRIA_DYE.get())
                .add(DDItems.ROSE_DYE.get())
        ;
    }

    public void appendGlassBlocks() {
        getOrCreateTagBuilder(DDTags.Items.GLASS_BLOCKS)
                //.add(DDBlocks.CORAL_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.CANARY_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.WASABI_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.SACRAMENTO_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.SKY_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.BLURPLE_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.SANGRIA_STAINED_GLASS.get().asItem())
                //.add(DDBlocks.ROSE_STAINED_GLASS.get().asItem())
        ;
    }

    public void appendGlassPanes() {
        getOrCreateTagBuilder(DDTags.Items.GLASS_PANES)
                //.add(DDBlocks.CORAL_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.CANARY_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.WASABI_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.SKY_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get().asItem())
                //.add(DDBlocks.ROSE_STAINED_GLASS_PANE.get().asItem())
        ;
    }

    public void appendFlags() {
        getOrCreateTagBuilder(DDTags.Items.FLAGS)
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_coral"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_canary"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_wasabi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_sacramento"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_sky"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_blurple"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_sangria"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "flag_rose"))
        ;
    }

    public void appendAwnings() {
        getOrCreateTagBuilder(DDTags.Items.AWNINGS)
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_coral"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_canary"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_wasabi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_sacramento"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_sky"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_blurple"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_sangria"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "awning_rose"))
        ;
    }

    public void appendCandleHolders() {
        getOrCreateTagBuilder(DDTags.Items.CANDLE_HOLDERS)
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_coral"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_canary"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_wasabi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_sacramento"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_sky"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_blurple"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_sangria"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "candle_holder_rose"))
        ;
    }

    public void appendPresents() {
        getOrCreateTagBuilder(DDTags.Items.PRESENTS)
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_coral"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_canary"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_wasabi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_sacramento"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_sky"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_blurple"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_sangria"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "present_rose"))
        ;
    }

    public void appendTrappedPresents() {
        getOrCreateTagBuilder(DDTags.Items.TRAPPED_PRESENTS)
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_coral"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_canary"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_wasabi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_sacramento"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_sky"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_blurple"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_sangria"))
                .addOptional(ResourceLocation.fromNamespaceAndPath(IntegrationIds.SUPPLEMENTARIES, "trapped_present_rose"))
        ;
    }

    public void appendRadonLamps() {
        getOrCreateTagBuilder(DDTags.Items.RADON_LAMPS)
                //.add(AlexCBlocks.CORAL_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.CANARY_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.WASABI_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.SACRAMENTO_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.SKY_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.BLURPLE_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.SANGRIA_RADON_LAMP.get().asItem())
                //.add(AlexCBlocks.ROSE_RADON_LAMP.get().asItem())
        ;
    }

    public void appendRockCandies() {
        getOrCreateTagBuilder(DDTags.Items.ROCK_CANDIES)
                //.add(AlexCBlocks.CORAL_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.CANARY_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.WASABI_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.SACRAMENTO_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.SKY_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.BLURPLE_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.SANGRIA_ROCK_CANDY.get().asItem())
                //.add(AlexCBlocks.ROSE_ROCK_CANDY.get().asItem())
        ;
    }

    public void appendFoxFood() {
        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .add(DDItems.BLUEBERRIES.get())
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(DDBlocks.ROSE.get().asItem())
                .add(DDBlocks.PEACH_BELLFLOWER.get().asItem())
        ;
    }

    public void appendTallFlowers() {
        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(DDBlocks.GOOB_BLOSSOM.get().asItem())
        ;
    }

    public void appendWool() {
        getOrCreateTagBuilder(ItemTags.WOOL)
                //.add(DDBlocks.CORAL_WOOL.get().asItem())
                //.add(DDBlocks.CANARY_WOOL.get().asItem())
                //.add(DDBlocks.WASABI_WOOL.get().asItem())
                //.add(DDBlocks.SACRAMENTO_WOOL.get().asItem())
                //.add(DDBlocks.SKY_WOOL.get().asItem())
                //.add(DDBlocks.BLURPLE_WOOL.get().asItem())
                //.add(DDBlocks.SANGRIA_WOOL.get().asItem())
                //.add(DDBlocks.ROSE_WOOL.get().asItem())
        ;
    }

    public void appendWoolCarpets() {
        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
                //.add(DDBlocks.CORAL_CARPET.get().asItem())
                //.add(DDBlocks.CANARY_CARPET.get().asItem())
                //.add(DDBlocks.WASABI_CARPET.get().asItem())
                //.add(DDBlocks.SACRAMENTO_CARPET.get().asItem())
                //.add(DDBlocks.SKY_CARPET.get().asItem())
                //.add(DDBlocks.BLURPLE_CARPET.get().asItem())
                //.add(DDBlocks.SANGRIA_CARPET.get().asItem())
                //.add(DDBlocks.ROSE_CARPET.get().asItem())
        ;
    }

    public void appendTerracotta() {
        getOrCreateTagBuilder(ItemTags.TERRACOTTA)
                //.add(DDBlocks.CORAL_TERRACOTTA.get().asItem())
                //.add(DDBlocks.CANARY_TERRACOTTA.get().asItem())
                //.add(DDBlocks.WASABI_TERRACOTTA.get().asItem())
                //.add(DDBlocks.SACRAMENTO_TERRACOTTA.get().asItem())
                //.add(DDBlocks.SKY_TERRACOTTA.get().asItem())
                //.add(DDBlocks.BLURPLE_TERRACOTTA.get().asItem())
                //.add(DDBlocks.SANGRIA_TERRACOTTA.get().asItem())
                //.add(DDBlocks.ROSE_TERRACOTTA.get().asItem())
        ;
    }

    public void appendCandles() {
        getOrCreateTagBuilder(ItemTags.CANDLES)
                //.add(DDBlocks.CORAL_CANDLE.get().asItem())
                //.add(DDBlocks.CANARY_CANDLE.get().asItem())
                //.add(DDBlocks.WASABI_CANDLE.get().asItem())
                //.add(DDBlocks.SACRAMENTO_CANDLE.get().asItem())
                //.add(DDBlocks.SKY_CANDLE.get().asItem())
                //.add(DDBlocks.BLURPLE_CANDLE.get().asItem())
                //.add(DDBlocks.SANGRIA_CANDLE.get().asItem())
                //.add(DDBlocks.ROSE_CANDLE.get().asItem())
        ;
    }

    public void appendBeds() {
        getOrCreateTagBuilder(ItemTags.BEDS)
                //.add(DDItems.CORAL_BED.get())
                //.add(DDItems.CANARY_BED.get())
                //.add(DDItems.WASABI_BED.get())
                //.add(DDItems.SACRAMENTO_BED.get())
                //.add(DDItems.SKY_BED.get())
                //.add(DDItems.BLURPLE_BED.get())
                //.add(DDItems.SANGRIA_BED.get())
                //.add(DDItems.ROSE_BED.get())
        ;
    }

    public void appendBanners() {
        getOrCreateTagBuilder(ItemTags.BANNERS)
                //.add(DDItems.CORAL_BANNER.get())
                //.add(DDItems.CANARY_BANNER.get())
                //.add(DDItems.WASABI_BANNER.get())
                //.add(DDItems.SACRAMENTO_BANNER.get())
                //.add(DDItems.SKY_BANNER.get())
                //.add(DDItems.BLURPLE_BANNER.get())
                //.add(DDItems.SANGRIA_BANNER.get())
                //.add(DDItems.ROSE_BANNER.get())
        ;
    }
}
