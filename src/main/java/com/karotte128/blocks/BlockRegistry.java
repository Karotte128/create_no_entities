package com.karotte128.blocks;

import com.karotte128.create_no_entities.CreateNoEntities;
import com.karotte128.fluids.FluidRegistry;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateNoEntities.ID);

    public static final RegistryObject<LiquidBlock> LIQUID_EGG_BLOCK = BLOCKS.register("liquid_egg_block",
            () -> new LiquidBlock(FluidRegistry.SOURCE_LIQUID_EGG, BlockBehaviour.Properties.copy(Blocks.WATER)));
}
