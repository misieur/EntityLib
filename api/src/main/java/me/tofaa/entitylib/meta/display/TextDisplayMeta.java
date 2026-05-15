package me.tofaa.entitylib.meta.display;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.manager.server.VersionComparison;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import me.tofaa.entitylib.meta.Metadata;
import net.kyori.adventure.text.Component;

public class TextDisplayMeta extends AbstractDisplayMeta {

    public final byte offset = (byte) (isVersion(ServerVersion.V_1_20_2, VersionComparison.NEWER_THAN_OR_EQUALS) ? OFFSET + 15 : OFFSET + 14);
    public final byte maxOffset = offset(offset, 5);

    private static final byte SHADOW = 1;
    private static final byte SEE_THROUGH = 2;
    private static final byte USE_DEFAULT_BACKGROUND = 4;
    private static final byte ALIGN_LEFT = 8;
    private static final byte ALIGN_RIGHT = 16;

    public TextDisplayMeta(int entityId, Metadata metadata, ServerVersion serverVersion) {
        super(entityId, metadata, serverVersion);
    }


    public Component getText() {
        return metadata.getIndex(offset, Component.empty());
    }

    public void setText(Component component) {
        metadata.setIndex(offset, EntityDataTypes.ADV_COMPONENT, component);
    }

    public int getLineWidth() {
        return metadata.getIndex(offset(offset, 1), 200);
    }

    public void setLineWidth(int value) {
        metadata.setIndex(offset(offset, 1), EntityDataTypes.INT, value);
    }

    public int getBackgroundColor() {
        return metadata.getIndex(offset(offset, 2), 0);
    }

    public void setBackgroundColor(int value) {
        metadata.setIndex(offset(offset, 2), EntityDataTypes.INT, value);
    }

    public byte getTextOpacity() {
        return metadata.getIndex(offset(offset, 3), (byte) -1);
    }

    public void setTextOpacity(byte value) {
        metadata.setIndex(offset(offset, 3), EntityDataTypes.BYTE, value);
    }

    public boolean isShadow() {
        return getMaskBit(offset(offset, 4), SHADOW);
    }

    public void setShadow(boolean value) {
        setMaskBit(offset(offset, 4), SHADOW, value);
    }

    public boolean isSeeThrough() {
        return getMaskBit(offset(offset, 4), SEE_THROUGH);
    }

    public void setSeeThrough(boolean value) {
        setMaskBit(offset(offset, 4), SEE_THROUGH, value);
    }

    public boolean isUseDefaultBackground() {
        return getMaskBit(offset(offset, 4), USE_DEFAULT_BACKGROUND);
    }

    public void setUseDefaultBackground(boolean value) {
        setMaskBit(offset(offset, 4), USE_DEFAULT_BACKGROUND, value);
    }

    public boolean isAlignLeft() {
        return getMaskBit(offset(offset, 4), ALIGN_LEFT);
    }

    public void setAlignLeft(boolean value) {
        setMaskBit(offset + 4, ALIGN_LEFT, value);
    }

    public boolean isAlignRight() {
        return getMaskBit(offset(offset, 4), ALIGN_RIGHT);
    }

    public void setAlignRight(boolean value) {
        setMaskBit(offset(offset, 4), ALIGN_RIGHT, value);
    }
}
