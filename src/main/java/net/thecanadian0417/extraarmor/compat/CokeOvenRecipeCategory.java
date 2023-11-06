package net.thecanadian0417.extraarmor.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;

public class CokeOvenRecipeCategory implements IRecipeCategory<CokeOvenRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(ExtraArmor.MOD_ID, "coke_oven");
    public static final ResourceLocation TEXTURE = new ResourceLocation(ExtraArmor.MOD_ID, "textures/gui/coke_oven_gui.png");

    public static final RecipeType<CokeOvenRecipe> COKE_OVEN_RECIPE_TYPE =
            new RecipeType<>(UID, CokeOvenRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public CokeOvenRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0,176,85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.COKE_OVEN.get()));
    }

    @Override
    public RecipeType<CokeOvenRecipe> getRecipeType()
    {
        return COKE_OVEN_RECIPE_TYPE;
    }

    @Override
    public Component getTitle()
    {
        return Component.translatable("block.extra_armor.coke_oven");
    }

    @Override
    public IDrawable getBackground()
    {
        return background;
    }

    @Override
    public IDrawable getIcon()
    {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CokeOvenRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT,56, 17).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116,35).addItemStack(recipe.getResultItem(null));
    }
}
