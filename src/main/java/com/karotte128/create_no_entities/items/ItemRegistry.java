package com.karotte128.create_no_entities.items;

import com.karotte128.fluids.FluidRegistry;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.karotte128.create_no_entities.CreateNoEntities.ID;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ID);

    public static final RegistryObject<Item> EGG_SHELL = ITEMS.register("eggshell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EGG_YOLK = ITEMS.register("egg_yolk", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MILK_POWDER = ITEMS.register("milk_powder", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CALCIUM_POWDER = ITEMS.register("calcium_powder", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIQUID_EGG_BUCKET = ITEMS.register("liquid_egg_bucket",(() -> new BucketItem(FluidRegistry.SOURCE_LIQUID_EGG, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1))));
}
