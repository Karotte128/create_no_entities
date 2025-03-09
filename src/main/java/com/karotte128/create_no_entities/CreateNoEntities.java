package com.karotte128.create_no_entities;

//import com.karotte128.create_no_entities.fluids.ModFluids;
import com.karotte128.create_no_entities.items.ModCreativeModeTabs;
import com.karotte128.create_no_entities.items.ModItems;
import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

	@Mod(CreateNoEntities.MODID)
	public class CreateNoEntities {
		public static final String MODID = "create_no_entities";
		private static final Logger LOGGER = LogUtils.getLogger();

		public CreateNoEntities(IEventBus modEventBus, ModContainer modContainer) {
			modEventBus.addListener(this::commonSetup);

			NeoForge.EVENT_BUS.register(this);

			ModCreativeModeTabs.register(modEventBus);
			ModItems.register(modEventBus);
			//ModFluids.register(modEventBus);

			modEventBus.addListener(this::addCreative);
		}

		private void commonSetup(final FMLCommonSetupEvent event) {
		}

		private void addCreative(BuildCreativeModeTabContentsEvent event) {
		}

		@SubscribeEvent
		public void onServerStarting(ServerStartingEvent event) {
		}

		@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
		public static class ClientModEvents {
			@SubscribeEvent
			public static void onClientSetup(FMLClientSetupEvent event) {
			}
		}

	}
