package net.thecanadian0417.extraarmor.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipeBookComponent;

public class CokeOvenScreen extends AbstractFurnaceScreen<CokeOvenMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ExtraArmor.MOD_ID, "textures/gui/coke_oven_gui.png");
    public CokeOvenScreen(CokeOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle)
    {
        super(pMenu, new CokeOvenRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
