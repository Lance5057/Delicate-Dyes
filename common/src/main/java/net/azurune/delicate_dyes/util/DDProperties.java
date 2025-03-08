package net.azurune.delicate_dyes.util;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DDProperties {
    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK);

        //NATURE
        public static final BlockBehaviour.Properties ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TULIP);
        public static final BlockBehaviour.Properties RED_ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TULIP);
        public static final BlockBehaviour.Properties BLUE_ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ORCHID);
        public static final BlockBehaviour.Properties WHITE_ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TULIP);

        //DYEABLE BLOCKS
        public static final BlockBehaviour.Properties WOOL = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL);
        public static final BlockBehaviour.Properties CARPET = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET);
        public static final BlockBehaviour.Properties GLASS = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS);
        public static final BlockBehaviour.Properties GLASS_PANE = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE);
        public static final BlockBehaviour.Properties TERRACOTTA = BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA);
        public static final BlockBehaviour.Properties GLAZED_TERRACOTTA = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_GLAZED_TERRACOTTA);
        public static final BlockBehaviour.Properties CONCRETE = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE);
        public static final BlockBehaviour.Properties CONCRETE_POWDER = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE_POWDER);
        public static final BlockBehaviour.Properties CANDLE = BlockBehaviour.Properties.ofFullCopy(Blocks.CANDLE);
        public static final BlockBehaviour.Properties CANDLE_CAKE = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CANDLE_CAKE);
        public static final BlockBehaviour.Properties BANNER = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_BANNER);
        public static final BlockBehaviour.Properties WALL_BANNER = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WALL_BANNER);
        public static final BlockBehaviour.Properties BED = BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_BED);
        public static final BlockBehaviour.Properties SHULKER_BOX = BlockBehaviour.Properties.ofFullCopy(Blocks.SHULKER_BOX);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties GENERIC_16 = new Item.Properties().stacksTo(16);
        public static final Item.Properties GENERIC_1 = new Item.Properties().stacksTo(1);

        //FOODS
        public static final Item.Properties BLUEBERRIES = new Item.Properties().food(Food.BLUEBERRIES);
        public static final Item.Properties BLUEBERRY_PIE = new Item.Properties().food(Food.BLUEBERRY_PIE);
    }

    public static class Food {
        //MISC
        public static final FoodProperties NOTHING = new FoodProperties.Builder().alwaysEdible().build();

        //GENERIC FOODS
        public static final FoodProperties BLUEBERRIES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4F).build();
        public static final FoodProperties BLUEBERRY_PIE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.7F).build();
    }
}
