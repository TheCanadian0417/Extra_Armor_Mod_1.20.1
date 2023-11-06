package net.thecanadian0417.extraarmor.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;
import net.thecanadian0417.extraarmor.screen.CokeOvenScreen;

import java.util.List;

@JeiPlugin
public class JEIExtraArmorPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid()
    {
        return new ResourceLocation(ExtraArmor.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new CokeOvenRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<CokeOvenRecipe> cokeOvenRecipes = recipeManager.getAllRecipesFor(CokeOvenRecipe.Type.INSTANCE);
        registration.addRecipes(CokeOvenRecipeCategory.COKE_OVEN_RECIPE_TYPE, cokeOvenRecipes);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(CokeOvenScreen.class,60,0,20,50);
    }
}
