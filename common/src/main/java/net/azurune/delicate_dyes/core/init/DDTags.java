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
        // DDYE
        public static final TagKey<Block> DELICATE_BEDS = create("delicate_beds", DelicateDyes.MOD_ID);
        // COMMON
        public static final TagKey<Block> MINEABLE_SHEAR = create("mineable/shear", IntegrationIds.MINECRAFT);
        public static final TagKey<Block> SHULKER_BOXES = create("shulker_boxes", IntegrationIds.C);
        //INTEGRATION
        public static final TagKey<Block> PRESENTS = create("presents", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Block> TRAPPED_PRESENTS = create("trapped_presents", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Block> LIGHTABLE_BY_GUNPOWDER = create("lightable_by_gunpowder", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Block> CANDLE_HOLDERS = create("candle_holders", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Block> FLAGS = create("flags", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Block> AWNINGS = create("awnings", IntegrationIds.SUPPLEMENTARIES);

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
        // INTEGRATION
        public static final TagKey<Item> RADON_LAMPS = create("radon_lamps", IntegrationIds.ALEXSCAVES);
        public static final TagKey<Item> ROCK_CANDIES = create("rock_candies", IntegrationIds.ALEXSCAVES);
        public static final TagKey<Item> PRESENTS = create("presents", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Item> TRAPPED_PRESENTS = create("trapped_presents", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Item> CANDLE_HOLDERS = create("candle_holders", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Item> FLAGS = create("flags", IntegrationIds.SUPPLEMENTARIES);
        public static final TagKey<Item> AWNINGS = create("awnings", IntegrationIds.SUPPLEMENTARIES);

        private static TagKey<Item> create(String id, String modid) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(modid, id));
        }
    }
}
