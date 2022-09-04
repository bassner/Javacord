package org.javacord.api.listener.server.member;

import org.javacord.api.event.server.member.MemberChangeMutedEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to member muted changes.
 */
@FunctionalInterface
public interface MemberChangeMutedListener extends MemberAttachableListener, ServerAttachableListener,
        UserAttachableListener, GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time the muted state of member is changed on a server.
     *
     * @param event The event.
     */
    void onMemberChangeMuted(MemberChangeMutedEvent event);

}
