package net.hypixel.skyblock.client.render.entity.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.hypixel.skyblock.entity.npc.VillageNPC;
import net.minecraft.client.renderer.entity.model.IHasHead;
import net.minecraft.client.renderer.entity.model.IHeadToggle;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class VillageNPCModel extends SegmentedModel<VillageNPC> implements IHasHead, IHeadToggle {
	protected static final Logger LOGGER = LogManager.getLogger();
	
	protected ModelRenderer villagerHead;
	protected ModelRenderer hat;
	protected final ModelRenderer hatBrim;
	protected final ModelRenderer villagerBody;
	protected final ModelRenderer clothing;
	protected final ModelRenderer villagerArms;
	protected final ModelRenderer rightVillagerLeg;
	protected final ModelRenderer leftVillagerLeg;
	protected final ModelRenderer villagerNose;

	public VillageNPCModel(float scale) {
		this(scale, 64, 64);
	}

	public VillageNPCModel(float scale, int textureWidth, int textureHeight) {
		this.villagerHead = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.villagerHead.setRotationPoint(0f, 0f, 0f);
		this.villagerHead.setTextureOffset(0, 0).addBox(-4f, -10f, -4f, 8f, 10f, 8f, scale);
		this.hat = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.hat.setRotationPoint(0f, 0f, 0f);
		this.hat.setTextureOffset(32, 0).addBox(-4f, -10f, -4f, 8f, 10f, 8f, scale + 0.5F);
		this.villagerHead.addChild(this.hat);
		this.hatBrim = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.hatBrim.setRotationPoint(0f, 0f, 0f);
		this.hatBrim.setTextureOffset(30, 47).addBox(-8f, -8f, -6f, 16f, 16f, 1f, scale);
		this.hatBrim.rotateAngleX = (-(float)Math.PI / 2F);
		this.hat.addChild(this.hatBrim);
		this.villagerNose = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.villagerNose.setRotationPoint(0f, -2f, 0f);
		this.villagerNose.setTextureOffset(24, 0).addBox(-1f, -1f, -6f, 2f, 4f, 2f, scale);
		this.villagerHead.addChild(this.villagerNose);
		this.villagerBody = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.villagerBody.setRotationPoint(0f, 0f, 0f);
		this.villagerBody.setTextureOffset(16, 20).addBox(-4f, 0f, -3f, 8f, 12f, 6f, scale);
		this.clothing = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.clothing.setRotationPoint(0f, 0f, 0f);
		this.clothing.setTextureOffset(0, 38).addBox(-4f, 0f, -3f, 8f, 18f, 6f, scale + 0.5F);
		this.villagerBody.addChild(this.clothing);
		this.villagerArms = (new ModelRenderer(this)).setTextureSize(textureWidth, textureHeight);
		this.villagerArms.setRotationPoint(0f, 2f, 0f);
		this.villagerArms.setTextureOffset(44, 22).addBox(-8f, -2f, -2f, 4f, 8f, 4f, scale);
		this.villagerArms.setTextureOffset(44, 22).addBox(4f, -2f, -2f, 4f, 8f, 4f, scale, true);
		this.villagerArms.setTextureOffset(40, 38).addBox(-4f, 2f, -2f, 8f, 4f, 4f, scale);
		this.rightVillagerLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(textureWidth, textureHeight);
		this.rightVillagerLeg.setRotationPoint(-2f, 12f, 0f);
		this.rightVillagerLeg.addBox(-2f, 0f, -2f, 4f, 12f, 4f, scale);
		this.leftVillagerLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(textureWidth, textureHeight);
		this.leftVillagerLeg.mirror = true;
		this.leftVillagerLeg.setRotationPoint(2f, 12f, 0f);
		this.leftVillagerLeg.addBox(-2f, 0f, -2f, 4f, 12f, 4f, scale);
		LOGGER.info("VillageNPCModel created");
	}
	
	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		LOGGER.info(matrixStackIn.toString());
		LOGGER.info(bufferIn.toString());
		super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}
	
	@Override
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(this.villagerHead, this.villagerBody, this.rightVillagerLeg, this.leftVillagerLeg, this.villagerArms);
	}
	
	@Override
	public ModelRenderer getModelHead() {
		return this.villagerHead;
	}
	
	@Override
	public void func_217146_a(boolean p_217146_1_) {
		this.villagerHead.showModel = p_217146_1_;
		this.hat.showModel = p_217146_1_;
		this.hatBrim.showModel = p_217146_1_;
	}

	@Override
	public void setRotationAngles(VillageNPC entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
	}
}