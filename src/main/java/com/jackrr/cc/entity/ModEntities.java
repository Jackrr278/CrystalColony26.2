package com.jackrr.cc.entity;

import com.jackrr.cc.CrystalColony;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, CrystalColony.MODID);

    public static final Supplier<EntityType<EntityPebble>> PEBBLE = ENTITY_TYPES.register("pebble",
            () -> EntityType.Builder.of(EntityPebble::new, MobCategory.CREATURE)
                    .fireImmune()
                    .build(getRK("pebble")
                    ));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    public static ResourceKey<EntityType<?>> getRK(String path){
        return ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CrystalColony.MODID, path));
    }
}
