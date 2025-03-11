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
const BLOCK_ID = "stone_brick";  // Base block name (e.g., "brick" -> "light_blue_brick")
const RESOURCE_PATH = path.join(EXECUTION_PATH, "common", "src", "main", "resources", "assets", MOD_ID);

// === COLOR LIST ===
const colors = [
    "white", "orange", "magenta", "light_blue", "yellow",
    "lime", "pink", "gray", "light_gray", "cyan",
    "purple", "blue", "brown", "green", "red", "black"
];

// === PATH SETUP ===
const BLOCK_PATH = path.join(RESOURCE_PATH, "models", "block");
const ITEM_PATH = path.join(RESOURCE_PATH, "models", "item");

// Ensure directories exist
[BLOCK_PATH, ITEM_PATH].forEach(dir => {
    if (!fs.existsSync(dir)) fs.mkdirSync(dir, { recursive: true });
});

// === FUNCTION TO WRITE FILES ===
function writeFile(directory, filename, data) {
    const filePath = path.join(directory, filename);
    fs.writeFileSync(filePath, JSON.stringify(data, null, 2));
    console.log(`✅ Generated: ${filePath}`);
}

// === GENERATE JSON FILES ===
colors.forEach(color => {
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
});

console.log("\n🎉 All JSON models generated successfully and placed in assets!");