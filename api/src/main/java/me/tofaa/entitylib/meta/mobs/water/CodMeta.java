package me.tofaa.entitylib.meta.mobs.water;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class CodMeta extends BaseFishMeta{

    public static final byte OFFSET = BaseFishMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public CodMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
