package net.hypixel.skyblock.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

/**
 * Client-side {@link CommonProxy}
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class ClientProxy implements CommonProxy {
	@Override
	@SuppressWarnings("resource")
	public PlayerEntity getClientPlayer() {
		return Minecraft.getInstance().player;
	}

	@Override
	@SuppressWarnings("resource")
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}

	@Override
	public ServerWorld getWorld() {
		throw new IllegalStateException("Only run this on the server!");
	}

	@Override
	public void init() {
	}
}