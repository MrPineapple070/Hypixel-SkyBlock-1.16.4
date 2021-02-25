package net.hypixel.skyblock.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

/**
 * Server-side {@link CommonProxy}
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class ServerProxy implements CommonProxy {
	@Override
	public PlayerEntity getClientPlayer() {
		throw new IllegalStateException("Only run this on the client!");
	}

	@Override
	public World getClientWorld() {
		throw new IllegalStateException("Only run this on the client!");
	}

	@Override
	public ServerWorld getWorld() {
		return this.getWorld();
	}

	@Override
	public void init() {
	}
}