package net.azurune.delicate_dyes.common.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class DDProperties {
    public static class BlockP {
        // MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.BEDROCK);
        public static final BlockBehaviour.Properties FLOWER_POT = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);

        // NATURE
        public static final BlockBehaviour.Properties PEACH_BELLFLOWER = BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_TULIP);
        public static final BlockBehaviour.Properties ROSE = BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_TULIP);

    }

    public static class ItemP {
        // MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties GENERIC_16 = new Item.Properties().stacksTo(16);
        public static final Item.Properties GENERIC_1 = new Item.Properties().stacksTo(1);
    }

    public static class Food {

    }
}
