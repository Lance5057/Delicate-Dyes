package net.azurune.delicate_dyes.core.integration.appledog.block;

import net.azurune.delicate_dyes.common.block.BlueberryBushBlock;
import net.azurune.delicate_dyes.core.integration.appledog.registry.ADItems;
import net.azurune.delicate_dyes.core.platform.Services;
import net.azurune.delicate_dyes.core.registry.DDItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class BlueberrycatBushBlock extends BlueberryBushBlock {
    private String modid;

    public BlueberrycatBushBlock(Properties properties, String modid) {
        super(properties);
        this.modid = modid;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet flagSet) {
        return Services.PLATFORM.isModLoaded(modid);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(ADItems.CATBLUEBERRY.get());
    }

    @Override
    protected void popItem(Level level, BlockPos pos, int j, boolean flag) {
        popResource(level, pos, new ItemStack(ADItems.CATBLUEBERRY.get(), j + (flag ? 1 : 0)));
    }
}
