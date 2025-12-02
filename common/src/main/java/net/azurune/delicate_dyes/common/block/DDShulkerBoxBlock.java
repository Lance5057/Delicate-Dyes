package net.azurune.delicate_dyes.common.block;

import net.azurune.delicate_dyes.common.util.DDDyeValues;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DDShulkerBoxBlock extends ShulkerBoxBlock {
    public DDShulkerBoxBlock(DyeColor color, Properties properties) {
        super(color, properties);
    }

    @Override
    public @NotNull BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof ShulkerBoxBlockEntity shulkerboxblockentity) {
            if (!level.isClientSide && player.isCreative() && !shulkerboxblockentity.isEmpty()) {
                ItemStack itemstack = getColoredItemStack(this.getColor());
                itemstack.applyComponents(blockentity.collectComponents());
                ItemEntity itementity = new ItemEntity(level, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, itemstack);
                itementity.setDefaultPickUpDelay();
                level.addFreshEntity(itementity);
            } else {
                shulkerboxblockentity.unpackLootTable(player);
            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }

    public static ItemStack getColoredItemStack(@Nullable DyeColor color) {
        return new ItemStack(getBlockByColor(color));
    }

    public static Block getBlockByColor(@Nullable DyeColor color) {
        if (color == null) {
            return Blocks.SHULKER_BOX;
        } else if (color.getId() >= DDDyeValues.CORAL.getId() || color.getId() <= DDDyeValues.ROSE.getId()) {
            if (color == DDDyeValues.CORAL) return DDBlocks.CORAL_SHULKER_BOX.get();
            else if (color == DDDyeValues.UMBER) return DDBlocks.UMBER_SHULKER_BOX.get();
            else if (color == DDDyeValues.CANARY) return DDBlocks.CANARY_SHULKER_BOX.get();
            else if (color == DDDyeValues.WASABI) return DDBlocks.WASABI_SHULKER_BOX.get();
            else if (color == DDDyeValues.SACRAMENTO) return DDBlocks.SACRAMENTO_SHULKER_BOX.get();
            else if (color == DDDyeValues.SKY) return DDBlocks.SKY_SHULKER_BOX.get();
            else if (color == DDDyeValues.BLURPLE) return DDBlocks.BLURPLE_SHULKER_BOX.get();
            else if (color == DDDyeValues.LAVENDER) return DDBlocks.LAVENDER_SHULKER_BOX.get();
            else if (color == DDDyeValues.SANGRIA) return DDBlocks.SANGRIA_SHULKER_BOX.get();
            else if (color == DDDyeValues.ROSE) return DDBlocks.ROSE_SHULKER_BOX.get();
        }
        return Blocks.SHULKER_BOX;
    }
}
