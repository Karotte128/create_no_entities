package com.karotte128.create_no_entities.items;

import com.karotte128.create_no_entities.CreateNoEntities;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateNoEntities.MODID);

    public static final DeferredItem<Item> EGG_SHELL = ITEMS.register("eggshell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EGG_YOLK = ITEMS.register("egg_yolk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MILK_POWDER = ITEMS.register("milk_powder",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
