package com.karotte128.create_no_entities;

//import com.karotte128.create_no_entities.blocks.BlockRegistry;
import com.karotte128.create_no_entities.fluids.FluidRegistry;
import com.karotte128.create_no_entities.items.ItemRegistry;
import com.simibubi.create.foundation.utility.Components;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeTab {

    public static void register(){
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, "", BASE_CREATIVE_TAB);
        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(CreativeTab::make);
    }

    private static void make(CreativeModeTab creativeModeTab, FabricItemGroupEntries entries) {
        if (creativeModeTab == BASE_CREATIVE_TAB) {

            entries.accept(FluidRegistry.LIQUID_EGG.get().getBucket());
	    entries.accept(ItemRegistry.EGG_SHELL);
	    entries.accept(ItemRegistry.EGG_YOLK);

	    entries.accept(ItemRegistry.MILK_POWDER);
        }
    }

    public static final CreativeModeTab BASE_CREATIVE_TAB = FabricItemGroup.builder()
                    .title(Components.translatable("itemGroup.create_no_entities"))
                    .icon(ItemRegistry.EGG_SHELL::asStack)
                    .build();
}
