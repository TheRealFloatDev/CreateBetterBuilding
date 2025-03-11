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

import java.util.HashMap;
import java.util.Map;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BetterBuildingMod.MOD_ID,
            Registry.ITEM_REGISTRY);

    // Colored brick items
    public static final Map<DyeColor, RegistrySupplier<Item>> COLORED_BRICK_ITEMS = new HashMap<>();
    static {
        for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_brick"; // e.g., "light_blue_brick"
            COLORED_BRICK_ITEMS.put(color, ITEMS.register(name,
                    () -> new BlockItem(ModBlocks.COLORED_BRICKS.get(color).get(), new Item.Properties())));

            String slabName = color.getName() + "_brick_slab"; // e.g., "light_blue_brick_slab"
            COLORED_BRICK_ITEMS.put(color, ITEMS.register(slabName,
                    () -> new BlockItem(ModBlocks.COLORED_BRICKS_SLABS.get(color).get(), new Item.Properties())));

            String stairsName = color.getName() + "_brick_stairs"; // e.g., "light_blue_brick_stairs"
            COLORED_BRICK_ITEMS.put(color, ITEMS.register(stairsName,
                    () -> new BlockItem(ModBlocks.COLORED_BRICKS_STAIRS.get(color).get(), new Item.Properties())));
        }
    }

    // Colored stone brick items
    public static final Map<DyeColor, RegistrySupplier<Item>> COLORED_STONE_BRICK_ITEMS = new HashMap<>();
    static {
        for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_stone_brick"; // e.g., "light_blue_stone_brick"
            COLORED_STONE_BRICK_ITEMS.put(color, ITEMS.register(name,
                    () -> new BlockItem(ModBlocks.COLORED_STONE_BRICKS.get(color).get(), new Item.Properties())));

            String slabName = color.getName() + "_stone_brick_slab"; // e.g., "light_blue_stone_brick_slab"
            COLORED_STONE_BRICK_ITEMS.put(color, ITEMS.register(slabName,
                    () -> new BlockItem(ModBlocks.COLORED_STONE_BRICKS_SLABS.get(color).get(), new Item.Properties())));

            String stairsName = color.getName() + "_stone_brick_stairs"; // e.g., "light_blue_stone_brick_stairs"
            COLORED_STONE_BRICK_ITEMS.put(color, ITEMS.register(stairsName,
                    () -> new BlockItem(ModBlocks.COLORED_STONE_BRICKS_STAIRS.get(color).get(),
                            new Item.Properties())));
        }
    }

    public static void register() {
        ITEMS.register();
    }
}