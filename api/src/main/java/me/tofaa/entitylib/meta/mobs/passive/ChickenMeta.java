package me.tofaa.entitylib.meta.mobs.passive;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;
import me.tofaa.entitylib.meta.types.AgeableMeta;

public class ChickenMeta extends AgeableMeta {

    public static final byte OFFSET = AgeableMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public ChickenMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
