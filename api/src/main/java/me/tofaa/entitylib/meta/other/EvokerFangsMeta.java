package me.tofaa.entitylib.meta.other;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.EntityMeta;
import me.tofaa.entitylib.meta.Metadata;

public class EvokerFangsMeta extends EntityMeta {

    public static final byte OFFSET = EntityMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public EvokerFangsMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
