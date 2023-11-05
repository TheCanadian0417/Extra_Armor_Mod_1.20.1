package net.thecanadian0417.extraarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN.get(),
            ModBlocks.TUNGSTEN_ORE.get(), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

    private static final List<ItemLike> CHROMIUM_SMELTABLES = List.of(ModItems.RAW_CHROMIUM.get(),
            ModBlocks.CHROMIUM_ORE.get(), ModBlocks.DEEPSLATE_CHROMIUM_ORE.get());

    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM.get(),
            ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get());

    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),
            ModBlocks.PLATINUM_ORE.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, TUNGSTEN_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT.get(), 0.7f, 100, "tungsten_ingot");
        oreSmelting(pWriter, TUNGSTEN_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT.get(), 0.7f, 200, "tungsten_ingot");
        oreBlasting(pWriter, CHROMIUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.CHROMIUM_INGOT.get(), 0.7f, 100, "chromium_ingot");
        oreSmelting(pWriter, CHROMIUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.CHROMIUM_INGOT.get(), 0.7f, 200, "chromium_ingot");
        oreBlasting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT.get(), 0.7f, 100, "titanium_ingot");
        oreSmelting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT.get(), 0.7f, 200, "titanium_ingot");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT.get(), 0.7f, 100, "platinum_ingot");
        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT.get(), 0.7f, 200, "platinum_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHROMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.METAL_DETECTOR.get())
                .pattern("  S")
                .pattern(" # ")
                .pattern("I  ")
                .define('S', Items.STICK)
                .define('#', Items.DIAMOND)
                .define('I', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TITANIUM_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COKE_OVEN.get())
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .define('#', Items.IRON_INGOT)
                .define('C', Items.COAL)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT.get(), 9)
                .requires(ModBlocks.TUNGSTEN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TUNGSTEN_BLOCK.get()), has(ModBlocks.TUNGSTEN_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.CHROMIUM_INGOT.get(), 9)
                .requires(ModBlocks.CHROMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CHROMIUM_BLOCK.get()), has(ModBlocks.CHROMIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.get()), has(ModBlocks.PLATINUM_BLOCK.get()))
                .save(pWriter);


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ExtraArmor.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
