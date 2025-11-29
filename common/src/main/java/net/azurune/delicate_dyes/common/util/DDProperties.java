package net.azurune.delicate_dyes.common.util;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DDProperties {
    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = Block.Properties.ofLegacyCopy(Blocks.BEDROCK);

        //NATURE
        public static final BlockBehaviour.Properties PEACH_BELLFLOWER = Block.Properties.ofLegacyCopy(Blocks.ORANGE_TULIP);
        public static final BlockBehaviour.Properties GOOB_BLOSSOM = Block.Properties.ofLegacyCopy(Blocks.SUNFLOWER).lightLevel(s -> 4);
        public static final BlockBehaviour.Properties BLUEBERRY_BUSH = Block.Properties.ofLegacyCopy(Blocks.SWEET_BERRY_BUSH);
        public static final BlockBehaviour.Properties ROSE = Block.Properties.ofLegacyCopy(Blocks.PINK_TULIP);

        //DYEABLE BLOCKS
        public static final BlockBehaviour.Properties WOOL = Block.Properties.ofLegacyCopy(Blocks.WHITE_WOOL);
        public static final BlockBehaviour.Properties CARPET = Block.Properties.ofLegacyCopy(Blocks.WHITE_CARPET);
        public static final BlockBehaviour.Properties GLASS = Block.Properties.ofLegacyCopy(Blocks.GLASS);
        public static final BlockBehaviour.Properties GLASS_PANE = Block.Properties.ofLegacyCopy(Blocks.GLASS_PANE);
        public static final BlockBehaviour.Properties TERRACOTTA = Block.Properties.ofLegacyCopy(Blocks.TERRACOTTA);
        public static final BlockBehaviour.Properties GLAZED_TERRACOTTA = Block.Properties.ofLegacyCopy(Blocks.WHITE_GLAZED_TERRACOTTA);
        public static final BlockBehaviour.Properties CONCRETE = Block.Properties.ofLegacyCopy(Blocks.WHITE_CONCRETE);
        public static final BlockBehaviour.Properties CONCRETE_POWDER = Block.Properties.ofLegacyCopy(Blocks.WHITE_CONCRETE_POWDER);
        public static final BlockBehaviour.Properties CANDLE = Block.Properties.ofLegacyCopy(Blocks.CANDLE);
        public static final BlockBehaviour.Properties CANDLE_CAKE = Block.Properties.ofLegacyCopy(Blocks.WHITE_CANDLE_CAKE);
        public static final BlockBehaviour.Properties BANNER = Block.Properties.ofLegacyCopy(Blocks.WHITE_BANNER);
        public static final BlockBehaviour.Properties WALL_BANNER = Block.Properties.ofLegacyCopy(Blocks.WHITE_WALL_BANNER);
        public static final BlockBehaviour.Properties BED = Block.Properties.ofLegacyCopy(Blocks.WHITE_BED);
        public static final BlockBehaviour.Properties SHULKER_BOX = Block.Properties.ofLegacyCopy(Blocks.SHULKER_BOX);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties GENERIC_16 = new Item.Properties().stacksTo(16);
        public static final Item.Properties GENERIC_1 = new Item.Properties().stacksTo(1);

        //FOODS
        public static final Item.Properties BLUEBERRIES = new Item.Properties().food(Food.BLUEBERRIES);
    }

    public static class Food {
        //MISC
        public static final FoodProperties NOTHING = new FoodProperties.Builder().alwaysEdible().build();

        //GENERIC FOODS
        public static final FoodProperties BLUEBERRIES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4F).build();
    }
}
