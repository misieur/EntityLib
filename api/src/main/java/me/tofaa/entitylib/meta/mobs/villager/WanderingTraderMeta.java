package me.tofaa.entitylib.meta.mobs.villager;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.tofaa.entitylib.meta.Metadata;

public class WanderingTraderMeta extends VillagerMeta{

    public static final byte OFFSET = VillagerMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public WanderingTraderMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }
}
