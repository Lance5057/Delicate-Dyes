package net.azurune.delicate_dyes.common.util;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DDProperties {
    public static class BlockP {
        // MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.BEDROCK);

        // NATURE
        public static final BlockBehaviour.Properties PEACH_BELLFLOWER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_TULIP);
    }

    public static class ItemP {
        // MISC
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
