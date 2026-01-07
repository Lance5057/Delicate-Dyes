package net.azurune.delicate_dyes.common.util;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class DDProperties {
    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.BEDROCK);
        public static final BlockBehaviour.Properties FLOWER_POT = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);

        //NATURE
        public static final BlockBehaviour.Properties PEACH_BELLFLOWER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_TULIP);
        public static final BlockBehaviour.Properties ROSE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_TULIP);
        public static final BlockBehaviour.Properties GOOB_BLOSSOM = BlockBehaviour.Properties.ofLegacyCopy(Blocks.SUNFLOWER).lightLevel(s -> 4);

        // DYEABLE BLOCKS
        public static final BlockBehaviour.Properties WOOL = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_WOOL);
        public static final BlockBehaviour.Properties CARPET = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_CARPET);
        public static final BlockBehaviour.Properties GLASS = BlockBehaviour.Properties.ofLegacyCopy(Blocks.GLASS);
        public static final BlockBehaviour.Properties GLASS_PANE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.GLASS_PANE);
        public static final BlockBehaviour.Properties TERRACOTTA = BlockBehaviour.Properties.ofLegacyCopy(Blocks.TERRACOTTA);
        public static final BlockBehaviour.Properties GLAZED_TERRACOTTA = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_GLAZED_TERRACOTTA);
        public static final BlockBehaviour.Properties CONCRETE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_CONCRETE);
        public static final BlockBehaviour.Properties CONCRETE_POWDER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_CONCRETE_POWDER);
        public static final BlockBehaviour.Properties CANDLE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.CANDLE);
        public static final BlockBehaviour.Properties CANDLE_CAKE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_CANDLE_CAKE);
        public static final BlockBehaviour.Properties BANNER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_BANNER);
        public static final BlockBehaviour.Properties WALL_BANNER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_WALL_BANNER);
        public static final BlockBehaviour.Properties BED = BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_BED);
        public static final BlockBehaviour.Properties SHULKER_BOX = BlockBehaviour.Properties.ofLegacyCopy(Blocks.SHULKER_BOX);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties GENERIC_16 = new Item.Properties().stacksTo(16);
        public static final Item.Properties GENERIC_1 = new Item.Properties().stacksTo(1);
    }

    public static class Food {
        //MISC
        public static final FoodProperties NOTHING = new FoodProperties.Builder().alwaysEdible().build();
    }
}
