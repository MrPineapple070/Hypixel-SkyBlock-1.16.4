package net.hypixel.skyblock.items.fishing_rod;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * Mod version of {@link FishingRodItem}
 *
 * @author MrPineapple070
 * @version 01 September 2020
 * @since 01 September 2020
 */
public class ModFishingRodItem extends FishingRodItem {
	@Nonnull
	final ModItemRarity rarity;

	public ModFishingRodItem(ModItemRarity rarity) {
		super(ItemProperties.fi1);
		this.rarity = Objects.requireNonNull(rarity, "ModItemRarity must be nonnull");
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return ((IFormattableTextComponent) super.getDisplayName(stack)).mergeStyle(this.rarity.color);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (!(playerIn instanceof ModServerPlayerEntity))
			return ActionResult.resultFail(playerIn.getHeldItem(handIn));
		final ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (playerIn.fishingBobber != null) {
			if (!worldIn.isRemote) {
				final int i = playerIn.fishingBobber.handleHookRetraction(itemstack);
				itemstack.damageItem(i, playerIn, p_220000_1_ -> {
					p_220000_1_.sendBreakAnimation(handIn);
				});
			}
			worldIn.playSound((PlayerEntity) null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
					SoundEvents.ENTITY_FISHING_BOBBER_RETRIEVE, SoundCategory.NEUTRAL, 1F,
					.4F / (random.nextFloat() * .4F + .8F));
		} else {
			worldIn.playSound((PlayerEntity) null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
					SoundEvents.ENTITY_FISHING_BOBBER_THROW, SoundCategory.NEUTRAL, .5F,
					.4F / (random.nextFloat() * .4F + .8F));
			((ModServerPlayerEntity) playerIn).consumeBait();
			if (!worldIn.isRemote)
				worldIn.addEntity(
						new FishingBobberEntity(playerIn, worldIn, EnchantmentHelper.getFishingLuckBonus(itemstack),
								EnchantmentHelper.getFishingSpeedBonus(itemstack)));
			playerIn.addStat(Stats.ITEM_USED.get(this));
		}
		return ActionResult.resultSuccess(itemstack);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		return false;
	}
}