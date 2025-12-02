package net.azurune.delicate_dyes.datagen;

import net.azurune.delicate_dyes.core.init.DDLootTables;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class DDEntityLootGen extends SimpleFabricLootTableProvider {
    private CompletableFuture<HolderLookup.Provider> registryLookup;

    public DDEntityLootGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup, LootContextParamSets.ENTITY);
        this.registryLookup = registryLookup;
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(DDLootTables.SHEEP_CORAL, createSheepTable(DDBlocks.CORAL_WOOL.get()));
        output.accept(DDLootTables.SHEEP_CANARY, createSheepTable(DDBlocks.CANARY_WOOL.get()));
        output.accept(DDLootTables.SHEEP_WASABI, createSheepTable(DDBlocks.WASABI_WOOL.get()));
        output.accept(DDLootTables.SHEEP_SACRAMENTO, createSheepTable(DDBlocks.SACRAMENTO_WOOL.get()));
        output.accept(DDLootTables.SHEEP_SKY, createSheepTable(DDBlocks.SKY_WOOL.get()));
        output.accept(DDLootTables.SHEEP_BLURPLE, createSheepTable(DDBlocks.BLURPLE_WOOL.get()));
        output.accept(DDLootTables.SHEEP_SANGRIA, createSheepTable(DDBlocks.SANGRIA_WOOL.get()));
        output.accept(DDLootTables.SHEEP_ROSE, createSheepTable(DDBlocks.ROSE_WOOL.get()));
    }

    protected static LootTable.Builder createSheepTable(ItemLike woolItem) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(woolItem))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(NestedLootTable.lootTableReference(EntityType.SHEEP.getDefaultLootTable())));
    }
}
