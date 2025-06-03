package net.azurune.delicate_dyes.core.integration.appledog.item;

import net.azurune.delicate_dyes.core.integration.common.item.IntegrationItemNameBlockItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class BlueberrycatItem extends IntegrationItemNameBlockItem {
    public BlueberrycatItem(Block block, Properties properties, String modid) {
        super(block, properties, modid);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity living) {
        living.playSound(SoundEvents.CAT_DEATH);
        return  super.finishUsingItem(stack, level, living);
    }
}
