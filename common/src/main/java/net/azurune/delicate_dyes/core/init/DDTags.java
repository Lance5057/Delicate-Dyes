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
        //COMMON
        public static final TagKey<Block> MINEABLE_SHEAR = create("mineable/shear", CompatIds.MINECRAFT);
        public static final TagKey<Block> SHULKER_BOXES = create("shulker_boxes", CompatIds.C);
        //INTEGRATION
        public static final TagKey<Block> PRESENTS = create("presents", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Block> TRAPPED_PRESENTS = create("trapped_presents", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Block> LIGHTABLE_BY_GUNPOWDER = create("lightable_by_gunpowder", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Block> CANDLE_HOLDERS = create("candle_holders", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Block> FLAGS = create("flags", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Block> AWNINGS = create("awnings", CompatIds.SUPPLEMENTARIES);

        private static TagKey<Block> create(String id, String modid) {
            return TagKey.create(Registries.BLOCK, RunicLib.customid(modid, id));
        }
    }

    public static class Items {
        //COMMON
        public static final TagKey<Item> DYES = create("dyes", CompatIds.C);
        public static final TagKey<Item> GLASS_BLOCKS = create("glass_blocks", CompatIds.C);
        public static final TagKey<Item> GLASS_PANES = create("glass_panes", CompatIds.C);
        public static final TagKey<Item> SHULKER_BOXES = create("shulker_boxes", CompatIds.C);
        //INTEGRATION
        public static final TagKey<Item> RADON_LAMPS = create("radon_lamps", CompatIds.ALEXSCAVES);
        public static final TagKey<Item> ROCK_CANDIES = create("rock_candies", CompatIds.ALEXSCAVES);
        public static final TagKey<Item> PRESENTS = create("presents", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Item> TRAPPED_PRESENTS = create("trapped_presents", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Item> CANDLE_HOLDERS = create("candle_holders", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Item> FLAGS = create("flags", CompatIds.SUPPLEMENTARIES);
        public static final TagKey<Item> AWNINGS = create("awnings", CompatIds.SUPPLEMENTARIES);

        private static TagKey<Item> create(String id, String modid) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(modid, id));
        }
    }
}
