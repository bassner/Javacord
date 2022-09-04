package org.javacord.core.event.server.role;

import org.javacord.api.entity.member.Member;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.event.server.role.MemberRoleAddEvent;

/**
 * The implementation of {@link MemberRoleAddEvent}.
 */
public class MemberRoleAddEventImpl extends UserRoleEventImpl implements MemberRoleAddEvent {

    /**
     * Creates a new user role add event.
     *
     * @param role   The role of the event.
     * @param member The member of the event.
     */
    public MemberRoleAddEventImpl(Role role, Member member) {
        super(role, member);
    }

}
