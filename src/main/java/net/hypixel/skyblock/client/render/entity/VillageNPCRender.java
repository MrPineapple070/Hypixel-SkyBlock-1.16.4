package net.hypixel.skyblock.client.render.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.hypixel.skyblock.client.render.entity.model.VillageNPCModel;
import net.hypixel.skyblock.entity.npc.VillageNPC;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class VillageNPCRender extends EntityRenderer<VillageNPC> {
	protected static final ResourceLocation texture = new ResourceLocation("textures/entity/villager/villager.png");
	protected static final Logger LOGGER = LogManager.getLogger();
	protected final VillageNPCModel model = new VillageNPCModel(0f);

	public VillageNPCRender(EntityRendererManager renderManager) {
		super(renderManager);
		this.shadowSize = .8f;
		LOGGER.info("VillageNPCRender created");
	}

	@Override
	public void render(VillageNPC entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		LOGGER.info("Rendering " + entityIn.toString());
		matrixStackIn.push();
		this.model.render(matrixStackIn, bufferIn.getBuffer(this.model.getRenderType(this.getEntityTexture(entityIn))),
				packedLightIn, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
		matrixStackIn.pop();
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getEntityTexture(VillageNPC entity) {
		return texture;
	}
}