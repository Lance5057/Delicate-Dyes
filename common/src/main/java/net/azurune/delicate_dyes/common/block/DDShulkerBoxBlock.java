package net.azurune.delicate_dyes.common.block;

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
        } else {
            return switch (color.getId()) {
                case 16 -> DDBlocks.CORAL_SHULKER_BOX.get();
                case 17 -> DDBlocks.CANARY_SHULKER_BOX.get();
                case 18 -> DDBlocks.WASABI_SHULKER_BOX.get();
                case 19 -> DDBlocks.SACRAMENTO_SHULKER_BOX.get();
                case 20 -> DDBlocks.SKY_SHULKER_BOX.get();
                case 21 -> DDBlocks.BLURPLE_SHULKER_BOX.get();
                case 22 -> DDBlocks.SANGRIA_SHULKER_BOX.get();
                case 23 -> DDBlocks.ROSE_SHULKER_BOX.get();
                default -> Blocks.SHULKER_BOX;
            };
        }
    }
}
