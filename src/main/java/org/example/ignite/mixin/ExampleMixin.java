package org.example.ignite.mixin;

import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MinecraftServer.class)
public abstract class ExampleMixin {

    @Shadow @Final public static Logger LOGGER;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void inject(CallbackInfo callback) {
        LOGGER.info("Hello mixin!");
    }
}
