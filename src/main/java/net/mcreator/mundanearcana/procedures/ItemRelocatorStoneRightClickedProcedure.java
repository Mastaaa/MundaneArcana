package net.mcreator.mundanearcana.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mundanearcana.MundanearcanaModElements;
import net.mcreator.mundanearcana.MundanearcanaMod;

import java.util.Map;
import java.util.Collections;

@MundanearcanaModElements.ModElement.Tag
public class ItemRelocatorStoneRightClickedProcedure extends MundanearcanaModElements.ModElement {
	public ItemRelocatorStoneRightClickedProcedure(MundanearcanaModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency entity for procedure ItemRelocatorStoneRightClicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MundanearcanaMod.LOGGER.warn("Failed to load dependency itemstack for procedure ItemRelocatorStoneRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double PlayerPosX = 0;
		double PlayerPosY = 0;
		double PlayerPosZ = 0;
		boolean IsPlayerPosSaved = false;
		if (((IsPlayerPosSaved) == (true))) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((PlayerPosX), (PlayerPosY), (PlayerPosZ));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((PlayerPosX), (PlayerPosY), (PlayerPosZ), _ent.rotationYaw,
							_ent.rotationPitch, Collections.emptySet());
				}
			}
			((itemstack)).shrink((int) 1);
		} else {
			PlayerPosX = (double) (entity.getPosX());
			PlayerPosY = (double) (entity.getPosY());
			PlayerPosZ = (double) (entity.getPosZ());
			IsPlayerPosSaved = (boolean) (true);
		}
	}
}
