package org.javacord.api.listener.channel.user;

import org.javacord.api.event.channel.user.PrivateChannelDeleteEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.member.ServerMemberAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to private channel deletions.
 */
@FunctionalInterface
public interface PrivateChannelDeleteListener extends UserAttachableListener, PrivateChannelAttachableListener,
        GloballyAttachableListener, ObjectAttachableListener, ServerMemberAttachableListener {

    /**
     * This method is called every time a private channel is deleted.
     *
     * @param event The event.
     */
    void onPrivateChannelDelete(PrivateChannelDeleteEvent event);

}
