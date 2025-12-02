package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class DDLootTables {
    public static ResourceKey<LootTable> SHEEP_CORAL = register("entities/sheep/coral");
    public static ResourceKey<LootTable> SHEEP_CANARY = register("entities/sheep/canary");
    public static ResourceKey<LootTable> SHEEP_WASABI = register("entities/sheep/wasabi");
    public static ResourceKey<LootTable> SHEEP_SACRAMENTO = register("entities/sheep/sacramento");
    public static ResourceKey<LootTable> SHEEP_SKY = register("entities/sheep/sky");
    public static ResourceKey<LootTable> SHEEP_BLURPLE = register("entities/sheep/blurple");
    public static ResourceKey<LootTable> SHEEP_ROSE = register("entities/sheep/rose");
    public static ResourceKey<LootTable> SHEEP_SANGRIA = register("entities/sheep/sangria");

    private static ResourceKey<LootTable> register(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, RunicLib.customid(DelicateDyes.MOD_ID, name));
    }

    public static void loadLootTables() {
    }
}
