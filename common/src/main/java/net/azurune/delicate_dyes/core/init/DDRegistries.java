package net.azurune.delicate_dyes.core.init;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.azurune.delicate_dyes.core.registry.DDItems;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class DDRegistries {
    public static void loadRegistries() {
        //registerFlammables();
        registerCompostables();
        //registerCauldronBehavior();
    }

    public static void registerCompostables() {
        COMPOSTABLES.put(DDItems.BLUEBERRIES.get(), 0.3F);

        COMPOSTABLES.put(DDBlocks.ROSE.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.GOOB_BLOSSOM.get(), 0.65F);
        COMPOSTABLES.put(DDBlocks.PEACH_BELLFLOWER.get(), 0.65F);
    }
}
