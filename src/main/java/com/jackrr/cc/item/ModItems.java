package com.jackrr.cc.item;

import com.jackrr.cc.CrystalColony;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CrystalColony.MODID);

    public static DeferredItem<Item> GEM_HEART = ITEMS.registerSimpleItem("gem_heart");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
