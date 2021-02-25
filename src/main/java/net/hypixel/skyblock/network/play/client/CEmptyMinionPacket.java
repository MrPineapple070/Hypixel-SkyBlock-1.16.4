package net.hypixel.skyblock.network.play.client;

import java.io.IOException;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

/**
 * @author MrPineapple070
 * @version 13 December 2020
 * @since 11 July 2019
 */
public class CEmptyMinionPacket implements IPacket<IServerPlayNetHandler> {
	public CEmptyMinionPacket() {
	}
	
	@Override
	public void readPacketData(PacketBuffer buf) throws IOException {
		HypixelSkyBlockMod.LOGGER.info(buf.toString());
	}

	@Override
	public void writePacketData(PacketBuffer buf) throws IOException {
		HypixelSkyBlockMod.LOGGER.info(buf.toString());
	}

	@Override
	public void processPacket(IServerPlayNetHandler handler) {
		HypixelSkyBlockMod.LOGGER.info(handler.toString());
	}
}