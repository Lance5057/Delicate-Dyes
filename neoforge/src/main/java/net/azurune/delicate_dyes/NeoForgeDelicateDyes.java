package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.platform.NeoForgeDDRegistryHelper;
import net.azurune.delicate_dyes.registry.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(DelicateDyes.MOD_ID)
public class NeoForgeDelicateDyes {
    public NeoForgeDelicateDyes(IEventBus eventBus) {
        NeoForgeDDRegistryHelper.BLOCK.register(eventBus);
        NeoForgeDDRegistryHelper.ITEM.register(eventBus);
        NeoForgeDDRegistryHelper.MOB_EFFECT.register(eventBus);
        NeoForgeDDRegistryHelper.BLOCK_ENTITY_TYPE.register(eventBus);
        NeoForgeDDRegistryHelper.ENTITY_TYPE.register(eventBus);
        NeoForgeDDRegistryHelper.SOUND_EVENT.register(eventBus);
        NeoForgeDDRegistryHelper.CREATIVE_MODE_TAB.register(eventBus);

        DelicateDyes.init();

        eventBus.addListener(this::clientSetup);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        //TRANSLUCENT
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CORAL_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CORAL_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CANARY_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.CANARY_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WASABI_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WASABI_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SACRAMENTO_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SACRAMENTO_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SKY_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SKY_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLURPLE_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLURPLE_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SANGRIA_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.SANGRIA_STAINED_GLASS_PANE.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE_STAINED_GLASS.value(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE_STAINED_GLASS_PANE.value(), RenderType.translucent());

        //CUTOUT
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.RED_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLUE_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.WHITE_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_RED_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_BLUE_ROSE.value(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_WHITE_ROSE.value(), RenderType.cutout());
    }
}