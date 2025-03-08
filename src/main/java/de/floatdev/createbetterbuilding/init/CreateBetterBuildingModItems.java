
/*
 *    MCreator note: This file will be REGENERATED on each build.
*/
package de.floatdev.createbetterbuilding.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import de.floatdev.createbetterbuilding.CreateBetterBuildingMod;

public class CreateBetterBuildingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateBetterBuildingMod.MODID);
	public static final RegistryObject<Item> HANDRAIL = block(CreateBetterBuildingModBlocks.HANDRAIL, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> OAK_BARREL = block(CreateBetterBuildingModBlocks.OAK_BARREL, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> WHITE_STONE_BRICK = block(CreateBetterBuildingModBlocks.WHITE_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STONE_BRICK = block(CreateBetterBuildingModBlocks.LIGHT_GRAY_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> GRAY_STONE_BRICK = block(CreateBetterBuildingModBlocks.GRAY_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> BLACK_STONE_BRICK = block(CreateBetterBuildingModBlocks.BLACK_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> BROWN_STONE_BRICK = block(CreateBetterBuildingModBlocks.BROWN_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> RED_STONE_BRICK = block(CreateBetterBuildingModBlocks.RED_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> ORANGE_STONE_BRICK = block(CreateBetterBuildingModBlocks.ORANGE_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> YELLOW_STONE_BRICK = block(CreateBetterBuildingModBlocks.YELLOW_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> LIME_STONE_BRICK = block(CreateBetterBuildingModBlocks.LIME_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> GREEN_STONE_BRICK = block(CreateBetterBuildingModBlocks.GREEN_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> CYAN_STONE_BRICK = block(CreateBetterBuildingModBlocks.CYAN_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STONE_BRICK = block(CreateBetterBuildingModBlocks.LIGHT_BLUE_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> BLUE_STONE_BRICK = block(CreateBetterBuildingModBlocks.BLUE_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> PURPLE_STONE_BRICK = block(CreateBetterBuildingModBlocks.PURPLE_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> MAGENTA_STONE_BRICK = block(CreateBetterBuildingModBlocks.MAGENTA_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> PINK_STONE_BRICK = block(CreateBetterBuildingModBlocks.PINK_STONE_BRICK, CreateBetterBuildingModTabs.TAB_CREATIVE_TAB);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
