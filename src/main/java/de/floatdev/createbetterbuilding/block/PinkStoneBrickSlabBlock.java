
package de.floatdev.createbetterbuilding.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PinkStoneBrickSlabBlock extends SlabBlock {
	public PinkStoneBrickSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops());
	}
}
