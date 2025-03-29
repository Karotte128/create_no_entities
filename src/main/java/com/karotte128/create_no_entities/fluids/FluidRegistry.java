//package com.karotte128.create_no_entities.fluids;
//
//import com.karotte128.create_no_entities.CreativeTab;
////import com.karotte128.create_no_entities.TagRegistry;
//import com.simibubi.create.AllFluids;
//import com.simibubi.create.AllTags;
//import com.tterrag.registrate.util.entry.FluidEntry;
//import com.tterrag.registrate.fabric.SimpleFlowableFluid;
//import net.fabricmc.fabric.api.transfer.v1.fluid.*;
//import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
//import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
//import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.material.Fluid;
//
//import javax.annotation.Nullable;
//
//import static com.karotte128.create_no_entities.CreateNoEntities.REGISTRATE;
//import static net.minecraft.world.item.Items.BUCKET;
//
//public class FluidRegistry {
//
//    public static final FluidEntry<SimpleFlowableFluid.Flowing> LIQUID_EGG =
//            REGISTRATE.fluid("liquid_egg", new ResourceLocation("create_no_entities:block/liquid_egg_still"), new ResourceLocation("create_no_entities:block/liquid_egg_flow"))
//                    .lang("Liquid_Egg")
//                    .fluidAttributes(() -> new CreateAttributeHandler("block.create_no_entities.liquid_egg", 1500, 500))
//                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
//                            .tickRate(25)
//                            .flowSpeed(3)
//                            .blastResistance(100f))
//                    .source(SimpleFlowableFluid.Source::new)
////                    .tag(AllTags.forgeFluidTag("liquid_egg"))
//                    .onRegisterAfter(Registries.ITEM, plant -> {
//                        Fluid source = plant.getSource();
//
//                        FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
//                                new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
//                        FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
//                                new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
//                    })
//                    .register();
//
//    public static void register() {}
//
//    private record CreateAttributeHandler(Component name, int viscosity, boolean lighterThanAir) implements FluidVariantAttributeHandler {
//        private CreateAttributeHandler(String key, int viscosity, int density) {
//            this(Component.translatable(key), viscosity, density <= 0);
//        }
//
//        public CreateAttributeHandler(String key) {
//            this(key, FluidConstants.WATER_VISCOSITY, 1000);
//        }
//
//        @Override
//        public Component getName(FluidVariant fluidVariant) {
//            return name.copy();
//        }
//
//        @Override
//        public int getViscosity(FluidVariant variant, @Nullable Level world) {
//            return viscosity;
//        }
//
//        @Override
//        public boolean isLighterThanAir(FluidVariant variant) {
//            return lighterThanAir;
//        }
//    }
//}
