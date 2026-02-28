package com.karotte128.fluids;

import com.karotte128.blocks.BlockRegistry;
import com.karotte128.create_no_entities.CreateNoEntities;
import com.karotte128.create_no_entities.items.ItemRegistry;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidRegistry {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateNoEntities.ID);

    public static final RegistryObject<FlowingFluid> SOURCE_LIQUID_EGG = FLUIDS.register("liquid_egg",
            () -> new ForgeFlowingFluid.Source(FluidRegistry.LIQUID_EGG_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_EGG = FLUIDS.register("flowing_soap_water",
            () -> new ForgeFlowingFluid.Flowing(FluidRegistry.LIQUID_EGG_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LIQUID_EGG_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FluidTypes.LIQUID_EGG_FLUID_TYPE, SOURCE_LIQUID_EGG, FLOWING_LIQUID_EGG)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.LIQUID_EGG_BLOCK)
            .bucket(ItemRegistry.LIQUID_EGG_BUCKET);
}
