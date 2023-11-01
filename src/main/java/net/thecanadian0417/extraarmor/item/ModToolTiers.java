package net.thecanadian0417.extraarmor.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier TUNGSTEN = TierSortingRegistry.registerTier(
            new ForgeTier(5,2500, 10f, 5f,20,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
            new ResourceLocation(ExtraArmor.MOD_ID, "tungsten"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3,1500, 7f, 3f,16,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(ExtraArmor.MOD_ID, "steel"), List.of(Tiers.IRON), List.of());

    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(4,2000, 12f, 4f,25,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(ExtraArmor.MOD_ID, "titanium"), List.of(Tiers.DIAMOND), List.of());
}
