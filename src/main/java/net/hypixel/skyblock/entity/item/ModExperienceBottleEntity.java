package net.hypixel.skyblock.entity.item;

import net.hypixel.skyblock.items.ModExperienceBottleItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceBottleEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * A {@link ExperienceBottleEntity} for {@link ModExperienceBottleItem}
 *
 * @author MrPineapple070
 * @version 20 May 2020
 */
public class ModExperienceBottleEntity extends ExperienceBottleEntity {
	/**
	 * The {@link ModExperienceBottleItem.Type} of this.
	 */
	private final ModExperienceBottleItem.Type type;

	public ModExperienceBottleEntity(EntityType<? extends ExperienceBottleEntity> entityTypeIn, World worldIn,
			ModExperienceBottleItem.Type typeIn) {
		super(entityTypeIn, worldIn);
		this.type = typeIn;
	}

	public ModExperienceBottleEntity(World worldIn, double x, double y, double z, ModExperienceBottleItem.Type typeIn) {
		super(worldIn, x, y, z);
		this.type = typeIn;
	}

	public ModExperienceBottleEntity(World worldIn, LivingEntity throwerIn, ModExperienceBottleItem.Type typeIn) {
		super(worldIn, throwerIn);
		this.type = typeIn;
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		// TODO Change this
		switch (this.type) {
		case GRAND:
			super.onImpact(result);
			break;
		case TITANIC:
			super.onImpact(result);
			break;
		default:
			return;
		}
	}
}
