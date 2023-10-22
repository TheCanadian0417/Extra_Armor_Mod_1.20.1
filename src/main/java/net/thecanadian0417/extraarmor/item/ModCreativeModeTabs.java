package net.thecanadian0417.extraarmor.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thecanadian0417.extraarmor.ExtraArmor;
import net.thecanadian0417.extraarmor.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraArmor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXTRA_ARMOR_MATERIALS = CREATIVE_MODE_TABS.register("extra_armor_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TUNGSTEN_INGOT.get()))
                    .title(Component.translatable("creativetab.extra_armor_materials"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TUNGSTEN_INGOT.get());
                        pOutput.accept(ModItems.RAW_TUNGSTEN.get());
                        pOutput.accept(ModItems.CHROMIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_CHROMIUM.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModItems.PLATINUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                        pOutput.accept(ModBlocks.CHROMIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TUNGSTEN_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                        pOutput.accept(ModBlocks.CHROMIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
