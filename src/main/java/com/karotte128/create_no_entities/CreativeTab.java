package com.karotte128.create_no_entities;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.karotte128.create_no_entities.CreateNoEntities.ID;
import static com.karotte128.create_no_entities.items.ItemRegistry.*;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("cne_tab", () -> CreativeModeTab.builder().withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> EGG_SHELL.get().getDefaultInstance()).title(Component.translatable("itemGroup.create_no_entities_tab")).displayItems((parameters, output) -> {
        output.accept(EGG_SHELL.get());
        output.accept(EGG_YOLK.get());
        output.accept(MILK_POWDER.get());
        output.accept(CALCIUM_POWDER.get());
    }).build());

}