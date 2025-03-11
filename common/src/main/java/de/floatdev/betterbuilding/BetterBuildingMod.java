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

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class BetterBuildingMod {
    public static final String MOD_ID = "create_better_building";

    public static final CreativeModeTab MY_TAB = CreativeTabRegistry.create(
            new ResourceLocation(MOD_ID, "tab"), // Tab ID
            () -> new ItemStack(Items.STONE) // Icon
    );

    public static void init() {
        // Write common init code here.
    }
}
