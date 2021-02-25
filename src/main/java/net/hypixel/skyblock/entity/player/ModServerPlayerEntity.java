package net.hypixel.skyblock.entity.player;

import java.util.List;

import com.mojang.authlib.GameProfile;

import net.hypixel.skyblock.inventory.ExtendedPlayerInventory;
import net.hypixel.skyblock.pets.Pet;
import net.hypixel.skyblock.pets.PetItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerInteractionManager;
import net.minecraft.util.NonNullList;
import net.minecraft.world.server.ServerWorld;

/**
 * Mod version of {@link ServerPlayerEntity}
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class ModServerPlayerEntity extends ServerPlayerEntity {
	/**
	 * The currently active {@link Pet}.<br>
	 * Only one pet may be active at a time.
	 */
	public Pet activePet;

	/**
	 * A {@link List} of all {@link Pet} that the player could equip at any time.
	 */
	private final NonNullList<Pet> pet_list = NonNullList.create();

	/**
	 * Construct this
	 *
	 * @param server               {@link MinecraftServer} for this
	 * @param worldIn              {@link ServerWorld} for this
	 * @param profile              {@link GameProfile} for this
	 * @param interactionManagerIn {@link PlayerInteractionManager} for this
	 */
	public ModServerPlayerEntity(MinecraftServer server, ServerWorld worldIn, GameProfile profile,
			PlayerInteractionManager interactionManagerIn) {
		super(server, worldIn, profile, interactionManagerIn);
	}

	public void addPet(PetItem pet) {
		this.pet_list.add(pet.pet);
	}

	public void consumeBait() {
		if (this.inventory instanceof ExtendedPlayerInventory) {
			final ExtendedPlayerInventory inv = (ExtendedPlayerInventory) this.inventory;
			inv.decrStackSize(inv.fishing_bag_start, 1);
		}
	}

	/**
	 * @return {@link #activePet}
	 */
	public Pet getActivePet() {
		return this.activePet;
	}

	/**
	 * Set the currently active pet
	 *
	 * @param pet the new {@link Pet}
	 */
	public void setActivePet(Pet pet) {
		this.activePet = pet;
	}
}