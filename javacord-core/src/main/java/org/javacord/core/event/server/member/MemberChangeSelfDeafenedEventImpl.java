package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberChangeSelfDeafenedEvent;

/**
 * The implementation of {@link MemberChangeSelfDeafenedEvent}.
 */
public class MemberChangeSelfDeafenedEventImpl extends ServerMemberEventImpl implements
        MemberChangeSelfDeafenedEvent {

    private final Member newMember;
    private final Member oldMember;

    /**
     * Creates a new member change self deafened event.
     *
     * @param newMember The new member.
     * @param oldMember The old member.
     */
    public MemberChangeSelfDeafenedEventImpl(Member newMember, Member oldMember) {
        super(newMember);
        this.newMember = newMember;
        this.oldMember = oldMember;
    }

    @Override
    public boolean isNewSelfDeafened() {
        return newMember.isSelfDeafened();
    }

    @Override
    public boolean isOldSelfDeafened() {
        return oldMember.isSelfDeafened();
    }
}
