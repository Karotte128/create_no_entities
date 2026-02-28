package com.karotte128.fluids;

import com.karotte128.create_no_entities.CreateNoEntities;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class FluidTypes {
    public static final ResourceLocation LIQUID_EGG_STILL_RL = ResourceLocation.fromNamespaceAndPath("create_no_entities", "block/liquid_egg_still");
    public static final ResourceLocation LIQUID_EGG_FLOWING_RL = ResourceLocation.fromNamespaceAndPath("create_no_entities","block/liquid_egg_flow");
    public static final ResourceLocation LIQUID_EGG_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateNoEntities.ID);

    public static final Supplier<FluidType> LIQUID_EGG_FLUID_TYPE = registerFluidType("liquid_egg",
            new BaseFluidType(LIQUID_EGG_STILL_RL, LIQUID_EGG_FLOWING_RL, LIQUID_EGG_OVERLAY_RL, 0xEEF4CA4E,
                    new Vector3f(244f / 255f, 202f / 255f, 78f / 255f),
                    FluidType.Properties.create()));

    private static Supplier<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }
}
