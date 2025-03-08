package net.azurune.delicate_dyes.util;

import net.azurune.delicate_dyes.platform.Services;

public class DDUtil {
    //TODO - Test (this is here to make compatibility with other dye mods actually a thing)
    public static int getDyeCount() {
        int dyeCount = 15;

//        if (Services.PLATFORM.isModLoaded("mint")) {
//            dyeCount = dyeCount + 20;
//        }
//
//        if (Services.PLATFORM.isModLoaded("dye_depot")) {
//            dyeCount = dyeCount + 16;
//        }
//
//        if (Services.PLATFORM.isModLoaded("placeholder_keke_mod_name")) {
//            dyeCount = dyeCount + 8;
//        }

        return dyeCount;
    }
}
