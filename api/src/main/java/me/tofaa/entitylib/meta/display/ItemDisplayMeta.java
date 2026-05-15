package me.tofaa.entitylib.meta.display;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.manager.server.VersionComparison;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import me.tofaa.entitylib.meta.Metadata;

public class ItemDisplayMeta extends AbstractDisplayMeta {

    public final byte offset = (byte) (isVersion(ServerVersion.V_1_20_2, VersionComparison.NEWER_THAN_OR_EQUALS) ? OFFSET + 15 : OFFSET + 14);
    public final byte maxOffset = offset(offset, 1);

    public ItemDisplayMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }

    public ItemStack getItem() {
        return super.metadata.getIndex(offset, ItemStack.EMPTY);
    }

    public void setItem(ItemStack itemStack) {
        super.metadata.setIndex(offset, EntityDataTypes.ITEMSTACK, itemStack);
    }

    public DisplayType getDisplayType() {
        return DisplayType.VALUES[super.metadata.getIndex(offset(offset, 1), (byte) 0)];
    }

    public void setDisplayType(DisplayType displayType) {
        super.metadata.setIndex(offset(offset, 1), EntityDataTypes.BYTE, (byte) displayType.ordinal());
    }

    public enum DisplayType {
        NONE,
        THIRD_PERSON_LEFT_HAND,
        THIRD_PERSON_RIGHT_HAND,
        FIRST_PERSON_LEFT_HAND,
        FIRST_PERSON_RIGHT_HAND,
        HEAD,
        GUI,
        GROUND,
        FIXED;

        private static final DisplayType[] VALUES = values();
    }

}

