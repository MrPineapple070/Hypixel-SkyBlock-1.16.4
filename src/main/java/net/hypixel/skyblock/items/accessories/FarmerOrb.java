package net.hypixel.skyblock.items.accessories;

import java.util.List;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.ModItemRarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.block.BambooBlock;
import net.minecraft.block.BambooSaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.CocoaBlock;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

/**
 * An {@link Accessory} that increases the regrowth rate of nearby crops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farmer_Orb">Farmer Orb</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FarmerOrb extends Accessory {
	private static final ImmutableList<Integer> dx = ImmutableList
			.copyOf(new Integer[] { -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7 });
	private static final ImmutableList<Integer> dy = ImmutableList
			.copyOf(new Integer[] { -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7 });
	private static final ImmutableList<Integer> dz = ImmutableList
			.copyOf(new Integer[] { -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7 });

	private static final ImmutableList<Block> effective_on = ImmutableList.copyOf(new Block[] { Blocks.WHEAT,
			Blocks.CARROTS, Blocks.POTATOES, Blocks.BEETROOTS, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM, Blocks.CACTUS,
			Blocks.SUGAR_CANE, Blocks.COCOA, Blocks.BAMBOO, Blocks.BAMBOO_SAPLING });

	private static final int Wheat = 0, Carrots = 1, Potatoes = 2, Beetroot = 3, Melon = 4, Pumpkin = 5, Cactus = 6,
			Sugar_Cane = 7, Cocoa = 8, Bamboo = 9, Bamboo_Sapling = 10;

	private final BlockPos[][][] nearby = new BlockPos[16][16][16];

	/**
	 * Construct this.
	 */
	public FarmerOrb() {
		super(ItemProperties.f1, ModItemRarity.Uncommon);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Increases the regrowth rate of nearby crops."));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isRemote)
			return;
		if (!(entityIn instanceof PlayerEntity))
			return;
		final PlayerEntity player = (PlayerEntity) entityIn;
		this.setNearby(player);

		for (final BlockPos[][] y_level : this.nearby)
			for (final BlockPos[] x_level : y_level)
				for (final BlockPos pos : x_level) {
					if (World.isOutsideBuildHeight(pos))
						continue;
					final BlockState state = worldIn.getBlockState(pos);
					final Block block = state.getBlock();
					if (state.getMaterial() == Material.AIR)
						continue;
					switch (effective_on.indexOf(block)) {
					case Wheat:
					case Carrots:
					case Potatoes:
					case Beetroot:
						((CropsBlock) block).grow(worldIn, pos, state);
						continue;
					case Melon:
					case Pumpkin:
						((StemBlock) block).grow((ServerWorld) worldIn, Item.random, pos, state);
						continue;
					case Cactus:
						((CactusBlock) block).tick(state, (ServerWorld) worldIn, pos, Item.random);
						continue;
					case Sugar_Cane:
						((SugarCaneBlock) block).tick(state, (ServerWorld) worldIn, pos, Item.random);
						continue;
					case Cocoa:
						((CocoaBlock) block).grow((ServerWorld) worldIn, Item.random, pos, state);
						continue;
					case Bamboo:
						((BambooBlock) block).grow((ServerWorld) worldIn, Item.random, pos, state);
						continue;
					case Bamboo_Sapling:
						((BambooSaplingBlock) block).grow((ServerWorld) worldIn, Item.random, pos, state);
						continue;
					default:
						continue;
					}
				}
	}

	private void setNearby(PlayerEntity player) {
		final double px = player.getPosX(), py = player.getPosY(), pz = player.getPosZ();
		for (int i = 0; i < this.nearby.length; i++)
			for (int j = 0; j < this.nearby[i].length; j++)
				for (int k = 0; k < this.nearby[i][j].length; k++)
					this.nearby[i][j][k] = new BlockPos(px + dx.get(j), py + dy.get(i), pz + dz.get(k));
	}
}