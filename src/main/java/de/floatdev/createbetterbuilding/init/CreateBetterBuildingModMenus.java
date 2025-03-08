/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package de.floatdev.createbetterbuilding.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import de.floatdev.createbetterbuilding.world.inventory.BarrelGuiMenu;
import de.floatdev.createbetterbuilding.CreateBetterBuildingMod;

public class CreateBetterBuildingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreateBetterBuildingMod.MODID);
	public static final RegistryObject<MenuType<BarrelGuiMenu>> BARREL_GUI = REGISTRY.register("barrel_gui", () -> IForgeMenuType.create(BarrelGuiMenu::new));
}
