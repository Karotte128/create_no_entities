package com.karotte128.create_no_entities.items;

import com.karotte128.create_no_entities.CreativeTab;
import com.simibubi.create.content.equipment.extendoGrip.ExtendoGripItemRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.karotte128.create_no_entities.CreateNoEntities.REGISTRATE;

public class ItemRegistry {

    public static final ItemEntry<Item> EGG_SHELL = REGISTRATE.item("eggshell", Item::new).register();
    public static final ItemEntry<Item> EGG_YOLK = REGISTRATE.item("egg_yolk", Item::new).register();

    public static final ItemEntry<Item> MILK_POWDER = REGISTRATE.item("milk_powder", Item::new).register();
	public static void register() {}
}
