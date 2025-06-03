package net.azurune.delicate_dyes.core.integration.alexscaves.registry;

import net.azurune.delicate_dyes.core.integration.common.item.IntegrationBlockItem;
import net.azurune.delicate_dyes.core.integration.common.util.CompatIds;
import net.azurune.delicate_dyes.core.integration.common.util.DDCProperties;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class AlexCItems {
    //CORAL
    public static final Supplier<Item> CORAL_ROCK_CANDY = register("rock_candy_coral", () -> new IntegrationBlockItem(AlexCBlocks.CORAL_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> CANARY_ROCK_CANDY = register("rock_candy_canary", () -> new IntegrationBlockItem(AlexCBlocks.CANARY_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> WASABI_ROCK_CANDY = register("rock_candy_wasabi", () -> new IntegrationBlockItem(AlexCBlocks.WASABI_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> SACRAMENTO_ROCK_CANDY = register("rock_candy_sacramento", () -> new IntegrationBlockItem(AlexCBlocks.SACRAMENTO_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> SKY_ROCK_CANDY = register("rock_candy_sky", () -> new IntegrationBlockItem(AlexCBlocks.SKY_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> BLURPLE_ROCK_CANDY = register("rock_candy_blurple", () -> new IntegrationBlockItem(AlexCBlocks.BLURPLE_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> SANGRIA_ROCK_CANDY = register("rock_candy_sangria", () -> new IntegrationBlockItem(AlexCBlocks.SANGRIA_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));
    public static final Supplier<Item> ROSE_ROCK_CANDY = register("rock_candy_rose", () -> new IntegrationBlockItem(AlexCBlocks.ROSE_ROCK_CANDY.get(), DDCProperties.ItemP.ROCK_CANDY, CompatIds.ALEXSCAVES));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(CompatIds.ALEXSCAVES, id, item);
    }

    public static void loadAlexCItems() {
    }
}
