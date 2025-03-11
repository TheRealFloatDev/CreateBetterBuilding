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

const fs = require("fs");
const path = require("path");

const EXECUTION_PATH = process.cwd();

// === CONFIGURABLE SETTINGS ===
const MOD_ID = "create_better_building";  // Replace with your mod ID
const BLOCKS = [
    {
        blockId: "brick",
        craftingBase: "minecraft:bricks"
    },
    {
        blockId: "stone_brick",
        craftingBase: "minecraft:stone_bricks"
    },
];  // Base block name (e.g., "brick" -> "light_blue_brick")
const RESOURCE_PATH = path.join(EXECUTION_PATH, "common", "src", "main", "resources", "assets", MOD_ID);
const DATA_PATH = path.join(EXECUTION_PATH, "common", "src", "main", "resources", "data");

// === COLOR LIST ===
const colors = [
    "white", "orange", "magenta", "light_blue", "yellow",
    "lime", "pink", "gray", "light_gray", "cyan",
    "purple", "blue", "brown", "green", "red", "black"
];

// === CONSTANTS ===
const constants = require("./constants");

// === PATH SETUP ===
const BLOCK_PATH = path.join(RESOURCE_PATH, "models", "block");
const ITEM_PATH = path.join(RESOURCE_PATH, "models", "item");
const BLOCKSTATE_PATH = path.join(RESOURCE_PATH, "blockstates");

const BLOCK_TAGS_PATH = path.join(DATA_PATH, "minecraft", "tags", "blocks");
const MINEABLE_TAGS_PATH = path.join(BLOCK_TAGS_PATH, "mineable");

const RECIPE_PATH = path.join(DATA_PATH, MOD_ID, "recipes");

// Ensure directories exist
[BLOCK_PATH, ITEM_PATH, BLOCKSTATE_PATH, BLOCK_TAGS_PATH, MINEABLE_TAGS_PATH, RECIPE_PATH].forEach(dir => {
    if (!fs.existsSync(dir)) fs.mkdirSync(dir, { recursive: true });
});

// === FUNCTION TO WRITE FILES ===
function writeFile(directory, filename, data) {
    const filePath = path.join(directory, filename);
    fs.writeFileSync(filePath, JSON.stringify(data, null, 2));
    console.log(`✅ Generated: ${filePath}`);
}

// === GENERATE JSON FILES ===
BLOCKS.forEach(block => {
    colors.forEach(color => {
        const BLOCK_ID = block.blockId;
        const CRAFTING_BASE = block.craftingBase;

        const blockName = `${color}_${BLOCK_ID}`;
        const texture = `${MOD_ID}:block/${blockName}`;

        // Block Models
        writeFile(BLOCK_PATH, `${blockName}.json`, {
            parent: "minecraft:block/cube_all",
            textures: { all: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_slab.json`, {
            parent: "minecraft:block/slab",
            textures: { bottom: texture, top: texture, side: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_slab_top.json`, {
            parent: "minecraft:block/slab_top",
            textures: { bottom: texture, top: texture, side: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_stairs.json`, {
            parent: "minecraft:block/stairs",
            textures: { bottom: texture, top: texture, side: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_stairs_inner.json`, {
            parent: "minecraft:block/inner_stairs",
            textures: { bottom: texture, top: texture, side: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_stairs_outer.json`, {
            parent: "minecraft:block/outer_stairs",
            textures: { bottom: texture, top: texture, side: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_wall_post.json`, {
            parent: "minecraft:block/template_wall_post",
            textures: { wall: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_wall_side.json`, {
            parent: "minecraft:block/template_wall_side",
            textures: { wall: texture }
        });

        writeFile(BLOCK_PATH, `${blockName}_wall_side_tall.json`, {
            parent: "minecraft:block/template_wall_side_tall",
            textures: { wall: texture }
        });

        // Item Models
        writeFile(ITEM_PATH, `${blockName}.json`, {
            parent: `${MOD_ID}:block/${blockName}`
        });

        writeFile(ITEM_PATH, `${blockName}_slab.json`, {
            parent: `${MOD_ID}:block/${blockName}_slab`
        });

        writeFile(ITEM_PATH, `${blockName}_stairs.json`, {
            parent: `${MOD_ID}:block/${blockName}_stairs`
        });

        writeFile(ITEM_PATH, `${blockName}_wall.json`, {
            parent: "minecraft:block/wall_inventory",
            textures: { wall: texture }
        });

        // Blockstates
        writeFile(BLOCKSTATE_PATH, `${blockName}.json`, {
            variants: {
                "": { model: `${MOD_ID}:block/${blockName}` }
            }
        });

        writeFile(BLOCKSTATE_PATH, `${blockName}_slab.json`, {
            variants: {
                "type=bottom": { model: `${MOD_ID}:block/${blockName}_slab` },
                "type=top": { model: `${MOD_ID}:block/${blockName}_slab_top` },
                "type=double": { model: `${MOD_ID}:block/${blockName}` }
            }
        });

        writeFile(BLOCKSTATE_PATH, `${blockName}_stairs.json`, {
            variants: {
                "facing=east,half=bottom,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs` },
                "facing=west,half=bottom,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, y: 180 },
                "facing=south,half=bottom,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, y: 90 },
                "facing=north,half=bottom,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, y: 270 },
                "facing=east,half=top,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, x: 180 },
                "facing=west,half=top,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, x: 180, y: 180 },
                "facing=south,half=top,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, x: 180, y: 90 },
                "facing=north,half=top,shape=straight": { model: `${MOD_ID}:block/${blockName}_stairs`, x: 180, y: 270 },

                "facing=east,half=bottom,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner` },
                "facing=west,half=bottom,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 180 },
                "facing=south,half=bottom,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 90 },
                "facing=north,half=bottom,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 270 },
                "facing=east,half=top,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180 },
                "facing=west,half=top,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 180 },
                "facing=south,half=top,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 90 },
                "facing=north,half=top,shape=inner_right": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 270 },

                "facing=east,half=bottom,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer` },
                "facing=west,half=bottom,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 180 },
                "facing=south,half=bottom,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 90 },
                "facing=north,half=bottom,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 270 },
                "facing=east,half=top,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180 },
                "facing=west,half=top,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 180 },
                "facing=south,half=top,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 90 },
                "facing=north,half=top,shape=outer_right": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 270 },

                "facing=east,half=bottom,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner` },
                "facing=west,half=bottom,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 180 },
                "facing=south,half=bottom,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 90 },
                "facing=north,half=bottom,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, y: 270 },
                "facing=east,half=top,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180 },
                "facing=west,half=top,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 180 },
                "facing=south,half=top,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 90 },
                "facing=north,half=top,shape=inner_left": { model: `${MOD_ID}:block/${blockName}_stairs_inner`, x: 180, y: 270 },

                "facing=east,half=bottom,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer` },
                "facing=west,half=bottom,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 180 },
                "facing=south,half=bottom,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 90 },
                "facing=north,half=bottom,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, y: 270 },
                "facing=east,half=top,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180 },
                "facing=west,half=top,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 180 },
                "facing=south,half=top,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 90 },
                "facing=north,half=top,shape=outer_left": { model: `${MOD_ID}:block/${blockName}_stairs_outer`, x: 180, y: 270 }
            }
        });

        writeFile(BLOCKSTATE_PATH, `${blockName}_wall.json`, {
            multipart: [
                { apply: { model: `${MOD_ID}:block/${blockName}_wall_post` }, when: { up: "true" } },

                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side`, y: 90, uvlock: true }, when: { east: "low" } },
                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side_tall`, y: 90, uvlock: true }, when: { east: "tall" } },

                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side`, uvlock: true }, when: { north: "low" } },
                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side_tall`, uvlock: true }, when: { north: "tall" } },

                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side`, y: 270, uvlock: true }, when: { west: "low" } },
                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side_tall`, y: 270, uvlock: true }, when: { west: "tall" } },

                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side`, y: 180, uvlock: true }, when: { south: "low" } },
                { apply: { model: `${MOD_ID}:block/${blockName}_wall_side_tall`, y: 180, uvlock: true }, when: { south: "tall" } }
            ]
        });

        // Crafting Recipes
        writeFile(RECIPE_PATH, `${blockName}_crafting.json`, {
            type: "minecraft:crafting_shaped",
            pattern: ["aaa", "aba", "aaa"],
            key: {
                a: { item: CRAFTING_BASE },
                b: { item: `minecraft:${color}_dye` }
            },
            result: { item: `${MOD_ID}:${blockName}`, count: 8 }
        });

        // Stone Cutter Recipes
        writeFile(RECIPE_PATH, `${blockName}_slab_stonecutting.json`, {
            type: "minecraft:stonecutting",
            ingredient: { item: `${MOD_ID}:${blockName}` },
            result: `${MOD_ID}:${blockName}_slab`,
            count: 2
        });

        writeFile(RECIPE_PATH, `${blockName}_stairs_stonecutting.json`, {
            type: "minecraft:stonecutting",
            ingredient: { item: `${MOD_ID}:${blockName}` },
            result: `${MOD_ID}:${blockName}_stairs`,
            count: 1
        });

        writeFile(RECIPE_PATH, `${blockName}_wall_stonecutting.json`, {
            type: "minecraft:stonecutting",
            ingredient: { item: `${MOD_ID}:${blockName}` },
            result: `${MOD_ID}:${blockName}_wall`,
            count: 1
        });

    });
});

// === GENERATE TAGS ===

const BLOCK_IDS = BLOCKS.map(block => block.blockId);

// Walls
writeFile(BLOCK_TAGS_PATH, "walls.json", {
    replace: false,
    values: BLOCK_IDS.map(BLOCK_ID => colors.map(color => `${MOD_ID}:${color}_${BLOCK_ID}_wall`)).flat().concat(constants.WALLS)
});

// Slabs
writeFile(BLOCK_TAGS_PATH, "slabs.json", {
    replace: false,
    values: BLOCK_IDS.map(BLOCK_ID => colors.map(color => `${MOD_ID}:${color}_${BLOCK_ID}_slab`)).flat().concat(constants.SLABS)
});

// Stairs
writeFile(BLOCK_TAGS_PATH, "stairs.json", {
    replace: false,
    values: BLOCK_IDS.map(BLOCK_ID => colors.map(color => `${MOD_ID}:${color}_${BLOCK_ID}_stairs`)).flat().concat(constants.STAIRS)
});

// Mineable pickaxe
writeFile(MINEABLE_TAGS_PATH, "pickaxe.json", {
    replace: false,
    values: BLOCK_IDS.map(BLOCK_ID => colors.map(color => [
        `${MOD_ID}:${color}_${BLOCK_ID}`,
        `${MOD_ID}:${color}_${BLOCK_ID}_slab`,
        `${MOD_ID}:${color}_${BLOCK_ID}_stairs`,
        `${MOD_ID}:${color}_${BLOCK_ID}_wall`
    ]).flat()).flat().concat(constants.PICKAXE_MINEABLES)
});

console.log("\n🎉 All JSON models generated successfully and placed in assets!");