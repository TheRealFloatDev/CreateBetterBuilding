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
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.core.Registry;

public class ModBlocks {
        // Create a registry for blocks
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BetterBuildingMod.MOD_ID,
                        Registry.BLOCK_REGISTRY);

        // Example brick block
        /*
         * public static final RegistrySupplier<Block> CUSTOM_BRICK =
         * BLOCKS.register("custom_brick",
         * () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,
         * 6.0f)));
         */

        // Colored brick blocks
        public static final Map<String, RegistrySupplier<Block>> COLORED_BRICKS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_BRICKS_SLABS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_BRICKS_STAIRS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_BRICKS_WALLS = new HashMap<>();
        public static final String[] COLORED_BRICKS_VARIATIONS = { "" };
        static {
                for (DyeColor color : DyeColor.values()) {
                        for (String variation : COLORED_BRICKS_VARIATIONS) {
                                String name = variation + color.getName() + "_brick"; // e.g., "light_blue_brick"
                                RegistrySupplier<Block> brickBlock = BLOCKS.register(name,
                                                () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(
                                                                2.0f,
                                                                6.0f)));
                                COLORED_BRICKS.put(variation + color.getName(), brickBlock);

                                String slabName = name + "_slab"; // e.g., "light_blue_brick_slab"
                                COLORED_BRICKS_SLABS.put(variation + color.getName(), BLOCKS.register(slabName,
                                                () -> new SlabBlock(BlockBehaviour.Properties.copy(brickBlock.get()))));

                                String stairsName = name + "_stairs"; // e.g., "light_blue_brick_stairs"
                                COLORED_BRICKS_STAIRS.put(variation + color.getName(), BLOCKS.register(stairsName,
                                                () -> new StairBlock(brickBlock.get().defaultBlockState(),
                                                                BlockBehaviour.Properties.copy(brickBlock.get()))));

                                String wallsName = name + "_wall"; // e.g., "light_blue_brick_wall"
                                COLORED_BRICKS_WALLS.put(variation + color.getName(), BLOCKS.register(wallsName,
                                                () -> new WallBlock(BlockBehaviour.Properties.copy(brickBlock.get()))));
                        }

                }
        }

        // Colored stone bricks blocks
        public static final Map<String, RegistrySupplier<Block>> COLORED_STONE_BRICKS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_STONE_BRICKS_SLABS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_STONE_BRICKS_STAIRS = new HashMap<>();
        public static final Map<String, RegistrySupplier<Block>> COLORED_STONE_BRICKS_WALLS = new HashMap<>();
        public static final String[] COLORED_STONE_BRICKS_VARIATIONS = { "", "mossy_" };
        static {
                for (DyeColor color : DyeColor.values()) {
                        for (String variation : COLORED_STONE_BRICKS_VARIATIONS) {
                                String name = variation + color.getName() + "_stone_brick"; // e.g.,
                                                                                            // "light_blue_stone_brick"
                                RegistrySupplier<Block> stoneBrickBlock = BLOCKS.register(name,
                                                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                                                                .strength(2.0f, 6.0f)));
                                COLORED_STONE_BRICKS.put(variation + color.getName(), stoneBrickBlock);

                                String slabName = name + "_slab"; // e.g.,
                                                                  // "light_blue_stone_brick_slab"
                                COLORED_STONE_BRICKS_SLABS.put(variation + color.getName(), BLOCKS.register(slabName,
                                                () -> new SlabBlock(BlockBehaviour.Properties
                                                                .copy(stoneBrickBlock.get()))));

                                String stairsName = name + "_stairs"; // e.g.,
                                                                      // "light_blue_stone_brick_stairs"
                                COLORED_STONE_BRICKS_STAIRS.put(variation + color.getName(), BLOCKS.register(stairsName,
                                                () -> new StairBlock(stoneBrickBlock.get().defaultBlockState(),
                                                                BlockBehaviour.Properties
                                                                                .copy(stoneBrickBlock.get()))));

                                String wallsName = name + "_wall"; // e.g.,
                                                                   // "light_blue_stone_brick_wall"
                                COLORED_STONE_BRICKS_WALLS.put(variation + color.getName(), BLOCKS.register(wallsName,
                                                () -> new WallBlock(BlockBehaviour.Properties
                                                                .copy(stoneBrickBlock.get()))));
                        }
                }
        }

        public static void register() {
                BLOCKS.register();
        }
}