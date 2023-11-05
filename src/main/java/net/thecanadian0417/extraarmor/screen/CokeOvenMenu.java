package net.thecanadian0417.extraarmor.screen;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;

public class CokeOvenMenu extends AbstractFurnaceMenu {
    protected CokeOvenMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public CokeOvenMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(ModMenuTypes.COKE_OVEN_MENU.get(), CokeOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public CokeOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(ModMenuTypes.COKE_OVEN_MENU.get(), CokeOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
