package net.mcreator.ultimate_infinity.procedure;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.ultimate_infinity.ElementsUltimateInfinityMod;

import java.util.Map;

@ElementsUltimateInfinityMod.ModElement.Tag
public class ProcedureAboundingBladesMobIsHitWithTool extends ElementsUltimateInfinityMod.ModElement {
	public ProcedureAboundingBladesMobIsHitWithTool(ElementsUltimateInfinityMod instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AboundingBladesMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double entityMaxHealth = 0;
		double currentEntityHealth = 0;
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1)
					- (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getMaxHealth() : -1) / 5)));
	}
}
