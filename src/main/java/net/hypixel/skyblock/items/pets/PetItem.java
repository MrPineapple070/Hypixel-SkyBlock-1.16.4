package net.hypixel.skyblock.items.pets;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.entity.player.ModServerPlayerEntity;
import net.hypixel.skyblock.items.Collection;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.pets.Pet;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

/**
 * {@link Pet} but as an {@link Item}.
 *
 * @author MrPineapple070
 * @version 23 June 2020
 */
public abstract class PetItem extends Item {
	/**
	 * {@link String} containing the level of this pet.<br>
	 */
	protected static final String level = "\u00A77[Lvl %d]\u00A7r ";

	/**
	 * {@link String} containing the default progress to the next level.<br>
	 * By default this contains 20 '-' with {@link FormatingCodes#white}.<br>
	 * This can be changes to contain any amount of {@link FormatingCodes#green} and
	 * {@link FormatingCodes#white} '-' as long the total number of '-' is 20.
	 */
	protected String lvl_progress = FormatingCodes.white + "--------------------";

	/**
	 * The {@link Pet} of this.
	 */
	@Nonnull
	public final Pet pet;

	public PetItem(Properties properties, Pet pet) {
		super(properties);
		this.pet = Objects.requireNonNull(pet, "Pet for PetItem cannot be null");
	}

	@Override
	public abstract void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn);

	public void changeLevelProgress() {
		int prog = (int)(20*this.pet.getProgress());
		this.lvl_progress = FormatingCodes.green;
		for (int i = 0; i < prog; ++i)
			this.lvl_progress += '-';
		this.lvl_progress += FormatingCodes.white;
		for (int i = prog; i < 20; ++i)
			this.lvl_progress += '-';
	}
	
	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		StringTextComponent lvl = new StringTextComponent(String.format(level, this.pet.getLevel()));
		return lvl.append(
				((IFormattableTextComponent) super.getDisplayName(stack)).mergeStyle(this.getPetRarity().color));
	}

	/**
	 * @return {@link Pet#collection}
	 */
	public Collection getPetCollection() {
		return this.pet.collection;
	}

	/**
	 * @return {@link Pet#rarity}
	 */
	public ModItemRarity getPetRarity() {
		return this.pet.getRarity();
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		PlayerEntity player = (PlayerEntity) entityIn;
		Item item = stack.getItem();
		if (!(item instanceof PetItem))
			return;
		PetItem pet = (PetItem) item;
		pet.pet.effect(player);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		final ItemStack held = playerIn.getHeldItem(handIn);
		if (playerIn instanceof ModServerPlayerEntity) {
			((ModServerPlayerEntity) playerIn).addPet((PetItem) held.getItem());
			playerIn.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
			return ActionResult.resultSuccess(held);
		}
		return ActionResult.resultFail(held);
	}
}