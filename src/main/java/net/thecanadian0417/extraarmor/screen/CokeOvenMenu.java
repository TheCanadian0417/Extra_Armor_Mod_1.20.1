package net.thecanadian0417.extraarmor.screen;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.SlotItemHandler;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.block.entity.CokeOvenBlockEntity;
import net.thecanadian0417.extraarmor.block.entity.ModBlockEntities;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;
import org.jetbrains.annotations.Nullable;

public class CokeOvenMenu extends AbstractFurnaceMenu {

    protected CokeOvenMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public CokeOvenMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(ModMenuTypes.COKE_OVEN_MENU.get(), CokeOvenRecipe.Type.INSTANCE , RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public CokeOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(ModMenuTypes.COKE_OVEN_MENU.get(), CokeOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
