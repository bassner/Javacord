package org.javacord.api.entity.user;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.DiscordClient;
import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Icon;
import org.javacord.api.entity.Mentionable;
import org.javacord.api.entity.Nameable;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.UpdatableFromCache;
import org.javacord.api.entity.activity.Activity;
import org.javacord.api.entity.channel.PrivateChannel;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.message.Messageable;
import org.javacord.api.entity.server.Server;
import org.javacord.api.listener.user.UserAttachableListenerManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * This class represents a user.
 */
public interface User extends UserLike, UpdatableFromCache<User>, UserAttachableListenerManager {

    /**
     * Gets the server voice channels the user is connected to.
     *
     * @return The server voice channels the user is connected to.
     */
    default Set<ServerVoiceChannel> getConnectedVoiceChannels() {
        return Collections.unmodifiableSet(getApi().getServerVoiceChannels().stream()
                .filter(this::isConnected)
                .collect(Collectors.toSet()));
    }

    /**
     * Gets all mutual servers with this user.
     *
     * @return All mutual servers with this user.
     */
    Set<Server> getMutualServers();

    @Override
    default Optional<User> getCurrentCachedInstance() {
        return getApi().getCachedUserById(getId());
    }

    @Override
    default CompletableFuture<User> getLatestInstance() {
        return getApi().getUserById(getId());
    }
}
