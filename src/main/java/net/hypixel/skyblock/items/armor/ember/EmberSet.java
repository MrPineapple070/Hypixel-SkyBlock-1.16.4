package net.hypixel.skyblock.items.armor.ember;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.hypixel.skyblock.util.FormatingCodes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ember_Armor">Ember Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 July 2019
 * @since 09 July 2019
 */
public class EmberSet implements FullSetInformation {
	public static final EmberSet instance = new EmberSet();

	public EmberSet() {
	}

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 0, 7, 0, 5, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 0, 13, 0, 10, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return Arrays.asList(new StringTextComponent(FormatingCodes.gold + "Full Set Bonus: Nether Lord"),
				new StringTextComponent(FormatingCodes.gray	+ "Obsidian will be created below you when walking on Lava."),
				new StringTextComponent(FormatingCodes.gray + "It also increases the chance of Nether monsters dropping an item by 20%."),
				new StringTextComponent(FormatingCodes.gray + "Wearing this full set will also prevent you from taking Lava and Fire Damage."));
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		return new double[] { 0, 0, 0, 8, 0, 5, 0 };
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 0, 12, 0, 5, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Ember;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}
