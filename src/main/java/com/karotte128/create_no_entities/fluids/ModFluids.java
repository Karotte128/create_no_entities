package com.karotte128.create_no_entities.fluids;

import com.karotte128.create_no_entities.CreateNoEntities;
import com.karotte128.create_no_entities.blocks.ModBlocks;
import com.karotte128.create_no_entities.items.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, CreateNoEntities.MODID);

    public static final Supplier<FlowingFluid> SOURCE_LIQUID_EGG = FLUIDS.register("source_liquid_egg",
            () -> new BaseFlowingFluid.Source(ModFluids.LIQUID_EGG_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_LIQUID_EGG = FLUIDS.register("flowing_liquid_egg",
            () -> new BaseFlowingFluid.Flowing(ModFluids.LIQUID_EGG_PROPERTIES));

    public static final DeferredBlock<LiquidBlock> LIQUID_EGG_BLOCK = ModBlocks.BLOCKS.register("liquid_egg_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LIQUID_EGG.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));
    public static final DeferredItem<Item> LIQUID_EGG_BUCKET = ModItems.ITEMS.registerItem("liquid_egg_bucket",
            properties -> new BucketItem(ModFluids.SOURCE_LIQUID_EGG.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final BaseFlowingFluid.Properties LIQUID_EGG_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.LIQUID_EGG_FLUID_TYPE, SOURCE_LIQUID_EGG, FLOWING_LIQUID_EGG)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModFluids.LIQUID_EGG_BLOCK).bucket(ModFluids.LIQUID_EGG_BUCKET);


    public static void register(IEventBus eventBus) {

        FLUIDS.register(eventBus);
    }
}

