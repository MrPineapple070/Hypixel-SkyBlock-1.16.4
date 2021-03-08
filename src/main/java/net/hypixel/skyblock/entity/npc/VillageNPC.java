package net.hypixel.skyblock.entity.npc;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.INPC;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap.MutableAttribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.world.World;

public abstract class VillageNPC extends Entity implements INPC {
	public VillageNPC(EntityType<? extends Entity> type, World worldIn) {
		super(type, worldIn);
		LOGGER.info(type.getRegistryName().toString() + " created");
	}

	public static MutableAttribute registerAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, Double.MAX_VALUE).createMutableAttribute(Attributes.MOVEMENT_SPEED, 0);
	}

	@Override
	protected final void registerData() {
		this.setInvulnerable(true);
		this.setNoGravity(true);
		this.setSilent(true);
		this.setCustomNameVisible(true);
	}

	@Override
	public final void readAdditional(CompoundNBT compound) {
		LOGGER.info("Reading:\t" + compound.toString());
	}

	@Override
	public final void writeAdditional(CompoundNBT compound) {
		LOGGER.info("Writing:\t" + compound.toString());
	}

	@Override
	public final IPacket<?> createSpawnPacket() {
		return new SSpawnObjectPacket(this, this.getType(), this.getEntityId(), this.getPosition());
	}
}