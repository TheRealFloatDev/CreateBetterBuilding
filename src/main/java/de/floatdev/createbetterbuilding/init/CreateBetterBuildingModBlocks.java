/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.floatdev.createbetterbuilding.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import de.floatdev.createbetterbuilding.block.YellowStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.WhiteStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.RedStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.PurpleStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.PinkStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.OrangeStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.OakBarrelBlock;
import de.floatdev.createbetterbuilding.block.MagentaStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.LimeStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.LightGrayStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.LightBlueStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.HandrailBlock;
import de.floatdev.createbetterbuilding.block.GreenStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.GrayStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.CyanStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.BrownStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.BlueStoneBrickBlock;
import de.floatdev.createbetterbuilding.block.BlackStoneBrickBlock;
import de.floatdev.createbetterbuilding.CreateBetterBuildingMod;

public class CreateBetterBuildingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateBetterBuildingMod.MODID);
	public static final RegistryObject<Block> HANDRAIL = REGISTRY.register("handrail", () -> new HandrailBlock());
	public static final RegistryObject<Block> OAK_BARREL = REGISTRY.register("oak_barrel", () -> new OakBarrelBlock());
	public static final RegistryObject<Block> WHITE_STONE_BRICK = REGISTRY.register("white_stone_brick", () -> new WhiteStoneBrickBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_STONE_BRICK = REGISTRY.register("light_gray_stone_brick", () -> new LightGrayStoneBrickBlock());
	public static final RegistryObject<Block> GRAY_STONE_BRICK = REGISTRY.register("gray_stone_brick", () -> new GrayStoneBrickBlock());
	public static final RegistryObject<Block> BLACK_STONE_BRICK = REGISTRY.register("black_stone_brick", () -> new BlackStoneBrickBlock());
	public static final RegistryObject<Block> BROWN_STONE_BRICK = REGISTRY.register("brown_stone_brick", () -> new BrownStoneBrickBlock());
	public static final RegistryObject<Block> RED_STONE_BRICK = REGISTRY.register("red_stone_brick", () -> new RedStoneBrickBlock());
	public static final RegistryObject<Block> ORANGE_STONE_BRICK = REGISTRY.register("orange_stone_brick", () -> new OrangeStoneBrickBlock());
	public static final RegistryObject<Block> YELLOW_STONE_BRICK = REGISTRY.register("yellow_stone_brick", () -> new YellowStoneBrickBlock());
	public static final RegistryObject<Block> LIME_STONE_BRICK = REGISTRY.register("lime_stone_brick", () -> new LimeStoneBrickBlock());
	public static final RegistryObject<Block> GREEN_STONE_BRICK = REGISTRY.register("green_stone_brick", () -> new GreenStoneBrickBlock());
	public static final RegistryObject<Block> CYAN_STONE_BRICK = REGISTRY.register("cyan_stone_brick", () -> new CyanStoneBrickBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_STONE_BRICK = REGISTRY.register("light_blue_stone_brick", () -> new LightBlueStoneBrickBlock());
	public static final RegistryObject<Block> BLUE_STONE_BRICK = REGISTRY.register("blue_stone_brick", () -> new BlueStoneBrickBlock());
	public static final RegistryObject<Block> PURPLE_STONE_BRICK = REGISTRY.register("purple_stone_brick", () -> new PurpleStoneBrickBlock());
	public static final RegistryObject<Block> MAGENTA_STONE_BRICK = REGISTRY.register("magenta_stone_brick", () -> new MagentaStoneBrickBlock());
	public static final RegistryObject<Block> PINK_STONE_BRICK = REGISTRY.register("pink_stone_brick", () -> new PinkStoneBrickBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
