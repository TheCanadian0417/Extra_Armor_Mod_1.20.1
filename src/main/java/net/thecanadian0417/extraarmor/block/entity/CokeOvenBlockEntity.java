package net.thecanadian0417.extraarmor.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.thecanadian0417.extraarmor.recipe.CokeOvenRecipe;
import net.thecanadian0417.extraarmor.screen.CokeOvenMenu;

import java.util.Map;

public class CokeOvenBlockEntity extends AbstractFurnaceBlockEntity {
    private Map<Item, Integer> BURN_DURATION_MAP = Map.of(Items.COAL, 100);
    public CokeOvenBlockEntity(BlockPos pPos, BlockState pBlockState)
    {
        super(ModBlockEntities.COKE_OVEN_BLOCK_ENTITY.get(), pPos, pBlockState, CokeOvenRecipe.Type.INSTANCE);
    }

    @Override
    protected Component getDefaultName()
    {
        return Component.translatable("block.extra_armor.coke_oven");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory)
    {
        return new CokeOvenMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel)
    {
        return BURN_DURATION_MAP.getOrDefault(pFuel.getItem(), 0);
    }
}
