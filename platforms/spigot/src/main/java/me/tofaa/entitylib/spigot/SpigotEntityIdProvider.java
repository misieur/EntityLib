package me.tofaa.entitylib.spigot;

import java.util.UUID;

import io.github.retrooper.packetevents.util.SpigotReflectionUtil;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;

import me.tofaa.entitylib.EntityIdProvider;
import me.tofaa.entitylib.Platform;

/**
 * Internal {@link EntityIdProvider} for Spigot servers, handling version and platform differences.
 */
public final class SpigotEntityIdProvider implements EntityIdProvider {

    /**
     * Constructs a new {@code SpigotEntityIdProvider}.
     *
     * @param platform The platform instance. Must not be null.
     */
    public SpigotEntityIdProvider(final @NotNull Platform<JavaPlugin> platform) {

    }

    @Override
    public int provide(@NotNull UUID entityUUID, @NotNull EntityType entityType) {
        // UUID and EntityType are unused in Minecraft id generation.
        return SpigotReflectionUtil.generateEntityId();
    }
}
