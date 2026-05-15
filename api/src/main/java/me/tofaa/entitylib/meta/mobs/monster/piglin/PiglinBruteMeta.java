package me.tofaa.entitylib.meta.mobs.monster.piglin;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class PiglinBruteMeta extends BasePiglinMeta{

    public static final byte OFFSET = BasePiglinMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public PiglinBruteMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
