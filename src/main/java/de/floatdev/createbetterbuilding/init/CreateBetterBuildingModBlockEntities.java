/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.floatdev.createbetterbuilding.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import de.floatdev.createbetterbuilding.block.entity.WarpedBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.SpruceBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.OakBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.MangroveBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.JungleBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.DarkOakBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.CrimsonBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.BirchBarrelBlockEntity;
import de.floatdev.createbetterbuilding.block.entity.AcaciaBarrelBlockEntity;
import de.floatdev.createbetterbuilding.CreateBetterBuildingMod;

public class CreateBetterBuildingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateBetterBuildingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OAK_BARREL = register("oak_barrel", CreateBetterBuildingModBlocks.OAK_BARREL, OakBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ACACIA_BARREL = register("acacia_barrel", CreateBetterBuildingModBlocks.ACACIA_BARREL, AcaciaBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIRCH_BARREL = register("birch_barrel", CreateBetterBuildingModBlocks.BIRCH_BARREL, BirchBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRIMSON_BARREL = register("crimson_barrel", CreateBetterBuildingModBlocks.CRIMSON_BARREL, CrimsonBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_OAK_BARREL = register("dark_oak_barrel", CreateBetterBuildingModBlocks.DARK_OAK_BARREL, DarkOakBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLE_BARREL = register("jungle_barrel", CreateBetterBuildingModBlocks.JUNGLE_BARREL, JungleBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANGROVE_BARREL = register("mangrove_barrel", CreateBetterBuildingModBlocks.MANGROVE_BARREL, MangroveBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPRUCE_BARREL = register("spruce_barrel", CreateBetterBuildingModBlocks.SPRUCE_BARREL, SpruceBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WARPED_BARREL = register("warped_barrel", CreateBetterBuildingModBlocks.WARPED_BARREL, WarpedBarrelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
