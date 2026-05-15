package me.tofaa.entitylib.meta.mobs.cuboid;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class MagmaCubeMeta extends SlimeMeta {

    public static final byte OFFSET = SlimeMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public MagmaCubeMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
