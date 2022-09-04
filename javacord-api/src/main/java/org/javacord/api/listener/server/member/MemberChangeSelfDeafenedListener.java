package org.javacord.api.listener.server.member;

import org.javacord.api.event.server.member.MemberChangeSelfDeafenedEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to member self-deafened changes.
 */
@FunctionalInterface
public interface MemberChangeSelfDeafenedListener extends MemberAttachableListener,
        ServerAttachableListener, UserAttachableListener, GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a member changed their self-deafened state on a server.
     *
     * @param event The event.
     */
    void onMemberChangeSelfDeafened(MemberChangeSelfDeafenedEvent event);

}
