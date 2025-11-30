package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.common.NeoForgeItemGroupAdditions;
import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(DelicateDyes.MOD_ID)
public class NeoForgeDelicateDyes {

    public NeoForgeDelicateDyes() {
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();

        DelicateDyes.init();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(NeoForgeItemGroupAdditions::buildCreativeTabs);
    }

    @SubscribeEvent
    public void commonSetup(FMLCommonSetupEvent event) {
        DDRegistries.loadRegistries();
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
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.BLUEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.PEACH_BELLFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.POTTED_PEACH_BELLFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DDBlocks.GOOB_BLOSSOM.get(), RenderType.cutout());
    }
}