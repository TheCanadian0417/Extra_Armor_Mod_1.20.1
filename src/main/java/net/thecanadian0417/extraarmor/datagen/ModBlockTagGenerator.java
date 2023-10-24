package net.thecanadian0417.extraarmor.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, ExtraArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.TUNGSTEN_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TUNGSTEN_ORE.get(),
                        ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                        ModBlocks.CHROMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(),
                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.TUNGSTEN_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.CHROMIUM_BLOCK.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.PLATINUM_BLOCK.get()
                );


        this.tag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .add(ModBlocks.TUNGSTEN_ORE.get(),
                        ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                        ModBlocks.CHROMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(),
                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.TUNGSTEN_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.CHROMIUM_BLOCK.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.PLATINUM_BLOCK.get()
                );

    }
}
