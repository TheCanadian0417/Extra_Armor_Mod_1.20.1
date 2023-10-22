package net.thecanadian0417.extraarmor.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.CHROMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());

        this.add(ModBlocks.TUNGSTEN_ORE.get(),
                block -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));

        this.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));

        this.add(ModBlocks.CHROMIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.CHROMIUM_ORE.get(), ModItems.RAW_CHROMIUM.get()));

        this.add(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(), ModItems.RAW_CHROMIUM.get()));

        this.add(ModBlocks.TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        this.add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        this.add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));

        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
