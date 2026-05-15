package me.tofaa.entitylib.meta.mobs.monster;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class CaveSpiderMeta extends SpiderMeta{

    public static final byte OFFSET = SpiderMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public CaveSpiderMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
