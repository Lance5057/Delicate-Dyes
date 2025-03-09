package net.azurune.delicate_dyes.platform;

import net.azurune.delicate_dyes.DelicateDyes;
import net.azurune.delicate_dyes.platform.services.DDRegistryHelper;
import net.azurune.delicate_dyes.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final DDRegistryHelper REGISTRY = load(DDRegistryHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        DelicateDyes.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}