package com.karotte128.create_no_entities;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.karotte128.create_no_entities.CreativeTab.CREATIVE_MODE_TABS;
import static com.karotte128.create_no_entities.items.ItemRegistry.ITEMS;

@Mod(CreateNoEntities.ID)
public class CreateNoEntities {
	public static final String ID = "create_no_entities";
	public static final String NAME = "Create: No Entities";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public CreateNoEntities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
