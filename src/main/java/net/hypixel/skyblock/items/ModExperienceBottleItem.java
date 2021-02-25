package net.hypixel.skyblock.items;

import net.hypixel.skyblock.entity.item.ModExperienceBottleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

/**
 * Used for custom {@link ExperienceBottleItem}
 *
 * @author MrPineapple070
 * @version 20 May 2020
 */
public class ModExperienceBottleItem extends ExperienceBottleItem {
	/**
	 * An enumerated type determining the type of {@link ModExperienceBottleItem}
	 *
	 * @author MrPineapple070
	 * @version 20 May 2020
	 */
	public enum Type {
		GRAND, TITANIC;
	}

	/**
	 * The {@link Type} of this
	 */
	private final ModExperienceBottleItem.Type type;

	/**
	 * Construct this
	 *
	 * @param builder {@link Properties}
	 * @param type    {@link Type}
	 */
	public ModExperienceBottleItem(Properties builder, Type type) {
		super(builder);
		if (type == null)
			throw new IllegalArgumentException("ModExperienceBottleItem must have a Type");
		this.type = type;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		final ItemStack itemstack = playerIn.getHeldItem(handIn);
		worldIn.playSound((PlayerEntity) null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
				SoundEvents.ENTITY_EXPERIENCE_BOTTLE_THROW, SoundCategory.NEUTRAL, 0.5F,
				0.4F / (random.nextFloat() * 0.4F + 0.8F));
		if (!worldIn.isRemote) {
			final ModExperienceBottleEntity exp_entity = new ModExperienceBottleEntity(worldIn, playerIn,
					this.type);
			exp_entity.setItem(itemstack);
			exp_entity.shoot(playerIn.rotationPitch, playerIn.rotationYaw, -20f, -7f, 1f);
			worldIn.addEntity(exp_entity);
		}

		playerIn.addStat(Stats.ITEM_USED.get(this));
		if (!playerIn.abilities.isCreativeMode)
			itemstack.shrink(1);
		return ActionResult.resultSuccess(itemstack);
	}
}