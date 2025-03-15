/*
 *   Copyright (c) 2025 Alexander Neitzel (TheRealFloatDev)

 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.

 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.

 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.floatdev.betterbuilding;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

public final class BetterBuildingMod {

    public static final String MOD_ID = "create_better_building";

    private static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab CREATIVE_MODE_TAB = CreativeTabRegistry.create(
            new ResourceLocation(BetterBuildingMod.MOD_ID, "tab_creative_tab"), // Tab ID
            () -> new ItemStack(ModItems.COLORED_BRICK_ITEMS.get(DyeColor.RED.getName()).get()) // Example icon
    );

    public static void init() {
        // Write common init code here.
        ModBlocks.register();
        ModItems.register();
    }
}
