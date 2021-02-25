package net.hypixel.skyblock.events.enchantments;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.init.EnchantmentInit;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/**
 * Handle {@link EnchantmentInit#telekinesis_tool} and
 * {@link EnchantmentInit#telekinesis_weapon}.
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
@Mod.EventBusSubscriber(modid = HypixelSkyBlockMod.MOD_ID, bus = Bus.FORGE)
public class TelekinesisEvent {
	/**
	 * Called whenever {@link BreakEvent} is fired. <br>
	 * Move all Block Drops into the Player's inventory if Telekinesis is detected.
	 * <br>
	 * Also add any experience dropped to the player.
	 *
	 * @param event {@code BreakEvent}
	 */
	@SubscribeEvent
	public static void telekinesis(BreakEvent event) {
		final PlayerEntity p = event.getPlayer();

		if (p.isCreative() || p.isSpectator())
			return;

		final int lt = EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.telekinesis_tool.get(),
				p.getHeldItemMainhand());
		final int lw = EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.telekinesis_weapon.get(),
				p.getHeldItemMainhand());

		if (lt <= 0 && lw <= 0)
			return;

		final IWorld w = event.getWorld();
		final BlockPos pos = event.getPos();

		for (final ItemStack stack : Block.getDrops(w.getBlockState(pos), (ServerWorld) w, pos, null))
			p.addItemStackToInventory(stack);

		w.destroyBlock(pos, false);
		p.addExperienceLevel(event.getExpToDrop());
		return;
	}

	/**
	 * Called whenever {@link LivingDeathEvent} is fired. <br>
	 * Move all Mob Drops into the Player's inventory if Telekinesis is detected.
	 * <br>
	 * Also add any experience dropped to the player.
	 *
	 * @param event {@code LivingDeathEvent}
	 */
	@SubscribeEvent
	public static void telekinesis(LivingDeathEvent event) {
		final LivingEntity entity = event.getEntityLiving();
		final LivingEntity attacker = entity.getAttackingEntity();

		if (!(attacker instanceof PlayerEntity))
			return;

		final PlayerEntity p = (PlayerEntity) attacker;

		if (p.isCreative() || p.isSpectator())
			return;

		final int lt = EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.telekinesis_tool.get(),
				p.getHeldItemMainhand());
		final int lw = EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.telekinesis_weapon.get(),
				p.getHeldItemMainhand());
		if (lt <= 0 && lw <= 0)
			return;
	}
}