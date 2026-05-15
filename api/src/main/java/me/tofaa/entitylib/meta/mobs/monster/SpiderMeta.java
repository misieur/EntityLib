package me.tofaa.entitylib.meta.mobs.monster;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;
import me.tofaa.entitylib.meta.types.MobMeta;

public class SpiderMeta extends MobMeta {

    public static final byte OFFSET = MobMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 1;

    private final static byte CLIMBING_BIT = 0x01;


    public SpiderMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }

    public boolean isClimbing() {
        return getMaskBit(OFFSET, CLIMBING_BIT);
    }

    public void setClimbing(boolean value) {
        setMaskBit(OFFSET, CLIMBING_BIT, value);
    }


}
