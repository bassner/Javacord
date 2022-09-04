package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberChangeMutedEvent;

/**
 * The implementation of {@link MemberChangeMutedEvent}.
 */
public class MemberChangeMutedEventImpl extends ServerMemberEventImpl implements MemberChangeMutedEvent {

    private final Member newMember;
    private final Member oldMember;

    /**
     * Creates a new user change muted event.
     *
     * @param newMember The new member.
     * @param oldMember The old member.
     */
    public MemberChangeMutedEventImpl(Member newMember, Member oldMember) {
        super(newMember);
        this.newMember = newMember;
        this.oldMember = oldMember;
    }

    @Override
    public boolean isNewMuted() {
        return newMember.isSelfMuted();
    }

    @Override
    public boolean isOldMuted() {
        return !isNewMuted();
    }
}
