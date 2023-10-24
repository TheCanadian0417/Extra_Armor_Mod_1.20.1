package net.thecanadian0417.extraarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, ExtraArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.TUNGSTEN_INGOT);
        simpleItem(ModItems.RAW_TUNGSTEN);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.CHROMIUM_INGOT);
        simpleItem(ModItems.RAW_CHROMIUM);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.RAW_TITANIUM);
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.METAL_DETECTOR);

        handheldItem(ModItems.TUNGSTEN_SWORD);
        handheldItem(ModItems.TUNGSTEN_PICKAXE);
        handheldItem(ModItems.TUNGSTEN_SHOVEL);
        handheldItem(ModItems.TUNGSTEN_AXE);
        handheldItem(ModItems.TUNGSTEN_HOE);

        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_HOE);

        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.TITANIUM_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExtraArmor.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ExtraArmor.MOD_ID,"item/" + item.getId().getPath()));
    }

}
