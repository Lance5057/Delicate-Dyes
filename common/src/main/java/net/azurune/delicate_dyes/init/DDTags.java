package net.azurune.delicate_dyes.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDTags {
    public static class Blocks {
        public static final TagKey<Block> DELICATE_BEDS = create("delicate_beds");

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, DelicateDyes.modid(id));
        }
    }

    public static class Items {
        public static final TagKey<Item> BLUEBERRIES = create("blueberries");

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, DelicateDyes.modid(id));
        }
    }
}
