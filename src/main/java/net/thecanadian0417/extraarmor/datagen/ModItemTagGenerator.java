package net.thecanadian0417.extraarmor.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(pOutput, pLookupProvider, pBlockTags, ExtraArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TUNGSTEN_HELMET.get(),
                        ModItems.TUNGSTEN_CHESTPLATE.get(),
                        ModItems.TUNGSTEN_LEGGINGS.get(),
                        ModItems.TUNGSTEN_BOOTS.get(),
                        ModItems.CHROMIUM_HELMET.get(),
                        ModItems.CHROMIUM_CHESTPLATE.get(),
                        ModItems.CHROMIUM_LEGGINGS.get(),
                        ModItems.CHROMIUM_BOOTS.get()
                );

    }

    @Override
    public String getName() { return "Item Tags" ;}
}
