
package de.floatdev.createbetterbuilding.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class LimeStoneBrickStairsBlock extends StairBlock {
	public LimeStoneBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
