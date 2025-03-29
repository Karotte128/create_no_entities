package com.karotte128.create_no_entities;

//import com.karotte128.create_no_entities.fluids.FluidRegistry;
import com.karotte128.create_no_entities.items.ItemRegistry;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateNoEntities implements ModInitializer {
	public static final String MOD_ID = "create_no_entities";
	public static final String NAME = "Create: No Entities";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {

		//FluidRegistry.registerModFluids();
		ItemRegistry.registerModItems();
		CreativeTab.registerItemGroups();
	}
}
