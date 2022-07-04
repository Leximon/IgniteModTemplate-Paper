package de.leximon.fuqsignature.mixin;

import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ServerGamePacketListenerImpl.class)
public abstract class ServerGamePacketListenerImplMixin {

    @Redirect(method = "broadcastChatMessage", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/PlayerChatMessage;verify(Lnet/minecraft/server/level/ServerPlayer;)Z"))
    private boolean inject(PlayerChatMessage instance, ServerPlayer var0) {
        System.out.println("häääääääääääääääääääääääääääääää");
        return true; // fuq chat signature
    }
}
