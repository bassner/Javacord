package org.javacord.api.listener.server.role;

import org.javacord.api.event.server.role.MemberRoleAddEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.server.member.MemberAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;

/**
 * This listener listens to users being added to a role.
 */
@FunctionalInterface
public interface MemberRoleAddListener extends ServerAttachableListener, UserAttachableListener,
        MemberAttachableListener, RoleAttachableListener,
        GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a user got added to a role.
     *
     * @param event The event.
     */
    void onMemberRoleAdd(MemberRoleAddEvent event);
}
