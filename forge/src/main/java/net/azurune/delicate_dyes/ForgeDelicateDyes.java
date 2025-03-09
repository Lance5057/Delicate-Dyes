package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.platform.ForgeDDRegistryHelper;
import net.azurune.delicate_dyes.registry.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(DelicateDyes.MOD_ID)
public class ForgeDelicateDyes {

    public ForgeDelicateDyes(IEventBus eventBus) {
        ForgeDDRegistryHelper.BLOCK.register(eventBus);
        ForgeDDRegistryHelper.ITEM.register(eventBus);
        ForgeDDRegistryHelper.MOB_EFFECT.register(eventBus);
        ForgeDDRegistryHelper.ENTITY_TYPE.register(eventBus);
        ForgeDDRegistryHelper.SOUND_EVENT.register(eventBus);
        ForgeDDRegistryHelper.CREATIVE_MODE_TAB.register(eventBus);
        
        DelicateDyes.init();

        eventBus.addListener(this::clientSetup);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        //TRANSLUCENT
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CORAL_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CORAL_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CANARY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CANARY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WASABI_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WASABI_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SACRAMENTO_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SKY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SKY_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLURPLE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLURPLE_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SANGRIA_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SANGRIA_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE_STAINED_GLASS_PANE.get(), RenderType.translucent());

        //CUTOUT
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.RED_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLUE_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WHITE_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_RED_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_BLUE_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_WHITE_ROSE.get(), RenderType.cutout());
    }
}