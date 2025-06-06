package com.karotte128.create_no_entities;

import com.karotte128.create_no_entities.fluids.FluidRegistry;
import com.karotte128.create_no_entities.items.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTab {

    public static final ItemGroup CREATE_NO_ENTITIES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CreateNoEntities.MOD_ID, "create_no_entities_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ItemRegistry.EGG_SHELL))
                    .displayName(Text.translatable("itemGroup.create_no_entities"))
                    .entries((displayContext, entries) -> {
                        entries.add(ItemRegistry.EGG_SHELL);
                        entries.add(ItemRegistry.EGG_YOLK);
                        entries.add(ItemRegistry.MILK_POWDER);
                        entries.add(ItemRegistry.CALCIUM_POWDER)    ;
                        entries.add(FluidRegistry.LIQUID_EGG_BUCKET);
                    }).build());


    public static void registerItemGroups() {
        CreateNoEntities.LOGGER.info("Registering Creative Tabs for " + CreateNoEntities.MOD_ID);
    }
}