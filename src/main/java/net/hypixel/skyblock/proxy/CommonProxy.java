package net.hypixel.skyblock.proxy;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

/**
 * An Interface for {@link ClientProxy} and {@link ServerProxy}.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public interface CommonProxy {
	/**
	 * This Method should only be called in {@link ClientProxy}
	 *
	 * @return {@link PlayerEntity}
	 */
	PlayerEntity getClientPlayer();

	/**
	 * This Method should only be called in {@link ClientProxy}
	 *
	 * @return {@link ClientWorld}
	 */
	World getClientWorld();

	/**
	 * This Method should only be called in {@link ServerProxy}
	 *
	 * @return {@link ServerWorld}
	 */
	ServerWorld getWorld();

	/**
	 * Initialize the proxy.
	 */
	void init();
}