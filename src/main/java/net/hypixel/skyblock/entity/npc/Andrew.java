package net.hypixel.skyblock.entity.npc;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.entity.ModEntityTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * 
 * @author MrPineapple070
 * @version 03 March 2021
 * @since 11 July 2019
 */
public class Andrew extends VillageNPC {
	public static final TranslationTextComponent name = new TranslationTextComponent("npc.andrew");
	public static final List<TranslationTextComponent> speach = Arrays
			.asList(new TranslationTextComponent("npc.andrew.0"), new TranslationTextComponent("npc.andrew.1"));
	
	public Andrew(EntityType<? extends Entity> type, World world) {
		super(type, world);
		this.setPosition(38, 68, -46);
		this.setCustomName(name);
	}
	
	public Andrew(World worldIn) {
		this(ModEntityTypes.Andrew.get(), worldIn);
	}

	@Override
	public ActionResultType applyPlayerInteraction(PlayerEntity player, Vector3d vec, Hand hand) {
		LOGGER.info(player.getName().getString() + " applyPlayerInteraction");
		LOGGER.info(vec.toString());
		LOGGER.info(hand.name());
		return ActionResultType.PASS;
	}
}