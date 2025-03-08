/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.floatdev.createbetterbuilding.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreateBetterBuildingModTabs {
	public static CreativeModeTab TAB_CREATIVE_TAB;

	public static void load() {
		TAB_CREATIVE_TAB = new CreativeModeTab("tab_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreateBetterBuildingModBlocks.OAK_BARREL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
