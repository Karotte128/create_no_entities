package com.karotte128.create_no_entities.items;

import com.karotte128.create_no_entities.CreateNoEntities;

import com.karotte128.create_no_entities.fluids.ModFluids;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNoEntities.MODID);

    public static final Supplier<CreativeModeTab> CREATE_NO_ENTITIES_TAB = CREATIVE_MODE_TAB.register("create_no_entities_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EGG_SHELL.get()))
                    .title(Component.translatable("itemGroup.create_no_entities_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.EGG_SHELL);
                        output.accept(ModItems.EGG_YOLK);
                        output.accept(ModItems.MILK_POWDER);
                        output.accept(ModFluids.LIQUID_EGG_BUCKET);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
