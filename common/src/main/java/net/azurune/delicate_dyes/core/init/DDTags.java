package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDTags {
    public static class Blocks {
        public static final TagKey<Block> DELICATE_BEDS = create("delicate_beds", DelicateDyes.MOD_ID);

        private static TagKey<Block> create(String id, String modid) {
            return TagKey.create(Registries.BLOCK, RunicLib.customid(modid, id));
        }
    }

    public static class Items {
        public static final TagKey<Item> SHULKER_BOXES = create("shulker_boxes", DelicateDyes.MOD_ID);
        //INTEGRATION
        public static final TagKey<Item> RADON_LAMPS = create("radon_lamps", CompatIds.ALEXSCAVES);
        public static final TagKey<Item> ROCK_CANDIES = create("rock_candies", CompatIds.ALEXSCAVES);

        private static TagKey<Item> create(String id, String modid) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(modid, id));
        }
    }
}
