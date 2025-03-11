/*
 *   Copyright (c) 2025 Garmingo UG (haftungsbeschraenkt)
 *   All rights reserved.
 *   Unauthorized use, reproduction, and distribution of this source code is strictly prohibited.
 */
package de.floatdev.betterbuilding.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import de.floatdev.betterbuilding.BetterBuildingMod;

@Mod(BetterBuildingMod.MOD_ID)
public final class BetterBuildingModForge {
    public BetterBuildingModForge() {
        // Submit our event bus to let Architectury API register our content on the
        // right time.
        EventBuses.registerModEventBus(BetterBuildingMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        BetterBuildingMod.init();
    }
}
