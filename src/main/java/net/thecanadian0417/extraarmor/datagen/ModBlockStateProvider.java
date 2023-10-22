package net.thecanadian0417.extraarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExtraArmor.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.CHROMIUM_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);

        blockWithItem(ModBlocks.TUNGSTEN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockWithItem(ModBlocks.CHROMIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CHROMIUM_ORE);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
