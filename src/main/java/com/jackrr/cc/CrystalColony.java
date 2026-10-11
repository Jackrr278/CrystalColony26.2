package com.jackrr.cc;

import com.jackrr.cc.entity.ModEntities;
import com.jackrr.cc.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CrystalColony.MODID)
public class CrystalColony {
    public static final String MODID = "cc";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CrystalColony(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);

    }
}
