package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.HypixelSkyBlockMod;
import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemMap;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * These {@link Accessory} automatically turns certain materials in the player's
 * inventory into their enchanted form.<br>
 * The base for Personal Compactors.<br>
 *
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Personal_Compactor_4000">Personal
 * Compactor 4000</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Personal_Compactor_5000">Personal
 * Compactor 5000</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Personal_Compactor_6000">Personal
 * Compactor 6000</a><br>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public abstract class PersonalCompactor extends Accessory {
	public static class PersonalComp4000 extends PersonalCompactor {
		public PersonalComp4000() {
			super(ItemProperties.m1, ModItemRarity.Uncommon, 4000);
		}
	}

	public static class PersonalComp5000 extends PersonalCompactor {
		public PersonalComp5000() {
			super(ItemProperties.m1, ModItemRarity.Rare, 5000);
		}
	}

	public static class PersonalComp6000 extends PersonalCompactor {
		public PersonalComp6000() {
			super(ItemProperties.m1, ModItemRarity.Epic, 6000);
		}
	}
	
	private static final ITextComponent info = new TranslationTextComponent("accessory.comp");
	
	/**
	 * The list of {@link ItemStack}
	 */
	public final NonNullList<ItemStack> items;

	/**
	 * An int that differentiates {@link PersonalComp4000},
	 * {@link PersonalComp5000}, and {@link PersonalComp6000}.<br>
	 * This value is expected to be 0xFA0 (4000), 0x1388 (5000), or 0x1770 (6000).
	 */
	protected final int type;

	protected PersonalCompactor(Properties properties, ModItemRarity rarity, int type) {
		super(properties, rarity);
		this.type = type;
		switch (this.type) {
		case 4000:
			this.items = NonNullList.withSize(1, ItemStack.EMPTY);
			break;
		case 5000:
			this.items = NonNullList.withSize(3, ItemStack.EMPTY);
			break;
		case 6000:
			this.items = NonNullList.withSize(7, ItemStack.EMPTY);
			break;
		default:
			throw new IllegalArgumentException("Illegal Personal Compactor type. Must be 4000, 5000, or 6000");
		}
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(info);
	}

	public ItemStack decrStackSize(int index, int count) {
		return ItemStackHelper.getAndSplit(this.items, index, count);
	}

	protected int[] getSuperCompIndex(Item item) {
		HypixelSkyBlockMod.LOGGER.info("Finding super compactor indexes for: " + item.getRegistryName().toString());
		int[] indexs = new int[3];
		int index = 0;
		boolean half = false;
		for (int i = this.items.size() - 1; i > -1; i--) {
			final ItemStack stack = this.items.get(i);
			if (stack.getItem().equals(item))
				switch (stack.getCount()) {
				case 32:
					if (!half) {
						indexs[index] = i;
						index++;
						half = true;
					}
					break;
				case 64:
					indexs[index] = i;
					index++;
					break;
				default:
					continue;
				}
			else
				continue;
		}
		return indexs;
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entityIn;
		for (ItemStack st : this.items) {
			Item item = st.getItem();
			Integer count = ItemMap.enchReqMap.get(item);
			if (count == null)
				continue;
			if (player.inventory.count(item) >= count.intValue())
				for (final int index : this.getSuperCompIndex(item)) {
					final ItemStack s = this.items.get(index);
					if (s.getCount() < s.getMaxStackSize())
						this.decrStackSize(index, stack.getCount());
					else
						this.removeStackFromSlot(index);
				}
		}
	}

	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(this.items, index);
	}
}