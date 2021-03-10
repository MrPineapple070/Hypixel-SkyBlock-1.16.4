package net.hypixel.skyblock.items.armor.elegant_tuxedo;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.items.armor.FullSetInformation;
import net.hypixel.skyblock.items.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Holds {@link EquipmentSlotType} specific infomration for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Elegant_Tuxedo">Elegant
 * Tuxedo Set</a>
 *
 * @author MrPineapple070
 * @version 04 August 2020
 * @since 04 August 2020
 */
public class ElegantTuxedoSet implements FullSetInformation {
	public static final ElegantTuxedoSet instance = new ElegantTuxedoSet();
	private static final List<ITextComponent> fsb = Arrays.asList(full_set_bonus.deepCopy()
			.append(new TranslationTextComponent("armor.tux.fsb")).mergeStyle(TextFormatting.GOLD),
			new TranslationTextComponent("armor.tux.fsb.discription", "50", "150"));

	@Override
	public double[] getBootsBuffs() {
		return new double[] { 0, 0, 50, 0, 10, 100, 0 };
	}

	@Override
	public double[] getChestplateBuffs() {
		return new double[] { 0, 0, 100, 0, 0, 300, 0 };
	}

	@Override
	public List<ITextComponent> getFullSetBonus() {
		return fsb;
	}

	@Override
	public double[] getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("The helmet does not exist for the Elegant Tuxedo set.");
	}

	@Override
	public double[] getLeggingsBuffs() {
		return new double[] { 0, 0, 50, 0, 0, 100, 0 };
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Elegant_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}
