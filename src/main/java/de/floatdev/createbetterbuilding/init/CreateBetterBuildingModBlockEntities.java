/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.floatdev.createbetterbuilding.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import de.floatdev.createbetterbuilding.block.entity.OakBarrelBlockEntity;
import de.floatdev.createbetterbuilding.CreateBetterBuildingMod;

public class CreateBetterBuildingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateBetterBuildingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OAK_BARREL = register("oak_barrel", CreateBetterBuildingModBlocks.OAK_BARREL, OakBarrelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
