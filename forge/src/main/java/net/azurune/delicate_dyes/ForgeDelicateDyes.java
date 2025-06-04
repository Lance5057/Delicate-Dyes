package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.common.ForgeItemGroupAdditions;
import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.azurune.delicate_dyes.core.integration.appledog.registry.ADBlocks;
import net.azurune.delicate_dyes.core.registry.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DelicateDyes.MOD_ID)
public class ForgeDelicateDyes {

    public ForgeDelicateDyes() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DelicateDyes.init();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(ForgeItemGroupAdditions::buildCreativeTabs);
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
        //COMPAT
        ItemBlockRenderTypes.setRenderLayer(ADBlocks.BLUEBERRYCAT_BUSH.get(), RenderType.cutout());
    }
}