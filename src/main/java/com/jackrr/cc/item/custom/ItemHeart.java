package com.jackrr.cc.item.custom;

import net.minecraft.world.item.Item;

public class ItemHeart extends Item {
    public ItemHeart(Properties properties) {
        super(properties
                .stacksTo(1)
                .fireResistant()
        );
    }
}
