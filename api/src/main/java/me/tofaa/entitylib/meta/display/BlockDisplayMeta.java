package me.tofaa.entitylib.meta.display;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.manager.server.VersionComparison;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.world.states.WrappedBlockState;
import me.tofaa.entitylib.meta.Metadata;

public class BlockDisplayMeta extends AbstractDisplayMeta {

    public final byte offset = (byte) (isVersion(ServerVersion.V_1_20_2, VersionComparison.NEWER_THAN_OR_EQUALS) ? OFFSET + 15 : OFFSET + 14);
    public final byte MAX_OFFSET = offset(offset, 1);

    public BlockDisplayMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }

    public int getBlockId() {
        return super.metadata.getIndex(offset, 0);
    }

    public void setBlockId(int blockId) {
        super.metadata.setIndex(offset, EntityDataTypes.BLOCK_STATE, blockId);
    }

    public WrappedBlockState getBlockState() {
        return WrappedBlockState.getByGlobalId(serverVersion.toClientVersion(), getBlockId());
    }

    public void setBlockState(WrappedBlockState blockState) {
        setBlockId(blockState.getGlobalId());
    }
}
