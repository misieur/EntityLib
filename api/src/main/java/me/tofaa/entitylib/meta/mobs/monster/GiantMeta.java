package me.tofaa.entitylib.meta.mobs.monster;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;
import me.tofaa.entitylib.meta.types.MobMeta;

public class GiantMeta extends MobMeta {
    public static final byte OFFSET = MobMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public GiantMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
