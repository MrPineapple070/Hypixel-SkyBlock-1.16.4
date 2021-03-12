package net.hypixel.skyblock.items.accessories;

import java.util.List;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * An {@link Accessory} that saves the players held coins when dying.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Piggy_Bank">Piggy Bank</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class PiggyBank extends Accessory {
	public static enum State {
		Broken, Cracked, Normal;
	}
	
	private static final ITextComponent percent0 = new TranslationTextComponent("accessory.piggy.0");
	private static final ITextComponent percent1 = new TranslationTextComponent("accessory.piggy.1");
	private static final ITextComponent percent2 = new TranslationTextComponent("accessory.piggy.2");
	
	private State state;

	public PiggyBank() {
		super(ItemProperties.m1, ModItemRarity.Uncommon);
		this.state = State.Normal;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		ITextComponent percent;
		switch (this.state) {
		case Normal:
			percent = percent0;
			break;
		case Cracked:
			percent = percent1;
			break;
		case Broken:
			percent = percent2;
			break;
		default:
			return;
		}
		tooltip.add(new TranslationTextComponent("accessory.piggy", percent));
	}

	public void repair() {
		this.state = State.Normal;
	}

	public void use() {
		switch (this.state) {
		case Normal:
			this.state = State.Cracked;
			return;
		case Cracked:
			this.state = State.Broken;
			return;
		default:
			return;
		}
	}
}
