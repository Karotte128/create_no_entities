package com.karotte128.create_no_entities.fluids;

import com.karotte128.create_no_entities.CreateNoEntities;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FluidRegistry {
    public static final FlowableFluid STILL_LIQUID_EGG = Registry.register(Registries.FLUID,
            Identifier.of(CreateNoEntities.MOD_ID, "liquid_egg"), new LiquidEggFluid.Still());
    public static final FlowableFluid FLOWING_LIQUID_EGG = Registry.register(Registries.FLUID,
            Identifier.of(CreateNoEntities.MOD_ID, "flowing_liquid_egg"), new LiquidEggFluid.Flowing());

    public static final Block LIQUID_EGG_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(CreateNoEntities.MOD_ID,
            "liquid_egg_block"), new FluidBlock(FluidRegistry.STILL_LIQUID_EGG, Block.Settings.copy(Blocks.WATER)
            .replaceable().liquid()));
    public static final Item LIQUID_EGG_BUCKET = Registry.register(Registries.ITEM, Identifier.of(CreateNoEntities.MOD_ID,
            "liquid_egg_bucket"), new BucketItem(FluidRegistry.STILL_LIQUID_EGG,
            new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static void registerModFluids() {
        CreateNoEntities.LOGGER.info("Registering Mod Fluids for " + CreateNoEntities.MOD_ID);
    }
}