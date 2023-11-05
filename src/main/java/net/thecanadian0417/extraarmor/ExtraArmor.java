package net.thecanadian0417.extraarmor;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thecanadian0417.extraarmor.block.ModBlocks;
import net.thecanadian0417.extraarmor.block.entity.ModBlockEntities;
import net.thecanadian0417.extraarmor.item.ModCreativeModeTabs;
import net.thecanadian0417.extraarmor.item.ModItems;
import net.thecanadian0417.extraarmor.recipe.ModRecipes;
import net.thecanadian0417.extraarmor.screen.CokeOvenScreen;
import net.thecanadian0417.extraarmor.screen.ModMenuTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtraArmor.MOD_ID)
public class ExtraArmor {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "extra_armor";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtraArmor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.TUNGSTEN_INGOT);
            event.accept(ModItems.RAW_TUNGSTEN);
            event.accept(ModItems.CHROMIUM_INGOT);
            event.accept(ModItems.RAW_CHROMIUM);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.RAW_TITANIUM);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.RAW_PLATINUM);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                MenuScreens.register(ModMenuTypes.COKE_OVEN_MENU.get(), CokeOvenScreen::new);
            });
        }


    }
}
