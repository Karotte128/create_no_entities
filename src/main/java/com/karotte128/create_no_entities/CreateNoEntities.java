package com.karotte128.create_no_entities;

import com.karotte128.fluids.FluidRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.karotte128.blocks.BlockRegistry.BLOCKS;
import static com.karotte128.create_no_entities.CreativeTab.CREATIVE_MODE_TABS;
import static com.karotte128.create_no_entities.items.ItemRegistry.ITEMS;
import static com.karotte128.fluids.FluidRegistry.FLUIDS;
import static com.karotte128.fluids.FluidTypes.FLUID_TYPES;

@Mod(CreateNoEntities.ID)
public class CreateNoEntities {
	public static final String ID = "create_no_entities";
	public static final String NAME = "Create: No Entities";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public CreateNoEntities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        FLUIDS.register(modEventBus);
        FLUID_TYPES.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_LIQUID_EGG.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_LIQUID_EGG.get(), RenderType.translucent());
        }
    }

}
