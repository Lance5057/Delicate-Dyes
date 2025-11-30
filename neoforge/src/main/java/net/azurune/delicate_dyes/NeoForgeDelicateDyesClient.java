package net.azurune.delicate_dyes;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = DelicateDyes.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoForgeDelicateDyesClient {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        DelicateDyesClient.init();
    }
}
