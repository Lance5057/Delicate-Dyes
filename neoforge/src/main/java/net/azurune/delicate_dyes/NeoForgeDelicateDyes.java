package net.azurune.delicate_dyes;

import net.azurune.delicate_dyes.core.init.DDDamageTypes;
import net.azurune.delicate_dyes.core.init.DDLootTables;
import net.azurune.delicate_dyes.core.init.DDRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(DelicateDyes.MOD_ID)
public class NeoForgeDelicateDyes {

    public NeoForgeDelicateDyes(IEventBus eventBus) {
        DelicateDyes.init();

        eventBus.addListener(this::commonSetup);
    }

    @SubscribeEvent
    public void commonSetup(FMLCommonSetupEvent event) {
        DDRegistries.loadRegistries();
        DDDamageTypes.loadDmgs();
        DDLootTables.loadTables();
    }
}