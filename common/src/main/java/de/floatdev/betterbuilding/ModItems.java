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
        public static final Map<String, RegistrySupplier<Item>> COLORED_BRICK_ITEMS = new HashMap<>();
        public static final String[] COLORED_BRICKS_VARIATIONS = { "" };
        static {
                for (DyeColor color : DyeColor.values()) {
                        for (String variation : COLORED_BRICKS_VARIATIONS) {
                                String name = variation + color.getName() + "_brick"; // e.g., "light_blue_brick" or
                                                                                      // "mossy_light_blue_brick"

                                String variationID = variation + color.getId();

                                COLORED_BRICK_ITEMS.put(variationID, ITEMS.register(name,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_BRICKS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String slabName = name + "_slab"; // e.g., "light_blue_brick_slab"
                                COLORED_BRICK_ITEMS.put(variationID, ITEMS.register(slabName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_BRICKS_SLABS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String stairsName = name + "_stairs"; // e.g.,
                                                                      // "light_blue_brick_stairs"
                                COLORED_BRICK_ITEMS.put(variationID, ITEMS.register(stairsName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_BRICKS_STAIRS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String wallName = name + "_wall"; // e.g., "light_blue_brick_wall"
                                COLORED_BRICK_ITEMS.put(variationID, ITEMS.register(wallName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_BRICKS_WALLS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));
                        }
                }
        }

        // Colored stone brick items
        public static final Map<String, RegistrySupplier<Item>> COLORED_STONE_BRICK_ITEMS = new HashMap<>();
        public static final String[] COLORED_STONE_BRICKS_VARIATIONS = { "", "mossy_" };
        static {
                for (DyeColor color : DyeColor.values()) {
                        for (String variation : COLORED_STONE_BRICKS_VARIATIONS) {
                                String name = variation + color.getName() + "_stone_brick"; // e.g.,
                                                                                            // "light_blue_stone_brick"

                                String variationID = variation + color.getId();

                                COLORED_STONE_BRICK_ITEMS.put(variationID, ITEMS.register(name,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_STONE_BRICKS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String slabName = name + "_slab"; // e.g.,
                                                                  // "light_blue_stone_brick_slab"
                                COLORED_STONE_BRICK_ITEMS.put(variationID, ITEMS.register(slabName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_STONE_BRICKS_SLABS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String stairsName = name + "_stairs"; // e.g.,
                                                                      // "light_blue_stone_brick_stairs"
                                COLORED_STONE_BRICK_ITEMS.put(variationID, ITEMS.register(stairsName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_STONE_BRICKS_STAIRS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));

                                String wallName = name + "_wall"; // e.g.,
                                                                  // "light_blue_stone_brick_wall"
                                COLORED_STONE_BRICK_ITEMS.put(variationID, ITEMS.register(wallName,
                                                () -> new BlockItem(
                                                                ModBlocks.COLORED_STONE_BRICKS_WALLS
                                                                                .get(variationID).get(),
                                                                new Item.Properties()
                                                                                .tab(BetterBuildingMod.CREATIVE_MODE_TAB))));
                        }

                }
        }

        public static void register() {
                ITEMS.register();
        }
}