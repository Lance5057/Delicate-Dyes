package net.azurune.delicate_dyes;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(DelicateDyes.MOD_ID)
public class NeoForgeDelicateDyes {

    public NeoForgeDelicateDyes(IEventBus eventBus) {
        DelicateDyes.init();
    }
}