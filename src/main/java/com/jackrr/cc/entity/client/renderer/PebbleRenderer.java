package com.jackrr.cc.entity.client.renderer;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.GeoEntityRenderer;
import com.jackrr.cc.entity.EntityPebble;
import com.jackrr.cc.entity.client.renderstate.PebbleRenderState;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.EntityType;
import org.jspecify.annotations.Nullable;

public class PebbleRenderer<T extends EntityPebble, R extends PebbleRenderState> extends GeoEntityRenderer<T, R> {
    public PebbleRenderer(EntityRendererProvider.Context context, GeoModel<T> model) {
        super(context, model);
    }

    @Override
    public void extractRenderState(T entity, R entityRenderState, float partialTick) {
        super.extractRenderState(entity, entityRenderState, partialTick);
    }

    @Override
    public R createRenderState(T animatable, @Nullable Void relatedObject) {
        return (R) new PebbleRenderState();
    }
}