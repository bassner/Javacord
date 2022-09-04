package org.javacord.api.listener.server.member;

import org.javacord.api.event.server.member.MemberChangeNicknameEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to member nickname changes.
 */
@FunctionalInterface
public interface MemberChangeNicknameListener
        extends MemberAttachableListener, ServerAttachableListener, UserAttachableListener,
                                                    GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a member changed their nickname on a server.
     *
     * @param event The event.
     */
    void onMemberChangeNickname(MemberChangeNicknameEvent event);
}
