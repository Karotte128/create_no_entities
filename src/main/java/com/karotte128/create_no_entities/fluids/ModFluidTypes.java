package com.karotte128.create_no_entities.fluids;

import com.karotte128.create_no_entities.CreateNoEntities;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final ResourceLocation LIQUID_EGG_STILL_RL = ResourceLocation.fromNamespaceAndPath("create_no_entities", "block/liquid_egg_still");
    public static final ResourceLocation LIQUID_EGG_FLOWING_RL = ResourceLocation.fromNamespaceAndPath("create_no_entities","block/liquid_egg_flow");
    public static final ResourceLocation LIQUID_EGG_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateNoEntities.MODID);

    public static final Supplier<FluidType> LIQUID_EGG_FLUID_TYPE = registerFluidType("liquid_egg",
            new BaseFluidType(LIQUID_EGG_STILL_RL, LIQUID_EGG_FLOWING_RL, LIQUID_EGG_OVERLAY_RL, 0xEEF4CA4E,
                    new Vector3f(244f / 255f, 202f / 255f, 78f / 255f),
                    FluidType.Properties.create()));


    private static Supplier<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}