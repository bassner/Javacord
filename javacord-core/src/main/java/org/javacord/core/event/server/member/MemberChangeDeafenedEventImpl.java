package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberChangeDeafenedEvent;

/**
 * The implementation of {@link MemberChangeDeafenedEvent}.
 */
public class MemberChangeDeafenedEventImpl extends ServerMemberEventImpl implements
        MemberChangeDeafenedEvent {

    private final Member newMember;
    private final Member oldMember;

    /**
     * Creates a new user change deafened event.
     *
     * @param newMember The new member.
     * @param oldMember The old member.
     */
    public MemberChangeDeafenedEventImpl(Member newMember, Member oldMember) {
        super(newMember);
        this.newMember = newMember;
        this.oldMember = oldMember;
    }

    @Override
    public boolean isNewDeafened() {
        // TODO This is wrong.
        return newMember.isSelfDeafened();
    }

    @Override
    public boolean isOldDeafened() {
        return oldMember.isSelfDeafened();
    }
}
