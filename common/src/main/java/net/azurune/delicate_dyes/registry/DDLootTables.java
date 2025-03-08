package net.azurune.delicate_dyes.registry;

import net.azurune.delicate_dyes.DelicateDyes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class DDLootTables {
    public static final ResourceKey<LootTable> CORAL_SHEEP_ENTITY = register("entities/sheep/coral");
    public static final ResourceKey<LootTable> CANARY_SHEEP_ENTITY = register("entities/sheep/canary");
    public static final ResourceKey<LootTable> WASABI_SHEEP_ENTITY = register("entities/sheep/wasabi");
    public static final ResourceKey<LootTable> SACRAMENTO_SHEEP_ENTITY = register("entities/sheep/sacramento");
    public static final ResourceKey<LootTable> SKY_SHEEP_ENTITY = register("entities/sheep/sky");
    public static final ResourceKey<LootTable> BLURPLE_SHEEP_ENTITY = register("entities/sheep/blurple");
    public static final ResourceKey<LootTable> SANGRIA_SHEEP_ENTITY = register("entities/sheep/sangria");
    public static final ResourceKey<LootTable> ROSE_SHEEP_ENTITY = register("entities/sheep/rose");

    private static ResourceKey<LootTable> register(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, DelicateDyes.modid(path));
    }
}
