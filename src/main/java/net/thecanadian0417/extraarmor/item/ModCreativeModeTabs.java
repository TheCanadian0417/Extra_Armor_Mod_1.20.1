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
                    .displayItems((pParameters, output) -> {
                        output.accept(ModItems.TUNGSTEN_INGOT.get());
                        output.accept(ModItems.RAW_TUNGSTEN.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());
                        output.accept(ModItems.RAW_CHROMIUM.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.TITANIUM_INGOT.get());
                        output.accept(ModItems.RAW_TITANIUM.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.METAL_DETECTOR.get());

                        output.accept(ModItems.TUNGSTEN_SWORD.get());
                        output.accept(ModItems.TUNGSTEN_PICKAXE.get());
                        output.accept(ModItems.TUNGSTEN_SHOVEL.get());
                        output.accept(ModItems.TUNGSTEN_AXE.get());
                        output.accept(ModItems.TUNGSTEN_HOE.get());

                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.STEEL_HOE.get());

                        output.accept(ModItems.TITANIUM_SWORD.get());
                        output.accept(ModItems.TITANIUM_PICKAXE.get());
                        output.accept(ModItems.TITANIUM_SHOVEL.get());
                        output.accept(ModItems.TITANIUM_AXE.get());
                        output.accept(ModItems.TITANIUM_HOE.get());

                        output.accept(ModItems.TUNGSTEN_HELMET.get());
                        output.accept(ModItems.TUNGSTEN_CHESTPLATE.get());
                        output.accept(ModItems.TUNGSTEN_LEGGINGS.get());
                        output.accept(ModItems.TUNGSTEN_BOOTS.get());

                        output.accept(ModItems.CHROMIUM_HELMET.get());
                        output.accept(ModItems.CHROMIUM_CHESTPLATE.get());
                        output.accept(ModItems.CHROMIUM_LEGGINGS.get());
                        output.accept(ModItems.CHROMIUM_BOOTS.get());

                        output.accept(ModItems.TITANIUM_HELMET.get());
                        output.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        output.accept(ModItems.TITANIUM_LEGGINGS.get());
                        output.accept(ModItems.TITANIUM_BOOTS.get());

                        output.accept(ModItems.PLATINUM_HELMET.get());
                        output.accept(ModItems.PLATINUM_CHESTPLATE.get());
                        output.accept(ModItems.PLATINUM_LEGGINGS.get());
                        output.accept(ModItems.PLATINUM_BOOTS.get());

                        output.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                        output.accept(ModBlocks.CHROMIUM_BLOCK.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.TUNGSTEN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                        output.accept(ModBlocks.CHROMIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get());
                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        output.accept(ModBlocks.COKE_OVEN.get());
                    })
                    .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
