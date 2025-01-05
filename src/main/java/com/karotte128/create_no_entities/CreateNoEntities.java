package com.karotte128.create_no_entities;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;


import com.karotte128.create_no_entities.fluids.FluidRegistry;
import com.karotte128.create_no_entities.items.ItemRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateNoEntities implements ModInitializer {
	public static final String ID = "create_no_entities";
	public static final String NAME = "Create: No Entities";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create("create_no_entities");

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);


		FluidRegistry.register();
		ItemRegistry.register();
		CreativeTab.register();

		REGISTRATE.register();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
