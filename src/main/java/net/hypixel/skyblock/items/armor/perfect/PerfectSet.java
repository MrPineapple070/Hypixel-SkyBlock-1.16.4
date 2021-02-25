package net.hypixel.skyblock.items.armor.perfect;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.ModArmorItem;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Perfect_Armor">Perfect
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 29 July 2020
 */
public abstract class PerfectSet extends ModArmorItem {
	public static class Perfect1 extends PerfectSet {
		public Perfect1(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect1, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect2 extends PerfectSet {
		public Perfect2(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect2, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect3 extends PerfectSet {
		public Perfect3(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect3, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect4 extends PerfectSet {
		public Perfect4(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect4, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect5 extends PerfectSet {
		public Perfect5(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect5, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect6 extends PerfectSet {
		public Perfect6(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect6, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect7 extends PerfectSet {
		public Perfect7(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect7, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect8 extends PerfectSet {
		public Perfect8(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect8, slot, ModItemRarity.Legendary);
		}
	}

	public static class Perfect9 extends PerfectSet {
		public Perfect9(EquipmentSlotType slot) {
			super(ModArmorMaterial.Perfect9, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectA extends PerfectSet {
		public PerfectA(EquipmentSlotType slot) {
			super(ModArmorMaterial.PerfectA, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectB extends PerfectSet {
		public PerfectB(EquipmentSlotType slot) {
			super(ModArmorMaterial.PerfectB, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectC extends PerfectSet {
		public PerfectC(EquipmentSlotType slot) {
			super(ModArmorMaterial.PerfectC, slot, ModItemRarity.Legendary);
		}
	}

	protected PerfectSet(ModArmorMaterial materialIn, EquipmentSlotType slot, ModItemRarity rarity) {
		super(materialIn, slot, ItemProperties.m1, rarity);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	}
}