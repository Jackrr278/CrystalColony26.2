package com.jackrr.cc.event;

import com.jackrr.cc.CrystalColony;
import com.jackrr.cc.entity.EntityPebble;
import com.jackrr.cc.entity.ModEntities;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = CrystalColony.MODID)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
    event.put(ModEntities.PEBBLE.get(), EntityPebble.createAttributes().build());
    }
}
