package net.hypixel.skyblock.tileentity.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.blocks.minion.CobblestoneMinion;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC1;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC2;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC3;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC4;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC5;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC6;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC7;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC8;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMC9;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMCa;
import net.hypixel.skyblock.inventory.container.minion.CobblestoneMinionContainer.CobbleMCb;
import net.hypixel.skyblock.items.init.ItemInit;
import net.hypixel.skyblock.tileentity.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.StringTextComponent;

/**
 * {@link TileEntity} for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Cobblestone_Minion">Cobblestone
 * Minion</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public abstract class CobblestoneMinionTileEntity extends AbstractMiningMTE {
	public static class CobbleMTE1 extends CobblestoneMinionTileEntity {
		public CobbleMTE1() {
			super(ModTileEntityTypes.cobblestone_minion_1.get(), MinionTier.I);
		}
	}

	public static class CobbleMTE2 extends CobblestoneMinionTileEntity {
		public CobbleMTE2() {
			super(ModTileEntityTypes.cobblestone_minion_2.get(), MinionTier.II);
		}
	}

	public static class CobbleMTE3 extends CobblestoneMinionTileEntity {
		public CobbleMTE3() {
			super(ModTileEntityTypes.cobblestone_minion_3.get(), MinionTier.III);
		}
	}

	public static class CobbleMTE4 extends CobblestoneMinionTileEntity {
		public CobbleMTE4() {
			super(ModTileEntityTypes.cobblestone_minion_4.get(), MinionTier.IV);
		}
	}

	public static class CobbleMTE5 extends CobblestoneMinionTileEntity {
		public CobbleMTE5() {
			super(ModTileEntityTypes.cobblestone_minion_5.get(), MinionTier.V);
		}
	}

	public static class CobbleMTE6 extends CobblestoneMinionTileEntity {
		public CobbleMTE6() {
			super(ModTileEntityTypes.cobblestone_minion_6.get(), MinionTier.VI);
		}
	}

	public static class CobbleMTE7 extends CobblestoneMinionTileEntity {
		public CobbleMTE7() {
			super(ModTileEntityTypes.cobblestone_minion_7.get(), MinionTier.VII);
		}
	}

	public static class CobbleMTE8 extends CobblestoneMinionTileEntity {
		public CobbleMTE8() {
			super(ModTileEntityTypes.cobblestone_minion_8.get(), MinionTier.VIII);
		}
	}

	public static class CobbleMTE9 extends CobblestoneMinionTileEntity {
		public CobbleMTE9() {
			super(ModTileEntityTypes.cobblestone_minion_9.get(), MinionTier.IX);
		}
	}

	public static class CobbleMTEa extends CobblestoneMinionTileEntity {
		public CobbleMTEa() {
			super(ModTileEntityTypes.cobblestone_minion_a.get(), MinionTier.X);
		}
	}

	public static class CobbleMTEb extends CobblestoneMinionTileEntity {
		public CobbleMTEb() {
			super(ModTileEntityTypes.cobblestone_minion_b.get(), MinionTier.XI);
		}
	}

	/**
	 * {@link ImmutableSet} of {@link Block} that this places.
	 */
	protected static final ImmutableSet<Block> validBlocks = ImmutableSet
			.copyOf(Arrays.asList(Blocks.AIR, Blocks.COBBLESTONE));

	/**
	 * Constructs {@code this}
	 *
	 * @param typeIn {@link TileEntityType}
	 * @param tier   {@link MinionTier}
	 */
	protected CobblestoneMinionTileEntity(TileEntityType<? extends AbstractMinionTileEntity> typeIn, MinionTier tier) {
		super(typeIn, tier);
	}

	@Override
	protected final Container createMenu(int id, PlayerInventory player) {
		switch (this.tier) {
		case I:
			return new CobbleMC1(id, player, this);
		case II:
			return new CobbleMC2(id, player, this);
		case III:
			return new CobbleMC3(id, player, this);
		case IV:
			return new CobbleMC4(id, player, this);
		case V:
			return new CobbleMC5(id, player, this);
		case VI:
			return new CobbleMC6(id, player, this);
		case VII:
			return new CobbleMC7(id, player, this);
		case VIII:
			return new CobbleMC8(id, player, this);
		case IX:
			return new CobbleMC9(id, player, this);
		case X:
			return new CobbleMCa(id, player, this);
		case XI:
			return new CobbleMCb(id, player, this);
		default:
			throw new IllegalStateException("Illegal Minion Tier:\t" + this.tier.name());
		}
	}

	@Override
	protected final Item[] getCompactor() {
		return new Item[] { Items.DIAMOND };
	}

	@Override
	protected final StringTextComponent initDisplayName() {
		return new StringTextComponent("Cobblestone Minion Tier " + this.tier.name());
	}

	@Override
	protected final SoundEvent getSoundEvent() {
		return SoundEvents.BLOCK_STONE_BREAK;
	}

	@Override
	protected final BlockState getState() {
		return Blocks.COBBLESTONE.getDefaultState();
	}

	@Override
	protected final Item[] getSuperCompactor() {
		return new Item[] { Items.COBBLESTONE, Items.DIAMOND, Items.DIAMOND_BLOCK, ItemInit.enchanted_diamond.get() };
	}

	protected final int getSpeed(MinionTier tier) {
		return CobblestoneMinion.speed.get(tier.asInt);
	}

	public final ImmutableSet<Block> getValidBlocks() {
		return validBlocks;
	}
}