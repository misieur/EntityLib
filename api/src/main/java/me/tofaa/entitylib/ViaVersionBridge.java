package me.tofaa.entitylib;

import com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jetbrains.annotations.Nullable;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.UUID;

public class ViaVersionBridge {

    private final static @Nullable MethodHandle SEND_RAW_PACKET_HANDLE;

    static {
        Class<?> viaClass = null;
        try {
            viaClass = Class.forName("com.viaversion.viaversion.api.Via");
        } catch (ClassNotFoundException ignored) {
        }
        MethodHandle sendRawPacketHandle = null;
        if (viaClass != null) {
            try {
                MethodHandles.Lookup lookup = MethodHandles.lookup();

                MethodHandle getApiHandle = lookup.findStatic(viaClass, "getAPI",
                        MethodType.methodType(Class.forName("com.viaversion.viaversion.api.ViaAPI")));

                Object viaApiInstance = getApiHandle.invoke();

                Class<?> byteBufClass = Class.forName("io.netty.buffer.ByteBuf");
                MethodHandle rawHandle = lookup.findVirtual(viaApiInstance.getClass(), "sendRawPacket",
                        MethodType.methodType(void.class, UUID.class, byteBufClass));

                sendRawPacketHandle = rawHandle.bindTo(viaApiInstance);

            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
        SEND_RAW_PACKET_HANDLE = sendRawPacketHandle;
    }

    public static boolean hasViaVersion() {
        return ViaVersionBridge.SEND_RAW_PACKET_HANDLE != null;
    }

    public static void sendPacket(UUID user, PacketWrapper<?> wrapper) {
        if (SEND_RAW_PACKET_HANDLE == null) throw new NullPointerException();
        try {
            SEND_RAW_PACKET_HANDLE.invoke(user, wrapper.buffer);
        } catch (Throwable e) {
            throw new RuntimeException("Failed to send packet using ViaVersion via reflection", e);
        }
    }

}
