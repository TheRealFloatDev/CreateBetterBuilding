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
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_BRICKS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_BRICKS_SLABS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_BRICKS_STAIRS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_BRICKS_WALLS = new HashMap<>();
    static {
        for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_brick"; // e.g., "light_blue_brick"
            COLORED_BRICKS.put(color, BLOCKS.register(name,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String slabName = color.getName() + "_brick_slab"; // e.g., "light_blue_brick_slab"
            COLORED_BRICKS_SLABS.put(color, BLOCKS.register(slabName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String stairsName = color.getName() + "_brick_stairs"; // e.g., "light_blue_brick_stairs"
            COLORED_BRICKS_STAIRS.put(color, BLOCKS.register(stairsName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String wallsName = color.getName() + "_brick_wall"; // e.g., "light_blue_brick_wall"
            COLORED_BRICKS_WALLS.put(color, BLOCKS.register(wallsName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));
        }
    }

    // Colored stone bricks blocks
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_STONE_BRICKS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_STONE_BRICKS_SLABS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_STONE_BRICKS_STAIRS = new HashMap<>();
    public static final Map<DyeColor, RegistrySupplier<Block>> COLORED_STONE_BRICKS_WALLS = new HashMap<>();
    static {
        for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_stone_brick"; // e.g., "light_blue_stone_brick"
            COLORED_STONE_BRICKS.put(color, BLOCKS.register(name,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String slabName = color.getName() + "_stone_brick_slab"; // e.g., "light_blue_stone_brick_slab"
            COLORED_STONE_BRICKS_SLABS.put(color, BLOCKS.register(slabName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String stairsName = color.getName() + "_stone_brick_stairs"; // e.g., "light_blue_stone_brick_stairs"
            COLORED_STONE_BRICKS_STAIRS.put(color, BLOCKS.register(stairsName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));

            String wallsName = color.getName() + "_stone_brick_wall"; // e.g., "light_blue_stone_brick_wall"
            COLORED_STONE_BRICKS_WALLS.put(color, BLOCKS.register(wallsName,
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0f))));
        }
    }

    public static void register() {
        BLOCKS.register();
    }
}