package com.jackrr.cc.entity.client.model;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jackrr.cc.CrystalColony;
import com.jackrr.cc.entity.EntityPebble;
import net.minecraft.resources.Identifier;

public class PebbleModel<T extends EntityPebble> extends DefaultedEntityGeoModel<T> {
    public PebbleModel() {
        super(Identifier.fromNamespaceAndPath(CrystalColony.MODID, "pebble"));
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(CrystalColony.MODID, "textures/entity/pebble.png");
    }
}



