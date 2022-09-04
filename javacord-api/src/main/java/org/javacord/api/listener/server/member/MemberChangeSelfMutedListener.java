package org.javacord.api.listener.server.member;

import org.javacord.api.event.server.member.MemberChangeSelfMutedEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to member self-muted changes.
 */
@FunctionalInterface
public interface MemberChangeSelfMutedListener extends MemberAttachableListener, ServerAttachableListener,
        UserAttachableListener, GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a member changed their self-muted state on a server.
     *
     * @param event The event.
     */
    void onMemberChangeSelfMuted(MemberChangeSelfMutedEvent event);

}
