package net.hypixel.skyblock.client.render.tileentity;

import java.util.Calendar;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.hypixel.skyblock.blocks.minion.MinionChestBlock;
import net.hypixel.skyblock.tileentity.minion.AbstractMinionChestTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.tileentity.DualBrightnessCallback;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMerger;
import net.minecraft.tileentity.TileEntityMerger.ICallbackWrapper;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * {@link TileEntityRenderer} for {@link AbstractMinionChestTileEntity}
 * 
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
@OnlyIn(Dist.CLIENT)
public class MinionChestTileEntityRenderer<T extends TileEntity & IChestLid> extends TileEntityRenderer<T> {
	/**
	 * {@link ModelRenderer} for the lid
	 */
	private final ModelRenderer singleLid;

	/**
	 * {@link ModelRenderer} for the bottom
	 */
	private final ModelRenderer singleBottom;

	/**
	 * {@link ModelRenderer} for the latch
	 */
	private final ModelRenderer singleLatch;

	/**
	 * Is the day Christmas?
	 */
	private boolean isChristmas;

	public MinionChestTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
		Calendar calendar = Calendar.getInstance();
		this.isChristmas = calendar.get(Calendar.MONTH) == Calendar.DECEMBER && calendar.get(Calendar.DATE) >= 24
				&& calendar.get(Calendar.DATE) <= 26;
		this.singleBottom = new ModelRenderer(64, 64, 0, 19);
		this.singleBottom.addBox(1f, 0f, 1f, 14f, 10f, 14f, 0f);
		this.singleLid = new ModelRenderer(64, 64, 0, 0);
		this.singleLid.addBox(1f, 0f, 0f, 14f, 5f, 14f, 0f);
		this.singleLid.rotationPointY = 9f;
		this.singleLid.rotationPointZ = 1f;
		this.singleLatch = new ModelRenderer(64, 64, 0, 0);
		this.singleLatch.addBox(7f, -1f, 15f, 2f, 4f, 1f, 0f);
		this.singleLatch.rotationPointY = 8f;
	}

	@Override
	public void render(T tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn,
			int combinedLightIn, int combinedOverlayIn) {
		World world = tileEntityIn.getWorld();
		boolean world_null = world != null;
		BlockState block_state = world_null ? tileEntityIn.getBlockState()
				: Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
		ChestType type = block_state.hasProperty(ChestBlock.TYPE) ? block_state.get(ChestBlock.TYPE) : ChestType.SINGLE;
		Block block = block_state.getBlock();
		if (block instanceof MinionChestBlock) {
			MinionChestBlock mcb = (MinionChestBlock) block;
			matrixStackIn.push();
			float angle = block_state.get(ChestBlock.FACING).getHorizontalAngle();
			matrixStackIn.translate(.5d, .5d, .5d);
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-angle));
			matrixStackIn.translate(-.5d, -.5d, -.5d);
			ICallbackWrapper<? extends ChestTileEntity> wrapper = world_null
					? mcb.combine(block_state, world, tileEntityIn.getPos(), true)
					: TileEntityMerger.ICallback::func_225537_b_;
			float lid_angle = wrapper.apply(MinionChestBlock.getLidRotationCallback(tileEntityIn)).get(partialTicks);
			lid_angle = 1f - lid_angle;
			lid_angle = 1f - lid_angle * lid_angle * lid_angle;
			int i = wrapper.apply(new DualBrightnessCallback<>()).applyAsInt(combinedLightIn);
			RenderMaterial material = this.getMaterial(tileEntityIn, type);
			IVertexBuilder vertex_builder = material.getBuffer(bufferIn, RenderType::getEntityCutout);
			this.renderModels(matrixStackIn, vertex_builder, this.singleLid, this.singleLatch, this.singleBottom,
					lid_angle, i, combinedOverlayIn);
			matrixStackIn.pop();
		}
	}

	/**
	 * Renders the lid, base, and latch of this onto the
	 * {@link AbstractMinionChestTileEntity}
	 * 
	 * @param matrixStackIn     {@link MatrixStack}
	 * @param bufferIn          {@link IVertexBuilder}
	 * @param chestLid          {@link ModelRenderer} for Chest Lid
	 * @param chestLatch        {@link ModelRenderer} for Chest Latch
	 * @param chestBottom       {@link ModelRenderer} for Chest Bottom
	 * @param lidAngle          the angle of the lid in radians
	 * @param combinedLightIn   the amount of light hitting this
	 * @param combinedOverlayIn the amount of overlay hitting this
	 */
	private void renderModels(MatrixStack matrixStackIn, IVertexBuilder bufferIn, ModelRenderer chestLid,
			ModelRenderer chestLatch, ModelRenderer chestBottom, float lidAngle, int combinedLightIn,
			int combinedOverlayIn) {
		chestLid.rotateAngleX = -(lidAngle * ((float) Math.PI / 2f));
		chestLatch.rotateAngleX = chestLid.rotateAngleX;
		chestLid.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
		chestLatch.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
		chestBottom.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	}

	/**
	 * Retrieves {@link RenderMaterial} from a {@link TileEntity} and
	 * {@link ChestType}.<br>
	 * Renders the special chest when {@link #isChristmas}
	 * 
	 * @param tileEntity {@link TileEntity} to render
	 * @param chestType  {@link ChestType} of tileEntity
	 * @return {@link Atlases#getChestMaterial(TileEntity, ChestType, boolean)}
	 */
	protected RenderMaterial getMaterial(T tileEntity, ChestType chestType) {
		return Atlases.getChestMaterial(tileEntity, chestType, this.isChristmas);
	}
}