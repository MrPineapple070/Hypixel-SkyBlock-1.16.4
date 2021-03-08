package net.hypixel.skyblock.client.render.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.hypixel.skyblock.entity.npc.VillageNPC;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public class VillageNPCModel extends EntityModel<VillageNPC> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer Legs;
	private final ModelRenderer Arm;
	private final ModelRenderer bb_main;
	private final ModelRenderer hands_r1;

	public VillageNPCModel() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.Head = new ModelRenderer(this);
		this.Head.setRotationPoint(-4.0F, 0.5F, 1.0F);
		this.Head.setTextureOffset(0, 0).addBox(-4.0F, -9.5F, -3.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		this.Head.setTextureOffset(24, 0).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		this.Body = new ModelRenderer(this);
		this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Body.setTextureOffset(16, 20).addBox(-8.0F, -23.0F, -1.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
		this.Body.setTextureOffset(0, 38).addBox(-8.0F, -23.0F, -1.0F, 8.0F, 20.0F, 6.0F, 0.0F, false);

		this.Legs = new ModelRenderer(this);
		this.Legs.setRotationPoint(-4.0F, 18.5F, 2.0F);
		this.Legs.setTextureOffset(0, 23).addBox(-4.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		this.Legs.setTextureOffset(0, 23).addBox(0.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		this.Arm = new ModelRenderer(this);
		this.Arm.setRotationPoint(-4.0F, 2.0F, 3.0F);
		this.setRotationAngle(this.Arm, -0.7854F, 0.0F, 0.0F);
		this.Arm.setTextureOffset(44, 22).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		this.Arm.setTextureOffset(44, 22).addBox(4.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		this.bb_main = new ModelRenderer(this);
		this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

		this.hands_r1 = new ModelRenderer(this);
		this.hands_r1.setRotationPoint(-4.0F, -17.4038F, -1.682F);
		this.bb_main.addChild(this.hands_r1);
		this.setRotationAngle(this.hands_r1, -0.7854F, 0.0F, 0.0F);
		this.hands_r1.setTextureOffset(40, 38).addBox(-4.0F, -2.5607F, -1.9393F, 8.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		this.Head.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Body.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Legs.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		this.bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(VillageNPC entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
	}
}