package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.common.util.IntegrationIds;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDTags {
    public static class Blocks {
        public static final TagKey<Block> DELICATE_BEDS = create("delicate_beds", DelicateDyes.MOD_ID);
        // COMMON
        public static final TagKey<Block> MINEABLE_SHEAR = create("mineable/shear", IntegrationIds.MINECRAFT);
        public static final TagKey<Block> SHULKER_BOXES = create("shulker_boxes", IntegrationIds.C);

        private static TagKey<Block> create(String id, String modid) {
            return TagKey.create(Registries.BLOCK, RunicLib.customid(modid, id));
        }
    }

    public static class Items {
        // COMMON
        public static final TagKey<Item> DYES = create("dyes", IntegrationIds.C);
        public static final TagKey<Item> GLASS_BLOCKS = create("glass_blocks", IntegrationIds.C);
        public static final TagKey<Item> GLASS_PANES = create("glass_panes", IntegrationIds.C);
        public static final TagKey<Item> SHULKER_BOXES = create("shulker_boxes", IntegrationIds.C);

        private static TagKey<Item> create(String id, String modid) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(modid, id));
        }
    }
}
