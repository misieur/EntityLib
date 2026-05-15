package me.tofaa.entitylib.meta.mobs.minecart;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class ChestMinecartMeta extends BaseMinecartMeta{

    public static final byte OFFSET = BaseMinecartMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;


    public ChestMinecartMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }

    @Override
    public int getObjectData() {
        return 1;
    }
}
