package com.karotte128.create_no_entities.items;

import com.karotte128.create_no_entities.CreateNoEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {

    public static final Item EGG_SHELL = registerItem("eggshell", new Item(new Item.Settings()));
    public static final Item EGG_YOLK = registerItem("egg_yolk", new Item(new Item.Settings()));

    public static final Item MILK_POWDER = registerItem("milk_powder", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CreateNoEntities.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateNoEntities.LOGGER.info("Registering Mod Items for " + CreateNoEntities.MOD_ID);
    }
}
