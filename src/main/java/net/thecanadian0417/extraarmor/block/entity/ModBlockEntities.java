package net.thecanadian0417.extraarmor.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraArmor.MOD_ID);


    public static final RegistryObject<BlockEntityType<CokeOvenBlockEntity>> COKE_OVEN_BE =
            BLOCK_ENTITIES.register("coke_oven_block_entity", () ->
                    BlockEntityType.Builder.of(CokeOvenBlockEntity::new,
                            ModBlocks.COKE_OVEN.get()).build(null));

    public static void register(IEventBus eventBus) { BLOCK_ENTITIES.register(eventBus); }
}
