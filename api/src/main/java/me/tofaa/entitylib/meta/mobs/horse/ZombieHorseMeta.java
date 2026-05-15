package me.tofaa.entitylib.meta.mobs.horse;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class ZombieHorseMeta extends BaseHorseMeta {

    public static final byte OFFSET = BaseHorseMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public ZombieHorseMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
