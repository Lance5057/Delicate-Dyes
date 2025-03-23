package net.azurune.delicate_dyes.common.util;

public class DDUtil {
    //TODO - Test (this is here to make compatibility with other dye mods actually a thing)

    //This gets the amount of dyes currently in the game (starting at 15 because vanilla has 16)
    public static int getDyeCount() {
        int dyeCount = 15;
//        if (Services.PLATFORM.isModLoaded("mint")) {
//            dyeCount = dyeCount + 20;
//        }
        return dyeCount;
    }
}
