package org.javacord.api.listener.channel.server.voice;

import org.javacord.api.event.channel.server.voice.ServerVoiceChannelMemberJoinEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.server.member.MemberAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to users joining a server voice channel.
 */
@FunctionalInterface
public interface VoiceChannelMemberJoinListener extends ServerAttachableListener, UserAttachableListener,
                                                              ServerVoiceChannelAttachableListener, MemberAttachableListener,
        GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a user joins a server voice channel.
     *
     * @param event The event
     */
    void onServerVoiceChannelMemberJoin(ServerVoiceChannelMemberJoinEvent event);

}