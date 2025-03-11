/*
 *   Copyright (c) 2025 Garmingo UG (haftungsbeschraenkt)
 *   All rights reserved.
 *   Unauthorized use, reproduction, and distribution of this source code is strictly prohibited.
 */
package de.floatdev.betterbuilding.fabric;

import net.fabricmc.api.ModInitializer;

import de.floatdev.betterbuilding.BetterBuildingMod;

public final class BetterBuildingModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        BetterBuildingMod.init();
    }
}
