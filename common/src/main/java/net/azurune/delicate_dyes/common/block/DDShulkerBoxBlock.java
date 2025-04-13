package net.azurune.delicate_dyes.common.block;

import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
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
import net.minecraft.world.level.gameevent.GameEvent;

public class DDShulkerBoxBlock extends ShulkerBoxBlock {
    public DDShulkerBoxBlock(DyeColor color, Properties properties) {
        super(color, properties);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof ShulkerBoxBlockEntity shulkerboxblockentity) {
            if (!level.isClientSide && player.isCreative() && !shulkerboxblockentity.isEmpty()) {
                ItemStack itemstack = getColoredItemStack(this.getColor());
                blockentity.saveToItem(itemstack);
                if (shulkerboxblockentity.hasCustomName()) {
                    itemstack.setHoverName(shulkerboxblockentity.getCustomName());
                }
                ItemEntity itementity = new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemstack);
                itementity.setDefaultPickUpDelay();
                level.addFreshEntity(itementity);
            } else {
                shulkerboxblockentity.unpackLootTable(player);
            }
        }
        this.spawnDestroyParticles(level, player, pos, state);
        if (state.is(BlockTags.GUARDED_BY_PIGLINS)) {
            PiglinAi.angerNearbyPiglins(player, false);
        }
        level.gameEvent(GameEvent.BLOCK_DESTROY, pos, GameEvent.Context.of(player, state));
    }

    public static ItemStack getColoredItemStack(@javax.annotation.Nullable DyeColor color) {
        return new ItemStack(getBlockByColor(color));
    }

    public static Block getBlockByColor(@javax.annotation.Nullable DyeColor color) {
        if (color == null) {
            return Blocks.SHULKER_BOX;
        } else {
            return switch (color.getId()) {
                case 690 -> DDBlocks.CORAL_SHULKER_BOX.get();
                case 691 -> DDBlocks.CANARY_SHULKER_BOX.get();
                case 692 -> DDBlocks.WASABI_SHULKER_BOX.get();
                case 693 -> DDBlocks.SACRAMENTO_SHULKER_BOX.get();
                case 694 -> DDBlocks.SKY_SHULKER_BOX.get();
                case 695 -> DDBlocks.BLURPLE_SHULKER_BOX.get();
                case 696 -> DDBlocks.SANGRIA_SHULKER_BOX.get();
                case 697 -> DDBlocks.ROSE_SHULKER_BOX.get();
                default -> Blocks.SHULKER_BOX;
            };
        }
    }
}
