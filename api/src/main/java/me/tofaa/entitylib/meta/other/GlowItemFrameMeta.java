package me.tofaa.entitylib.meta.other;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class GlowItemFrameMeta extends ItemFrameMeta {

    public static final byte OFFSET = ItemFrameMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public GlowItemFrameMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
