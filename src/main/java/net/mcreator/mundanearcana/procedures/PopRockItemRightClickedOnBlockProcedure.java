package net.mcreator.mundanearcana.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

import net.mcreator.mundanearcana.MundanearcanaModElements;
import net.mcreator.mundanearcana.MundanearcanaMod;

import java.util.Map;

@MundanearcanaModElements.ModElement.Tag
public class PopRockItemRightClickedOnBlockProcedure extends MundanearcanaModElements.ModElement {
	public PopRockItemRightClickedOnBlockProcedure(MundanearcanaModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency itemstack for procedure PopRockItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency x for procedure PopRockItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency y for procedure PopRockItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency z for procedure PopRockItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency world for procedure PopRockItemRightClickedOnBlock!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		((itemstack)).shrink((int) 1);
	}
}
